package com.intellij.psi;

@SuppressWarnings("all")
public interface StubBuilder {
  public abstract com.intellij.psi.stubs.StubElement buildStubTree(com.intellij.psi.PsiFile p0);
  public abstract boolean skipChildProcessingWhenBuildingStubs(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1);
}
