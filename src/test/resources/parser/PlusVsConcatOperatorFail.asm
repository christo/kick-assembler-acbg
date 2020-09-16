// this works fine

.printnow("" + 1 + " is the loneliest number")

// kick apparently uses left associative type inference in the following
// expression after parsing, meaning the operator is numbe addition

.printnow( 3 + " is a crowd")
