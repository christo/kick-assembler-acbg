// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerBlock extends PsiElement {

  @NotNull
  List<KickAssemblerFunctionDefinition> getFunctionDefinitionList();

  @NotNull
  List<KickAssemblerMacroDefinition> getMacroDefinitionList();

  @NotNull
  List<KickAssemblerPreprocessorDirective> getPreprocessorDirectiveList();

  @NotNull
  List<KickAssemblerPseudoCommandDef> getPseudoCommandDefList();

  @NotNull
  List<KickAssemblerStatement> getStatementList();

}
