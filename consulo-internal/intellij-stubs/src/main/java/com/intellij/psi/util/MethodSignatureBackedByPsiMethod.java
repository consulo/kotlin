package com.intellij.psi.util;

@SuppressWarnings("all")
public interface MethodSignatureBackedByPsiMethod extends com.intellij.psi.util.MethodSignature {
    com.intellij.psi.PsiMethod getMethod();
    boolean isRaw();
}
