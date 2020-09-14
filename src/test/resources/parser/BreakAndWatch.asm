.break "stop right here and check stuff out" // magic string parsed by vice & co
.watch $d019
.watch $d019, $d019 + $f
.watch $d020, $d021, "in case something happens"
.break