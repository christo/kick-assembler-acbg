// character literal

.byte 'h', 'e', 'l', 'l', 'o', '\n'
.text "world"

.printnow("literal single quote char: " + ''')
.printnow('a'   /* char to char concat */
    + 'b' + 'c')
.printnow('\')  // the backslash is not escape in a char literal
.printnow('\'') // except when it is

// the following fails in kick 5.16 with Error: Unterminated string
//.printnow('\"')
// the following fails in kick 5.16 with Error: Can't get a double representation from a value of type String
//.printnow('\n' + "that was a newline")
