package com.intellij.psi.impl;

@SuppressWarnings("all")
public abstract class ResolveScopeManager {
    public abstract com.intellij.psi.search.GlobalSearchScope getResolveScope(com.intellij.psi.PsiElement p0);
    public abstract com.intellij.psi.search.GlobalSearchScope getDefaultResolveScope(com.intellij.openapi.vfs.VirtualFile p0);
    public abstract com.intellij.psi.search.GlobalSearchScope getUseScope(com.intellij.psi.PsiElement p0);
    public static ResolveScopeManager getInstance(com.intellij.openapi.project.Project p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope getElementUseScope(com.intellij.psi.PsiElement p0) { return null; }
    public static com.intellij.psi.search.GlobalSearchScope getElementResolveScope(com.intellij.psi.PsiElement p0) { return null; }
}
