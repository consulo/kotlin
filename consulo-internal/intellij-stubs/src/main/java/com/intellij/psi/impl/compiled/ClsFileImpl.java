package com.intellij.psi.impl.compiled;

@SuppressWarnings("all")
public abstract class ClsFileImpl implements com.intellij.psi.PsiFile {
    public com.intellij.psi.impl.java.stubs.PsiJavaFileStub getStub() { return null; }
    public com.intellij.psi.PsiClass[] getClasses() { return new com.intellij.psi.PsiClass[0]; }
}
