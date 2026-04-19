package com.intellij.psi.stubs;

@SuppressWarnings("all")
public class PsiFileStubImpl<T extends com.intellij.psi.PsiFile> extends com.intellij.psi.stubs.StubBase<T> implements com.intellij.psi.stubs.PsiFileStub<T> {
  public static final com.intellij.psi.tree.IStubFileElementType TYPE = null;
  public PsiFileStubImpl(T p0) { super(null, (com.intellij.psi.stubs.IStubElementType<?,?>)null); }
  public T getPsi() { return null; }
  public void setPsi(T p0) {}
  public void clearPsi(java.lang.String p0) {}
  public java.lang.String getInvalidationReason() { return null; }
  public com.intellij.psi.stubs.IStubElementType getStubType() { return null; }
  public com.intellij.psi.tree.IElementType getElementType() { return null; }
  public com.intellij.psi.stubs.ObjectStubSerializer<?, ? extends com.intellij.psi.stubs.Stub> getStubSerializer() { return null; }
  public com.intellij.psi.tree.IStubFileElementType<?> getType() { return null; }
  public com.intellij.psi.stubs.PsiFileStub<?>[] getStubRoots() { return null; }
  public void setStubRoots(com.intellij.psi.stubs.PsiFileStub<?>[] p0) {}
  public boolean rootsAreSet() { return false; }
  public final java.lang.String getDiagnostics() { return null; }
}
