package de.achimonline.kickassembler.acbg;

import java.io.File;

public class ExpectedFailureTest extends AbstractParseTest {
    public ExpectedFailureTest(String testName, File assemblySource) {
        super( "", "asm", testName, assemblySource);
    }

    public void testForLoopStaticFail() {
        doTest(true);
    }

    public void testImportExpressionFail() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/resources/fails";
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
