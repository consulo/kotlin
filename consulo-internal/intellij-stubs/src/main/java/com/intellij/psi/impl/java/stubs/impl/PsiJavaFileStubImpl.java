package com.intellij.psi.impl.java.stubs.impl;

@SuppressWarnings("all")
public class PsiJavaFileStubImpl extends com.intellij.psi.stubs.PsiFileStubImpl<com.intellij.psi.PsiJavaFile> implements com.intellij.psi.impl.java.stubs.PsiJavaFileStub {
    public PsiJavaFileStubImpl(String packageName, boolean compiled) { super(null); }
    public PsiJavaFileStubImpl(com.intellij.psi.PsiJavaFile file, com.intellij.pom.java.LanguageLevel languageLevel, boolean compiled) { super(file); }
    public String getPackageName() { return null; }
    public boolean isCompiled() { return true; }
    public com.intellij.psi.PsiClass[] getClasses() { return new com.intellij.psi.PsiClass[0]; }
}
