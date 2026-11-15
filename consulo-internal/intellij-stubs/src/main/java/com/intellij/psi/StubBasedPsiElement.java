package com.intellij.psi;

@SuppressWarnings("all")
public interface StubBasedPsiElement<T extends com.intellij.psi.stubs.StubElement> extends PsiElement {
    T getStub();
    com.intellij.psi.stubs.IStubElementType getElementType();
    default com.intellij.psi.tree.IElementType getIElementType() { return getElementType(); }
}
