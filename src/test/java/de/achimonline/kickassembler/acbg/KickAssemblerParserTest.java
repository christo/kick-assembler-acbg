package de.achimonline.kickassembler.acbg;

import com.intellij.testFramework.ParsingTestCase;
import de.achimonline.kickassembler.acbg.parser.KickAssemblerParserDefinition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests the generated lexer and parser comparing a fresh PsiFile model with a predefined expected result file
 * for each of various assembly sources.
 */
@RunWith(JUnit4.class)
public class KickAssemblerParserTest extends ParsingTestCase {

    public KickAssemblerParserTest() {
        super("", "asm", new KickAssemblerParserDefinition());
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/resources/parser";
    }

    @Override
    protected boolean includeRanges() {
        return false;
    }

    @Override
    protected boolean skipSpaces() {
        return true;
    }

    @Test
    public void testAddressingModeDirectives() {
        doTest(true, true);
    }

    @Test
    public void testAlign() {
        doTest(true, true);
    }

    @Test
    public void testAllKindsOfLabelDef() {
        doTest(true, true);
    }

    @Test
    public void testAssert() {
        doTest(true, true);
    }

    @Test
    public void testAssertBlocks() {
        doTest(true, true);
    }

    @Test
    public void testBreakAndWatch() {
        doTest(true, true);
    }

    @Test
    public void testCharLiteral() {
        doTest(true, true);
    }

    @Test
    public void testEscapeHex() {
        doTest(true, true);
    }

    @Test
    public void testEscapedNamespace() {
        doTest(true, true);
    }

    @Test
    public void testEval() {
        doTest(true, true);
    }

    @Test
    public void testExprOperators() {
        doTest(true, true);
    }

    @Test
    public void testFill() {
        doTest(true, true);
    }

    @Test
    public void testForLoopKitchenSink() {
        doTest(true, true);
    }

    @Test
    public void testFunctionDefinitionWithoutBraces() {
        doTest(true, true);
    }

    /**
     * Note this source fail to assemble on kick but only after parsing correctly.
     */
    @Test
    public void testForLoopStaticFail() {
        doTest(true);
    }

    @Test
    public void testFunctionReturn() {
        doTest(true, true);
    }

    @Test
    public void testIfElse() {
        doTest(true, true);
    }

    @Test
    public void testImportDirective() {
        doTest(true, true);
    }

    @Test
    public void testIndirect() {
        doTest(true, true);
    }

    @Test
    public void testInfiniteLoop() {
        doTest(true, true);
    }

    @Test
    public void testJustComments() {
        doTest(true, true);
    }

    @Test
    public void testKeywordClash() {
        doTest(true, true);
    }

    @Test
    public void testKickPuzzlers() {
        doTest(true, true);
    }

    @Test
    public void testKoalaImport() {
        doTest(true, true);
    }

    @Test
    public void testLabelCases() {
        doTest(true, true);
    }

    @Test
    public void testLabelWithMnemonicSubstring() {
        doTest(true, true);
    }

    @Test
    public void testLabelsAreStatements() {
        doTest(true, true);
    }

    @Test
    public void testLoadBinaryFill() {
        doTest(true, true);
    }

    @Test
    public void testLocalLabelOfIfBlock() {
        doTest(true, true);
    }

    @Test
    public void testLocalLabelsOfForLoop() {
        doTest(true, true);
    }

    @Test
    public void testMacroArguments() {
        doTest(true, true);
    }

    @Test
    public void testMacroDefinitionWithoutBraces() {
        doTest(true, true);
    }

    @Test
    public void testMacroWithForLoop() {
        doTest(true, true);
    }

    @Test
    public void testMacroWithPpDirectives() {
        doTest(true, true);
    }

    @Test
    public void testMemblock() {
        doTest(true, true);
    }

    @Test
    public void testMultipleLabelDefs() {
        doTest(true, true);
    }

    @Test
    public void testNegativeNumberOperatorPrecedence() {
        doTest(true, true);
    }

    @Test
    public void testNegativeNumbers() {
        doTest(true, true);
    }

    @Test
    public void testParameterMaps() {
        doTest(true, true);
    }

    @Test
    public void testPcAssign() {
        doTest(true, true);
    }

    @Test
    public void testPostDotCombo() {
        doTest(true, true);
    }

    @Test
    public void testPreprocessor() {
        doTest(true, true);
    }

    @Test
    public void testPreprocessorPhase() {
        doTest(true, true);
    }

    @Test
    public void testPrintAndError() {
        doTest(true, true);
    }

    @Test
    public void testPseudoCommands() {
        doTest(true, true);
    }

    @Test
    public void testQuotedTextMacro() {
        doTest(true, true);
    }

    @Test
    public void testScopedLabelClash() {
        doTest(true, true);
    }

    @Test
    public void testSegments() {
        doTest(true, true);
    }

    @Test
    public void testSemicolons() {
        doTest(true, true);
    }

    @Test
    public void testSimpleForLoop() {
        doTest(true, true);
    }

    @Test
    public void testTernaryOperator() {
        doTest(true, true);
    }

    @Test
    public void testUnaryDirectives() {
        doTest(true, true);
    }

    @Test
    public void testUserDefinedDataStructures() {
        doTest(true, true);
    }

    @Test
    public void testWhile() {
        doTest(true, true);
    }
}

