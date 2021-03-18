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

public class KickAssemblerFunctionDefImpl extends ASTWrapperPsiElement implements KickAssemblerFunctionDef {

  public KickAssemblerFunctionDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitFunctionDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KickAssemblerIdentifierList getIdentifierList() {
    return findChildByClass(KickAssemblerIdentifierList.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerPreprocessorDirective> getPreprocessorDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerPreprocessorDirective.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerStatement.class);
  }

}
