// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.achimonline.kickassembler.acbg.psi.impl.*;

public interface KickAssemblerTypes {

  IElementType ARGUMENT = new KickAssemblerElementType("ARGUMENT");
  IElementType BASIC_VALUE = new KickAssemblerElementType("BASIC_VALUE");
  IElementType BLOCK = new KickAssemblerElementType("BLOCK");
  IElementType BRACKETED = new KickAssemblerElementType("BRACKETED");
  IElementType CPU_DIRECTIVE = new KickAssemblerElementType("CPU_DIRECTIVE");
  IElementType DATA_DEFINITION = new KickAssemblerElementType("DATA_DEFINITION");
  IElementType DEF_EXPR = new KickAssemblerElementType("DEF_EXPR");
  IElementType DEF_EXPR_LIST = new KickAssemblerElementType("DEF_EXPR_LIST");
  IElementType ENCODING_DIRECTIVE = new KickAssemblerElementType("ENCODING_DIRECTIVE");
  IElementType EXPR = new KickAssemblerElementType("EXPR");
  IElementType EXPR_LEFT = new KickAssemblerElementType("EXPR_LEFT");
  IElementType EXPR_LIST = new KickAssemblerElementType("EXPR_LIST");
  IElementType FOR_LOOP = new KickAssemblerElementType("FOR_LOOP");
  IElementType IDENTIFIER_LIST = new KickAssemblerElementType("IDENTIFIER_LIST");
  IElementType IMPORT = new KickAssemblerElementType("IMPORT");
  IElementType INFIX_OPERATOR = new KickAssemblerElementType("INFIX_OPERATOR");
  IElementType INSTRUCTION = new KickAssemblerElementType("INSTRUCTION");
  IElementType INVOCATION = new KickAssemblerElementType("INVOCATION");
  IElementType LABEL_ASSIGNMENT = new KickAssemblerElementType("LABEL_ASSIGNMENT");
  IElementType MACRO_DEFINITION = new KickAssemblerElementType("MACRO_DEFINITION");
  IElementType PC_ASSIGNMENT = new KickAssemblerElementType("PC_ASSIGNMENT");
  IElementType POSTFIX_OPERATOR = new KickAssemblerElementType("POSTFIX_OPERATOR");
  IElementType PREFIX_OPERATOR = new KickAssemblerElementType("PREFIX_OPERATOR");
  IElementType ROOT = new KickAssemblerElementType("ROOT");
  IElementType SCOPED_LABEL = new KickAssemblerElementType("SCOPED_LABEL");
  IElementType STATEMENT = new KickAssemblerElementType("STATEMENT");

  IElementType AND = new KickAssemblerTokenType("AND");
  IElementType ASSIGN = new KickAssemblerTokenType("ASSIGN");
  IElementType ASTERISK = new KickAssemblerTokenType("ASTERISK");
  IElementType BASIC_UPSTART = new KickAssemblerTokenType("BASIC_UPSTART");
  IElementType BIT_AND = new KickAssemblerTokenType("BIT_AND");
  IElementType BIT_NOT = new KickAssemblerTokenType("BIT_NOT");
  IElementType BIT_OR = new KickAssemblerTokenType("BIT_OR");
  IElementType BIT_XOR = new KickAssemblerTokenType("BIT_XOR");
  IElementType BOOLEAN = new KickAssemblerTokenType("BOOLEAN");
  IElementType COLON = new KickAssemblerTokenType("COLON");
  IElementType COMMA = new KickAssemblerTokenType("COMMA");
  IElementType COMMENT_BLOCK = new KickAssemblerTokenType("COMMENT_BLOCK");
  IElementType COMMENT_LINE = new KickAssemblerTokenType("COMMENT_LINE");
  IElementType DEPRECATED_DIRECTIVE = new KickAssemblerTokenType("DEPRECATED_DIRECTIVE");
  IElementType DIRECTIVE = new KickAssemblerTokenType("DIRECTIVE");
  IElementType DIRECTIVE_BUILTIN = new KickAssemblerTokenType("DIRECTIVE_BUILTIN");
  IElementType DIRECTIVE_CPU = new KickAssemblerTokenType("DIRECTIVE_CPU");
  IElementType DIRECTIVE_DATA = new KickAssemblerTokenType("DIRECTIVE_DATA");
  IElementType DIRECTIVE_DEF = new KickAssemblerTokenType("DIRECTIVE_DEF");
  IElementType DIRECTIVE_DEF_MACRO = new KickAssemblerTokenType("DIRECTIVE_DEF_MACRO");
  IElementType DIRECTIVE_ENCODING = new KickAssemblerTokenType("DIRECTIVE_ENCODING");
  IElementType DIRECTIVE_FOR = new KickAssemblerTokenType("DIRECTIVE_FOR");
  IElementType DIRECTIVE_RETURN = new KickAssemblerTokenType("DIRECTIVE_RETURN");
  IElementType DIVIDE = new KickAssemblerTokenType("DIVIDE");
  IElementType DIVIDE_EQUAL = new KickAssemblerTokenType("DIVIDE_EQUAL");
  IElementType DOT = new KickAssemblerTokenType("DOT");
  IElementType DUMMY = new KickAssemblerTokenType("DUMMY");
  IElementType EQUAL = new KickAssemblerTokenType("EQUAL");
  IElementType GREATER = new KickAssemblerTokenType("GREATER");
  IElementType GREATER_EQUALS = new KickAssemblerTokenType("GREATER_EQUALS");
  IElementType HASH = new KickAssemblerTokenType("HASH");
  IElementType LABEL = new KickAssemblerTokenType("LABEL");
  IElementType LABEL_DEF = new KickAssemblerTokenType("LABEL_DEF");
  IElementType LEFT_BRACE = new KickAssemblerTokenType("LEFT_BRACE");
  IElementType LEFT_BRACKET = new KickAssemblerTokenType("LEFT_BRACKET");
  IElementType LEFT_PARENTHESES = new KickAssemblerTokenType("LEFT_PARENTHESES");
  IElementType LESS = new KickAssemblerTokenType("LESS");
  IElementType LESS_EQUALS = new KickAssemblerTokenType("LESS_EQUALS");
  IElementType MINUS = new KickAssemblerTokenType("MINUS");
  IElementType MINUS_EQUAL = new KickAssemblerTokenType("MINUS_EQUAL");
  IElementType MINUS_MINUS = new KickAssemblerTokenType("MINUS_MINUS");
  IElementType MNEMONIC = new KickAssemblerTokenType("MNEMONIC");
  IElementType MULTILABEL = new KickAssemblerTokenType("MULTILABEL");
  IElementType MULTILABEL_DEF = new KickAssemblerTokenType("MULTILABEL_DEF");
  IElementType NOT = new KickAssemblerTokenType("NOT");
  IElementType NOT_EQUAL = new KickAssemblerTokenType("NOT_EQUAL");
  IElementType NULL = new KickAssemblerTokenType("NULL");
  IElementType NUMBER = new KickAssemblerTokenType("NUMBER");
  IElementType OR = new KickAssemblerTokenType("OR");
  IElementType PLUS = new KickAssemblerTokenType("PLUS");
  IElementType PLUS_EQUAL = new KickAssemblerTokenType("PLUS_EQUAL");
  IElementType PLUS_PLUS = new KickAssemblerTokenType("PLUS_PLUS");
  IElementType PREPROCESSOR = new KickAssemblerTokenType("PREPROCESSOR");
  IElementType PREPROCESSOR_IMPORT = new KickAssemblerTokenType("PREPROCESSOR_IMPORT");
  IElementType QUESTION_MARK = new KickAssemblerTokenType("QUESTION_MARK");
  IElementType RIGHT_BRACE = new KickAssemblerTokenType("RIGHT_BRACE");
  IElementType RIGHT_BRACKET = new KickAssemblerTokenType("RIGHT_BRACKET");
  IElementType RIGHT_PARENTHESES = new KickAssemblerTokenType("RIGHT_PARENTHESES");
  IElementType SEMICOLON = new KickAssemblerTokenType("SEMICOLON");
  IElementType SHIFT_LEFT = new KickAssemblerTokenType("SHIFT_LEFT");
  IElementType SHIFT_RIGHT = new KickAssemblerTokenType("SHIFT_RIGHT");
  IElementType STRING = new KickAssemblerTokenType("STRING");
  IElementType TIMES_EQUAL = new KickAssemblerTokenType("TIMES_EQUAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT) {
        return new KickAssemblerArgumentImpl(node);
      }
      else if (type == BASIC_VALUE) {
        return new KickAssemblerBasicValueImpl(node);
      }
      else if (type == BLOCK) {
        return new KickAssemblerBlockImpl(node);
      }
      else if (type == BRACKETED) {
        return new KickAssemblerBracketedImpl(node);
      }
      else if (type == CPU_DIRECTIVE) {
        return new KickAssemblerCpuDirectiveImpl(node);
      }
      else if (type == DATA_DEFINITION) {
        return new KickAssemblerDataDefinitionImpl(node);
      }
      else if (type == DEF_EXPR) {
        return new KickAssemblerDefExprImpl(node);
      }
      else if (type == DEF_EXPR_LIST) {
        return new KickAssemblerDefExprListImpl(node);
      }
      else if (type == ENCODING_DIRECTIVE) {
        return new KickAssemblerEncodingDirectiveImpl(node);
      }
      else if (type == EXPR) {
        return new KickAssemblerExprImpl(node);
      }
      else if (type == EXPR_LEFT) {
        return new KickAssemblerExprLeftImpl(node);
      }
      else if (type == EXPR_LIST) {
        return new KickAssemblerExprListImpl(node);
      }
      else if (type == FOR_LOOP) {
        return new KickAssemblerForLoopImpl(node);
      }
      else if (type == IDENTIFIER_LIST) {
        return new KickAssemblerIdentifierListImpl(node);
      }
      else if (type == IMPORT) {
        return new KickAssemblerImportImpl(node);
      }
      else if (type == INFIX_OPERATOR) {
        return new KickAssemblerInfixOperatorImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new KickAssemblerInstructionImpl(node);
      }
      else if (type == INVOCATION) {
        return new KickAssemblerInvocationImpl(node);
      }
      else if (type == LABEL_ASSIGNMENT) {
        return new KickAssemblerLabelAssignmentImpl(node);
      }
      else if (type == MACRO_DEFINITION) {
        return new KickAssemblerMacroDefinitionImpl(node);
      }
      else if (type == PC_ASSIGNMENT) {
        return new KickAssemblerPcAssignmentImpl(node);
      }
      else if (type == POSTFIX_OPERATOR) {
        return new KickAssemblerPostfixOperatorImpl(node);
      }
      else if (type == PREFIX_OPERATOR) {
        return new KickAssemblerPrefixOperatorImpl(node);
      }
      else if (type == ROOT) {
        return new KickAssemblerRootImpl(node);
      }
      else if (type == SCOPED_LABEL) {
        return new KickAssemblerScopedLabelImpl(node);
      }
      else if (type == STATEMENT) {
        return new KickAssemblerStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
