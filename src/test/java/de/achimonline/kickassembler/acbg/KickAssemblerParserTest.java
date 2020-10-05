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

    public void testAddressingModeDirectives() {
        doTest(true);
    }

    public void testAlign() {
        doTest(true);
    }

    public void testAllKindsOfLabelDef() {
        doTest(true);
    }

    public void testAssert() {
        doTest(true);
    }

    public void testAssertBlocks() {
        doTest(true);
    }

    public void testBreakAndWatch() {
        doTest(true);
    }

    public void testCharLiteral() {
        doTest(true);
    }

    public void testEscapeHex() {
        doTest(true);
    }

    public void testEscapedNamespace() {
        doTest(true);
    }

    public void testEval() {
        doTest(true);
    }

    public void testExprOperators() {
        doTest(true);
    }

    public void testFill() {
        doTest(true);
    }

    public void testForLoopKitchenSink() {
        doTest(true);
    }

    /**
     * Note this source fail to assemble on kick but only after parsing correctly.
     */
    public void testForLoopStaticFail() {
        doTest(true);
    }

    public void testFunctionReturn() {
        doTest(true);
    }

    public void testIfElse() {
        doTest(true);
    }

    public void testImportDirective() {
        doTest(true);
    }

    public void testIndirect() {
        doTest(true);
    }

    public void testInfiniteLoop() {
        doTest(true);
    }

    public void testJustComments() {
        doTest(true);
    }

    public void testKeywordClash() {
        doTest(true);
    }

    public void testKickPuzzlers() {
        doTest(true);
    }

    public void testKoalaImport() {
        doTest(true);
    }

    public void testLabelCases() {
        doTest(true);
    }

    public void testLabelWithMnemonicSubstring() {
        doTest(true);
    }

    public void testLabelsAreStatements() {
        doTest(true);
    }

    public void testLoadBinaryFill() {
        doTest(true);
    }

    public void testLocalLabelOfIfBlock() {
        doTest(true);
    }

    public void testLocalLabelsOfForLoop() {
        doTest(true);
    }

    public void testMacroArguments() {
        doTest(true);
    }

    public void testMacroDefinitionWithoutBraces() {
        doTest(true);
    }

    public void testMacroWithForLoop() {
        doTest(true);
    }

    public void testMemblock() {
        doTest(true);
    }

    public void testMultipleLabelDefs() {
        doTest(true);
    }

    public void testNegativeNumberOperatorPrecedence() {
        doTest(true);
    }

    public void testNegativeNumbers() {
        doTest(true);
    }

    public void testParameterMaps() {
        doTest(true);
    }

    public void testPcAssign() {
        doTest(true);
    }

    public void testPostDotCombo() {
        doTest(true);
    }

    public void testPreprocessor() {
        doTest(true);
    }

    public void testPreprocessorPhase() {
        doTest(true);
    }

    public void testPrintAndError() {
        doTest(true);
    }

    public void testQuotedTextMacro() {
        doTest(true);
    }

    public void testScopedLabelClash() {
        doTest(true);
    }

    public void testSegments() {
        doTest(true);
    }

    public void testSemicolons() {
        doTest(true);
    }

    public void testSimpleForLoop() {
        doTest(true);
    }

    public void testTernaryOperator() {
        doTest(true);
    }

    public void testUnaryDirectives() {
        doTest(true);
    }

    public void testUserDefinedDataStructures() {
        doTest(true);
    }

    public void testWhile() {
        doTest(true);
    }
}

