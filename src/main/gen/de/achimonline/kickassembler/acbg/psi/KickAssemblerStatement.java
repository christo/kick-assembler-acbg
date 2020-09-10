// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerStatement extends PsiElement {

  @Nullable
  KickAssemblerBlock getBlock();

  @Nullable
  KickAssemblerCpuDirective getCpuDirective();

  @Nullable
  KickAssemblerDataDefinition getDataDefinition();

  @Nullable
  KickAssemblerEncodingDirective getEncodingDirective();

  @Nullable
  KickAssemblerForLoop getForLoop();

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

}
