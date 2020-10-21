// This is a generated file. Not intended for manual editing.
package de.achimonline.kickassembler.acbg.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KickAssemblerInstruction extends PsiElement {

  @Nullable
  KickAssemblerArgument getArgument();

  @Nullable
  KickAssemblerOneArgumentIndirect getOneArgumentIndirect();

  @Nullable
  KickAssemblerTwoArgumentsIndirect getTwoArgumentsIndirect();

}
