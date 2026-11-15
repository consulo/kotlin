package com.intellij.psi.impl.compiled;

@SuppressWarnings("all")
public class ClsFileImpl extends com.intellij.psi.impl.source.PsiFileImpl implements com.intellij.psi.PsiJavaFile {
    public ClsFileImpl(com.intellij.psi.FileViewProvider viewProvider) { super(viewProvider); }
    public com.intellij.psi.impl.java.stubs.PsiJavaFileStub getStub() { return null; }
    public com.intellij.psi.PsiClass[] getClasses() { return new com.intellij.psi.PsiClass[0]; }
    public String getPackageName() { return null; }
    public void setPackageName(String packageName) {}
    public com.intellij.psi.PsiPackageStatement getPackageStatement() { return null; }
    public com.intellij.psi.PsiImportList getImportList() { return null; }
    public com.intellij.pom.java.LanguageLevel getLanguageLevel() { return null; }
    public com.intellij.psi.PsiElement getMirror() { return null; }
}
