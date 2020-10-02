// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerExpr extends PsiElement {

  @Nullable
  KickAssemblerBasicValue getBasicValue();

  @Nullable
  KickAssemblerBracketed getBracketed();

  @NotNull
  List<KickAssemblerExpr> getExprList();

  @NotNull
  List<KickAssemblerInfixOperator> getInfixOperatorList();

  @Nullable
  KickAssemblerInvocation getInvocation();

  @Nullable
  KickAssemblerPostfixOperator getPostfixOperator();

  @NotNull
  List<KickAssemblerPrefixOperator> getPrefixOperatorList();

  @Nullable
  KickAssemblerScopedLabel getScopedLabel();

  @NotNull
  List<KickAssemblerTernaryRhs> getTernaryRhsList();

}
