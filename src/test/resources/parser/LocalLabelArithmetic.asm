inc !textptr- + 1
    brk
!textptr:
	lda scroll_text
	cmp #$ff
	bne !nowrap+
	jsr scroll_reset