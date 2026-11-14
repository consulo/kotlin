package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiWildcardType extends com.intellij.psi.PsiType {
    public abstract com.intellij.psi.PsiType getBound();
    public abstract boolean isExtends();
    public abstract boolean isSuper();
    public boolean isBounded() { return getBound() != null; }
}
