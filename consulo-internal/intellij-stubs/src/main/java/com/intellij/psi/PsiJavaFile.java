package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiJavaFile extends com.intellij.psi.PsiFile, com.intellij.psi.PsiClassOwner, com.intellij.psi.PsiImportHolder {
    String getPackageName();
    com.intellij.psi.PsiPackageStatement getPackageStatement();
    com.intellij.psi.PsiImportList getImportList();
    com.intellij.psi.PsiClass[] getClasses();
    com.intellij.pom.java.LanguageLevel getLanguageLevel();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiJavaFile
    public com.intellij.psi.PsiElement[] getOnDemandImports(boolean p0, boolean p1);
    public com.intellij.psi.PsiClass[] getSingleClassImports(boolean p0);
    public java.lang.String[] getImplicitlyImportedPackages();
    public default com.intellij.psi.ImplicitlyImportedElement[] getImplicitlyImportedElements() { return null; }
    public com.intellij.psi.PsiJavaCodeReferenceElement[] getImplicitlyImportedPackageReferences();
    public com.intellij.psi.PsiJavaCodeReferenceElement findImportReferenceTo(com.intellij.psi.PsiClass p0);
    public com.intellij.psi.PsiJavaModule getModuleDeclaration();
}
