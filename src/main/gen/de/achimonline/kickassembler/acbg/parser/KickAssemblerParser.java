// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.achimonline.kickassembler.acbg.psi.KickAssemblerTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class KickAssemblerParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return kickAssemblerFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // LABEL_DEF? HASH? ( LESS | GREATER )? expr
  public static boolean argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENT, "<argument>");
    result_ = argument_0(builder_, level_ + 1);
    result_ = result_ && argument_1(builder_, level_ + 1);
    result_ = result_ && argument_2(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LABEL_DEF?
  private static boolean argument_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_0")) return false;
    consumeToken(builder_, LABEL_DEF);
    return true;
  }

  // HASH?
  private static boolean argument_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_1")) return false;
    consumeToken(builder_, HASH);
    return true;
  }

  // ( LESS | GREATER )?
  private static boolean argument_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_2")) return false;
    argument_2_0(builder_, level_ + 1);
    return true;
  }

  // LESS | GREATER
  private static boolean argument_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_2_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    return result_;
  }

  /* ********************************************************** */
  // STRING | NUMBER | BOOLEAN | NULL
  public static boolean basicValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basicValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BASIC_VALUE, "<basic value>");
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, NULL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACE statement* RIGHT_BRACE
  public static boolean block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block")) return false;
    if (!nextTokenIs(builder_, LEFT_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && block_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, BLOCK, result_);
    return result_;
  }

  // statement*
  private static boolean block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "block_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ( LEFT_PARENTHESES expr RIGHT_PARENTHESES )
  //     | ( LEFT_BRACKET expr RIGHT_BRACKET )
  public static boolean bracketed(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed")) return false;
    if (!nextTokenIs(builder_, "<bracketed>", LEFT_BRACKET, LEFT_PARENTHESES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BRACKETED, "<bracketed>");
    result_ = bracketed_0(builder_, level_ + 1);
    if (!result_) result_ = bracketed_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LEFT_PARENTHESES expr RIGHT_PARENTHESES
  private static boolean bracketed_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PARENTHESES);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PARENTHESES);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACKET expr RIGHT_BRACKET
  private static boolean bracketed_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( [COLON] ( scopedLabel | BASIC_UPSTART ) ) | DIRECTIVE_BUILTIN
  static boolean callable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = callable_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DIRECTIVE_BUILTIN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [COLON] ( scopedLabel | BASIC_UPSTART )
  private static boolean callable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = callable_0_0(builder_, level_ + 1);
    result_ = result_ && callable_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [COLON]
  private static boolean callable_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_0_0")) return false;
    consumeToken(builder_, COLON);
    return true;
  }

  // scopedLabel | BASIC_UPSTART
  private static boolean callable_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callable_0_1")) return false;
    boolean result_;
    result_ = scopedLabel(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, BASIC_UPSTART);
    return result_;
  }

  /* ********************************************************** */
  // DIRECTIVE_CPU ("_6502NoIllegals" | "_6502" | "dtv" | "_65c02")
  public static boolean cpuDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cpuDirective")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_CPU)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIRECTIVE_CPU);
    result_ = result_ && cpuDirective_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CPU_DIRECTIVE, result_);
    return result_;
  }

  // "_6502NoIllegals" | "_6502" | "dtv" | "_65c02"
  private static boolean cpuDirective_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cpuDirective_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "_6502NoIllegals");
    if (!result_) result_ = consumeToken(builder_, "_6502");
    if (!result_) result_ = consumeToken(builder_, "dtv");
    if (!result_) result_ = consumeToken(builder_, "_65c02");
    return result_;
  }

  /* ********************************************************** */
  // DIRECTIVE_DATA exprList
  public static boolean dataDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_DATA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIRECTIVE_DATA);
    result_ = result_ && exprList(builder_, level_ + 1);
    exit_section_(builder_, marker_, DATA_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // "var" | "const"
  static boolean declarationKeyword(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declarationKeyword")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "var");
    if (!result_) result_ = consumeToken(builder_, "const");
    return result_;
  }

  /* ********************************************************** */
  // ( declarationKeyword? LABEL ASSIGN expr ) | expr
  public static boolean defExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DEF_EXPR, "<def expr>");
    result_ = defExpr_0(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // declarationKeyword? LABEL ASSIGN expr
  private static boolean defExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = defExpr_0_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LABEL, ASSIGN);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // declarationKeyword?
  private static boolean defExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExpr_0_0")) return false;
    declarationKeyword(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // defExpr ( COMMA defExpr )*
  public static boolean defExprList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExprList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DEF_EXPR_LIST, "<def expr list>");
    result_ = defExpr(builder_, level_ + 1);
    result_ = result_ && defExprList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( COMMA defExpr )*
  private static boolean defExprList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExprList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!defExprList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "defExprList_1", pos_)) break;
    }
    return true;
  }

  // COMMA defExpr
  private static boolean defExprList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExprList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && defExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIRECTIVE_ENCODING  ( "\"screencode_mixed\"" | "\"screencode_upper\"" )
  public static boolean encodingDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encodingDirective")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_ENCODING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIRECTIVE_ENCODING);
    result_ = result_ && encodingDirective_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENCODING_DIRECTIVE, result_);
    return result_;
  }

  // "\"screencode_mixed\"" | "\"screencode_upper\""
  private static boolean encodingDirective_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encodingDirective_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "\"screencode_mixed\"");
    if (!result_) result_ = consumeToken(builder_, "\"screencode_upper\"");
    return result_;
  }

  /* ********************************************************** */
  // exprLeft ( infixOperator expr )*
  public static boolean expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPR, "<expr>");
    result_ = exprLeft(builder_, level_ + 1);
    result_ = result_ && expr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( infixOperator expr )*
  private static boolean expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expr_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_1", pos_)) break;
    }
    return true;
  }

  // infixOperator expr
  private static boolean expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = infixOperator(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (
  //         bracketed | basicValue | invocation | scopedLabel | MULTILABEL | ASTERISK |
  //         ( prefixOperator exprLeft )
  //     ) postfixOperator?
  public static boolean exprLeft(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR_LEFT, "<expr left>");
    result_ = exprLeft_0(builder_, level_ + 1);
    result_ = result_ && exprLeft_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // bracketed | basicValue | invocation | scopedLabel | MULTILABEL | ASTERISK |
  //         ( prefixOperator exprLeft )
  private static boolean exprLeft_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = bracketed(builder_, level_ + 1);
    if (!result_) result_ = basicValue(builder_, level_ + 1);
    if (!result_) result_ = invocation(builder_, level_ + 1);
    if (!result_) result_ = scopedLabel(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MULTILABEL);
    if (!result_) result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = exprLeft_0_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // prefixOperator exprLeft
  private static boolean exprLeft_0_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_0_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = prefixOperator(builder_, level_ + 1);
    result_ = result_ && exprLeft(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // postfixOperator?
  private static boolean exprLeft_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_1")) return false;
    postfixOperator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expr ( COMMA expr )*
  public static boolean exprList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPR_LIST, "<expr list>");
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && exprList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( COMMA expr )*
  private static boolean exprList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!exprList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exprList_1", pos_)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean exprList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIRECTIVE_FOR LEFT_PARENTHESES defExprList SEMICOLON exprList SEMICOLON exprList RIGHT_PARENTHESES
  //     (statement | block)
  public static boolean forLoop(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forLoop")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DIRECTIVE_FOR, LEFT_PARENTHESES);
    result_ = result_ && defExprList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && exprList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && exprList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PARENTHESES);
    result_ = result_ && forLoop_8(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_LOOP, result_);
    return result_;
  }

  // statement | block
  private static boolean forLoop_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forLoop_8")) return false;
    boolean result_;
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // LABEL ( COMMA LABEL )*
  public static boolean identifierList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifierList")) return false;
    if (!nextTokenIs(builder_, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LABEL);
    result_ = result_ && identifierList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, IDENTIFIER_LIST, result_);
    return result_;
  }

  // ( COMMA LABEL )*
  private static boolean identifierList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifierList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!identifierList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "identifierList_1", pos_)) break;
    }
    return true;
  }

  // COMMA LABEL
  private static boolean identifierList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifierList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PREPROCESSOR_IMPORT STRING
  public static boolean import_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_$")) return false;
    if (!nextTokenIs(builder_, PREPROCESSOR_IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PREPROCESSOR_IMPORT, STRING);
    exit_section_(builder_, marker_, IMPORT, result_);
    return result_;
  }

  /* ********************************************************** */
  // PLUS | MINUS | ASTERISK | DIVIDE |
  //     LESS | GREATER | LESS_EQUALS | GREATER_EQUALS | NOT_EQUAL |
  //     BIT_AND | BIT_OR | BIT_XOR |
  //     AND | OR |
  //     SHIFT_LEFT | SHIFT_RIGHT |
  //     PLUS_EQUAL | MINUS_EQUAL | TIMES_EQUAL | DIVIDE_EQUAL
  public static boolean infixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIX_OPERATOR, "<infix operator>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = consumeToken(builder_, DIVIDE);
    if (!result_) result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    if (!result_) result_ = consumeToken(builder_, LESS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, GREATER_EQUALS);
    if (!result_) result_ = consumeToken(builder_, NOT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, BIT_AND);
    if (!result_) result_ = consumeToken(builder_, BIT_OR);
    if (!result_) result_ = consumeToken(builder_, BIT_XOR);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT);
    if (!result_) result_ = consumeToken(builder_, PLUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, MINUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, TIMES_EQUAL);
    if (!result_) result_ = consumeToken(builder_, DIVIDE_EQUAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ( MNEMONIC argument argument ) |
  //     ( MNEMONIC argument ) |
  //     MNEMONIC
  public static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    if (!nextTokenIs(builder_, MNEMONIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = instruction_0(builder_, level_ + 1);
    if (!result_) result_ = instruction_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MNEMONIC);
    exit_section_(builder_, marker_, INSTRUCTION, result_);
    return result_;
  }

  // MNEMONIC argument argument
  private static boolean instruction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MNEMONIC);
    result_ = result_ && argument(builder_, level_ + 1);
    result_ = result_ && argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MNEMONIC argument
  private static boolean instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MNEMONIC);
    result_ = result_ && argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // callable LEFT_PARENTHESES exprList? RIGHT_PARENTHESES
  public static boolean invocation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INVOCATION, "<invocation>");
    result_ = callable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_PARENTHESES);
    result_ = result_ && invocation_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PARENTHESES);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // exprList?
  private static boolean invocation_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocation_2")) return false;
    exprList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // root*
  static boolean kickAssemblerFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "kickAssemblerFile")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!root(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "kickAssemblerFile", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DIRECTIVE_DEF LABEL ASSIGN expr
  public static boolean labelAssignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelAssignment")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_DEF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DIRECTIVE_DEF, LABEL, ASSIGN);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, LABEL_ASSIGNMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIRECTIVE_DEF_MACRO LABEL LEFT_PARENTHESES identifierList? RIGHT_PARENTHESES LEFT_BRACE
  //     ( statement )*
  //     RIGHT_BRACE
  public static boolean macroDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macroDefinition")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_DEF_MACRO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DIRECTIVE_DEF_MACRO, LABEL, LEFT_PARENTHESES);
    result_ = result_ && macroDefinition_3(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RIGHT_PARENTHESES, LEFT_BRACE);
    result_ = result_ && macroDefinition_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, MACRO_DEFINITION, result_);
    return result_;
  }

  // identifierList?
  private static boolean macroDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macroDefinition_3")) return false;
    identifierList(builder_, level_ + 1);
    return true;
  }

  // ( statement )*
  private static boolean macroDefinition_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macroDefinition_6")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!macroDefinition_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macroDefinition_6", pos_)) break;
    }
    return true;
  }

  // ( statement )
  private static boolean macroDefinition_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macroDefinition_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (ASTERISK | ".pc") ASSIGN expr STRING? "virtual"?
  public static boolean pcAssignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pcAssignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PC_ASSIGNMENT, "<pc assignment>");
    result_ = pcAssignment_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && pcAssignment_3(builder_, level_ + 1);
    result_ = result_ && pcAssignment_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ASTERISK | ".pc"
  private static boolean pcAssignment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pcAssignment_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = consumeToken(builder_, ".pc");
    return result_;
  }

  // STRING?
  private static boolean pcAssignment_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pcAssignment_3")) return false;
    consumeToken(builder_, STRING);
    return true;
  }

  // "virtual"?
  private static boolean pcAssignment_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pcAssignment_4")) return false;
    consumeToken(builder_, "virtual");
    return true;
  }

  /* ********************************************************** */
  // PLUS_PLUS | MINUS_MINUS
  public static boolean postfixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfixOperator")) return false;
    if (!nextTokenIs(builder_, "<postfix operator>", MINUS_MINUS, PLUS_PLUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POSTFIX_OPERATOR, "<postfix operator>");
    result_ = consumeToken(builder_, PLUS_PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS_MINUS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // MINUS | NOT | BIT_NOT
  public static boolean prefixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefixOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PREFIX_OPERATOR, "<prefix operator>");
    result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, BIT_NOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // statement |
  //            macroDefinition |
  //            STRING |
  //            NUMBER |
  //            BOOLEAN |
  //            NULL |
  //            LEFT_PARENTHESES |
  //            RIGHT_PARENTHESES |
  //            LEFT_BRACKET |
  //            RIGHT_BRACKET |
  //            LEFT_BRACE |
  //            RIGHT_BRACE |
  //            HASH |
  //            ASSIGN |
  //            COMMA |
  //            SEMICOLON |
  //            LESS_EQUALS |
  //            GREATER_EQUALS |
  //            LESS |
  //            GREATER |
  //            BIT_AND |
  //            BIT_OR |
  //            BIT_XOR |
  //            BIT_NOT |
  //            SHIFT_LEFT |
  //            SHIFT_RIGHT |
  //            PLUS |
  //            MINUS |
  //            ASTERISK |
  //            DIVIDE |
  //            NOT_EQUAL |
  //            EQUAL |
  //            AND |
  //            OR |
  //            NOT |
  //            PLUS_PLUS |
  //            MINUS_MINUS |
  //            PLUS_EQUAL |
  //            MINUS_EQUAL |
  //            TIMES_EQUAL |
  //            DIVIDE_EQUAL |
  //            DOT |
  //            COLON |
  //            QUESTION_MARK |
  //            PREPROCESSOR |
  //            DIRECTIVE_RETURN |
  //            DIRECTIVE_DATA |
  //            DIRECTIVE |
  //            DEPRECATED_DIRECTIVE |
  //            LABEL_DEF |
  //            MULTILABEL_DEF |
  //            MNEMONIC |
  //            LABEL |
  //            MULTILABEL |
  //            COMMENT_LINE |
  //            COMMENT_BLOCK |
  //            DUMMY
  public static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROOT, "<root>");
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = macroDefinition(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, NULL);
    if (!result_) result_ = consumeToken(builder_, LEFT_PARENTHESES);
    if (!result_) result_ = consumeToken(builder_, RIGHT_PARENTHESES);
    if (!result_) result_ = consumeToken(builder_, LEFT_BRACKET);
    if (!result_) result_ = consumeToken(builder_, RIGHT_BRACKET);
    if (!result_) result_ = consumeToken(builder_, LEFT_BRACE);
    if (!result_) result_ = consumeToken(builder_, RIGHT_BRACE);
    if (!result_) result_ = consumeToken(builder_, HASH);
    if (!result_) result_ = consumeToken(builder_, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, LESS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, GREATER_EQUALS);
    if (!result_) result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    if (!result_) result_ = consumeToken(builder_, BIT_AND);
    if (!result_) result_ = consumeToken(builder_, BIT_OR);
    if (!result_) result_ = consumeToken(builder_, BIT_XOR);
    if (!result_) result_ = consumeToken(builder_, BIT_NOT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = consumeToken(builder_, DIVIDE);
    if (!result_) result_ = consumeToken(builder_, NOT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, EQUAL);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, PLUS_PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS_MINUS);
    if (!result_) result_ = consumeToken(builder_, PLUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, MINUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, TIMES_EQUAL);
    if (!result_) result_ = consumeToken(builder_, DIVIDE_EQUAL);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, COLON);
    if (!result_) result_ = consumeToken(builder_, QUESTION_MARK);
    if (!result_) result_ = consumeToken(builder_, PREPROCESSOR);
    if (!result_) result_ = consumeToken(builder_, DIRECTIVE_RETURN);
    if (!result_) result_ = consumeToken(builder_, DIRECTIVE_DATA);
    if (!result_) result_ = consumeToken(builder_, DIRECTIVE);
    if (!result_) result_ = consumeToken(builder_, DEPRECATED_DIRECTIVE);
    if (!result_) result_ = consumeToken(builder_, LABEL_DEF);
    if (!result_) result_ = consumeToken(builder_, MULTILABEL_DEF);
    if (!result_) result_ = consumeToken(builder_, MNEMONIC);
    if (!result_) result_ = consumeToken(builder_, LABEL);
    if (!result_) result_ = consumeToken(builder_, MULTILABEL);
    if (!result_) result_ = consumeToken(builder_, COMMENT_LINE);
    if (!result_) result_ = consumeToken(builder_, COMMENT_BLOCK);
    if (!result_) result_ = consumeToken(builder_, DUMMY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LABEL ( DOT LABEL )*
  public static boolean scopedLabel(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopedLabel")) return false;
    if (!nextTokenIs(builder_, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LABEL);
    result_ = result_ && scopedLabel_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SCOPED_LABEL, result_);
    return result_;
  }

  // ( DOT LABEL )*
  private static boolean scopedLabel_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopedLabel_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!scopedLabel_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "scopedLabel_1", pos_)) break;
    }
    return true;
  }

  // DOT LABEL
  private static boolean scopedLabel_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopedLabel_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // import |
  //     dataDefinition |
  //     invocation |
  //     block |
  //     labelAssignment |
  //     pcAssignment |
  //     cpuDirective |
  //     encodingDirective |
  //     instruction |
  //     forLoop
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = import_$(builder_, level_ + 1);
    if (!result_) result_ = dataDefinition(builder_, level_ + 1);
    if (!result_) result_ = invocation(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    if (!result_) result_ = labelAssignment(builder_, level_ + 1);
    if (!result_) result_ = pcAssignment(builder_, level_ + 1);
    if (!result_) result_ = cpuDirective(builder_, level_ + 1);
    if (!result_) result_ = encodingDirective(builder_, level_ + 1);
    if (!result_) result_ = instruction(builder_, level_ + 1);
    if (!result_) result_ = forLoop(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
