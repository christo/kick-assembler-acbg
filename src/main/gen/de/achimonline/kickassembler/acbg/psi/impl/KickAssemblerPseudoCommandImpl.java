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

public class KickAssemblerPseudoCommandImpl extends ASTWrapperPsiElement implements KickAssemblerPseudoCommand {

  public KickAssemblerPseudoCommandImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitPseudoCommand(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KickAssemblerArgument> getArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerArgument.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerOneArgumentIndirect> getOneArgumentIndirectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerOneArgumentIndirect.class);
  }

  @Override
  @NotNull
  public List<KickAssemblerTwoArgumentsIndirect> getTwoArgumentsIndirectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KickAssemblerTwoArgumentsIndirect.class);
  }

}