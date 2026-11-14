package com.intellij.psi.impl.java.stubs;

@SuppressWarnings("all")
public abstract class ClsStubPsiFactory {
    public abstract com.intellij.psi.PsiClass createClass(PsiClassStub stub);
    public abstract com.intellij.psi.PsiAnnotation createAnnotation(com.intellij.psi.impl.java.stubs.PsiAnnotationStub stub);
}
