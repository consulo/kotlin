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
    // Inherited abstract members (genstub.py)
    public com.intellij.psi.PsiClass[] getSingleClassImports(boolean p0) { return null; }
    public com.intellij.psi.PsiElement[] getOnDemandImports(boolean p0, boolean p1) { return null; }
    public com.intellij.psi.PsiJavaCodeReferenceElement findImportReferenceTo(com.intellij.psi.PsiClass p0) { return null; }
    public com.intellij.psi.PsiJavaCodeReferenceElement[] getImplicitlyImportedPackageReferences() { return null; }
    public com.intellij.psi.PsiJavaModule getModuleDeclaration() { return null; }
    public java.lang.String[] getImplicitlyImportedPackages() { return null; }
}
