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

    private static final FileFilter EXCLUDER = pathname -> !asList(
            /* problem files: we do not want to use these for testing: */
            BASE + "/KimJorgensen/easyflash/libs",                          // ca65 source
            BASE + "/1888games/Caveman-C64VIC20Plus4PET/Lionel/irq.asm",    // syntax error
            BASE + "/1888games/Fire-Game-Watch/Lionel/irq.asm",             // syntax error
            // kick assembler distribution:
            BASE + "/berrydejager/c64-trefpunt/MacOSX/Prerequisites",
            BASE + "/berrydejager/c64-trefpunt/SourceBin/Prerequisites",
            BASE + "/berrydejager/c64-trefpunt/Windows/Prerequisites",
            BASE + "/defame-demogroup/c64_defame_text_editor",  // says it's kick but it's not
            BASE + "/defame-demogroup/c64_tinn64/research",     // not a part of the project
            // the following are not kick assembler
            BASE + "/EddieFAF/c64coding/demo/src/part0/acme",
            BASE + "/EddieFAF/c64coding/demo/src/part1/acme",
            BASE + "/EddieFAF/c64coding/demo/src/part2/acme",
            BASE + "/EddieFAF/c64coding/demo/src/part3/acme",
            BASE + "/EddieFAF/c64coding/acme",
            BASE + "/EddieFAF/c64coding/dasm",
            BASE + "/EddieFAF/c64coding/misc",
            BASE + "/EddieFAF/c64coding/demo/lib/acme",
            BASE + "/FolkertVanVerseveld/c64/irq/macros.asm",
            BASE + "/FrankBuss/kerberos/skoe-easyflash/EasyProg",
            BASE + "/FrankBuss/kerberos/skoe-easyflash/EF3BootImage",
            BASE + "/FrankBuss/kerberos/skoe-easyflash/EasyTransfer",
            BASE + "/FrankBuss/kerberos/skoe-easyflash/EasySDK",
            BASE + "/FrankBuss/kerberos/skoe-easyflash/libs",
            BASE + "/FrankBuss/kerberos/skoe-easyflash/Hardware/ef3-vhdl/testcrts/np_test",
            BASE + "/go4retro/EasyFlash3/libs",
            BASE + "/go4retro/EasyFlash3/EasyProg",
            BASE + "/go4retro/EasyFlash3/EF3BootImage",
            BASE + "/go4retro/EasyFlash3/EasyTransfer",
            BASE + "/go4retro/EasyFlash3/EasySDK",
            BASE + "/go4retro/EasyFlash3/EF3BootImage",
            BASE + "/go4retro/EasyFlash3/Hardware",
            BASE + "/graydefender/RandomStuff/4player.asm",
            BASE + "/graydefender/RandomStuff/Effect_1_AllColorsborder.asm",
            BASE + "/graydefender/RandomStuff/Effect_2_rocking.asm",
            BASE + "/graydefender/RandomStuff/Effect_3_OuterOnly.asm",
            BASE + "/graydefender/RandomStuff/Effect_4_BothDirections.asm",
            BASE + "/graydefender/RandomStuff/Effect_5_Everyother.asm",
            BASE + "/graydefender/RandomStuff/Effect_6_fullscreen-nonopt.asm",
            BASE + "/graydefender/RandomStuff/Effect_7_Fullscreen2-opt.asm",
            BASE + "/graydefender/RandomStuff/Generic_Border_Effect-Opt.asm",
            BASE + "/graydefender/RandomStuff/Generic_Border_Effect.asm",
            BASE + "/graydefender/RandomStuff/blackboard.asm",
            BASE + "/graydefender/RandomStuff/bordereffect.asm",
            BASE + "/graydefender/RandomStuff/bordereffect1.asm",
            BASE + "/graydefender/RandomStuff/bordereffect2.asm",
            BASE + "/graydefender/RandomStuff/leftshift.asm",
            BASE + "/graydefender/RandomStuff/leftshift2.asm",
            BASE + "/graydefender/RandomStuff/maze.asm",
            BASE + "/graydefender/RandomStuff/rle0.asm",
            BASE + "/graydefender/RandomStuff/rle1.asm",
            BASE + "/graydefender/RandomStuff/rle2.asm",
            BASE + "/graydefender/RandomStuff/rle3.asm",
            BASE + "/graydefender/RandomStuff/rle4.asm",
            BASE + "/graydefender/RandomStuff/rle5.asm",
            BASE + "/graydefender/RandomStuff/worm.asm",
            BASE + "/graydefender/RandomStuff/worm2.asm",
            BASE + "/graydefender/RandomStuff/worm3.asm",
            BASE + "/graydefender/RandomStuff/worm4.asm",
            BASE + "/graydefender/RandomStuff/worm5.asm",
            BASE + "/ioncodes/c64-playground/2x1_font/font-charset.s",
            BASE + "/ioncodes/c64-playground/2x1_font/font-colors.s",
            BASE + "/ioncodes/c64-playground/2x1_font/font-map.s",
            BASE + "/MEGA65/mega65-core/src/utilities",
            BASE + "/MEGA65/open-roms/src/kernal/rs232",
            BASE + "/OldSkoolCoder/TwitchStreams/02. CharPad/CBMPrgStudio",
            BASE + "/OldSkoolCoder/TwitchStreams/04. Sprite Management System/CBMPrgStudio",
            BASE + "/PotcFdk/JSIDPlay2/jsidplay2/src/test/resources/vic",
            BASE + "/xunil/tetrisclone/drawingtest-easy6502.asm",
            BASE + "/defame-demogroup/c64_sa2019invite/spindle",
            BASE + "/dkrey/mafia_asm/scratchpad.asm",
            BASE + "/go4retro/EasyFlash3/3rdParty",
            BASE + "/EddieFAF/c64coding/kickass/loader/fade_routine_orig.asm",
            BASE + "/mix256/kng2",  // old version of kick with prefix pseudocommands and semicolon arg delimiters


            /* known problems in our parser that must be fixed: */
            // these three are all arguably bugs in kick and should show a warning at least:
            BASE + "/1888games/Donkey-Kong-Junior-C64/vic20/scripts/lookups/monkeyData.asm",
            BASE + "/1888games/Donkey-Kong-Junior-C64/zPET/scripts/lookups/monkeyData.asm",
            BASE + "/1888games/Donkey-Kong-Junior-C64/xPLUS_4/scripts/lookups/monkeyData.asm",
            BASE + "/stid/woz64/libs/memory.asm",
            // pseudocommands
            BASE + "/barryw/c64lib",            // @prefix
            BASE + "/dkt64/yadm/inc/makra.asm"  // overrides existing mnemonic "asl"
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
        final Optional<String> name = Optional.of("");
        return ROOT.isDirectory() ? sources(ROOT, "", name, all(SOURCES, EXCLUDER)) : emptyList();
    }

}
