package com.intellij.psi;

@SuppressWarnings("all")
public abstract class NonClasspathClassFinder extends com.intellij.psi.PsiElementFinder {
    public NonClasspathClassFinder(com.intellij.openapi.project.Project project) {}
    public com.intellij.psi.PsiClass findClass(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope) { return null; }
    public com.intellij.psi.PsiClass[] findClasses(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope) { return new com.intellij.psi.PsiClass[0]; }
    public com.intellij.psi.PsiPackage findPackage(String qualifiedName) { return null; }
    public java.util.List<com.intellij.openapi.vfs.VirtualFile> getClassRoots() { return new java.util.ArrayList<>(); }
}
