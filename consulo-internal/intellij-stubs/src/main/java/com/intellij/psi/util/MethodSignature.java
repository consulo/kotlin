package com.intellij.psi.util;

@SuppressWarnings("all")
public interface MethodSignature {
    String getName();
    com.intellij.psi.PsiType[] getParameterTypes();
    com.intellij.psi.PsiTypeParameter[] getTypeParameters();
    com.intellij.psi.PsiSubstitutor getSubstitutor();
    boolean isRaw();
    boolean isConstructor();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.util.MethodSignature
    public static final com.intellij.psi.util.MethodSignature[] EMPTY_ARRAY = null;
}
