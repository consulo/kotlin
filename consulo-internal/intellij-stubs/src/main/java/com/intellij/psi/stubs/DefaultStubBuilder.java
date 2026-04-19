package com.intellij.psi.stubs;

@SuppressWarnings("all")
public class DefaultStubBuilder implements com.intellij.psi.StubBuilder {
  public DefaultStubBuilder() { throw new UnsupportedOperationException("stub"); }
  public com.intellij.psi.stubs.StubElement buildStubTree(com.intellij.psi.PsiFile p0) { return null; }
  protected com.intellij.psi.stubs.StubElement createStubForFile(com.intellij.psi.PsiFile p0) { return null; }
  protected final com.intellij.psi.stubs.StubElement buildStubTreeFor(com.intellij.lang.ASTNode p0, com.intellij.psi.stubs.StubElement p1) { return null; }
  public boolean skipChildProcessingWhenBuildingStubs(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) { return false; }
}
