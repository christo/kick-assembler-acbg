// these things are freaky

.function getTypeName(arg) {
    .var type = arg.getType()
    .if (type == AT_ABSOLUTE) .return "AT_ABSOLUTE"
    .if (type == AT_ABSOLUTEX) .return "AT_ABSOLUTEX"
    .if (type == AT_ABSOLUTEY) .return "AT_ABSOLUTEY"
    .if (type == AT_IMMEDIATE) .return "AT_IMMEDIATE"
    .if (type == AT_INDIRECT) .return "AT_INDIRECT"
    .if (type == AT_IZEROPAGEX) .return "AT_IZEROPAGEX"
    .if (type == AT_IZEROPAGEY) .return "AT_IZEROPAGEY"
    .if (type == AT_NONE) .return "AT_NONE"
    .return "error"
}

.pseudocommand foo one:two {
        .printnow "one: " + getTypeName(one) + " two: " + getTypeName(two)
        clc
        adc one
        adc two
}

.pseudocommand indirectlda it {
    .printnow "it: " + getTypeName(it)
    lda (it)
}

foo $20, x : ($21), y
foo #$22 : $2400,y
indirectlda #21

.pseudocommand add16 a:b:tar {
add16:
	clc
	lda a
	adc b
	sta tar
	lda _16bitNext(a)
	adc _16bitNext(b)
	sta _16bitNext(tar)
}

add16 leveldata,y : lily1ramp : lily1ramp