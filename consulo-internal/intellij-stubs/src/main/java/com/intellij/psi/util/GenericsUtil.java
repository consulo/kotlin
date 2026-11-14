package com.intellij.psi.util;

@SuppressWarnings("all")
public class GenericsUtil {
    public static com.intellij.psi.PsiType getLeastUpperBound(com.intellij.psi.PsiType type1, com.intellij.psi.PsiType type2, com.intellij.psi.PsiManager manager) { return null; }
    public static com.intellij.psi.PsiType eliminateWildcards(com.intellij.psi.PsiType type) { return type; }
    public static boolean isTypeArgumentsApplicable(com.intellij.psi.PsiTypeParameter[] typeParams, com.intellij.psi.PsiSubstitutor substitutor, com.intellij.psi.PsiElement context) { return true; }
}
