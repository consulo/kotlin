package com.intellij.psi.stubs;

@SuppressWarnings("all")
public interface StubElement<T extends com.intellij.psi.PsiElement> extends com.intellij.psi.stubs.Stub {
  public abstract com.intellij.psi.stubs.IStubElementType<?, ?> getStubType();
  public abstract com.intellij.psi.tree.IElementType getElementType();
  public abstract com.intellij.psi.stubs.StubElement<?> getParentStub();
  public abstract com.intellij.psi.stubs.PsiFileStub<?> getContainingFileStub();
  public abstract java.util.List<com.intellij.psi.stubs.StubElement<?>> getChildrenStubs();
  public abstract <P extends com.intellij.psi.PsiElement, S extends com.intellij.psi.stubs.StubElement<P>> S findChildStubByType(com.intellij.psi.stubs.IStubElementType<S, P> p0);
  public default com.intellij.psi.stubs.StubElement<? extends com.intellij.psi.PsiElement> findChildStubByElementType(com.intellij.psi.tree.IElementType p0) { return null; }
  public abstract T getPsi();
  public abstract <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.IElementType p0, E[] p1);
  public abstract <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.TokenSet p0, E[] p1);
  public abstract <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.IElementType p0, com.intellij.util.ArrayFactory<? extends E> p1);
  public abstract <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.TokenSet p0, com.intellij.util.ArrayFactory<? extends E> p1);
  public abstract <E extends com.intellij.psi.PsiElement> E getParentStubOfType(java.lang.Class<E> p0);
}
