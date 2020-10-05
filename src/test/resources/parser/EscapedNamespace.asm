// from Kick Assembler manual @v5.16 section 9.5

.label myLabel = 1
{
    .label myLabel = 2
    .print "scoped myLabel="+ myLabel //<-- Returns 2
    .print "root myLabel="+ @myLabel //<-- Returns 1
}

.function myFunction() { .return "root"}
.namespace mySpace {
    .function myFunction() { .return "mySpace" }
    .print @myFunction()
}