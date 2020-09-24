// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerInvocation extends PsiElement {

  @Nullable
  KickAssemblerAssert getAssert();

  @NotNull
  List<KickAssemblerExpr> getExprList();

  @Nullable
  KickAssemblerScopedLabel getScopedLabel();

}
