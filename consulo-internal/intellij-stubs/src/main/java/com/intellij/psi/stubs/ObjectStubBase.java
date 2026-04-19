package com.intellij.psi.stubs;

@SuppressWarnings("all")
public abstract class ObjectStubBase<T extends com.intellij.psi.stubs.Stub> extends com.intellij.openapi.util.UserDataHolderBase implements com.intellij.psi.stubs.Stub {
  protected final T myParent;
  public int id;
  public ObjectStubBase(T p0) { throw new UnsupportedOperationException("stub"); }
  public T getParentStub() { return null; }
  public boolean isDangling() { return false; }
  public void markDangling() {}
  public int getStubId() { return 0; }
}
