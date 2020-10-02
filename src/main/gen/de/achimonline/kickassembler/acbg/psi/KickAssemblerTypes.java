// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.achimonline.kickassembler.acbg.psi.impl.*;

public interface KickAssemblerTypes {

  IElementType ALIGN_DIRECTIVE = new KickAssemblerElementType("ALIGN_DIRECTIVE");
  IElementType ARGUMENT = new KickAssemblerElementType("ARGUMENT");
  IElementType ASSERT = new KickAssemblerElementType("ASSERT");
  IElementType BASIC_VALUE = new KickAssemblerElementType("BASIC_VALUE");
  IElementType BLOCK = new KickAssemblerElementType("BLOCK");
  IElementType BRACKETED = new KickAssemblerElementType("BRACKETED");
  IElementType BREAK_DIRECTIVE = new KickAssemblerElementType("BREAK_DIRECTIVE");
  IElementType CPU_DIRECTIVE = new KickAssemblerElementType("CPU_DIRECTIVE");
  IElementType DATA_DEFINITION = new KickAssemblerElementType("DATA_DEFINITION");
  IElementType DEFINE_DIRECTIVE = new KickAssemblerElementType("DEFINE_DIRECTIVE");
  IElementType DEF_EXPR = new KickAssemblerElementType("DEF_EXPR");
  IElementType DEF_EXPR_LIST = new KickAssemblerElementType("DEF_EXPR_LIST");
  IElementType DISK_DIRECTIVE = new KickAssemblerElementType("DISK_DIRECTIVE");
  IElementType ENCODING_DIRECTIVE = new KickAssemblerElementType("ENCODING_DIRECTIVE");
  IElementType ENUM_DIRECTIVE = new KickAssemblerElementType("ENUM_DIRECTIVE");
  IElementType ESCAPED_STRING = new KickAssemblerElementType("ESCAPED_STRING");
  IElementType EVAL_EXPRESSION = new KickAssemblerElementType("EVAL_EXPRESSION");
  IElementType EXPR = new KickAssemblerElementType("EXPR");
  IElementType FILEMODIFY_DIRECTIVE = new KickAssemblerElementType("FILEMODIFY_DIRECTIVE");
  IElementType FOR_LOOP = new KickAssemblerElementType("FOR_LOOP");
  IElementType FUNCTION_DEFINITION = new KickAssemblerElementType("FUNCTION_DEFINITION");
  IElementType IDENTIFIER_LIST = new KickAssemblerElementType("IDENTIFIER_LIST");
  IElementType IF_ELSE = new KickAssemblerElementType("IF_ELSE");
  IElementType IMPORT = new KickAssemblerElementType("IMPORT");
  IElementType INFIX_OPERATOR = new KickAssemblerElementType("INFIX_OPERATOR");
  IElementType INSTRUCTION = new KickAssemblerElementType("INSTRUCTION");
  IElementType INVOCATION = new KickAssemblerElementType("INVOCATION");
  IElementType LABEL_ASSIGNMENT = new KickAssemblerElementType("LABEL_ASSIGNMENT");
  IElementType MACRO_DEFINITION = new KickAssemblerElementType("MACRO_DEFINITION");
  IElementType MODIFY_DIRECTIVE = new KickAssemblerElementType("MODIFY_DIRECTIVE");
  IElementType NAMESPACE_DIRECTIVE = new KickAssemblerElementType("NAMESPACE_DIRECTIVE");
  IElementType NILADIC = new KickAssemblerElementType("NILADIC");
  IElementType PARAMETER = new KickAssemblerElementType("PARAMETER");
  IElementType PARAMETER_MAP = new KickAssemblerElementType("PARAMETER_MAP");
  IElementType PARAM_DIRECTIVE = new KickAssemblerElementType("PARAM_DIRECTIVE");
  IElementType PC_ASSIGNMENT = new KickAssemblerElementType("PC_ASSIGNMENT");
  IElementType POSTFIX_OPERATOR = new KickAssemblerElementType("POSTFIX_OPERATOR");
  IElementType PREFIX_OPERATOR = new KickAssemblerElementType("PREFIX_OPERATOR");
  IElementType ROOT = new KickAssemblerElementType("ROOT");
  IElementType SCOPED_LABEL = new KickAssemblerElementType("SCOPED_LABEL");
  IElementType SEGMENT_DIRECTIVE = new KickAssemblerElementType("SEGMENT_DIRECTIVE");
  IElementType STATEMENT = new KickAssemblerElementType("STATEMENT");
  IElementType TERNARY_RHS = new KickAssemblerElementType("TERNARY_RHS");
  IElementType WATCH_DIRECTIVE = new KickAssemblerElementType("WATCH_DIRECTIVE");
  IElementType WHILE = new KickAssemblerElementType("WHILE");

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
  IElementType CPU_6502 = new KickAssemblerTokenType("_6502");
  IElementType CPU_6502_NO_ILLEGAL = new KickAssemblerTokenType("_6502NoIllegals");
  IElementType CPU_65C02 = new KickAssemblerTokenType("_65c02");
  IElementType CPU_DTV = new KickAssemblerTokenType("dtv");
  IElementType DIRECTIVE = new KickAssemblerTokenType("DIRECTIVE");
  IElementType DIRECTIVE_ALIGN = new KickAssemblerTokenType("DIRECTIVE_ALIGN");
  IElementType DIRECTIVE_ASSERT = new KickAssemblerTokenType("DIRECTIVE_ASSERT");
  IElementType DIRECTIVE_BINARY = new KickAssemblerTokenType("DIRECTIVE_BINARY");
  IElementType DIRECTIVE_BREAK = new KickAssemblerTokenType("DIRECTIVE_BREAK");
  IElementType DIRECTIVE_BUILTIN = new KickAssemblerTokenType("DIRECTIVE_BUILTIN");
  IElementType DIRECTIVE_CPU = new KickAssemblerTokenType("DIRECTIVE_CPU");
  IElementType DIRECTIVE_DATA = new KickAssemblerTokenType("DIRECTIVE_DATA");
  IElementType DIRECTIVE_DEF = new KickAssemblerTokenType("DIRECTIVE_DEF");
  IElementType DIRECTIVE_DEFINE = new KickAssemblerTokenType("DIRECTIVE_DEFINE");
  IElementType DIRECTIVE_DEF_MACRO = new KickAssemblerTokenType("DIRECTIVE_DEF_MACRO");
  IElementType DIRECTIVE_DISK = new KickAssemblerTokenType("DIRECTIVE_DISK");
  IElementType DIRECTIVE_ENCODING = new KickAssemblerTokenType("DIRECTIVE_ENCODING");
  IElementType DIRECTIVE_ENUM = new KickAssemblerTokenType("DIRECTIVE_ENUM");
  IElementType DIRECTIVE_EVAL = new KickAssemblerTokenType("DIRECTIVE_EVAL");
  IElementType DIRECTIVE_FILEMODIFY = new KickAssemblerTokenType("DIRECTIVE_FILEMODIFY");
  IElementType DIRECTIVE_FOR = new KickAssemblerTokenType("DIRECTIVE_FOR");
  IElementType DIRECTIVE_FUNCTION = new KickAssemblerTokenType("DIRECTIVE_FUNCTION");
  IElementType DIRECTIVE_IF = new KickAssemblerTokenType("DIRECTIVE_IF");
  IElementType DIRECTIVE_IMPORT = new KickAssemblerTokenType("DIRECTIVE_IMPORT");
  IElementType DIRECTIVE_IMPORTONCE = new KickAssemblerTokenType("DIRECTIVE_IMPORTONCE");
  IElementType DIRECTIVE_MODIFY = new KickAssemblerTokenType("DIRECTIVE_MODIFY");
  IElementType DIRECTIVE_NAMESPACE = new KickAssemblerTokenType("DIRECTIVE_NAMESPACE");
  IElementType DIRECTIVE_PARAM = new KickAssemblerTokenType("DIRECTIVE_PARAM");
  IElementType DIRECTIVE_PC = new KickAssemblerTokenType("DIRECTIVE_PC");
  IElementType DIRECTIVE_RETURN = new KickAssemblerTokenType("DIRECTIVE_RETURN");
  IElementType DIRECTIVE_SEGMENT = new KickAssemblerTokenType("DIRECTIVE_SEGMENT");
  IElementType DIRECTIVE_SEGMENT_DEF = new KickAssemblerTokenType("DIRECTIVE_SEGMENT_DEF");
  IElementType DIRECTIVE_TERNARY = new KickAssemblerTokenType("DIRECTIVE_TERNARY");
  IElementType DIRECTIVE_UNARY = new KickAssemblerTokenType("DIRECTIVE_UNARY");
  IElementType DIRECTIVE_WATCH = new KickAssemblerTokenType("DIRECTIVE_WATCH");
  IElementType DIRECTIVE_WHILE = new KickAssemblerTokenType("DIRECTIVE_WHILE");
  IElementType DIVIDE = new KickAssemblerTokenType("DIVIDE");
  IElementType DIVIDE_EQUAL = new KickAssemblerTokenType("DIVIDE_EQUAL");
  IElementType DOT = new KickAssemblerTokenType("DOT");
  IElementType DUMMY = new KickAssemblerTokenType("DUMMY");
  IElementType EQUAL = new KickAssemblerTokenType("EQUAL");
  IElementType ESCAPE_CHAR = new KickAssemblerTokenType("ESCAPE_CHAR");
  IElementType GREATER = new KickAssemblerTokenType("GREATER");
  IElementType GREATER_EQUALS = new KickAssemblerTokenType("GREATER_EQUALS");
  IElementType HASH = new KickAssemblerTokenType("HASH");
  IElementType LABEL = new KickAssemblerTokenType("LABEL");
  IElementType LABEL_DEF = new KickAssemblerTokenType("LABEL_DEF");
  IElementType LEFT_BRACE = new KickAssemblerTokenType("LEFT_BRACE");
  IElementType LEFT_BRACKET = new KickAssemblerTokenType("LEFT_BRACKET");
  IElementType LEFT_PAREN = new KickAssemblerTokenType("LEFT_PAREN");
  IElementType LESS = new KickAssemblerTokenType("LESS");
  IElementType LESS_EQUALS = new KickAssemblerTokenType("LESS_EQUALS");
  IElementType MINUS = new KickAssemblerTokenType("MINUS");
  IElementType MINUS_EQUAL = new KickAssemblerTokenType("MINUS_EQUAL");
  IElementType MINUS_MINUS = new KickAssemblerTokenType("MINUS_MINUS");
  IElementType MNEMONIC = new KickAssemblerTokenType("MNEMONIC");
  IElementType MNEMONIC_EXTENSION = new KickAssemblerTokenType("MNEMONIC_EXTENSION");
  IElementType MNEMONIC_EXTENSION_DEPRECATED = new KickAssemblerTokenType("MNEMONIC_EXTENSION_DEPRECATED");
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
  IElementType PREPROCESSOR_IMPORTONCE = new KickAssemblerTokenType("PREPROCESSOR_IMPORTONCE");
  IElementType QUESTION_MARK = new KickAssemblerTokenType("QUESTION_MARK");
  IElementType RIGHT_BRACE = new KickAssemblerTokenType("RIGHT_BRACE");
  IElementType RIGHT_BRACKET = new KickAssemblerTokenType("RIGHT_BRACKET");
  IElementType RIGHT_PAREN = new KickAssemblerTokenType("RIGHT_PAREN");
  IElementType SCREENCODE_MIXED = new KickAssemblerTokenType("\"screencode_mixed\"");
  IElementType SCREENCODE_UPPER = new KickAssemblerTokenType("\"screencode_upper\"");
  IElementType SEMICOLON = new KickAssemblerTokenType("SEMICOLON");
  IElementType SHIFT_LEFT = new KickAssemblerTokenType("SHIFT_LEFT");
  IElementType SHIFT_RIGHT = new KickAssemblerTokenType("SHIFT_RIGHT");
  IElementType STRING = new KickAssemblerTokenType("STRING");
  IElementType STRING_END = new KickAssemblerTokenType("STRING_END");
  IElementType STRING_ESCAPE_BEGIN = new KickAssemblerTokenType("STRING_ESCAPE_BEGIN");
  IElementType STRING_VALUE = new KickAssemblerTokenType("STRING_VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIGN_DIRECTIVE) {
        return new KickAssemblerAlignDirectiveImpl(node);
      }
      else if (type == ARGUMENT) {
        return new KickAssemblerArgumentImpl(node);
      }
      else if (type == ASSERT) {
        return new KickAssemblerAssertImpl(node);
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
      else if (type == BREAK_DIRECTIVE) {
        return new KickAssemblerBreakDirectiveImpl(node);
      }
      else if (type == CPU_DIRECTIVE) {
        return new KickAssemblerCpuDirectiveImpl(node);
      }
      else if (type == DATA_DEFINITION) {
        return new KickAssemblerDataDefinitionImpl(node);
      }
      else if (type == DEFINE_DIRECTIVE) {
        return new KickAssemblerDefineDirectiveImpl(node);
      }
      else if (type == DEF_EXPR) {
        return new KickAssemblerDefExprImpl(node);
      }
      else if (type == DEF_EXPR_LIST) {
        return new KickAssemblerDefExprListImpl(node);
      }
      else if (type == DISK_DIRECTIVE) {
        return new KickAssemblerDiskDirectiveImpl(node);
      }
      else if (type == ENCODING_DIRECTIVE) {
        return new KickAssemblerEncodingDirectiveImpl(node);
      }
      else if (type == ENUM_DIRECTIVE) {
        return new KickAssemblerEnumDirectiveImpl(node);
      }
      else if (type == ESCAPED_STRING) {
        return new KickAssemblerEscapedStringImpl(node);
      }
      else if (type == EVAL_EXPRESSION) {
        return new KickAssemblerEvalExpressionImpl(node);
      }
      else if (type == EXPR) {
        return new KickAssemblerExprImpl(node);
      }
      else if (type == FILEMODIFY_DIRECTIVE) {
        return new KickAssemblerFilemodifyDirectiveImpl(node);
      }
      else if (type == FOR_LOOP) {
        return new KickAssemblerForLoopImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new KickAssemblerFunctionDefinitionImpl(node);
      }
      else if (type == IDENTIFIER_LIST) {
        return new KickAssemblerIdentifierListImpl(node);
      }
      else if (type == IF_ELSE) {
        return new KickAssemblerIfElseImpl(node);
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
      else if (type == MODIFY_DIRECTIVE) {
        return new KickAssemblerModifyDirectiveImpl(node);
      }
      else if (type == NAMESPACE_DIRECTIVE) {
        return new KickAssemblerNamespaceDirectiveImpl(node);
      }
      else if (type == NILADIC) {
        return new KickAssemblerNiladicImpl(node);
      }
      else if (type == PARAMETER) {
        return new KickAssemblerParameterImpl(node);
      }
      else if (type == PARAMETER_MAP) {
        return new KickAssemblerParameterMapImpl(node);
      }
      else if (type == PARAM_DIRECTIVE) {
        return new KickAssemblerParamDirectiveImpl(node);
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
      else if (type == SEGMENT_DIRECTIVE) {
        return new KickAssemblerSegmentDirectiveImpl(node);
      }
      else if (type == STATEMENT) {
        return new KickAssemblerStatementImpl(node);
      }
      else if (type == TERNARY_RHS) {
        return new KickAssemblerTernaryRhsImpl(node);
      }
      else if (type == WATCH_DIRECTIVE) {
        return new KickAssemblerWatchDirectiveImpl(node);
      }
      else if (type == WHILE) {
        return new KickAssemblerWhileImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
