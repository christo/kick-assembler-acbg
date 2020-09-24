// from KickAssembler manual as at v5.16 Chapter 10.3. Segments

    // Define two segments
    .segmentdef MySegment1
    .segmentdef MySegment2 [start=$1000]

    // Add code to segment1
    .segment MySegment1 *=$4000
    ldx #30
l1:
    inc $d021
    dex
    bne l1

    // Add code to segment2 (Using default block starting in $1000)
    .segment MySegment2
    inc $d021
    jmp *-3

    // Switch back to segment1 and add more code.
    .segment MySegment1
    inc $d020
    jmp *-3