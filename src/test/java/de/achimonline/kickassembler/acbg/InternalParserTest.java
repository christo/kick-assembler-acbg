package de.achimonline.kickassembler.acbg;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.Optional;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

/**
 * Tests the generated lexer and parser comparing a fresh PsiFile model with a predefined expected result file
 * for each of various assembly sources.
 */
@SuppressWarnings({"UnconstructableJUnitTestCase", "OptionalUsedAsFieldOrParameterType"})
@RunWith(Parameterized.class)
public class InternalParserTest extends AbstractParseTest {

    private static final File ROOT = new File("src/test/resources/parser");
    private static final String BASE = ROOT.getAbsolutePath();
    private static final Optional<String> NADA = Optional.of("");
    private static final FileFilter EXCLUDER = f -> !asList(
            BASE + "/LabelNamedAsDirective.asm",    // TODO handle label directive nameclash
            BASE + "/ScopedLabelClash.asm",
            BASE + "/LocalLabelsFail.asm",
            BASE + "/ImportExpressionFail.asm",
            BASE + "/MixedCaseOpcodeFail.asm",
            BASE + "/LabelArithmetic.asm",
            "foobar"
    ).contains(f.getAbsolutePath());

    public InternalParserTest(String testName, File assemblySource) {
        super(ROOT.getAbsolutePath(), "asm", testName, assemblySource);
    }

    @Parameters(name = "{0}")
    public static Collection<Object[]> cases() {
        return ROOT.isDirectory()
                ? sources(ROOT, "", NADA, all(SOURCES, EXCLUDER))
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

