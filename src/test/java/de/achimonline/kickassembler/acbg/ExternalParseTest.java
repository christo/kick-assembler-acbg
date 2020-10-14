package de.achimonline.kickassembler.acbg;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.Optional;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

@SuppressWarnings({"UnconstructableJUnitTestCase"})
@RunWith(Parameterized.class)
public class ExternalParseTest extends AbstractParseTest {

    private static final File ROOT = new File("kick-assembler-sample-code");
    private static final String BASE = ROOT.getAbsolutePath();

    private static final FileFilter NOT_EXCLUDED = pathname -> !asList(
            /* we do not want to use these for testing: */

            BASE + "/KimJorgensen/easyflash/libs",                          // ca65 source
            BASE + "/1888games/Caveman-C64VIC20Plus4PET/Lionel/irq.asm",    // syntax error
            BASE + "/1888games/Fire-Game-Watch/Lionel/irq.asm",             // syntax error
            // kick assembler distribution:
            BASE + "/berrydejager/c64-trefpunt/MacOSX/Prerequisites",
            BASE + "/berrydejager/c64-trefpunt/SourceBin/Prerequisites",
            BASE + "/berrydejager/c64-trefpunt/Windows/Prerequisites",
            BASE + "/burnsauce/durexforth",   // TODO: seems to be acme check if this repo has any kick
            BASE + "/defame-demogroup/c64_defame_text_editor",  // says it's kick but it's not
            BASE + "/defame-demogroup/c64_tinn64/research",     // not a part of the project

            /* known problems that must be fixed: */
            // these three are all arguably bugs in kick and should show a warning at least:
            BASE + "/1888games/Donkey-Kong-Junior-C64/vic20/scripts/lookups/monkeyData.asm",
            BASE + "/1888games/Donkey-Kong-Junior-C64/zPET/scripts/lookups/monkeyData.asm",
            BASE + "/1888games/Donkey-Kong-Junior-C64/xPLUS_4/scripts/lookups/monkeyData.asm",
            // pseudocommands
            BASE + "/barryw/c64lib"
    ).contains(pathname.getAbsolutePath());


    public ExternalParseTest(String testName, File assemblySource) {
        super("", getExtension(assemblySource), testName, assemblySource);
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
        final Optional<String> name = Optional.of("Sample");
        return ROOT.isDirectory() ? sources(ROOT, "", name, all(FILTER, NOT_EXCLUDED)) : emptyList();
    }

}
