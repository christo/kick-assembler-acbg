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

public class KickAssemblerWhileImpl extends ASTWrapperPsiElement implements KickAssemblerWhile {

  public KickAssemblerWhileImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitWhile(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KickAssemblerBlock getBlock() {
    return findChildByClass(KickAssemblerBlock.class);
  }

  @Override
  @NotNull
  public KickAssemblerExpr getExpr() {
    return findNotNullChildByClass(KickAssemblerExpr.class);
  }

  @Override
  @Nullable
  public KickAssemblerPreprocessorDirective getPreprocessorDirective() {
    return findChildByClass(KickAssemblerPreprocessorDirective.class);
  }

  @Override
  @Nullable
  public KickAssemblerStatement getStatement() {
    return findChildByClass(KickAssemblerStatement.class);
  }

}
