package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiClassOwner extends com.intellij.psi.PsiFile {
  public abstract com.intellij.psi.PsiClass[] getClasses();
  public abstract java.lang.String getPackageName();
  public abstract void setPackageName(java.lang.String p0) throws com.intellij.util.IncorrectOperationException;
}
