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

public class KickAssemblerExprLeftImpl extends ASTWrapperPsiElement implements KickAssemblerExprLeft {

  public KickAssemblerExprLeftImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitExprLeft(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KickAssemblerBasicValue getBasicValue() {
    return findChildByClass(KickAssemblerBasicValue.class);
  }

  @Override
  @Nullable
  public KickAssemblerBracketed getBracketed() {
    return findChildByClass(KickAssemblerBracketed.class);
  }

  @Override
  @Nullable
  public KickAssemblerExprLeft getExprLeft() {
    return findChildByClass(KickAssemblerExprLeft.class);
  }

  @Override
  @Nullable
  public KickAssemblerInvocation getInvocation() {
    return findChildByClass(KickAssemblerInvocation.class);
  }

  @Override
  @Nullable
  public KickAssemblerPostfixOperator getPostfixOperator() {
    return findChildByClass(KickAssemblerPostfixOperator.class);
  }

  @Override
  @Nullable
  public KickAssemblerPrefixOperator getPrefixOperator() {
    return findChildByClass(KickAssemblerPrefixOperator.class);
  }

  @Override
  @Nullable
  public KickAssemblerScopedLabel getScopedLabel() {
    return findChildByClass(KickAssemblerScopedLabel.class);
  }

}
