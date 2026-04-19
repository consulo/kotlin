package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiCheckedRenameElement extends com.intellij.psi.PsiNamedElement {
  public abstract void checkSetName(java.lang.String p0) throws com.intellij.util.IncorrectOperationException;
}
