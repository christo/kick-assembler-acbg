package de.achimonline.kickassembler.acbg;

import com.intellij.openapi.fileEditor.impl.LoadTextUtil;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.testFramework.LightVirtualFile;
import com.intellij.testFramework.ParsingTestCase;
import de.achimonline.kickassembler.acbg.parser.KickAssemblerParserDefinition;
import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.intellij.openapi.util.text.StringUtil.toTitleCase;

@SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "JUnit4AnnotatedMethodInJUnit3TestCase"})
public abstract class AbstractParseTest extends ParsingTestCase {

    private static final Logger logger = LoggerFactory.getLogger(AbstractParseTest.class);
    /**
     * Default source extensions found in the wild.
     */
    private static final List<String> EXTS = Arrays.asList(".asm", ".s");
    static final FileFilter SOURCES = f -> !f.getName().startsWith(".") && (f.isDirectory() || isSource(f));
    private final String testName;
    private final File assemblySource;

    AbstractParseTest(String dataPath, String extension, String testName, File assemblySource) {
        super(dataPath, extension, new KickAssemblerParserDefinition());
        this.testName = testName;
        this.assemblySource = assemblySource;
    }

    static FileFilter all(FileFilter... filters) {
        return f -> {
            for (FileFilter filter : filters) {
                if (!filter.accept(f)) {
                    return false;
                }
            }
            return true;
        };
    }

    /**
     * Create list of sources to test based on a directory of files, each file contained
     * is added and each directory is recursively searched.
     *
     * @param dir      the directory to collect from.
     * @param prefix   prefix all names with this.
     * @param override optionally provide a name instead of deriving from the dir.
     */
    static Collection<Object[]> sources(File dir, String prefix, Optional<String> override, FileFilter filter) {
        // TODO possibly safeguard against post-normalisation duplicates?
        ArrayList<Object[]> sources = new ArrayList<>();
        for (File file : dir.listFiles(filter)) {
            final String dirName = prefix + normalise(dir.getName(), override);
            if (file.isDirectory()) {
                sources.addAll(sources(dirName, file, filter));
            } else {
                final String testName = dirName + normalise(file.getName());
                logger.info("adding sample source " + testName);
                sources.add(new Object[]{testName, file});
            }
        }
        return sources;
    }

    private static Collection<Object[]> sources(String prefix, File dir, FileFilter filter) {
        return sources(dir, prefix, Optional.empty(), filter);
    }

    private static boolean isSource(final File f) {
        return f.isFile() && EXTS.stream().anyMatch((String s) -> f.getName().endsWith(s));
    }

    @NotNull
    private static String normalise(String baseName) {
        return normalise(baseName, Optional.empty());
    }

    @NotNull
    private static String normalise(String baseName, Optional<String> override) {
        return override.orElse(toTitleCase(removeExt(baseName))).replaceAll("[\\W_]", "");
    }

    @NotNull
    private static String removeExt(@NotNull String baseName) {
        String newName = baseName;
        // note we do not consider files with multiple extensions
        for (String ext : EXTS) {
            newName = StringUtil.trimEnd(newName, ext);
        }
        return newName;
    }

    static String getExtension(File f) {
        final String name = f.getName();
        return name.substring(name.lastIndexOf(".") + 1); // do not include the dot in the extension
    }

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @NotNull
    private String getSourceUrl() {
        return "file://" + assemblySource.getAbsolutePath().replaceAll(" ", "+");
    }

    @Override
    protected String getTestDataPath() {
        return "";
    }

    @Test
    public void runTest() {
        setName(testName);
        try {
            // transform windows to unix line endings; note the space is there to preserve offset reporting
            String text = FileUtil.loadFile(assemblySource).replaceAll("\\r\\n", " \n");
            ;
            myFile = createPsiFile(testName, text);
            ensureParsed(myFile);
            final VirtualFile vfile = myFile.getVirtualFile();
            assertEquals("light virtual file text mismatch", text, ((LightVirtualFile) vfile).getContent().toString());
            assertEquals("virtual file text mismatch", text, LoadTextUtil.loadText(vfile));
            assertEquals("doc text mismatch", text, Objects.requireNonNull(myFile.getViewProvider().getDocument()).getText());
            assertEquals("psi text mismatch", text, myFile.getText());
            ensureCorrectReparse(myFile);
            // TODO make sure we don't write out the files for the external test
            if (getCheckResult()) {
                checkResult(testName, myFile);

            } else {
                toParseTreeText(myFile, skipSpaces(), includeRanges());
            }
            if (getEnsureNoErrorElements()) {
                ensureNoErrorElements();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable t) {
            logger.error("failure in asm: " + getSourceUrl());
            throw t;
        }
    }

    protected boolean getCheckResult() {
        return false;
    }

    protected boolean getEnsureNoErrorElements() {
        return true;
    }

    @Override
    protected boolean skipSpaces() {
        return true;
    }
}
