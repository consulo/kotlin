package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiPackage extends com.intellij.psi.PsiElement, com.intellij.psi.PsiCheckedRenameElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiQualifiedNamedElement {
    PsiPackage[] EMPTY_ARRAY = new PsiPackage[0];
    String PACKAGE_INFO_CLASS = "package-info";
    String PACKAGE_INFO_FILE = "package-info.java";
    String PACKAGE_INFO_CLS_FILE = "package-info.class";
    default String getQualifiedName() { return null; }
    default com.intellij.psi.PsiPackage getParentPackage() { return null; }
    default com.intellij.psi.PsiPackage[] getSubPackages() { return new com.intellij.psi.PsiPackage[0]; }
    default com.intellij.psi.PsiPackage[] getSubPackages(com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiPackage[0]; }
    default com.intellij.psi.PsiClass[] getClasses() { return new com.intellij.psi.PsiClass[0]; }
    default com.intellij.psi.PsiClass[] getClasses(com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiClass[0]; }
    default com.intellij.psi.PsiAnnotationOwner getAnnotationList() { return null; }
    default String getName() { return null; }
    default com.intellij.psi.PsiElement setName(String name) { return null; }
    default com.intellij.psi.PsiClass[] findClassByShortName(String name, com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiClass[0]; }
    default void handleQualifiedNameChange(String newQualifiedName) {}
    default com.intellij.openapi.vfs.VirtualFile[] occursInPackagePrefixes() { return new com.intellij.openapi.vfs.VirtualFile[0]; }
    default boolean containsClassNamed(String name) { return false; }
    default com.intellij.psi.PsiDirectory[] getDirectories() { return new com.intellij.psi.PsiDirectory[0]; }
    default com.intellij.psi.PsiDirectory[] getDirectories(com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiDirectory[0]; }
}
