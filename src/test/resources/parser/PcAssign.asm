// note these first tokens should not parse as the multiply&assign operator
*=$02 "Temp vars zero page" virtual

FOOBAR: .byte $00

*=$4000 "Main"

FOOBAR2: .byte $00

* =$c000 "Extra"

FOOBAR3: .byte $00

.pc = $a000

    nop