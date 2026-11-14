package com.intellij.psi.impl.java.stubs;

@SuppressWarnings("all")
public interface PsiJavaFileStub {
    String getPackageName();
    boolean isCompiled();
    com.intellij.psi.PsiClass[] getClasses();
}
