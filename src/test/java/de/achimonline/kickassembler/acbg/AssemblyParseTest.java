package de.achimonline.kickassembler.acbg;

import com.intellij.openapi.fileEditor.impl.LoadTextUtil;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.testFramework.LightVirtualFile;
import com.intellij.testFramework.ParsingTestCase;
import de.achimonline.kickassembler.acbg.parser.KickAssemblerParserDefinition;
import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
import static java.util.Collections.emptyList;

@SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "UnconstructableJUnitTestCase"})
@RunWith(Parameterized.class)
public class AssemblyParseTest extends ParsingTestCase {

    private static final Logger logger = LoggerFactory.getLogger(AssemblyParseTest.class);
    private static final List<String> EXTS = Arrays.asList(".asm", ".s");
    private static final FileFilter FILTER = f -> f.isDirectory() || isSourceExt(f);
    private final String testName;
    private final File assemblySource;

    public AssemblyParseTest(String testName, File assemblySource) {
        super("", getExtension(assemblySource), new KickAssemblerParserDefinition());
        this.testName = testName;
        this.assemblySource = assemblySource;
    }

    /**
     * Collects all the assembly source code to parse in an acceptible data structure for
     * {@link Parameterized.Parameters}. Note the results of these test depend on the disk contents
     * of those sources. No assertions about the structure of the parse tree are made, only that
     * the code can be parsed without errors.
     *
     * @return a List of Object arrays whose elements are the test name and source {@link File}.
     */
    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> getCases() {
        final File root = new File("kick-assembler-sample-code");
        final Optional<String> name = Optional.of("Sample");
        return root.isDirectory() ? collectSources(root, "", name) : emptyList();
    }

    @Test
    public void runTest() {
        setName(testName);
        try {
            // transform windows to unix line endings; note the space is there to preserve offset reporting
            String text = FileUtil.loadFile(assemblySource).replaceAll("\\r\\n", " \n");
            myFile = createPsiFile(testName, text);
            ensureParsed(myFile);
            assertEquals("light virtual file text mismatch", text, ((LightVirtualFile) myFile.getVirtualFile()).getContent().toString());
            assertEquals("virtual file text mismatch", text, LoadTextUtil.loadText(myFile.getVirtualFile()));
            assertEquals("doc text mismatch", text, Objects.requireNonNull(myFile.getViewProvider().getDocument()).getText());
            assertEquals("psi text mismatch", text, myFile.getText());
            ensureCorrectReparse(myFile);
            ensureNoErrorElements();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

    @Override
    protected String getTestDataPath() {
        return "";
    }

    /**
     * Create list of sources to test based on a directory of files, each file contained
     * is added and each directory is recursively searched.
     * @param dir      the directory to collect from.
     * @param prefix   prefix all names with this.
     * @param override optionally provide a name instead of deriving from the dir.
     */
    private static List<Object[]> collectSources(File dir, String prefix, Optional<String> override) {
        // TODO possibly safeguard against post-normalisation duplicates?
        ArrayList<Object[]> sources = new ArrayList<>();
        for (File file : dir.listFiles(FILTER)) {
            final String dirName = prefix + normalise(dir.getName(), override);
            if (file.isDirectory()) {
                sources.addAll(collectSources(dirName, file));
            } else {
                final String testName = dirName + normalise(file.getName());
                logger.info("adding sample source " + testName);
                sources.add(new Object[]{testName, file});
            }
        }
        return sources;
    }

    private static String getExtension(File f) {
        final String name = f.getName();
        return name.substring(name.lastIndexOf(".")+1); // do not include the dot in the extension
    }

    private static boolean isSourceExt(final File f) {
        return EXTS.stream().anyMatch((String s) -> f.getName().endsWith(s));
    }

    @NotNull
    private static String normalise(String baseName) {
        return normalise(baseName, Optional.empty());
    }

    @NotNull
    private static String normalise(String baseName, Optional<String> override) {
        return override.orElse(toTitleCase(removeExt(baseName))).replaceAll("[\\W_]", "");
    }

    private static String removeExt(String baseName) {
        String newName = baseName;
        // note we do not consider multiple extensions
        for (String ext : EXTS) {
            newName = StringUtil.trimEnd(newName, ext);
        }
        return newName;
    }

    private static List<Object[]> collectSources(String prefix, File dir) {
        return collectSources(dir, prefix, Optional.empty());
    }
}
