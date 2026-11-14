package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiArrayType extends com.intellij.psi.PsiType {
    public abstract com.intellij.psi.PsiType getComponentType();
}
