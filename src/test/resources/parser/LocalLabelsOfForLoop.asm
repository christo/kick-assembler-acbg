// this works the same for while loops
.for (var i=0; i<20; i++) {
    lda #i
    sta loop2[i].color+1
}

loop2: .for (var i=0; i<20; i++) {
color:  lda #0
        sta $d020
}