// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerRoot extends PsiElement {

  @Nullable
  KickAssemblerBlock getBlock();

  @Nullable
  KickAssemblerFunctionDefinition getFunctionDefinition();

  @Nullable
  KickAssemblerImportOnce getImportOnce();

  @Nullable
  KickAssemblerMacroDefinition getMacroDefinition();

  @Nullable
  KickAssemblerMultilabelDef getMultilabelDef();

  @Nullable
  KickAssemblerPreprocessorDirective getPreprocessorDirective();

  @Nullable
  KickAssemblerPseudoCommandDef getPseudoCommandDef();

  @Nullable
  KickAssemblerStatement getStatement();

}
