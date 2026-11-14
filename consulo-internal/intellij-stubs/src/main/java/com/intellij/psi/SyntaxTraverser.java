package com.intellij.psi;

@SuppressWarnings("all")
public class SyntaxTraverser<T> implements Iterable<T> {
    public static <T> SyntaxTraverser<com.intellij.psi.PsiElement> psiTraverser() { return new SyntaxTraverser<>(); }
    public static SyntaxTraverser<com.intellij.psi.PsiElement> psiTraverser(com.intellij.psi.PsiElement root) { return new SyntaxTraverser<>(); }
    public <R> SyntaxTraverser<R> filter(Class<R> cls) { return new SyntaxTraverser<R>(); }
    public SyntaxTraverser<T> filter(java.util.function.Predicate<? super T> p) { return this; }
    public <R> SyntaxTraverser<R> map(java.util.function.Function<? super T, ? extends R> f) { return new SyntaxTraverser<R>(); }
    public java.util.Iterator<T> iterator() { return java.util.Collections.<T>emptyIterator(); }
    public java.util.List<T> toList() { return java.util.Collections.emptyList(); }
    public java.util.Set<T> toSet() { return java.util.Collections.emptySet(); }
    public T first() { return null; }
    public T last() { return null; }
    public int size() { return 0; }
    public Iterable<T> traverse() { return this; }
}
