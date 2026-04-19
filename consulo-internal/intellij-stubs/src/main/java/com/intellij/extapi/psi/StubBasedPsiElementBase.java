package com.intellij.extapi.psi;

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class StubBasedPsiElementBase<T extends com.intellij.psi.stubs.StubElement> extends ASTDelegatePsiElement
    implements com.intellij.psi.StubBasedPsiElement<T> {
    public StubBasedPsiElementBase(T p0, com.intellij.psi.stubs.IStubElementType p1) { }
    public StubBasedPsiElementBase(com.intellij.lang.ASTNode p0) { }
    public T getStub() { return null; }
    public T getGreenStub() { return null; }
    public com.intellij.psi.stubs.IStubElementType getElementType() { return null; }
    public <Psi extends com.intellij.psi.PsiElement> Psi getStubOrPsiChild(com.intellij.psi.stubs.IStubElementType<? extends com.intellij.psi.stubs.StubElement, Psi> p0) { return null; }
    public <Psi extends com.intellij.psi.PsiElement> Psi[] getStubOrPsiChildren(com.intellij.psi.stubs.IStubElementType<? extends com.intellij.psi.stubs.StubElement, Psi> p0, Psi[] p1) { return null; }
    public <Psi extends com.intellij.psi.PsiElement> Psi[] getStubOrPsiChildren(com.intellij.psi.stubs.IStubElementType<? extends com.intellij.psi.stubs.StubElement, Psi> p0, com.intellij.util.ArrayFactory<Psi> p1) { return null; }
    public <Psi extends com.intellij.psi.PsiElement> Psi[] getStubOrPsiChildren(com.intellij.psi.tree.TokenSet p0, com.intellij.util.ArrayFactory<Psi> p1) { return null; }
    public <Psi extends com.intellij.psi.PsiElement> Psi[] getStubOrPsiChildren(com.intellij.psi.tree.TokenSet p0, Psi[] p1) { return p1; }
    public com.intellij.psi.PsiElement[] getStubOrPsiChildren(com.intellij.psi.tree.TokenSet p0) { return null; }
    public <Psi extends com.intellij.psi.PsiElement> java.util.List<Psi> getStubOrPsiChildrenAsList(com.intellij.psi.stubs.IStubElementType<? extends com.intellij.psi.stubs.StubElement, Psi> p0) { return null; }
    public com.intellij.psi.PsiElement getParentByStub() { return null; }
    public <Psi extends com.intellij.psi.PsiElement> Psi getRequiredStubOrPsiChild(com.intellij.psi.stubs.IStubElementType<? extends com.intellij.psi.stubs.StubElement, Psi> p0) { return null; }
}
