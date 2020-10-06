// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerMacroDefinition extends PsiElement {

  @Nullable
  KickAssemblerIdentifierList getIdentifierList();

  @NotNull
  List<KickAssemblerPreprocessorDirective> getPreprocessorDirectiveList();

  @NotNull
  List<KickAssemblerStatement> getStatementList();

}
