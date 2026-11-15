package com.intellij.psi.stubs;
@SuppressWarnings("all")
public interface StubElementFactory<Stub extends StubElement<?>, Psi extends com.intellij.psi.PsiElement> {
    Stub createStub(Psi psi, StubElement<?> parentStub);
    Psi createPsi(Stub stub);
    default boolean shouldCreateStub(com.intellij.lang.ASTNode node) { return true; }
}
