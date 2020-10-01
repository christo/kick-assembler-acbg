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

public class KickAssemblerIfElseImpl extends ASTWrapperPsiElement implements KickAssemblerIfElse {

  public KickAssemblerIfElseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitIfElse(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KickAssemblerBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerBlock.class);
  }

  @Override
  @NotNull
  public KickAssemblerExpr getExpr() {
    return findNotNullChildByClass(KickAssemblerExpr.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerStatement.class);
  }

}