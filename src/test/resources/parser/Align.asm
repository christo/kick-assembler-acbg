*=$1000
    nop         // expect at $1000
.align $100
    nop         // expect at $1100
.var xyz = $10 * 2
.align xyz
    nop         // expect at $1120