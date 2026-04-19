package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiNameIdentifierOwner extends com.intellij.psi.PsiNamedElement {
  public abstract com.intellij.psi.PsiElement getNameIdentifier();
  public default com.intellij.psi.PsiElement getIdentifyingElement() { return null; }
}
