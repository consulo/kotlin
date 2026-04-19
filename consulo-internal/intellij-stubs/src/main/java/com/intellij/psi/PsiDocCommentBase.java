package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiDocCommentBase extends com.intellij.psi.PsiComment {
  public abstract com.intellij.psi.PsiElement getOwner();
}
