// intentionally ambiguous pseudocommand example

.pseudocommand begin x {
    lda x
}
.namespace inner {

.pseudocommand begin x : y {
    lda x
    sda y
}

lives:
    .byte $03

begin:
    lda lives: #20

}