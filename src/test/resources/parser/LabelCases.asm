LabelWithNumber3:
        jmp LabelWithNumber3

// the following labels rules from
// http://www.theweb.dk/KickAssembler/webhelp/content/ch03s04.html

        // argument labels
        stx tmpX
        // stuff
        ldx tmpX:#$00


        jmp !+++ // Jumps to the third '!' label
!:      nop
!:      nop
!:              // <- here!
