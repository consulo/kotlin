package com.intellij.lang.folding;

@SuppressWarnings("all")
public class FoldingDescriptor {
    public static final FoldingDescriptor[] EMPTY = new FoldingDescriptor[0];
    public FoldingDescriptor(com.intellij.lang.ASTNode node, com.intellij.openapi.util.TextRange range) {}
    public FoldingDescriptor(com.intellij.psi.PsiElement element, com.intellij.openapi.util.TextRange range) {}
    public com.intellij.lang.ASTNode getElement() { return null; }
    public com.intellij.openapi.util.TextRange getRange() { return null; }
    public String getPlaceholderText() { return null; }
    public void setPlaceholderText(String text) {}
    public boolean canBeRemovedWhenCollapsed() { return false; }
    public void setCanBeRemovedWhenCollapsed(boolean value) {}
}
