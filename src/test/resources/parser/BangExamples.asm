.var x = false
// bracketed
.if ( !(x) ) {
    .printnow("not x")
}
// double
.if (!(!x)) .printnow(x)
else
    .printnow("what?")