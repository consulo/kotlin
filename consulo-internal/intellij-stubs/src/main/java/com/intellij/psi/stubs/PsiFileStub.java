package com.intellij.psi.stubs;

@SuppressWarnings("all")
public interface PsiFileStub<T extends com.intellij.psi.PsiFile> extends com.intellij.psi.stubs.StubElement<T>, com.intellij.openapi.util.UserDataHolder {
  public abstract com.intellij.psi.tree.StubFileElementType<?> getType();
  public default com.intellij.psi.tree.IElementType getFileElementType() { return null; }
  public abstract java.lang.String getInvalidationReason();
}
