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
        doTest(true, true);
    }

    public void testAlign() {
        doTest(true, true);
    }

    public void testAllKindsOfLabelDef() {
        doTest(true, true);
    }

    public void testAssert() {
        doTest(true, true);
    }

    public void testAssertBlocks() {
        doTest(true, true);
    }

    public void testBreakAndWatch() {
        doTest(true, true);
    }

    public void testCharLiteral() {
        doTest(true, true);
    }

    public void testEscapeHex() {
        doTest(true, true);
    }

    public void testEscapedNamespace() {
        doTest(true, true);
    }

    public void testEval() {
        doTest(true, true);
    }

    public void testExprOperators() {
        doTest(true, true);
    }

    public void testFill() {
        doTest(true, true);
    }

    public void testForLoopKitchenSink() {
        doTest(true, true);
    }

    public void testFunctionDefinitionWithoutBraces() {
        doTest(true, true);
    }

    /**
     * Note this source fail to assemble on kick but only after parsing correctly.
     */
    public void testForLoopStaticFail() {
        doTest(true);
    }

    public void testFunctionReturn() {
        doTest(true, true);
    }

    public void testIfElse() {
        doTest(true, true);
    }

    public void testImportDirective() {
        doTest(true, true);
    }

    public void testIndirect() {
        doTest(true, true);
    }

    public void testInfiniteLoop() {
        doTest(true, true);
    }

    public void testJustComments() {
        doTest(true, true);
    }

    public void testKeywordClash() {
        doTest(true, true);
    }

    public void testKickPuzzlers() {
        doTest(true, true);
    }

    public void testKoalaImport() {
        doTest(true, true);
    }

    public void testLabelCases() {
        doTest(true, true);
    }

    public void testLabelWithMnemonicSubstring() {
        doTest(true, true);
    }

    public void testLabelsAreStatements() {
        doTest(true, true);
    }

    public void testLoadBinaryFill() {
        doTest(true, true);
    }

    public void testLocalLabelOfIfBlock() {
        doTest(true, true);
    }

    public void testLocalLabelsOfForLoop() {
        doTest(true, true);
    }

    public void testMacroArguments() {
        doTest(true, true);
    }

    public void testMacroDefinitionWithoutBraces() {
        doTest(true, true);
    }

    public void testMacroWithForLoop() {
        doTest(true, true);
    }

    public void testMacroWithPpDirectives() {
        doTest(true, true);
    }

    public void testMemblock() {
        doTest(true, true);
    }

    public void testMultipleLabelDefs() {
        doTest(true, true);
    }

    public void testNegativeNumberOperatorPrecedence() {
        doTest(true, true);
    }

    public void testNegativeNumbers() {
        doTest(true, true);
    }

    public void testParameterMaps() {
        doTest(true, true);
    }

    public void testPcAssign() {
        doTest(true, true);
    }

    public void testPostDotCombo() {
        doTest(true, true);
    }

    public void testPreprocessor() {
        doTest(true, true);
    }

    public void testPreprocessorPhase() {
        doTest(true, true);
    }

    public void testPrintAndError() {
        doTest(true, true);
    }

    public void testPseudoCommands() {
        doTest(true, true);
    }

    public void testQuotedTextMacro() {
        doTest(true, true);
    }

    public void testScopedLabelClash() {
        doTest(true, true);
    }

    public void testSegments() {
        doTest(true, true);
    }

    public void testSemicolons() {
        doTest(true, true);
    }

    public void testSimpleForLoop() {
        doTest(true, true);
    }

    public void testTernaryOperator() {
        doTest(true, true);
    }

    public void testUnaryDirectives() {
        doTest(true, true);
    }

    public void testUserDefinedDataStructures() {
        doTest(true, true);
    }

    public void testWhile() {
        doTest(true, true);
    }
}

