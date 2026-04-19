package com.intellij.psi.stubs;

@SuppressWarnings("all")
public interface NamedStub<T extends com.intellij.psi.PsiNamedElement> extends com.intellij.psi.stubs.StubElement<T> {
  public abstract java.lang.String getName();
}
