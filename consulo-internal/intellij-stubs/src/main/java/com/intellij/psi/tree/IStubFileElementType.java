package com.intellij.psi.tree;

@SuppressWarnings("all")
public class IStubFileElementType<T extends com.intellij.psi.stubs.PsiFileStub> extends com.intellij.psi.tree.StubFileElementType<T> {
  public IStubFileElementType(com.intellij.lang.Language p0) { super(p0); }
  public IStubFileElementType(java.lang.String p0, com.intellij.lang.Language p1) { super(p0, p1); }
  public int getStubVersion() { return 0; }
  public com.intellij.psi.StubBuilder getBuilder() { return null; }
  public java.lang.String getExternalId() { return null; }
  public void serialize(T p0, com.intellij.psi.stubs.StubOutputStream p1) throws java.io.IOException {}
  public T deserialize(com.intellij.psi.stubs.StubInputStream p0, com.intellij.psi.stubs.StubElement p1) throws java.io.IOException { return null; }
  public void indexStub(com.intellij.psi.stubs.PsiFileStub p0, com.intellij.psi.stubs.IndexSink p1) {}
  public boolean shouldBuildStubFor(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
  public static int getTemplateStubBaseVersion() { return 0; }
}
