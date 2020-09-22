package de.achimonline.kickassembler.acbg;

import com.intellij.testFramework.ParsingTestCase;
import de.achimonline.kickassembler.acbg.parser.KickAssemblerParserDefinition;

public class ExpectedFailureTest extends ParsingTestCase {
    public ExpectedFailureTest() {
        super("", "asm", new KickAssemblerParserDefinition());
    }

    public void testForLoopStaticFail() {
        doTest(true);
    }

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
