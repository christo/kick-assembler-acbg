set_marker_shape:
        ldx item_playing
        lda item_text_offset_lo, x
        sta !addr+
        sta !addr+ + 1
        lda item_text_offset_hi, x
        sta !addr+ + 2
!addr:  sty.abs $0000
        rts