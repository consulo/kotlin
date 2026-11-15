package com.intellij.psi.impl.source.resolve;

@SuppressWarnings("all")
public class ResolveCache {
    public static ResolveCache getInstance(com.intellij.openapi.project.Project p0) { return null; }
    public interface AbstractResolver<TRef extends com.intellij.psi.PsiReference, TResult> {
        TResult resolve(TRef p0, boolean p1);
    }
    public interface PolyVariantResolver<T extends com.intellij.psi.PsiPolyVariantReference> extends AbstractResolver<T, com.intellij.psi.ResolveResult[]> {
        com.intellij.psi.ResolveResult[] resolve(T p0, boolean p1);
    }
    public interface Resolver extends AbstractResolver<com.intellij.psi.PsiReference, com.intellij.psi.PsiElement> {
    }
    public <T extends com.intellij.psi.PsiPolyVariantReference> com.intellij.psi.ResolveResult[] resolveWithCaching(T p0, PolyVariantResolver<T> p1, boolean p2, boolean p3) { return null; }
}
