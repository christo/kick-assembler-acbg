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

public class KickAssemblerRootImpl extends ASTWrapperPsiElement implements KickAssemblerRoot {

  public KickAssemblerRootImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KickAssemblerVisitor visitor) {
    visitor.visitRoot(this);
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
  public KickAssemblerFunctionDefinition getFunctionDefinition() {
    return findChildByClass(KickAssemblerFunctionDefinition.class);
  }

  @Override
  @Nullable
  public KickAssemblerMacroDefinition getMacroDefinition() {
    return findChildByClass(KickAssemblerMacroDefinition.class);
  }

  @Override
  @Nullable
  public KickAssemblerNiladic getNiladic() {
    return findChildByClass(KickAssemblerNiladic.class);
  }

  @Override
  @Nullable
  public KickAssemblerStatement getStatement() {
    return findChildByClass(KickAssemblerStatement.class);
  }

}
