	.macro LoadBank() {
		#if GMOD2
			sta $de00
		#elif MAGICDESK
			sta $de00
		#elif EASYFLASH
			sta $de00
		#endif
	}