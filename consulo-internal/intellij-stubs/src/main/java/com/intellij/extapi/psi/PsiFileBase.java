package com.intellij.extapi.psi;

@SuppressWarnings("all")
public abstract class PsiFileBase extends com.intellij.psi.impl.source.PsiFileImpl {
  protected PsiFileBase(com.intellij.psi.FileViewProvider p0, com.intellij.lang.Language p1) { super(p0); }
  public final com.intellij.lang.Language getLanguage() { return null; }
  public void accept(com.intellij.psi.PsiElementVisitor p0) {}
  public com.intellij.lang.ParserDefinition getParserDefinition() { return null; }
}
