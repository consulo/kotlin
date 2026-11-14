package com.intellij.psi.impl;

@SuppressWarnings("all")
public class PsiClassImplUtil {
    public static com.intellij.psi.PsiField findFieldByName(com.intellij.psi.PsiClass aClass, String name, boolean checkBases) { return null; }
    public static com.intellij.psi.PsiMethod[] findMethodsByName(com.intellij.psi.PsiClass aClass, String name, boolean checkBases) { return new com.intellij.psi.PsiMethod[0]; }
    public static com.intellij.psi.PsiClass findInnerByName(com.intellij.psi.PsiClass aClass, String name, boolean checkBases) { return null; }
    public static boolean isClassEquivalentTo(com.intellij.psi.PsiClass aClass, com.intellij.psi.PsiElement another) { return aClass == another; }
    public static boolean processDeclarationsInClass(com.intellij.psi.PsiClass aClass, com.intellij.psi.scope.PsiScopeProcessor processor, com.intellij.psi.ResolveState state, java.util.Set<com.intellij.psi.PsiClass> visited, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement place, com.intellij.pom.java.LanguageLevel languageLevel, boolean isRaw) { return true; }
}
