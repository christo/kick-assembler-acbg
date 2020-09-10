// example from http://www.theweb.dk/KickAssembler/webhelp/content/ch03s02.html
// some explicit absolute mode addressing (not the otherwise automatic zeropage conversion)
    lda.abs $0040,x   // Uses absolute mode
    lda.a $0030,x     // Same as abs (abbreviation)
    stx.zp zpLabel,y  // Uses zeropage mode
    stx.z zpLabel,y   // Same as zp (abbreviation)
    .label zpLabel = $10

    jmp.z $1000 // Modifies nothing, jmp don't have any zp mode


// deprecated mnemonic extensions

    lda.zpx table

	jmp.i $1000


.label table = *