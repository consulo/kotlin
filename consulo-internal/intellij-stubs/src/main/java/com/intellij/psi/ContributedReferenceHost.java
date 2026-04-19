package com.intellij.psi;

@SuppressWarnings("all")
public interface ContributedReferenceHost extends com.intellij.psi.PsiElement {
  public abstract com.intellij.psi.PsiReference[] getReferences();
}
