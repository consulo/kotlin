package com.intellij.psi.impl.java.stubs.impl;

@SuppressWarnings("all")
public class PsiJavaFileStubImpl implements com.intellij.psi.impl.java.stubs.PsiJavaFileStub {
    public PsiJavaFileStubImpl(String packageName, boolean compiled) {}
    public String getPackageName() { return null; }
    public boolean isCompiled() { return true; }
    public com.intellij.psi.PsiClass[] getClasses() { return new com.intellij.psi.PsiClass[0]; }
}
