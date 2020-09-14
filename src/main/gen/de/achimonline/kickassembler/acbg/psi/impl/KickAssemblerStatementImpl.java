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

public class KickAssemblerStatementImpl extends ASTWrapperPsiElement implements KickAssemblerStatement {

  public KickAssemblerStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitStatement(this);
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
  @Nullable
  public KickAssemblerBreakDirective getBreakDirective() {
    return findChildByClass(KickAssemblerBreakDirective.class);
  }

  @Override
  @Nullable
  public KickAssemblerCpuDirective getCpuDirective() {
    return findChildByClass(KickAssemblerCpuDirective.class);
  }

  @Override
  @Nullable
  public KickAssemblerDataDefinition getDataDefinition() {
    return findChildByClass(KickAssemblerDataDefinition.class);
  }

  @Override
  @Nullable
  public KickAssemblerEncodingDirective getEncodingDirective() {
    return findChildByClass(KickAssemblerEncodingDirective.class);
  }

  @Override
  @Nullable
  public KickAssemblerForLoop getForLoop() {
    return findChildByClass(KickAssemblerForLoop.class);
  }

  @Override
  @Nullable
  public KickAssemblerIfElse getIfElse() {
    return findChildByClass(KickAssemblerIfElse.class);
  }

  @Override
  @Nullable
  public KickAssemblerImport getImport() {
    return findChildByClass(KickAssemblerImport.class);
  }

  @Override
  @Nullable
  public KickAssemblerInstruction getInstruction() {
    return findChildByClass(KickAssemblerInstruction.class);
  }

  @Override
  @Nullable
  public KickAssemblerInvocation getInvocation() {
    return findChildByClass(KickAssemblerInvocation.class);
  }

  @Override
  @Nullable
  public KickAssemblerLabelAssignment getLabelAssignment() {
    return findChildByClass(KickAssemblerLabelAssignment.class);
  }

  @Override
  @Nullable
  public KickAssemblerPcAssignment getPcAssignment() {
    return findChildByClass(KickAssemblerPcAssignment.class);
  }

  @Override
  @Nullable
  public KickAssemblerWatchDirective getWatchDirective() {
    return findChildByClass(KickAssemblerWatchDirective.class);
  }

  @Override
  @Nullable
  public KickAssemblerWhile getWhile() {
    return findChildByClass(KickAssemblerWhile.class);
  }

}
