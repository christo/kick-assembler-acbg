// the following fails in kick 5.16 with Error: Unterminated string
.printnow('\"')
// the following fails in kick 5.16 with Error: Can't get a double representation from a value of type String
.printnow('\n' + "that was a newline") 