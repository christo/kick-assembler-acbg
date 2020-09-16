.label StaticFrame = $c000

.macro setEnemyColor(xx, yy) {
    ldx #xx
    .if (yy == null) {
        ldy #xx
    }
}

.macro LoadIt(n) {
    lda #n
}

.macro callMacro(a, b) {
    .if (a) {
        lda #1
    }
    .if (b) {
        ldx #2
    }
}

    lda StaticFrame
    // macro calls with optional colon prefix
	:LoadIt(0)
	:setEnemyColor(2, null)
	callMacro(true, false)


