package de.achimonline.kickassembler.acbg;

import com.intellij.testFramework.ParsingTestCase;
import de.achimonline.kickassembler.acbg.parser.KickAssemblerParserDefinition;

/**
 * Tests the generated lexer and parser comparing a fresh PsiFile model with a predefined expected result file
 * for each of various assembly sources. Note this is written like a JUnit 3 test due to the superclass:
 * {@link ParsingTestCase}.
 */
public class KickAssemblerParserTest extends ParsingTestCase {

    public KickAssemblerParserTest() {
        super("", "asm", new KickAssemblerParserDefinition());
    }

    public void testJustComments() {
        doTest(true);
    }

    public void testForLoopKitchenSink() {
        doTest(true);
    }

    public void testSimpleForLoop() {
        doTest(true);
    }

    public void testExprOperators() {
        doTest(true);
    }

    public void testInfiniteLoop() {
        doTest(true);
    }

    public void testLabelCases() {
        doTest(true);
    }

    public void testLabelWithMnemonicSubstring() {
        doTest(true);
    }

    public void testMacroWithForLoop() {
        doTest(true);
    }

    //    public void testLocalLabelOfIfBlock() {
    //        doTest(true);
    //    }

    //    public void testLocalLabelsOfForLoop() {
    //        doTest(true);
    //    }

    //    public void testMacroArguments() {
    //        doTest(true);
    //    }

//        public void testAddressingModeDirectives() {
//            doTest(true);
//        }

    //    public void testImportExpressionFail() {
    //        doTest(true);
    //    }


    //    public void testLocalLabelsFail() {
    //        doTest(true);
    //    }


    //    public void testMixedCaseOpcodeFail() {
    //        doTest(true);
    //    }

    //    public void testPcAssign() {
    //        doTest(true);
    //    }

    //    public void testQuotedTextMacro() {
    //        doTest(true);
    //    }

    @Override
    protected String getTestDataPath() {
        return "src/test/resources/parser";
    }

    @Override
    protected boolean skipSpaces() {
        return true;
    }

    @Override
    protected boolean includeRanges() {
        return false;
    }
}
