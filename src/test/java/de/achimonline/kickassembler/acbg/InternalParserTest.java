package de.achimonline.kickassembler.acbg;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.Optional;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

/**
 * Tests the generated lexer and parser comparing a fresh PsiFile model with a predefined expected result file
 * for each of various assembly sources. Note that this test needs to be written with JUnit 4 runner so it can
 * be run alongside the {@link org.junit.runners.Parameterized Parameterized} tests but in a JUnit 3 style
 * for compatibility with the way ParsingTestCase loads files TODO fix this like {@link ExternalParseTest}
 */
@SuppressWarnings({"UnconstructableJUnitTestCase"})
@RunWith(Parameterized.class)
public class InternalParserTest extends AbstractParseTest {

    private static final File ROOT = new File("src/test/resources/parser");
    private static final String BASE = ROOT.getAbsolutePath();
    private static final FileFilter UNEXCLUDED = f -> !asList(
            BASE + "/LabelNamedAsDirective.asm",
            "foobar"
    ).contains(f.getAbsolutePath());

    public InternalParserTest(String testName, File assemblySource) {
        super(ROOT.getAbsolutePath(), "asm", testName, assemblySource);
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> getCases() {
        return ROOT.isDirectory()
                ? sources(ROOT, "", Optional.of(""), all(FILTER, UNEXCLUDED))
                : emptyList();
    }

    @Override
    protected boolean getCheckResult() {
        return true;
    }

    @Override
    protected boolean getEnsureNoErrorElements() {
        return true;
    }
}

