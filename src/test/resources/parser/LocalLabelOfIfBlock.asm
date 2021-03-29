jmp myIf.lbl

myIf: .if (true) {
lbl: lda #0 // <-- Jumps here ...
} else {
lbl: nop
}