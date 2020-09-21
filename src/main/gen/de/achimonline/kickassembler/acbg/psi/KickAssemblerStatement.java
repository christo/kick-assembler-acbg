// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerStatement extends PsiElement {

  @Nullable
  KickAssemblerAlignDirective getAlignDirective();

  @Nullable
  KickAssemblerBlock getBlock();

  @Nullable
  KickAssemblerBreakDirective getBreakDirective();

  @Nullable
  KickAssemblerCpuDirective getCpuDirective();

  @Nullable
  KickAssemblerDataDefinition getDataDefinition();

  @Nullable
  KickAssemblerEncodingDirective getEncodingDirective();

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
  KickAssemblerPcAssignment getPcAssignment();

  @Nullable
  KickAssemblerWatchDirective getWatchDirective();

  @Nullable
  KickAssemblerWhile getWhile();

}
