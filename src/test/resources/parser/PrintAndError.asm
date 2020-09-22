* = $1000
.var n = "42 is the answer"
.var c = "" + 69
nop
.if (c != 0) {
    .print n
    .print c
    .error "assert"
    .errorif (>*) != (>label1), "page crossed!"
}
nop
nop
label1: