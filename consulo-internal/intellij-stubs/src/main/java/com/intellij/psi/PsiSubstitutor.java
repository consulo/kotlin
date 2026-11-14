package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiSubstitutor {
    PsiSubstitutor EMPTY = null;
    PsiSubstitutor UNKNOWN = null;
    com.intellij.psi.PsiType substitute(com.intellij.psi.PsiType type);
    com.intellij.psi.PsiType substitute(com.intellij.psi.PsiTypeParameter typeParameter);
    com.intellij.psi.PsiType substituteWithBoundsPromotion(com.intellij.psi.PsiTypeParameter typeParameter);
    java.util.Map<com.intellij.psi.PsiTypeParameter, com.intellij.psi.PsiType> getSubstitutionMap();
    PsiSubstitutor put(com.intellij.psi.PsiTypeParameter classParameter, com.intellij.psi.PsiType mapping);
    PsiSubstitutor putAll(com.intellij.psi.PsiClass parentClass, com.intellij.psi.PsiType[] mappings);
    PsiSubstitutor putAll(PsiSubstitutor another);
    boolean isValid();
}
