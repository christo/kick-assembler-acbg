.const c = 50
.const b = 1
.const d = 10;
.for(var i=0; i <= d; i++) {
    .var t = i/d;
    .if (t < (1/2.75)) {
        .byte floor(c*(7.5625*t*t) + b);
    }
}