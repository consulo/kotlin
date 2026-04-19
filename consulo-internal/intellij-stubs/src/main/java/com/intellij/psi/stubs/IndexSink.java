package com.intellij.psi.stubs;

@SuppressWarnings("all")
public interface IndexSink {
  public abstract <Psi extends com.intellij.psi.PsiElement, K> void occurrence(com.intellij.psi.stubs.StubIndexKey<K, Psi> p0, K p1);
}
