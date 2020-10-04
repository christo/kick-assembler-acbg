lda #12
#if DEFD
    cmp ($f1)
#else
    cmp ($f1,x)
#endif