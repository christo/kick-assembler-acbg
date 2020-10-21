.function _16bitNext(arg) {
    .if (arg.getType()==AT_IMMEDIATE)
        .return CmdArgument(arg.getType(),>arg.getValue())
    .return CmdArgument(arg.getType(),arg.getValue()+1)
}

.pseudocommand mov16 src:tar {
mov16:
	lda src
	sta tar
	lda _16bitNext(src)
	sta _16bitNext(tar)
}

mov16 #irq1 : $fffe

irq1: rti

mov16 #irq1 : $fffe
