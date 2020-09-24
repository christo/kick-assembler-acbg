// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerForLoop extends PsiElement {

  @Nullable
  KickAssemblerBlock getBlock();

  @NotNull
  KickAssemblerDefExprList getDefExprList();

  @NotNull
  List<KickAssemblerExpr> getExprList();

  @Nullable
  KickAssemblerStatement getStatement();

}
