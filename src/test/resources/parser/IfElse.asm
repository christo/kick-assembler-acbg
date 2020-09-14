.if (1 < 2) {
    lda #1
} else {
    lda #0
}

.if (* == 2) {
    lda #1
}

.if (x > y)
    lda #1
    else .if (2 > 1) {
    lda #2
}