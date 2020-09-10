// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerExprLeft extends PsiElement {

  @Nullable
  KickAssemblerBasicValue getBasicValue();

  @Nullable
  KickAssemblerBracketed getBracketed();

  @Nullable
  KickAssemblerExprLeft getExprLeft();

  @Nullable
  KickAssemblerInvocation getInvocation();

  @Nullable
  KickAssemblerPostfixOperator getPostfixOperator();

  @Nullable
  KickAssemblerPrefixOperator getPrefixOperator();

  @Nullable
  KickAssemblerScopedLabel getScopedLabel();

}
