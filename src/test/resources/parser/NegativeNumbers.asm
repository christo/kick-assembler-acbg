// test that scripting expressions with negative numbers has correct precedence

.var x = -9
.var y = -0
.eval y = x - x
.printnow(y)