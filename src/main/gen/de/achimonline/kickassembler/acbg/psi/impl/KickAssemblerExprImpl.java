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

public class KickAssemblerExprImpl extends ASTWrapperPsiElement implements KickAssemblerExpr {

  public KickAssemblerExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitExpr(this);
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
  @NotNull
  public KickAssemblerExprLeft getExprLeft() {
    return findNotNullChildByClass(KickAssemblerExprLeft.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerInfixOperator> getInfixOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerInfixOperator.class);
  }

}
