package com.intellij.psi.impl.java.stubs;

@SuppressWarnings("all")
public interface PsiJavaFileStub extends com.intellij.psi.stubs.PsiFileStub<com.intellij.psi.PsiJavaFile> {
    String getPackageName();
    boolean isCompiled();
    com.intellij.psi.PsiClass[] getClasses();
}
