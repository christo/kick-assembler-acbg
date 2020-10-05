package de.achimonline.kickassembler.acbg.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.achimonline.kickassembler.acbg.psi.KickAssemblerTypes;
import com.intellij.psi.TokenType;

/*
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>KickAssembler.flex</tt>
 */
%%
%class KickAssemblerLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
    return;
%eof}

%{

private void pm() {
      if ((zzLexicalState == POST_MNEMONIC) || (zzLexicalState == POST_DOT)) {
          yybegin(YYINITIAL);
      }
}

%}

MNEMONIC = (
    "adc"|"ADC" |
    "ahx"|"AHX" |
    "alr"|"ALR" |
    "anc"|"ANC" |
    "and"|"AND" |
    "arr"|"ARR" |
    "asl"|"ASL" |
    "axs"|"AXS" |
    "bcc"|"BCC" |
    "bcs"|"BCS" |
    "beq"|"BEQ" |
    "bit"|"BIT" |
    "bmi"|"BMI" |
    "bne"|"BNE" |
    "bpl"|"BPL" |
    "brk"|"BRK" |
    "bvc"|"BVC" |
    "bvs"|"BVS" |
    "clc"|"CLC" |
    "cld"|"CLD" |
    "cli"|"CLI" |
    "clv"|"CLV" |
    "cmp"|"CMP" |
    "cpx"|"CPX" |
    "cpy"|"CPY" |
    "dcp"|"DCP" |
    "dec"|"DEC" |
    "dex"|"DEX" |
    "dey"|"DEY" |
    "eor"|"EOR" |
    "inc"|"INC" |
    "inx"|"INX" |
    "iny"|"INY" |
    "isc"|"ISC" |
    "jmp"|"JMP" |
    "jsr"|"JSR" |
    "las"|"LAS" |
    "lax"|"LAX" |
    "lda"|"LDA" |
    "ldx"|"LDX" |
    "ldy"|"LDY" |
    "lsr"|"LSR" |
    "nop"|"NOP" |
    "ora"|"ORA" |
    "pha"|"PHA" |
    "php"|"PHP" |
    "pla"|"PLA" |
    "plp"|"PLP" |
    "rla"|"RLA" |
    "rol"|"ROL" |
    "ror"|"ROR" |
    "rra"|"RRA" |
    "rti"|"RTI" |
    "rts"|"RTS" |
    "sax"|"SAX" |
    "sbc"|"SBC" |
    "sec"|"SEC" |
    "sed"|"SED" |
    "sei"|"SEI" |
    "shx"|"SHX" |
    "shy"|"SHY" |
    "slo"|"SLO" |
    "sre"|"SRE" |
    "sta"|"STA" |
    "stx"|"STX" |
    "sty"|"STY" |
    "tas"|"TAS" |
    "tax"|"TAX" |
    "tay"|"TAY" |
    "tsx"|"TSX" |
    "txa"|"TXA" |
    "txs"|"TXS" |
    "tya"|"TYA" |
    "xaa"|"XAA" |
    "bra"|"BRA" |
    "sac"|"SAC" |
    "sir"|"SIR" |

    "sbc2"|"SBC2" |
    "anc2"|"ANC2"
)

LINE_BREAK  = \n|\r|\r\n
WHITE_SPACE = [\ \t\f]
ANY_BLANKS = ({WHITE_SPACE}|{LINE_BREAK})+

DEC_LITERAL = [0-9]+(_+[0-9]+)*
FLT_LITERAL = {DEC_LITERAL}("."{DEC_LITERAL})?
HEX_LITERAL = "$"[0-9a-fA-F]+(_+[0-9a-fA-F]+)*
BIN_LITERAL = "%"[0-1]+(_+[0-1]+)*
CHAR_LITERAL = '([^']|\"|{STRING_CHAR})'
ESCAPE_CHAR_LITERAL = '{ESCAPE_CHAR}'

LABEL = ([a-zA-Z_][a-zA-Z0-9_]*)
MULTILABEL = "!"{LABEL}?(\+|-)+
LABEL_DEF = {LABEL}":"
MULTILABEL_DEF = "!"{LABEL}?":"

LINE_COMMENT  = "//"[^\r\n]*
BLOCK_COMMENT = "/*"([^"*"]|("*"+[^"*""/"]))*("*"+"/")?

STRING_CHAR = \"([^\"\r\n])*\"
ESCAPE_CHAR = (\\n|\\r|\\t|\\b|\\f|\\\"|\\\\)

%xstate STRING_ESCAPE POST_MNEMONIC MNEMONIC_SUFFIX POST_DOT SYMBOL_DEF

%%

<YYINITIAL, POST_MNEMONIC> {
    {ANY_BLANKS}   { pm(); return TokenType.WHITE_SPACE; }

    {STRING_CHAR} { pm(); return KickAssemblerTypes.STRING; }

    "BasicUpstart2" { pm(); return KickAssemblerTypes.BASIC_UPSTART; }

    "#define"     { pm(); return KickAssemblerTypes.PREPROCESSOR_DEF; }
    "#elif"       { pm(); return KickAssemblerTypes.PREPROCESSOR_IF; }
    "#else"       { pm(); return KickAssemblerTypes.PREPROCESSOR; }
    "#endif"      { pm(); return KickAssemblerTypes.PREPROCESSOR; }
    "#if"         { pm(); return KickAssemblerTypes.PREPROCESSOR_IF; }
    "#import"     { pm(); return KickAssemblerTypes.PREPROCESSOR_IMPORT; }
    "#importif"   { pm(); return KickAssemblerTypes.PREPROCESSOR; }
    "#importonce" { pm(); return KickAssemblerTypes.PREPROCESSOR_IMPORTONCE; }
    "#undef"      { pm(); return KickAssemblerTypes.PREPROCESSOR_DEF; }

    {MNEMONIC}      { yybegin(POST_MNEMONIC); return KickAssemblerTypes.MNEMONIC; }

    "true"|"false" 	  { pm(); return KickAssemblerTypes.BOOLEAN; }
    "null"            { pm(); return KickAssemblerTypes.NULL; }

    "var" | "const"  { return KickAssemblerTypes.DIRECTIVE_DEF; }

    {LABEL_DEF}       { pm(); return KickAssemblerTypes.LABEL_DEF; }
    {MULTILABEL_DEF}  { pm(); return KickAssemblerTypes.MULTILABEL_DEF; }
    {LABEL}           { pm(); return KickAssemblerTypes.LABEL; }
    {MULTILABEL}      { pm(); return KickAssemblerTypes.MULTILABEL; }

    "("  { pm(); return KickAssemblerTypes.LEFT_PAREN; }
    ")"  { pm(); return KickAssemblerTypes.RIGHT_PAREN; }
    "{"  { pm(); return KickAssemblerTypes.LEFT_BRACE; }
    "}"  { pm(); return KickAssemblerTypes.RIGHT_BRACE; }
    "["  { pm(); return KickAssemblerTypes.LEFT_BRACKET; }
    "]"  { pm(); return KickAssemblerTypes.RIGHT_BRACKET; }

    "#"	 { pm(); return KickAssemblerTypes.HASH; }
    "="	 { pm(); return KickAssemblerTypes.ASSIGN; }
    ","	 { pm(); return KickAssemblerTypes.COMMA; }
    ";"	 { pm(); return KickAssemblerTypes.SEMICOLON; }
    "<=" { pm(); return KickAssemblerTypes.LESS_EQUALS; }
    ">=" { pm(); return KickAssemblerTypes.GREATER_EQUALS; }
    "<"	 { pm(); return KickAssemblerTypes.LESS; }
    ">"	 { pm(); return KickAssemblerTypes.GREATER; }
    "&"	 { pm(); return KickAssemblerTypes.BIT_AND; }
    "|"	 { pm(); return KickAssemblerTypes.BIT_OR; }
    "^"	 { pm(); return KickAssemblerTypes.BIT_XOR; }
    "~"	 { pm(); return KickAssemblerTypes.BIT_NOT; }
    "<<" { pm(); return KickAssemblerTypes.SHIFT_LEFT; }
    ">>" { pm(); return KickAssemblerTypes.SHIFT_RIGHT; }
    "+"	 { pm(); return KickAssemblerTypes.PLUS; }
    "-"	 { pm(); return KickAssemblerTypes.MINUS; }
    "*"	 { pm(); return KickAssemblerTypes.ASTERISK; }
    "/"	 { pm(); return KickAssemblerTypes.DIVIDE; }
    "!=" { pm(); return KickAssemblerTypes.NOT_EQUAL; }
    "==" { pm(); return KickAssemblerTypes.EQUAL; }
    "&&" { pm(); return KickAssemblerTypes.AND; }
    "||" { pm(); return KickAssemblerTypes.OR; }
    "!"	 { pm(); return KickAssemblerTypes.NOT; }
    "++" { pm(); return KickAssemblerTypes.PLUS_PLUS; }
    "--" { pm(); return KickAssemblerTypes.MINUS_MINUS; }
    "+=" { pm(); return KickAssemblerTypes.PLUS_EQUAL; }
    "-=" { pm(); return KickAssemblerTypes.MINUS_EQUAL; }
    "/=" { pm(); return KickAssemblerTypes.DIVIDE_EQUAL; }
    ":"	 { pm(); return KickAssemblerTypes.COLON; }
    "?"	 { pm(); return KickAssemblerTypes.QUESTION_MARK; }
    "@"	 { pm(); return KickAssemblerTypes.AT; }

    "." {
        if(zzLexicalState == POST_MNEMONIC) {
            yybegin(MNEMONIC_SUFFIX);
        } else if (zzLexicalState != POST_DOT) {
            yybegin(POST_DOT);
        }
        return KickAssemblerTypes.DOT;
    }


    "@\"" { yybegin(STRING_ESCAPE); return KickAssemblerTypes.STRING_ESCAPE_BEGIN; }

    {DEC_LITERAL}|{FLT_LITERAL}|{HEX_LITERAL}|{BIN_LITERAL} { pm(); return KickAssemblerTypes.NUMBER; }

    {CHAR_LITERAL} { pm(); return KickAssemblerTypes.CHAR; }
    {ESCAPE_CHAR_LITERAL} { pm(); return KickAssemblerTypes.ESCAPE_CHAR; }

    {LINE_COMMENT}  { pm(); return KickAssemblerTypes.COMMENT_LINE; }
    {BLOCK_COMMENT} { pm(); return KickAssemblerTypes.COMMENT_BLOCK; }

    [^] { pm(); return KickAssemblerTypes.DUMMY; }
}

<POST_DOT> {
    "const"         { yybegin(SYMBOL_DEF); return KickAssemblerTypes.DIRECTIVE_DEF; }
    "var"           { yybegin(SYMBOL_DEF); return KickAssemblerTypes.DIRECTIVE_DEF; }

    "align"         { pm(); return KickAssemblerTypes.DIRECTIVE_ALIGN; }
    "assert"        { pm(); return KickAssemblerTypes.DIRECTIVE_ASSERT; }
    "asserterror"   { pm(); return KickAssemblerTypes.DIRECTIVE_BINARY; }
    "break"         { pm(); return KickAssemblerTypes.DIRECTIVE_BREAK; }
    "by"| "byte"    { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "cpu"           { pm(); return KickAssemblerTypes.DIRECTIVE_CPU; }
    "define"        { pm(); return KickAssemblerTypes.DIRECTIVE_DEFINE; }
    "disk"          { pm(); return KickAssemblerTypes.DIRECTIVE_DISK; }
    "dw"            { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "dword"         { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "encoding"      { pm(); return KickAssemblerTypes.DIRECTIVE_ENCODING; }
    "enum"          { pm(); return KickAssemblerTypes.DIRECTIVE_ENUM; }
    "error"         { pm(); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "errorif"       { pm(); return KickAssemblerTypes.DIRECTIVE_BINARY; }
    "eval"          { pm(); return KickAssemblerTypes.DIRECTIVE_EVAL; }
    "file"          { pm(); return KickAssemblerTypes.DIRECTIVE_PARAM; }
    "filemodify"    { pm(); return KickAssemblerTypes.DIRECTIVE_FILEMODIFY; }
    "filenamespace" { pm(); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "fill"          { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "fillword"      { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "for"           { pm(); return KickAssemblerTypes.DIRECTIVE_FOR; }
    "function"      { pm(); return KickAssemblerTypes.DIRECTIVE_FUNCTION; }
    "if"            { pm(); return KickAssemblerTypes.DIRECTIVE_IF; }
    "import"        { pm(); return KickAssemblerTypes.DIRECTIVE_IMPORT; }
    "importonce"    { pm(); return KickAssemblerTypes.DIRECTIVE_IMPORTONCE; }   // deprecated
    "label"         { pm(); return KickAssemblerTypes.DIRECTIVE_DEF; }
    "lohifill"      { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "macro"         { pm(); return KickAssemblerTypes.DIRECTIVE_DEF_MACRO; }
    "memblock"      { pm(); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "modify"        { pm(); return KickAssemblerTypes.DIRECTIVE_MODIFY; }
    "namespace"     { pm(); return KickAssemblerTypes.DIRECTIVE_NAMESPACE; }
    "pc"            { pm(); return KickAssemblerTypes.DIRECTIVE_PC; }
    "plugin"        { pm(); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "print"         { pm(); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "printnow"      { pm(); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "pseudocommand" { pm(); return KickAssemblerTypes.DIRECTIVE; }
    "pseudopc"      { pm(); return KickAssemblerTypes.DIRECTIVE; }
    "return"        { pm(); return KickAssemblerTypes.DIRECTIVE_RETURN; }
    "segment"       { pm(); return KickAssemblerTypes.DIRECTIVE_SEGMENT; }
    "segmentdef"    { pm(); return KickAssemblerTypes.DIRECTIVE_SEGMENT_DEF; }
    "segmentout"    { pm(); return KickAssemblerTypes.DIRECTIVE_PARAM; }
    "struct"        { pm(); return KickAssemblerTypes.DIRECTIVE_STRUCT; }
    "te" | "text"   { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "watch"         { pm(); return KickAssemblerTypes.DIRECTIVE_WATCH; }
    "while"         { pm(); return KickAssemblerTypes.DIRECTIVE_WHILE; }
    "wo" | "word"   { pm(); return KickAssemblerTypes.DIRECTIVE_DATA; }

    {LABEL_DEF}       { pm(); return KickAssemblerTypes.LABEL_DEF; }
    {MULTILABEL_DEF}  { pm(); return KickAssemblerTypes.MULTILABEL_DEF; }
    {LABEL}           { pm(); return KickAssemblerTypes.LABEL; }
    {MULTILABEL}      { pm(); return KickAssemblerTypes.MULTILABEL; }

}

<MNEMONIC_SUFFIX> {
    /*
    These override the addressing mode of a mnemonic as at v5.16 see
    http://www.theweb.dk/KickAssembler/webhelp/content/ch03s02.html
    */
    "a"             { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION; }
    "abs"           { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION; }
    "zp"            { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION; }
    "z"             { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION; }

    /* Deprecated mnemonic extensions supported but discouraged. */
    "im"  | "imm"     { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Immediate
    "zx"  | "zpx"     { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Zeropage,x	lda.zpx table
    "zy"  | "zpy"     { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Zeropage,y
    "izx" | "izpx"	  { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Indirect zeropage,x
    "izy" | "izpy"	  { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Indirect zeropage,y
    "ax"  | "absx"    { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Absolute,x	lda.absx $1234
    "ay"  | "absy"    { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Absolute,y
    "i"   | "ind"     { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Indirect	jmp.i $1000
    "r"   | "rel"     { yybegin(YYINITIAL); return KickAssemblerTypes.MNEMONIC_EXTENSION_DEPRECATED; } // Relative to program counter

    "const"         { yybegin(SYMBOL_DEF); return KickAssemblerTypes.DIRECTIVE_DEF; }
    "var"           { yybegin(SYMBOL_DEF); return KickAssemblerTypes.DIRECTIVE_DEF; }

    "align"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_ALIGN; }
    "assert"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_ASSERT; }
    "asserterror"   { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_BINARY; }
    "break"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_BREAK; }
    "by"            { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "byte"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "cpu"           { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_CPU; }
    "define"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DEFINE; }
    "disk"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DISK; }
    "dw"            { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "dword"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "encoding"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_ENCODING; }
    "enum"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_ENUM; }
    "error"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "errorif"       { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_BINARY; }
    "eval"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_EVAL; }
    "file"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_PARAM; }
    "filemodify"    { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_FILEMODIFY; }
    "filenamespace" { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "fill"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "fillword"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "for"           { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_FOR; }
    "function"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_FUNCTION; }
    "if"            { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_IF; }
    "import"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_IMPORT; }
    "importonce"    { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_IMPORTONCE; }   // deprecated
    "label"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DEF; }
    "lohifill"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "macro"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DEF_MACRO; }
    "memblock"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "modify"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_MODIFY; }
    "namespace"     { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_NAMESPACE; }
    "pc"            { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_PC; }
    "plugin"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "print"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "printnow"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_UNARY; }
    "pseudocommand" { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE; }
    "pseudopc"      { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE; }
    "return"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_RETURN; }
    "segment"       { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_SEGMENT; }
    "segmentdef"    { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_SEGMENT_DEF; }
    "segmentout"    { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_PARAM; }
    "struct"        { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_STRUCT; }
    "te"            { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "text"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "watch"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_WATCH; }
    "while"         { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_WHILE; }
    "wo"            { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }
    "word"          { yybegin(YYINITIAL); return KickAssemblerTypes.DIRECTIVE_DATA; }

    {LINE_COMMENT}  { return KickAssemblerTypes.COMMENT_LINE; }
    {BLOCK_COMMENT} { return KickAssemblerTypes.COMMENT_BLOCK; }

    ";"	 { yybegin(YYINITIAL); return KickAssemblerTypes.SEMICOLON; }

    [^] { yybegin(YYINITIAL); return KickAssemblerTypes.DUMMY; }
}

<SYMBOL_DEF> {
    {LABEL}           { yybegin(YYINITIAL); return KickAssemblerTypes.LABEL; }
    {ANY_BLANKS}   { pm(); return TokenType.WHITE_SPACE; }
}

<STRING_ESCAPE> {
    // TODO PETSCII conversions
    \"              { yybegin(YYINITIAL); return KickAssemblerTypes.STRING_END; }

    [^\n\r\"\\]+    { return KickAssemblerTypes.STRING_VALUE; }
    {ESCAPE_CHAR}   { return KickAssemblerTypes.ESCAPE_CHAR; }

}
