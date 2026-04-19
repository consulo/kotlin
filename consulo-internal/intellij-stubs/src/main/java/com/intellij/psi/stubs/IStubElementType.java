package com.intellij.psi.stubs;

@SuppressWarnings("all")
public abstract class IStubElementType<StubT extends com.intellij.psi.stubs.StubElement, PsiT extends com.intellij.psi.PsiElement> extends com.intellij.psi.tree.IElementType {
  public IStubElementType(java.lang.String p0, com.intellij.lang.Language p1) { super(p0, p1); }
  public static void checkNotInstantiatedTooLate(java.lang.Class<?> p0) {}
  public abstract PsiT createPsi(StubT p0);
  public abstract StubT createStub(PsiT p0, com.intellij.psi.stubs.StubElement<? extends com.intellij.psi.PsiElement> p1);
  public boolean shouldCreateStub(com.intellij.lang.ASTNode p0) { return false; }
  public String getExternalId() { return null; }
  public void serialize(StubT stub, StubOutputStream dataStream) throws java.io.IOException {}
  public StubT deserialize(StubInputStream dataStream, StubElement parentStub) throws java.io.IOException { return null; }
  public void indexStub(StubT stub, IndexSink sink) {}
}
