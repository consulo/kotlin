package com.intellij.psi;

@SuppressWarnings("all")
public abstract class AbstractElementManipulator<T extends com.intellij.psi.PsiElement> implements com.intellij.psi.ElementManipulator<T> {
  public AbstractElementManipulator() { throw new UnsupportedOperationException("stub"); }
  public abstract T handleContentChange(T p0, com.intellij.openapi.util.TextRange p1, java.lang.String p2) throws com.intellij.util.IncorrectOperationException;
  public T handleContentChange(T p0, java.lang.String p1) throws com.intellij.util.IncorrectOperationException { return null; }
  public com.intellij.openapi.util.TextRange getRangeInElement(T p0) { return null; }
}
