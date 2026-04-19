package com.intellij.psi;
@SuppressWarnings("all")
public class PsiRecursiveElementVisitor extends PsiElementVisitor {
    public PsiRecursiveElementVisitor() {}
    public PsiRecursiveElementVisitor(boolean p0) {}
    public void visitElement(PsiElement p0) { p0.acceptChildren(this); }
}
