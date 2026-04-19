package com.intellij.psi.stubs;

@SuppressWarnings("all")
public interface Stub {
  public abstract com.intellij.psi.stubs.Stub getParentStub();
  public abstract java.util.List<? extends com.intellij.psi.stubs.Stub> getChildrenStubs();
  public default com.intellij.psi.stubs.ObjectStubSerializer<?, ? extends com.intellij.psi.stubs.Stub> getStubSerializer() { return null; }
}
