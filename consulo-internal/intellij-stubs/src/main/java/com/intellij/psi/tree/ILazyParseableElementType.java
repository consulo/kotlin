package com.intellij.psi.tree;

@SuppressWarnings("all")
public class ILazyParseableElementType extends com.intellij.psi.tree.IElementType implements ILazyParseableElementTypeBase {
  public static final com.intellij.openapi.util.Key<com.intellij.lang.Language> LANGUAGE_KEY = null;
  public ILazyParseableElementType(java.lang.String p0) { super(p0, null); }
  public ILazyParseableElementType(java.lang.String p0, com.intellij.lang.Language p1) { super(p0, p1); }
  public ILazyParseableElementType(java.lang.String p0, com.intellij.lang.Language p1, boolean p2) { super(p0, p1, p2); }
  public com.intellij.lang.ASTNode parseContents(com.intellij.lang.ASTNode p0) { return null; }
  protected com.intellij.lang.ASTNode doParseContents(com.intellij.lang.ASTNode p0, com.intellij.psi.PsiElement p1) { return null; }
  protected com.intellij.lang.Language getLanguageForParser(com.intellij.psi.PsiElement p0) { return null; }
  public com.intellij.lang.ASTNode createNode(java.lang.CharSequence p0) { return null; }
}
