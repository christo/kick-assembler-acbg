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

public class KickAssemblerInstructionImpl extends ASTWrapperPsiElement implements KickAssemblerInstruction {

  public KickAssemblerInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitInstruction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KickAssemblerVisitor) accept((KickAssemblerVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KickAssemblerArgument getArgument() {
    return findChildByClass(KickAssemblerArgument.class);
  }

  @Override
  @Nullable
  public KickAssemblerOneArgumentIndirect getOneArgumentIndirect() {
    return findChildByClass(KickAssemblerOneArgumentIndirect.class);
  }

  @Override
  @Nullable
  public KickAssemblerTwoArgumentsIndirect getTwoArgumentsIndirect() {
    return findChildByClass(KickAssemblerTwoArgumentsIndirect.class);
  }

}
