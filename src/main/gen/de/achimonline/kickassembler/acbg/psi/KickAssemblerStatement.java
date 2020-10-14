// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerStatement extends PsiElement {

  @Nullable
  KickAssemblerAlignDirective getAlignDirective();

  @Nullable
  KickAssemblerAssert getAssert();

  @Nullable
  KickAssemblerBlock getBlock();

  @Nullable
  KickAssemblerBreakDirective getBreakDirective();

  @Nullable
  KickAssemblerCpuDirective getCpuDirective();

  @Nullable
  KickAssemblerDataDefinition getDataDefinition();

  @Nullable
  KickAssemblerDefineDirective getDefineDirective();

  @Nullable
  KickAssemblerDiskDirective getDiskDirective();

  @Nullable
  KickAssemblerEncodingDirective getEncodingDirective();

  @Nullable
  KickAssemblerEnumDirective getEnumDirective();

  @Nullable
  KickAssemblerEvalExpression getEvalExpression();

  @Nullable
  KickAssemblerFilemodifyDirective getFilemodifyDirective();

  @Nullable
  KickAssemblerForLoop getForLoop();

  @Nullable
  KickAssemblerIfElse getIfElse();

  @Nullable
  KickAssemblerImport getImport();

  @Nullable
  KickAssemblerInstruction getInstruction();

  @Nullable
  KickAssemblerInvocation getInvocation();

  @Nullable
  KickAssemblerLabelAssignment getLabelAssignment();

  @Nullable
  KickAssemblerModifyDirective getModifyDirective();

  @Nullable
  KickAssemblerMultilabelDef getMultilabelDef();

  @Nullable
  KickAssemblerNamespaceDirective getNamespaceDirective();

  @Nullable
  KickAssemblerParamDirective getParamDirective();

  @Nullable
  KickAssemblerPcAssignment getPcAssignment();

  @Nullable
  KickAssemblerPseudoCommand getPseudoCommand();

  @Nullable
  KickAssemblerPseudoPcAssignment getPseudoPcAssignment();

  @Nullable
  KickAssemblerReturnStatement getReturnStatement();

  @Nullable
  KickAssemblerSegmentDirective getSegmentDirective();

  @Nullable
  KickAssemblerStructDirective getStructDirective();

  @Nullable
  KickAssemblerWatchDirective getWatchDirective();

  @Nullable
  KickAssemblerWhile getWhile();

}
