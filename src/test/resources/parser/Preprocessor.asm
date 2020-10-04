#if true && (true || false)
    #define ABC
    lda #%0
#else
    nop
    #define XYZ
    nop
#endif
