package com.intellij.psi.util;

@SuppressWarnings("all")
public interface MethodSignature {
    String getName();
    com.intellij.psi.PsiType[] getParameterTypes();
    com.intellij.psi.PsiType[] getTypeParameters();
    com.intellij.psi.PsiSubstitutor getSubstitutor();
    boolean isRaw();
    boolean isConstructor();
}
