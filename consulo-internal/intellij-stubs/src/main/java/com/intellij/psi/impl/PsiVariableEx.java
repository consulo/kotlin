package com.intellij.psi.impl;

@SuppressWarnings("all")
public interface PsiVariableEx extends com.intellij.psi.PsiVariable {
    Object computeConstantValue(java.util.Set<com.intellij.psi.PsiVariable> visitedVars);
}
