package com.intellij.psi.stubs;

@SuppressWarnings("all")
public abstract class StubBase<T extends com.intellij.psi.PsiElement> extends com.intellij.psi.stubs.ObjectStubBase<com.intellij.psi.stubs.StubElement<?>> implements com.intellij.psi.stubs.StubElement<T> {
  protected StubBase(com.intellij.psi.stubs.StubElement p0, com.intellij.psi.stubs.IStubElementType<?, ?> p1) { super(p0); }
  public com.intellij.psi.stubs.StubList getStubList() { return null; }
  public void setStubList(com.intellij.psi.stubs.StubList p0) {}
  protected StubBase(com.intellij.psi.stubs.StubElement p0, com.intellij.psi.tree.IElementType p1) { super(p0); }
  public com.intellij.psi.stubs.StubElement<?> getParentStub() { return null; }
  public com.intellij.psi.stubs.PsiFileStub<?> getContainingFileStub() { return null; }
  public java.util.List<com.intellij.psi.stubs.StubElement<?>> getChildrenStubs() { return null; }
  public <P extends com.intellij.psi.PsiElement, S extends com.intellij.psi.stubs.StubElement<P>> S findChildStubByType(com.intellij.psi.stubs.IStubElementType<S, P> p0) { return null; }
  public final com.intellij.psi.stubs.StubElement<com.intellij.psi.PsiElement> findChildStubByElementType(com.intellij.psi.tree.IElementType p0) { return null; }
  public void setPsi(T p0) {}
  public final T getCachedPsi() { return null; }
  public T getPsi() { return null; }
  public <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.IElementType p0, E[] p1) { return null; }
  public <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.TokenSet p0, E[] p1) { return null; }
  public <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.IElementType p0, com.intellij.util.ArrayFactory<? extends E> p1) { return null; }
  public <E extends com.intellij.psi.PsiElement> E[] getChildrenByType(com.intellij.psi.tree.TokenSet p0, com.intellij.util.ArrayFactory<? extends E> p1) { return null; }
  public <E extends com.intellij.psi.PsiElement> E getParentStubOfType(java.lang.Class<E> p0) { return null; }
  public com.intellij.psi.stubs.IStubElementType<?, ?> getStubType() { return null; }
  public com.intellij.psi.tree.IElementType getElementType() { return null; }
  public com.intellij.psi.stubs.ObjectStubSerializer<?, ? extends com.intellij.psi.stubs.Stub> getStubSerializer() { return null; }
  public com.intellij.openapi.project.Project getProject() { return null; }
  public java.lang.String printTree() { return null; }
  public java.lang.String toString() { return null; }
  public int compareByOrderWith(com.intellij.psi.stubs.ObjectStubBase<?> p0) { return 0; }
}
