package com.intellij.lang;

@SuppressWarnings("all")
public interface PsiParser {
  public abstract com.intellij.lang.ASTNode parse(com.intellij.psi.tree.IElementType p0, com.intellij.lang.PsiBuilder p1);
}
