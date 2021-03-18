// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerRoot extends PsiElement {

  @Nullable
  KickAssemblerBlock getBlock();

  @Nullable
  KickAssemblerFunctionDef getFunctionDef();

  @Nullable
  KickAssemblerImportOnce getImportOnce();

  @Nullable
  KickAssemblerMacroDef getMacroDef();

  @Nullable
  KickAssemblerPreprocessorDirective getPreprocessorDirective();

  @Nullable
  KickAssemblerPseudoCommandDef getPseudoCommandDef();

  @Nullable
  KickAssemblerStatement getStatement();

}
