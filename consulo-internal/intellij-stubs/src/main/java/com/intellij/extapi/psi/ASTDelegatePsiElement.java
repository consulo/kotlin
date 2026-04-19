package com.intellij.extapi.psi;

@SuppressWarnings("all")
public abstract class ASTDelegatePsiElement extends com.intellij.psi.impl.ElementBase {
    public com.intellij.lang.ASTNode getNode() { return null; }
    protected <T extends com.intellij.psi.PsiElement> T findChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
    protected <T extends com.intellij.psi.PsiElement> T findChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
    protected <T extends com.intellij.psi.PsiElement> T findNotNullChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
    public com.intellij.psi.PsiElement findNotNullChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
    protected <T extends com.intellij.psi.PsiElement> java.util.List<T> findChildrenByType(com.intellij.psi.tree.IElementType p0) { return null; }
    protected <T extends com.intellij.psi.PsiElement> java.util.List<T> findChildrenByType(com.intellij.psi.tree.IElementType p0, boolean p1) { return null; }
    protected <T extends com.intellij.psi.PsiElement> java.util.List<T> findChildrenByType(com.intellij.psi.tree.TokenSet p0) { return null; }
    protected <T> T findChildByClass(Class<T> p0) { return null; }
    protected <T> T findNotNullChildByClass(Class<T> p0) { return null; }
    protected <T> T[] findChildrenByClass(Class<T> p0) { return null; }
    public void subtreeChanged() {}
    public void deleteChildInternal(com.intellij.lang.ASTNode p0) {}
    protected <T extends com.intellij.psi.PsiElement> T findLastChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
    public com.intellij.psi.PsiElement findChildByFilter(com.intellij.psi.tree.TokenSet p0) { return null; }
}
