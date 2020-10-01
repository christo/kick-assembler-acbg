// from KickAssembler manual @ v5.16 section 11.2 Parameter Maps

// Save a prg file containing the code segment
.file [name="MyFile.prg", segments="Code"]

// Save a bin file containing the code and data segment
.file [name="DeleteMe.bin", type="bin", segments="Code,Data"]

// Save one file for each memoryblock in the DATA segment
// ('Data_Sinus.prg' and 'Data_Mul3.prg' are created)
.file [name="Data.prg", mbfiles, segments="Data"]

// Define some segments
    .segment Code []
    BasicUpstart2(start)
start:
    inc $d020
    jmp *-3

    .segment Data []
    *=$0f00 "Mul3"
    .fill $40, i*3

    *=$2000 "Sinus"
    .fill $100, 127.5 + 127.5*sin(toRadians(i*360/256))