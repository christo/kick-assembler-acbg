.fill 64/6, [$aa, $aa, $aa, $55, $55, $55]

// Nomal filling
.fill 5, 0 // Generates byte 0,0,0,0,0
.fill 5, i // Generates byte 0,1,2,3,4
.fill 256, 127.5 + 127.5*sin(toRadians(i*360/256)) // Generates a sine curve
// Use [,,] to fill with a repeat pattern
.fill 4, [$10,$20] // Generates .byte $10,$20,$10,$20,$10,$20,$10,$20
.fill 3, ['D','E','M','O','!'] // Generates the same bytes as .text "DEMO!DEMO! DEMO!"
.fill 3, [i,i*$10] // Generates .byte 0,0,1,$10,2,$20
// .fillword is like .fill but with .word directives
.fillword 5,i*$80 // Generates .word $0000,$0080,$0100,$0180,$0200
.fillword 2,[$100,0] // Generates .word $0100,$0000,$0100,$0000