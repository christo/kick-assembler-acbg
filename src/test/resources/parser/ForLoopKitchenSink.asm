// crazy example
.var foo = 0
.for ((foo++ * 0), const i=(foo*2), var x = $f; foo < 10 && (x++ > 0); foo++)
    .printnow("yo" + foo + " " + i + " " + x)