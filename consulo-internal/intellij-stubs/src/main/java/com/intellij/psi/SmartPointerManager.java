package com.intellij.psi;

@SuppressWarnings("all")
public abstract class SmartPointerManager {
  public SmartPointerManager() { throw new UnsupportedOperationException("stub"); }
  public abstract com.intellij.psi.SmartPsiFileRange createSmartPsiFileRangePointer(com.intellij.psi.PsiFile p0, com.intellij.openapi.util.TextRange p1);
  public static com.intellij.psi.SmartPointerManager getInstance(com.intellij.openapi.project.Project p0) { return null; }
  public static <E extends com.intellij.psi.PsiElement> com.intellij.psi.SmartPsiElementPointer<E> createPointer(E p0) { return null; }
  public abstract <E extends com.intellij.psi.PsiElement> com.intellij.psi.SmartPsiElementPointer<E> createSmartPsiElementPointer(E p0);
  public abstract <E extends com.intellij.psi.PsiElement> com.intellij.psi.SmartPsiElementPointer<E> createSmartPsiElementPointer(E p0, com.intellij.psi.PsiFile p1);
  public <E extends com.intellij.psi.PsiElement> com.intellij.psi.SmartPsiElementPointer<E> createLazyPointer(E p0) { return null; }
  public abstract boolean pointToTheSameElement(com.intellij.psi.SmartPsiElementPointer<?> p0, com.intellij.psi.SmartPsiElementPointer<?> p1);
  public abstract void removePointer(com.intellij.psi.SmartPsiElementPointer<?> p0);
}
