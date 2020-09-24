.assert "these should assemble identically", {
    .for (var i=0; i<4; i++)
        sta $0400+i
}, {
    sta $0400
    sta $0401
    sta $0402
    sta $0403
}