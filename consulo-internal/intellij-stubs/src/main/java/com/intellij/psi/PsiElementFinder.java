package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiElementFinder {
    public static final com.intellij.openapi.extensions.ProjectExtensionPointName<PsiElementFinder> EP = new com.intellij.openapi.extensions.ProjectExtensionPointName<>("com.intellij.java.elementFinder");
    public abstract com.intellij.psi.PsiClass findClass(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope);
    public abstract com.intellij.psi.PsiClass[] findClasses(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope);
    public abstract com.intellij.psi.PsiPackage findPackage(String qualifiedName);
    public com.intellij.psi.PsiPackage[] getSubPackages(com.intellij.psi.PsiPackage psiPackage, com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiPackage[0]; }
    public com.intellij.psi.PsiClass[] getClasses(com.intellij.psi.PsiPackage psiPackage, com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiClass[0]; }
    public com.intellij.psi.PsiFile[] getPackageFiles(com.intellij.psi.PsiPackage psiPackage, com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiFile[0]; }
    public boolean processPackageDirectories(com.intellij.psi.PsiPackage psiPackage, com.intellij.psi.search.GlobalSearchScope scope, com.intellij.util.Processor<com.intellij.psi.PsiDirectory> consumer) { return true; }
    public static com.intellij.psi.PsiClass[] filterByName(String name, com.intellij.psi.PsiClass[] classes) { return classes; }
}
