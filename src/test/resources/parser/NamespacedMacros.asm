.macro @someMacro() {
	.printnow("I am global")
}

.namespace MyScope {
	.macro someMacro() {
		.printnow("I am local")
	}
	.printnow("I am in MyScope")
	someMacro()
}

.struct MyScope { game, timer }


.function makeThing() {
    .var ht = Hashtable()
    .var foo = MyScope("foogame", 1)
    .eval ht.put("foo", foo)
    .return ht
}

.printnow(makeThing().get("foo").getFieldNames())
