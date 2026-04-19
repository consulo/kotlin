package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiPolyVariantReference extends com.intellij.psi.PsiReference {
  public abstract com.intellij.psi.ResolveResult[] multiResolve(boolean p0);
}
