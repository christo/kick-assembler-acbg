// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.achimonline.kickassembler.acbg.psi.KickAssemblerTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.achimonline.kickassembler.acbg.psi.*;

public class KickAssemblerBlockImpl extends ASTWrapperPsiElement implements KickAssemblerBlock {

  public KickAssemblerBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KickAssemblerFunctionDefinition> getFunctionDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerFunctionDefinition.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerMacroDefinition> getMacroDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerMacroDefinition.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerPreprocessorDirective> getPreprocessorDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerPreprocessorDirective.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerPseudoCommandDef> getPseudoCommandDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerPseudoCommandDef.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerStatement.class);
  }

}
