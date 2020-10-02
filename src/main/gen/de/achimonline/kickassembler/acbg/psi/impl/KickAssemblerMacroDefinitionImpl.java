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

public class KickAssemblerMacroDefinitionImpl extends ASTWrapperPsiElement implements KickAssemblerMacroDefinition {

  public KickAssemblerMacroDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitMacroDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KickAssemblerExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerExpr.class);
  }

  @Override
  @Nullable
  public KickAssemblerIdentifierList getIdentifierList() {
    return findChildByClass(KickAssemblerIdentifierList.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerStatement.class);
  }

}
