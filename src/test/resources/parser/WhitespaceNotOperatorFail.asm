// found by experimentation with v5.16
.var n = false
.if ( !n) {
    .print("this is fine")
}

.if ( ! n) {
    .print("kick parses the bang as multilabel")
}