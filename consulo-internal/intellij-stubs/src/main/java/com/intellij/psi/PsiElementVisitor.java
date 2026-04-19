package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiElementVisitor {
  public static final com.intellij.psi.PsiElementVisitor EMPTY_VISITOR = null;
  public PsiElementVisitor() { throw new UnsupportedOperationException("stub"); }
  public void visitBinaryFile(com.intellij.psi.PsiBinaryFile p0) {}
  public void visitComment(com.intellij.psi.PsiComment p0) {}
  public void visitDirectory(com.intellij.psi.PsiDirectory p0) {}
  public void visitElement(com.intellij.psi.PsiElement p0) {}
  public void visitErrorElement(com.intellij.psi.PsiErrorElement p0) {}
  public void visitFile(com.intellij.psi.PsiFile p0) {}
  public void visitOuterLanguageElement(com.intellij.psi.templateLanguages.OuterLanguageElement p0) {}
  public void visitPlainText(com.intellij.psi.PsiPlainText p0) {}
  public void visitPlainTextFile(com.intellij.psi.PsiPlainTextFile p0) {}
  public void visitWhiteSpace(com.intellij.psi.PsiWhiteSpace p0) {}
}
