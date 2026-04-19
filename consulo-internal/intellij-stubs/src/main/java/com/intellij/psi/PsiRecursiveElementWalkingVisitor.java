package com.intellij.psi;
@SuppressWarnings("all")
public class PsiRecursiveElementWalkingVisitor extends PsiElementVisitor {
    public PsiRecursiveElementWalkingVisitor() {}
    public PsiRecursiveElementWalkingVisitor(boolean p0) {}
    public void visitElement(PsiElement p0) { p0.acceptChildren(this); }
    public void stopWalking() {}
}
