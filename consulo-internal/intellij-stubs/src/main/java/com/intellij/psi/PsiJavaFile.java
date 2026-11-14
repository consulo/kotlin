package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiJavaFile extends com.intellij.psi.PsiFile, com.intellij.psi.PsiClassOwner {
    String getPackageName();
    com.intellij.psi.PsiPackageStatement getPackageStatement();
    com.intellij.psi.PsiImportList getImportList();
    com.intellij.psi.PsiClass[] getClasses();
    com.intellij.pom.java.LanguageLevel getLanguageLevel();
}
