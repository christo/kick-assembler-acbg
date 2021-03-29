// Add the x’th entry of a table if x is positive or
// subtract it if x is negative
.if (x>=0) adc zpXtable+x else sbc zpXtable+abs(x)

// Init an offset table or display a warning if the table length is exceeded
.if (i<tableLength) {
   lda #0
   sta offset1+i
   sta offset2+i
} else {
   .error "Error!! I is too high!"
}