// note this fails on kick assembler after parsing but before execution of the macro
// due to reference to not yet defined symbol foo at 5:19 and 5:27
.macro freaky() {
    .var foo=0
    .for (const i=foo*2, (foo++ * 0), var foo = 1; foo < 10; foo++)
        .printnow("yo" + foo + " " + i)
}
.if (false) freaky()