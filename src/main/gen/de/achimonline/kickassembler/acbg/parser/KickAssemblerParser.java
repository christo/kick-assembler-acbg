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
  // DOT DIRECTIVE_ALIGN expr
  public static boolean alignDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "alignDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_ALIGN);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, ALIGN_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr | HASH? expr | labelDef? HASH? expr
  public static boolean argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENT, "<argument>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = argument_1(builder_, level_ + 1);
    if (!result_) result_ = argument_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // HASH? expr
  private static boolean argument_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = argument_1_0(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // HASH?
  private static boolean argument_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_1_0")) return false;
    consumeToken(builder_, HASH);
    return true;
  }

  // labelDef? HASH? expr
  private static boolean argument_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = argument_2_0(builder_, level_ + 1);
    result_ = result_ && argument_2_1(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // labelDef?
  private static boolean argument_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_2_0")) return false;
    labelDef(builder_, level_ + 1);
    return true;
  }

  // HASH?
  private static boolean argument_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_2_1")) return false;
    consumeToken(builder_, HASH);
    return true;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_ASSERT stringLiteral COMMA (block | expr) COMMA (block | expr)
  public static boolean assert_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assert_$")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_ASSERT);
    result_ = result_ && stringLiteral(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && assert_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && assert_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSERT, result_);
    return result_;
  }

  // block | expr
  private static boolean assert_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assert_4")) return false;
    boolean result_;
    result_ = block(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    return result_;
  }

  // block | expr
  private static boolean assert_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assert_6")) return false;
    boolean result_;
    result_ = block(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER | BOOLEAN | NULL | CHAR | ESCAPE_CHAR | stringLiteral
  public static boolean basicValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basicValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BASIC_VALUE, "<basic value>");
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, NULL);
    if (!result_) result_ = consumeToken(builder_, CHAR);
    if (!result_) result_ = consumeToken(builder_, ESCAPE_CHAR);
    if (!result_) result_ = stringLiteral(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACE
  //     (statement | macroDef | functionDef | preprocessorDirective | pseudoCommandDef)*
  //      RIGHT_BRACE
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

  // (statement | macroDef | functionDef | preprocessorDirective | pseudoCommandDef)*
  private static boolean block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!block_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "block_1", pos_)) break;
    }
    return true;
  }

  // statement | macroDef | functionDef | preprocessorDirective | pseudoCommandDef
  private static boolean block_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1_0")) return false;
    boolean result_;
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = macroDef(builder_, level_ + 1);
    if (!result_) result_ = functionDef(builder_, level_ + 1);
    if (!result_) result_ = preprocessorDirective(builder_, level_ + 1);
    if (!result_) result_ = pseudoCommandDef(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // (  LEFT_PAREN  expr  RIGHT_PAREN  ) | ( LEFT_BRACKET expr RIGHT_BRACKET )
  public static boolean bracketed(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed")) return false;
    if (!nextTokenIs(builder_, "<bracketed>", LEFT_BRACKET, LEFT_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BRACKETED, "<bracketed>");
    result_ = bracketed_0(builder_, level_ + 1);
    if (!result_) result_ = bracketed_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LEFT_PAREN  expr  RIGHT_PAREN
  private static boolean bracketed_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketed_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
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
  // DOT DIRECTIVE_BREAK STRING?
  public static boolean breakDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "breakDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_BREAK);
    result_ = result_ && breakDirective_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, BREAK_DIRECTIVE, result_);
    return result_;
  }

  // STRING?
  private static boolean breakDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "breakDirective_2")) return false;
    consumeToken(builder_, STRING);
    return true;
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
  // statement | preprocessorDirective | block
  static boolean compound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compound")) return false;
    boolean result_;
    result_ = statement(builder_, level_ + 1);
    if (!result_) result_ = preprocessorDirective(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_CPU ( "_6502NoIllegals" | "_6502" | "dtv" | "_65c02")
  public static boolean cpuDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cpuDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_CPU);
    result_ = result_ && cpuDirective_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CPU_DIRECTIVE, result_);
    return result_;
  }

  // "_6502NoIllegals" | "_6502" | "dtv" | "_65c02"
  private static boolean cpuDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cpuDirective_2")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "_6502NoIllegals");
    if (!result_) result_ = consumeToken(builder_, "_6502");
    if (!result_) result_ = consumeToken(builder_, "dtv");
    if (!result_) result_ = consumeToken(builder_, "_65c02");
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_DATA exprs (COMMA LEFT_BRACKET expr (COMMA exprs)* RIGHT_BRACKET)?
  public static boolean dataDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_DATA);
    result_ = result_ && exprs(builder_, level_ + 1);
    result_ = result_ && dataDefinition_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, DATA_DEFINITION, result_);
    return result_;
  }

  // (COMMA LEFT_BRACKET expr (COMMA exprs)* RIGHT_BRACKET)?
  private static boolean dataDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition_3")) return false;
    dataDefinition_3_0(builder_, level_ + 1);
    return true;
  }

  // COMMA LEFT_BRACKET expr (COMMA exprs)* RIGHT_BRACKET
  private static boolean dataDefinition_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, LEFT_BRACKET);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && dataDefinition_3_0_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA exprs)*
  private static boolean dataDefinition_3_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition_3_0_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dataDefinition_3_0_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dataDefinition_3_0_3", pos_)) break;
    }
    return true;
  }

  // COMMA exprs
  private static boolean dataDefinition_3_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dataDefinition_3_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && exprs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DIRECTIVE_DEF AT? LABEL ASSIGN expr
  static boolean defExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExpr")) return false;
    if (!nextTokenIs(builder_, DIRECTIVE_DEF)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, DIRECTIVE_DEF);
    result_ = result_ && defExpr_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 2, LABEL, ASSIGN);
    pinned_ = result_; // pin = 4
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // AT?
  private static boolean defExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExpr_1")) return false;
    consumeToken(builder_, AT);
    return true;
  }

  /* ********************************************************** */
  // exprMaybeDef ( COMMA exprMaybeDef )*
  public static boolean defExprList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExprList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DEF_EXPR_LIST, "<def expr list>");
    result_ = exprMaybeDef(builder_, level_ + 1);
    result_ = result_ && defExprList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( COMMA exprMaybeDef )*
  private static boolean defExprList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExprList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!defExprList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "defExprList_1", pos_)) break;
    }
    return true;
  }

  // COMMA exprMaybeDef
  private static boolean defExprList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defExprList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && exprMaybeDef(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_DEFINE LABEL ( COMMA LABEL)* block
  public static boolean defineDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defineDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_DEFINE, LABEL);
    result_ = result_ && defineDirective_3(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEFINE_DIRECTIVE, result_);
    return result_;
  }

  // ( COMMA LABEL)*
  private static boolean defineDirective_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defineDirective_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!defineDirective_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "defineDirective_3", pos_)) break;
    }
    return true;
  }

  // COMMA LABEL
  private static boolean defineDirective_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defineDirective_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // cpuDirective |
  //     encodingDirective |
  //     breakDirective |
  //     watchDirective |
  //     alignDirective |
  //     paramDirective |
  //     diskDirective |
  //     enumDirective |
  //     defineDirective |
  //     filemodifyDirective |
  //     modifyDirective |
  //     namespaceDirective |
  //     segmentDirective |
  //     structDirective
  static boolean directive(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    result_ = cpuDirective(builder_, level_ + 1);
    if (!result_) result_ = encodingDirective(builder_, level_ + 1);
    if (!result_) result_ = breakDirective(builder_, level_ + 1);
    if (!result_) result_ = watchDirective(builder_, level_ + 1);
    if (!result_) result_ = alignDirective(builder_, level_ + 1);
    if (!result_) result_ = paramDirective(builder_, level_ + 1);
    if (!result_) result_ = diskDirective(builder_, level_ + 1);
    if (!result_) result_ = enumDirective(builder_, level_ + 1);
    if (!result_) result_ = defineDirective(builder_, level_ + 1);
    if (!result_) result_ = filemodifyDirective(builder_, level_ + 1);
    if (!result_) result_ = modifyDirective(builder_, level_ + 1);
    if (!result_) result_ = namespaceDirective(builder_, level_ + 1);
    if (!result_) result_ = segmentDirective(builder_, level_ + 1);
    if (!result_) result_ = structDirective(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_DISK [LABEL] [parameterMap] LEFT_BRACE parameterMapList RIGHT_BRACE
  public static boolean diskDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "diskDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_DISK);
    result_ = result_ && diskDirective_2(builder_, level_ + 1);
    result_ = result_ && diskDirective_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && parameterMapList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, DISK_DIRECTIVE, result_);
    return result_;
  }

  // [LABEL]
  private static boolean diskDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "diskDirective_2")) return false;
    consumeToken(builder_, LABEL);
    return true;
  }

  // [parameterMap]
  private static boolean diskDirective_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "diskDirective_3")) return false;
    parameterMap(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_IMPORT (
  //     "source" STRING |
  //     ("binary"|"c64"|"text") STRING [ COMMA expr [ COMMA expr ]]
  // )
  static boolean dotImport(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_IMPORT);
    result_ = result_ && dotImport_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "source" STRING |
  //     ("binary"|"c64"|"text") STRING [ COMMA expr [ COMMA expr ]]
  private static boolean dotImport_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dotImport_2_0(builder_, level_ + 1);
    if (!result_) result_ = dotImport_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "source" STRING
  private static boolean dotImport_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "source");
    result_ = result_ && consumeToken(builder_, STRING);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ("binary"|"c64"|"text") STRING [ COMMA expr [ COMMA expr ]]
  private static boolean dotImport_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = dotImport_2_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRING);
    result_ = result_ && dotImport_2_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "binary"|"c64"|"text"
  private static boolean dotImport_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "binary");
    if (!result_) result_ = consumeToken(builder_, "c64");
    if (!result_) result_ = consumeToken(builder_, "text");
    return result_;
  }

  // [ COMMA expr [ COMMA expr ]]
  private static boolean dotImport_2_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_1_2")) return false;
    dotImport_2_1_2_0(builder_, level_ + 1);
    return true;
  }

  // COMMA expr [ COMMA expr ]
  private static boolean dotImport_2_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && dotImport_2_1_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA expr ]
  private static boolean dotImport_2_1_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_1_2_0_2")) return false;
    dotImport_2_1_2_0_2_0(builder_, level_ + 1);
    return true;
  }

  // COMMA expr
  private static boolean dotImport_2_1_2_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotImport_2_1_2_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_ENCODING (encodingValue | LEFT_PAREN encodingValue RIGHT_PAREN)
  public static boolean encodingDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encodingDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_ENCODING);
    result_ = result_ && encodingDirective_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENCODING_DIRECTIVE, result_);
    return result_;
  }

  // encodingValue | LEFT_PAREN encodingValue RIGHT_PAREN
  private static boolean encodingDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encodingDirective_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = encodingValue(builder_, level_ + 1);
    if (!result_) result_ = encodingDirective_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_PAREN encodingValue RIGHT_PAREN
  private static boolean encodingDirective_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encodingDirective_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && encodingValue(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "\"screencode_mixed\""
  //     | "\"screencode_upper\""
  //     | "\"petscii_mixed\""
  //     | "\"petscii_upper\""
  //     | "\"ascii\""
  static boolean encodingValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "encodingValue")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "\"screencode_mixed\"");
    if (!result_) result_ = consumeToken(builder_, "\"screencode_upper\"");
    if (!result_) result_ = consumeToken(builder_, "\"petscii_mixed\"");
    if (!result_) result_ = consumeToken(builder_, "\"petscii_upper\"");
    if (!result_) result_ = consumeToken(builder_, "\"ascii\"");
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_ENUM LEFT_BRACE parameter (COMMA parameter) RIGHT_BRACE
  public static boolean enumDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_ENUM, LEFT_BRACE);
    result_ = result_ && parameter(builder_, level_ + 1);
    result_ = result_ && enumDirective_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, ENUM_DIRECTIVE, result_);
    return result_;
  }

  // COMMA parameter
  private static boolean enumDirective_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDirective_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_ESCAPE_BEGIN ( STRING_VALUE | ESCAPE_CHAR | ESCAPE_HEX)* STRING_END
  public static boolean escapedString(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "escapedString")) return false;
    if (!nextTokenIs(builder_, STRING_ESCAPE_BEGIN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_ESCAPE_BEGIN);
    result_ = result_ && escapedString_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRING_END);
    exit_section_(builder_, marker_, ESCAPED_STRING, result_);
    return result_;
  }

  // ( STRING_VALUE | ESCAPE_CHAR | ESCAPE_HEX)*
  private static boolean escapedString_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "escapedString_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!escapedString_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "escapedString_1", pos_)) break;
    }
    return true;
  }

  // STRING_VALUE | ESCAPE_CHAR | ESCAPE_HEX
  private static boolean escapedString_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "escapedString_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRING_VALUE);
    if (!result_) result_ = consumeToken(builder_, ESCAPE_CHAR);
    if (!result_) result_ = consumeToken(builder_, ESCAPE_HEX);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_EVAL expr
  public static boolean evalExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "evalExpression")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_EVAL);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, EVAL_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( exprLeft ( infixOperator expr | ternaryRhs )+ ) | exprLeft
  public static boolean expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, EXPR, "<expr>");
    result_ = expr_0(builder_, level_ + 1);
    if (!result_) result_ = exprLeft(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // exprLeft ( infixOperator expr | ternaryRhs )+
  private static boolean expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = exprLeft(builder_, level_ + 1);
    result_ = result_ && expr_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( infixOperator expr | ternaryRhs )+
  private static boolean expr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr_0_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!expr_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expr_0_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // infixOperator expr | ternaryRhs
  private static boolean expr_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr_0_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = ternaryRhs(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // infixOperator expr
  private static boolean expr_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = infixOperator(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ LESS | GREATER ] (
  //         bracketed | basicValue | invocation | scopedLabel postfixOperator? | multilabel | ASTERISK |
  //         ( prefixOperator exprLeft )
  //     )
  static boolean exprLeft(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = exprLeft_0(builder_, level_ + 1);
    result_ = result_ && exprLeft_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ LESS | GREATER ]
  private static boolean exprLeft_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_0")) return false;
    exprLeft_0_0(builder_, level_ + 1);
    return true;
  }

  // LESS | GREATER
  private static boolean exprLeft_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    return result_;
  }

  // bracketed | basicValue | invocation | scopedLabel postfixOperator? | multilabel | ASTERISK |
  //         ( prefixOperator exprLeft )
  private static boolean exprLeft_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = bracketed(builder_, level_ + 1);
    if (!result_) result_ = basicValue(builder_, level_ + 1);
    if (!result_) result_ = invocation(builder_, level_ + 1);
    if (!result_) result_ = exprLeft_1_3(builder_, level_ + 1);
    if (!result_) result_ = multilabel(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = exprLeft_1_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // scopedLabel postfixOperator?
  private static boolean exprLeft_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_1_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = scopedLabel(builder_, level_ + 1);
    result_ = result_ && exprLeft_1_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // postfixOperator?
  private static boolean exprLeft_1_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_1_3_1")) return false;
    postfixOperator(builder_, level_ + 1);
    return true;
  }

  // prefixOperator exprLeft
  private static boolean exprLeft_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprLeft_1_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = prefixOperator(builder_, level_ + 1);
    result_ = result_ && exprLeft(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // defExpr | expr
  public static boolean exprMaybeDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprMaybeDef")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPR_MAYBE_DEF, "<expr maybe def>");
    result_ = defExpr(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expr ( COMMA expr )*
  static boolean exprs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && exprs_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( COMMA expr )*
  private static boolean exprs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprs_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!exprs_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exprs_1", pos_)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean exprs_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprs_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_FILEMODIFY invocation
  public static boolean filemodifyDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "filemodifyDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_FILEMODIFY);
    result_ = result_ && invocation(builder_, level_ + 1);
    exit_section_(builder_, marker_, FILEMODIFY_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_FOR LEFT_PAREN  defExprList SEMICOLON exprs SEMICOLON exprs RIGHT_PAREN
  //     compound
  public static boolean forLoop(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forLoop")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_FOR, LEFT_PAREN);
    result_ = result_ && defExprList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && exprs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && exprs(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    result_ = result_ && compound(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_LOOP, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_FUNCTION invocableDef
  public static boolean functionDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDef")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_FUNCTION);
    result_ = result_ && invocableDef(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_DEF, result_);
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
  // DOT DIRECTIVE_IF LEFT_PAREN expr RIGHT_PAREN compound [ ELSE compound ]
  public static boolean ifElse(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifElse")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_IF, LEFT_PAREN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    result_ = result_ && compound(builder_, level_ + 1);
    result_ = result_ && ifElse_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_ELSE, result_);
    return result_;
  }

  // [ ELSE compound ]
  private static boolean ifElse_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifElse_6")) return false;
    ifElse_6_0(builder_, level_ + 1);
    return true;
  }

  // ELSE compound
  private static boolean ifElse_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifElse_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && compound(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PREPROCESSOR_IMPORT STRING | dotImport
  public static boolean import_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_$")) return false;
    if (!nextTokenIs(builder_, "<import $>", DOT, PREPROCESSOR_IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IMPORT, "<import $>");
    result_ = parseTokens(builder_, 0, PREPROCESSOR_IMPORT, STRING);
    if (!result_) result_ = dotImport(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_IMPORTONCE | PREPROCESSOR_IMPORTONCE
  public static boolean importOnce(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importOnce")) return false;
    if (!nextTokenIs(builder_, "<import once>", DOT, PREPROCESSOR_IMPORTONCE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IMPORT_ONCE, "<import once>");
    result_ = parseTokens(builder_, 0, DOT, DIRECTIVE_IMPORTONCE);
    if (!result_) result_ = consumeToken(builder_, PREPROCESSOR_IMPORTONCE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DOT | PLUS | MINUS | ASTERISK | DIVIDE |
  //     ppInfixOperator |
  //     LESS | GREATER | LESS_EQUALS | GREATER_EQUALS |
  //     BIT_AND | BIT_OR | BIT_XOR |
  //     SHIFT_LEFT | SHIFT_RIGHT |
  //     PLUS_EQUAL | MINUS_EQUAL | ASTERISK ASSIGN | DIVIDE_EQUAL |
  //     ASSIGN
  public static boolean infixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIX_OPERATOR, "<infix operator>");
    result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = consumeToken(builder_, DIVIDE);
    if (!result_) result_ = ppInfixOperator(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    if (!result_) result_ = consumeToken(builder_, LESS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, GREATER_EQUALS);
    if (!result_) result_ = consumeToken(builder_, BIT_AND);
    if (!result_) result_ = consumeToken(builder_, BIT_OR);
    if (!result_) result_ = consumeToken(builder_, BIT_XOR);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT);
    if (!result_) result_ = consumeToken(builder_, PLUS_EQUAL);
    if (!result_) result_ = consumeToken(builder_, MINUS_EQUAL);
    if (!result_) result_ = parseTokens(builder_, 0, ASTERISK, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, DIVIDE_EQUAL);
    if (!result_) result_ = consumeToken(builder_, ASSIGN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // MNEMONIC0 [ DOT mnemonicExt]
  //     | MNEMONIC1 [ DOT mnemonicExt] oneArgument
  //     | MNEMONIC12 [ DOT mnemonicExt] oneOrTwoArguments
  //     | (MNEMONIC_012 | MNEMONIC_ILLEGAL) [ DOT mnemonicExt] oneOrTwoArguments?
  public static boolean instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INSTRUCTION, "<instruction>");
    result_ = instruction_0(builder_, level_ + 1);
    if (!result_) result_ = instruction_1(builder_, level_ + 1);
    if (!result_) result_ = instruction_2(builder_, level_ + 1);
    if (!result_) result_ = instruction_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // MNEMONIC0 [ DOT mnemonicExt]
  private static boolean instruction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MNEMONIC0);
    result_ = result_ && instruction_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ DOT mnemonicExt]
  private static boolean instruction_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_0_1")) return false;
    instruction_0_1_0(builder_, level_ + 1);
    return true;
  }

  // DOT mnemonicExt
  private static boolean instruction_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && mnemonicExt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MNEMONIC1 [ DOT mnemonicExt] oneArgument
  private static boolean instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MNEMONIC1);
    result_ = result_ && instruction_1_1(builder_, level_ + 1);
    result_ = result_ && oneArgument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ DOT mnemonicExt]
  private static boolean instruction_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_1_1")) return false;
    instruction_1_1_0(builder_, level_ + 1);
    return true;
  }

  // DOT mnemonicExt
  private static boolean instruction_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && mnemonicExt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MNEMONIC12 [ DOT mnemonicExt] oneOrTwoArguments
  private static boolean instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MNEMONIC12);
    result_ = result_ && instruction_2_1(builder_, level_ + 1);
    result_ = result_ && oneOrTwoArguments(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ DOT mnemonicExt]
  private static boolean instruction_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_2_1")) return false;
    instruction_2_1_0(builder_, level_ + 1);
    return true;
  }

  // DOT mnemonicExt
  private static boolean instruction_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && mnemonicExt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (MNEMONIC_012 | MNEMONIC_ILLEGAL) [ DOT mnemonicExt] oneOrTwoArguments?
  private static boolean instruction_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = instruction_3_0(builder_, level_ + 1);
    result_ = result_ && instruction_3_1(builder_, level_ + 1);
    result_ = result_ && instruction_3_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MNEMONIC_012 | MNEMONIC_ILLEGAL
  private static boolean instruction_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_3_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, MNEMONIC_012);
    if (!result_) result_ = consumeToken(builder_, MNEMONIC_ILLEGAL);
    return result_;
  }

  // [ DOT mnemonicExt]
  private static boolean instruction_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_3_1")) return false;
    instruction_3_1_0(builder_, level_ + 1);
    return true;
  }

  // DOT mnemonicExt
  private static boolean instruction_3_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_3_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && mnemonicExt(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // oneOrTwoArguments?
  private static boolean instruction_3_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instruction_3_2")) return false;
    oneOrTwoArguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ( LEFT_BRACE  ( invocableInternal )+  RIGHT_BRACE ) | invocableInternal
  static boolean invocableBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = invocableBody_0(builder_, level_ + 1);
    if (!result_) result_ = invocableInternal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACE  ( invocableInternal )+  RIGHT_BRACE
  private static boolean invocableBody_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableBody_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && invocableBody_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( invocableInternal )+
  private static boolean invocableBody_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableBody_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = invocableBody_0_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!invocableBody_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "invocableBody_0_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( invocableInternal )
  private static boolean invocableBody_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableBody_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = invocableInternal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // AT? LABEL  LEFT_PAREN  identifierList?  RIGHT_PAREN  invocableBody
  static boolean invocableDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableDef")) return false;
    if (!nextTokenIs(builder_, "", AT, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = invocableDef_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LABEL, LEFT_PAREN);
    result_ = result_ && invocableDef_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    result_ = result_ && invocableBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // AT?
  private static boolean invocableDef_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableDef_0")) return false;
    consumeToken(builder_, AT);
    return true;
  }

  // identifierList?
  private static boolean invocableDef_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableDef_3")) return false;
    identifierList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // preprocessorDirective | statement
  static boolean invocableInternal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocableInternal")) return false;
    boolean result_;
    result_ = preprocessorDirective(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // callable  LEFT_PAREN  exprs?  RIGHT_PAREN  | nArityDirectives | assert
  public static boolean invocation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INVOCATION, "<invocation>");
    result_ = invocation_0(builder_, level_ + 1);
    if (!result_) result_ = nArityDirectives(builder_, level_ + 1);
    if (!result_) result_ = assert_$(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // callable  LEFT_PAREN  exprs?  RIGHT_PAREN
  private static boolean invocation_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocation_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = callable(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && invocation_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // exprs?
  private static boolean invocation_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "invocation_0_2")) return false;
    exprs(builder_, level_ + 1);
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
  // DOT defExpr
  public static boolean labelAssignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelAssignment")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && defExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, LABEL_ASSIGNMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // AT? LABEL_DEF
  static boolean labelDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelDef")) return false;
    if (!nextTokenIs(builder_, "", AT, LABEL_DEF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = labelDef_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LABEL_DEF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // AT?
  private static boolean labelDef_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelDef_0")) return false;
    consumeToken(builder_, AT);
    return true;
  }

  /* ********************************************************** */
  // AT? LABEL [ LEFT_BRACKET expr RIGHT_BRACKET ]
  static boolean labelExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelExpr")) return false;
    if (!nextTokenIs(builder_, "", AT, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = labelExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LABEL);
    result_ = result_ && labelExpr_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // AT?
  private static boolean labelExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelExpr_0")) return false;
    consumeToken(builder_, AT);
    return true;
  }

  // [ LEFT_BRACKET expr RIGHT_BRACKET ]
  private static boolean labelExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelExpr_2")) return false;
    labelExpr_2_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACKET expr RIGHT_BRACKET
  private static boolean labelExpr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelExpr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // labelDef | multilabelDef
  static boolean labelsDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelsDef")) return false;
    boolean result_;
    result_ = labelDef(builder_, level_ + 1);
    if (!result_) result_ = multilabelDef(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_DEF_MACRO invocableDef
  public static boolean macroDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macroDef")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_DEF_MACRO);
    result_ = result_ && invocableDef(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_DEF, result_);
    return result_;
  }

  /* ********************************************************** */
  // MNEMONIC_EXTENSION | MNEMONIC_EXTENSION_DEPRECATED
  static boolean mnemonicExt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mnemonicExt")) return false;
    if (!nextTokenIs(builder_, "", MNEMONIC_EXTENSION, MNEMONIC_EXTENSION_DEPRECATED)) return false;
    boolean result_;
    result_ = consumeToken(builder_, MNEMONIC_EXTENSION);
    if (!result_) result_ = consumeToken(builder_, MNEMONIC_EXTENSION_DEPRECATED);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_MODIFY invocation block
  public static boolean modifyDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modifyDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_MODIFY);
    result_ = result_ && invocation(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODIFY_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // BANG LABEL? ( PLUS+ | MINUS+ )
  public static boolean multilabel(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabel")) return false;
    if (!nextTokenIs(builder_, BANG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BANG);
    result_ = result_ && multilabel_1(builder_, level_ + 1);
    result_ = result_ && multilabel_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, MULTILABEL, result_);
    return result_;
  }

  // LABEL?
  private static boolean multilabel_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabel_1")) return false;
    consumeToken(builder_, LABEL);
    return true;
  }

  // PLUS+ | MINUS+
  private static boolean multilabel_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabel_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multilabel_2_0(builder_, level_ + 1);
    if (!result_) result_ = multilabel_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS+
  private static boolean multilabel_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabel_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, PLUS)) break;
      if (!empty_element_parsed_guard_(builder_, "multilabel_2_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MINUS+
  private static boolean multilabel_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabel_2_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MINUS);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, MINUS)) break;
      if (!empty_element_parsed_guard_(builder_, "multilabel_2_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BANG (LABEL_DEF | COLON)
  public static boolean multilabelDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabelDef")) return false;
    if (!nextTokenIs(builder_, BANG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BANG);
    result_ = result_ && multilabelDef_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MULTILABEL_DEF, result_);
    return result_;
  }

  // LABEL_DEF | COLON
  private static boolean multilabelDef_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multilabelDef_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LABEL_DEF);
    if (!result_) result_ = consumeToken(builder_, COLON);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_UNARY expr |
  //     DOT DIRECTIVE_BINARY expr COMMA expr |
  //     DOT DIRECTIVE_TERNARY expr COMMA expr COMMA expr
  static boolean nArityDirectives(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nArityDirectives")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = nArityDirectives_0(builder_, level_ + 1);
    if (!result_) result_ = nArityDirectives_1(builder_, level_ + 1);
    if (!result_) result_ = nArityDirectives_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT DIRECTIVE_UNARY expr
  private static boolean nArityDirectives_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nArityDirectives_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_UNARY);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT DIRECTIVE_BINARY expr COMMA expr
  private static boolean nArityDirectives_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nArityDirectives_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_BINARY);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT DIRECTIVE_TERNARY expr COMMA expr COMMA expr
  private static boolean nArityDirectives_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nArityDirectives_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_TERNARY);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_NAMESPACE LABEL block
  public static boolean namespaceDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_NAMESPACE, LABEL);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAMESPACE_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // oneArgumentIndirect | argument
  static boolean oneArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "oneArgument")) return false;
    boolean result_;
    result_ = oneArgumentIndirect(builder_, level_ + 1);
    if (!result_) result_ = argument(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_PAREN  argument  RIGHT_PAREN
  public static boolean oneArgumentIndirect(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "oneArgumentIndirect")) return false;
    if (!nextTokenIs(builder_, LEFT_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && argument(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, ONE_ARGUMENT_INDIRECT, result_);
    return result_;
  }

  /* ********************************************************** */
  // twoArguments | oneArgument
  static boolean oneOrTwoArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "oneOrTwoArguments")) return false;
    boolean result_;
    result_ = twoArguments(builder_, level_ + 1);
    if (!result_) result_ = oneArgument(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_PARAM parameterMap
  public static boolean paramDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paramDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_PARAM);
    result_ = result_ && parameterMap(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAM_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // LABEL [ASSIGN expr]
  public static boolean parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter")) return false;
    if (!nextTokenIs(builder_, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LABEL);
    result_ = result_ && parameter_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAMETER, result_);
    return result_;
  }

  // [ASSIGN expr]
  private static boolean parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1")) return false;
    parameter_1_0(builder_, level_ + 1);
    return true;
  }

  // ASSIGN expr
  private static boolean parameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // parameter ( COMMA parameter )* COMMA?
  static boolean parameterList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterList")) return false;
    if (!nextTokenIs(builder_, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter(builder_, level_ + 1);
    result_ = result_ && parameterList_1(builder_, level_ + 1);
    result_ = result_ && parameterList_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( COMMA parameter )*
  private static boolean parameterList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameterList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameterList_1", pos_)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameterList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA?
  private static boolean parameterList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterList_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LEFT_BRACKET [ parameterList ] RIGHT_BRACKET
  public static boolean parameterMap(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterMap")) return false;
    if (!nextTokenIs(builder_, LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && parameterMap_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, PARAMETER_MAP, result_);
    return result_;
  }

  // [ parameterList ]
  private static boolean parameterMap_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterMap_1")) return false;
    parameterList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // parameterMap [ COMMA parameterMapList ] COMMA?
  static boolean parameterMapList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterMapList")) return false;
    if (!nextTokenIs(builder_, LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameterMap(builder_, level_ + 1);
    result_ = result_ && parameterMapList_1(builder_, level_ + 1);
    result_ = result_ && parameterMapList_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA parameterMapList ]
  private static boolean parameterMapList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterMapList_1")) return false;
    parameterMapList_1_0(builder_, level_ + 1);
    return true;
  }

  // COMMA parameterMapList
  private static boolean parameterMapList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterMapList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameterMapList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA?
  private static boolean parameterMapList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameterMapList_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // (ASTERISK | DOT DIRECTIVE_PC) ASSIGN expr STRING? "virtual"?
  public static boolean pcAssignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pcAssignment")) return false;
    if (!nextTokenIs(builder_, "<pc assignment>", ASTERISK, DOT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PC_ASSIGNMENT, "<pc assignment>");
    result_ = pcAssignment_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, pcAssignment_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && pcAssignment_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ASTERISK | DOT DIRECTIVE_PC
  private static boolean pcAssignment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pcAssignment_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASTERISK);
    if (!result_) result_ = parseTokens(builder_, 0, DOT, DIRECTIVE_PC);
    exit_section_(builder_, marker_, null, result_);
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
  // PLUS PLUS | MINUS MINUS
  public static boolean postfixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfixOperator")) return false;
    if (!nextTokenIs(builder_, "<postfix operator>", MINUS, PLUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POSTFIX_OPERATOR, "<postfix operator>");
    result_ = parseTokens(builder_, 0, PLUS, PLUS);
    if (!result_) result_ = parseTokens(builder_, 0, MINUS, MINUS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ppExprLeft (ppInfixOperator ppExpr)*
  public static boolean ppExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PP_EXPR, "<pp expr>");
    result_ = ppExprLeft(builder_, level_ + 1);
    result_ = result_ && ppExpr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (ppInfixOperator ppExpr)*
  private static boolean ppExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExpr_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ppExpr_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ppExpr_1", pos_)) break;
    }
    return true;
  }

  // ppInfixOperator ppExpr
  private static boolean ppExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExpr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ppInfixOperator(builder_, level_ + 1);
    result_ = result_ && ppExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [BANG] ((basicValue | scopedLabel ) | LEFT_PAREN  ppExpr RIGHT_PAREN )
  public static boolean ppExprLeft(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExprLeft")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PP_EXPR_LEFT, "<pp expr left>");
    result_ = ppExprLeft_0(builder_, level_ + 1);
    result_ = result_ && ppExprLeft_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [BANG]
  private static boolean ppExprLeft_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExprLeft_0")) return false;
    consumeToken(builder_, BANG);
    return true;
  }

  // (basicValue | scopedLabel ) | LEFT_PAREN  ppExpr RIGHT_PAREN
  private static boolean ppExprLeft_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExprLeft_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ppExprLeft_1_0(builder_, level_ + 1);
    if (!result_) result_ = ppExprLeft_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // basicValue | scopedLabel
  private static boolean ppExprLeft_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExprLeft_1_0")) return false;
    boolean result_;
    result_ = basicValue(builder_, level_ + 1);
    if (!result_) result_ = scopedLabel(builder_, level_ + 1);
    return result_;
  }

  // LEFT_PAREN  ppExpr RIGHT_PAREN
  private static boolean ppExprLeft_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppExprLeft_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && ppExpr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // EQUAL | NOT_EQUAL | AND | OR
  static boolean ppInfixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ppInfixOperator")) return false;
    boolean result_;
    result_ = consumeToken(builder_, EQUAL);
    if (!result_) result_ = consumeToken(builder_, NOT_EQUAL);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, OR);
    return result_;
  }

  /* ********************************************************** */
  // MINUS | BANG | BIT_NOT
  public static boolean prefixOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefixOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PREFIX_OPERATOR, "<prefix operator>");
    result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, BANG);
    if (!result_) result_ = consumeToken(builder_, BIT_NOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PREPROCESSOR |
  //     (PREPROCESSOR_IF | PREPROCESSOR_DEF ) ppExpr
  public static boolean preprocessorDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "preprocessorDirective")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PREPROCESSOR_DIRECTIVE, "<preprocessor directive>");
    result_ = consumeToken(builder_, PREPROCESSOR);
    if (!result_) result_ = preprocessorDirective_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (PREPROCESSOR_IF | PREPROCESSOR_DEF ) ppExpr
  private static boolean preprocessorDirective_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "preprocessorDirective_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = preprocessorDirective_1_0(builder_, level_ + 1);
    result_ = result_ && ppExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PREPROCESSOR_IF | PREPROCESSOR_DEF
  private static boolean preprocessorDirective_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "preprocessorDirective_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PREPROCESSOR_IF);
    if (!result_) result_ = consumeToken(builder_, PREPROCESSOR_DEF);
    return result_;
  }

  /* ********************************************************** */
  // LABEL [ pseudoCommandArgs ]
  public static boolean pseudoCommand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommand")) return false;
    if (!nextTokenIs(builder_, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LABEL);
    result_ = result_ && pseudoCommand_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PSEUDO_COMMAND, result_);
    return result_;
  }

  // [ pseudoCommandArgs ]
  private static boolean pseudoCommand_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommand_1")) return false;
    pseudoCommandArgs(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // oneOrTwoArguments? (COLON oneOrTwoArguments)*
  static boolean pseudoCommandArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandArgs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = pseudoCommandArgs_0(builder_, level_ + 1);
    result_ = result_ && pseudoCommandArgs_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // oneOrTwoArguments?
  private static boolean pseudoCommandArgs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandArgs_0")) return false;
    oneOrTwoArguments(builder_, level_ + 1);
    return true;
  }

  // (COLON oneOrTwoArguments)*
  private static boolean pseudoCommandArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandArgs_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!pseudoCommandArgs_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "pseudoCommandArgs_1", pos_)) break;
    }
    return true;
  }

  // COLON oneOrTwoArguments
  private static boolean pseudoCommandArgs_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandArgs_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && oneOrTwoArguments(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_PSEUDOCOMMAND AT? LABEL [LABEL (COLON LABEL)*] invocableBody
  public static boolean pseudoCommandDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandDef")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_PSEUDOCOMMAND);
    result_ = result_ && pseudoCommandDef_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LABEL);
    result_ = result_ && pseudoCommandDef_4(builder_, level_ + 1);
    result_ = result_ && invocableBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, PSEUDO_COMMAND_DEF, result_);
    return result_;
  }

  // AT?
  private static boolean pseudoCommandDef_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandDef_2")) return false;
    consumeToken(builder_, AT);
    return true;
  }

  // [LABEL (COLON LABEL)*]
  private static boolean pseudoCommandDef_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandDef_4")) return false;
    pseudoCommandDef_4_0(builder_, level_ + 1);
    return true;
  }

  // LABEL (COLON LABEL)*
  private static boolean pseudoCommandDef_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandDef_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LABEL);
    result_ = result_ && pseudoCommandDef_4_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COLON LABEL)*
  private static boolean pseudoCommandDef_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandDef_4_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!pseudoCommandDef_4_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "pseudoCommandDef_4_0_1", pos_)) break;
    }
    return true;
  }

  // COLON LABEL
  private static boolean pseudoCommandDef_4_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoCommandDef_4_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COLON, LABEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_PSEUDOPC expr block
  public static boolean pseudoPcAssignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pseudoPcAssignment")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_PSEUDOPC);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, PSEUDO_PC_ASSIGNMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_RETURN [expr]
  public static boolean returnStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnStatement")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_RETURN);
    result_ = result_ && returnStatement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
  }

  // [expr]
  private static boolean returnStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnStatement_2")) return false;
    expr(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // compound |
  //            macroDef |
  //            functionDef |
  //            pseudoCommandDef |
  //            importOnce |
  //            DOT DIRECTIVE |
  //            COMMENT_LINE |
  //            COMMENT_BLOCK |
  //            DUMMY
  public static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROOT, "<root>");
    result_ = compound(builder_, level_ + 1);
    if (!result_) result_ = macroDef(builder_, level_ + 1);
    if (!result_) result_ = functionDef(builder_, level_ + 1);
    if (!result_) result_ = pseudoCommandDef(builder_, level_ + 1);
    if (!result_) result_ = importOnce(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, DOT, DIRECTIVE);
    if (!result_) result_ = consumeToken(builder_, COMMENT_LINE);
    if (!result_) result_ = consumeToken(builder_, COMMENT_BLOCK);
    if (!result_) result_ = consumeToken(builder_, DUMMY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // labelExpr ( DOT labelExpr )*
  public static boolean scopedLabel(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopedLabel")) return false;
    if (!nextTokenIs(builder_, "<scoped label>", AT, LABEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SCOPED_LABEL, "<scoped label>");
    result_ = labelExpr(builder_, level_ + 1);
    result_ = result_ && scopedLabel_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( DOT labelExpr )*
  private static boolean scopedLabel_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopedLabel_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!scopedLabel_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "scopedLabel_1", pos_)) break;
    }
    return true;
  }

  // DOT labelExpr
  private static boolean scopedLabel_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopedLabel_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && labelExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT (DIRECTIVE_SEGMENT | DIRECTIVE_SEGMENT_DEF) LABEL [parameterMap] [STRING]
  public static boolean segmentDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "segmentDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && segmentDirective_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LABEL);
    result_ = result_ && segmentDirective_3(builder_, level_ + 1);
    result_ = result_ && segmentDirective_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, SEGMENT_DIRECTIVE, result_);
    return result_;
  }

  // DIRECTIVE_SEGMENT | DIRECTIVE_SEGMENT_DEF
  private static boolean segmentDirective_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "segmentDirective_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DIRECTIVE_SEGMENT);
    if (!result_) result_ = consumeToken(builder_, DIRECTIVE_SEGMENT_DEF);
    return result_;
  }

  // [parameterMap]
  private static boolean segmentDirective_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "segmentDirective_3")) return false;
    parameterMap(builder_, level_ + 1);
    return true;
  }

  // [STRING]
  private static boolean segmentDirective_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "segmentDirective_4")) return false;
    consumeToken(builder_, STRING);
    return true;
  }

  /* ********************************************************** */
  // (
  //     directive |
  //     instruction |
  //     import |
  //     dataDefinition |
  //     invocation |
  //     pseudoCommand |
  //     labelsDef |
  //     assert |
  //     block |
  //     pcAssignment |
  //     pseudoPcAssignment |
  //     labelAssignment |
  //     forLoop |
  //     ifElse |
  //     while |
  //     evalExpression |
  //     returnStatement |
  //     SEMICOLON
  // ) LINE_BREAK*
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = statement_0(builder_, level_ + 1);
    result_ = result_ && statement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // directive |
  //     instruction |
  //     import |
  //     dataDefinition |
  //     invocation |
  //     pseudoCommand |
  //     labelsDef |
  //     assert |
  //     block |
  //     pcAssignment |
  //     pseudoPcAssignment |
  //     labelAssignment |
  //     forLoop |
  //     ifElse |
  //     while |
  //     evalExpression |
  //     returnStatement |
  //     SEMICOLON
  private static boolean statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0")) return false;
    boolean result_;
    result_ = directive(builder_, level_ + 1);
    if (!result_) result_ = instruction(builder_, level_ + 1);
    if (!result_) result_ = import_$(builder_, level_ + 1);
    if (!result_) result_ = dataDefinition(builder_, level_ + 1);
    if (!result_) result_ = invocation(builder_, level_ + 1);
    if (!result_) result_ = pseudoCommand(builder_, level_ + 1);
    if (!result_) result_ = labelsDef(builder_, level_ + 1);
    if (!result_) result_ = assert_$(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    if (!result_) result_ = pcAssignment(builder_, level_ + 1);
    if (!result_) result_ = pseudoPcAssignment(builder_, level_ + 1);
    if (!result_) result_ = labelAssignment(builder_, level_ + 1);
    if (!result_) result_ = forLoop(builder_, level_ + 1);
    if (!result_) result_ = ifElse(builder_, level_ + 1);
    if (!result_) result_ = while_$(builder_, level_ + 1);
    if (!result_) result_ = evalExpression(builder_, level_ + 1);
    if (!result_) result_ = returnStatement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    return result_;
  }

  // LINE_BREAK*
  private static boolean statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(builder_, "statement_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING | escapedString
  static boolean stringLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stringLiteral")) return false;
    if (!nextTokenIs(builder_, "", STRING, STRING_ESCAPE_BEGIN)) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = escapedString(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_STRUCT LABEL  LEFT_BRACE  identifierList?  RIGHT_BRACE
  public static boolean structDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_STRUCT, LABEL, LEFT_BRACE);
    result_ = result_ && structDirective_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, STRUCT_DIRECTIVE, result_);
    return result_;
  }

  // identifierList?
  private static boolean structDirective_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDirective_4")) return false;
    identifierList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // QUESTION_MARK expr COLON expr
  public static boolean ternaryRhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternaryRhs")) return false;
    if (!nextTokenIs(builder_, QUESTION_MARK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUESTION_MARK);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, TERNARY_RHS, result_);
    return result_;
  }

  /* ********************************************************** */
  // (argument COMMA argument) | twoArgumentsIndirect
  static boolean twoArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "twoArguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = twoArguments_0(builder_, level_ + 1);
    if (!result_) result_ = twoArgumentsIndirect(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // argument COMMA argument
  private static boolean twoArguments_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "twoArguments_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = argument(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_PAREN  argument COMMA argument  RIGHT_PAREN
  public static boolean twoArgumentsIndirect(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "twoArgumentsIndirect")) return false;
    if (!nextTokenIs(builder_, LEFT_PAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && argument(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && argument(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, TWO_ARGUMENTS_INDIRECT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_WATCH expr [ COMMA expr [ COMMA STRING ] ]
  public static boolean watchDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "watchDirective")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_WATCH);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && watchDirective_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, WATCH_DIRECTIVE, result_);
    return result_;
  }

  // [ COMMA expr [ COMMA STRING ] ]
  private static boolean watchDirective_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "watchDirective_3")) return false;
    watchDirective_3_0(builder_, level_ + 1);
    return true;
  }

  // COMMA expr [ COMMA STRING ]
  private static boolean watchDirective_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "watchDirective_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && watchDirective_3_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA STRING ]
  private static boolean watchDirective_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "watchDirective_3_0_2")) return false;
    parseTokens(builder_, 0, COMMA, STRING);
    return true;
  }

  /* ********************************************************** */
  // DOT DIRECTIVE_WHILE LEFT_PAREN expr RIGHT_PAREN compound
  public static boolean while_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_$")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, DIRECTIVE_WHILE, LEFT_PAREN);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    result_ = result_ && compound(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHILE, result_);
    return result_;
  }

}
