// the preprocessor directives are processed first which affects the semantics of braceless if statements

.if (true)
    #import "JustComments.asm"
    .printnow "this will be printed"