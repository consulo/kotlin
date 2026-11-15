package com.intellij.lang.folding;

@SuppressWarnings("all")
public abstract class CustomFoldingBuilder {
    public final FoldingDescriptor[] buildFoldRegions(com.intellij.psi.PsiElement root, com.intellij.openapi.editor.Document document, boolean quick) { return null; }
    protected abstract void buildLanguageFoldRegions(java.util.List<FoldingDescriptor> descriptors, com.intellij.psi.PsiElement root, com.intellij.openapi.editor.Document document, boolean quick);
    public final String getPlaceholderText(com.intellij.lang.ASTNode node, com.intellij.openapi.util.TextRange range) { return null; }
    protected abstract String getLanguagePlaceholderText(com.intellij.lang.ASTNode node, com.intellij.openapi.util.TextRange range);
    public final String getPlaceholderText(com.intellij.lang.ASTNode node) { return null; }
    public final boolean isCollapsedByDefault(com.intellij.lang.ASTNode node) { return false; }
    protected abstract boolean isRegionCollapsedByDefault(com.intellij.lang.ASTNode node);
    protected boolean isCustomFoldingCandidate(com.intellij.lang.ASTNode node) { return false; }
    protected boolean isCustomFoldingRoot(com.intellij.lang.ASTNode node) { return false; }
    protected static boolean isCustomRegionElement(com.intellij.psi.PsiElement element) { return false; }
}
