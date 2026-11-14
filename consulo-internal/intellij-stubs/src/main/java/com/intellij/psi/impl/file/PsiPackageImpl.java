package com.intellij.psi.impl.file;

@SuppressWarnings("all")
public class PsiPackageImpl extends com.intellij.psi.impl.PsiElementBase implements com.intellij.psi.PsiPackage {
    public PsiPackageImpl(com.intellij.psi.PsiManager manager, String qualifiedName) {}
    public String getQualifiedName() { return null; }
    public String getName() { return null; }
    public com.intellij.psi.PsiPackage getParentPackage() { return null; }
    public com.intellij.psi.PsiClass[] getClasses() { return new com.intellij.psi.PsiClass[0]; }
    public com.intellij.psi.PsiClass[] getClasses(com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiClass[0]; }
    public com.intellij.psi.PsiPackage[] getSubPackages() { return new com.intellij.psi.PsiPackage[0]; }
    public com.intellij.psi.PsiPackage[] getSubPackages(com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiPackage[0]; }
    public com.intellij.psi.PsiClass[] findClassByShortName(String name, com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiClass[0]; }
    public com.intellij.psi.PsiModifierList getModifierList() { return null; }
    public boolean hasModifierProperty(String name) { return false; }
    public com.intellij.psi.PsiElement setName(String name) { return null; }
    public void checkSetName(String name) {}
    public void handleQualifiedNameChange(String newQualifiedName) {}
    public com.intellij.openapi.vfs.VirtualFile[] occursInPackagePrefixes() { return new com.intellij.openapi.vfs.VirtualFile[0]; }
    public boolean containsClassNamed(String name) { return false; }
    public com.intellij.psi.PsiDirectory[] getDirectories() { return new com.intellij.psi.PsiDirectory[0]; }
    public com.intellij.psi.PsiDirectory[] getDirectories(com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiDirectory[0]; }
    public com.intellij.psi.PsiAnnotationOwner getAnnotationList() { return null; }
}
