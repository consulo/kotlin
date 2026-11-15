package com.intellij.psi.impl.source;

@SuppressWarnings("all")
public class SourceTreeToPsiMap {
    public static com.intellij.lang.ASTNode psiElementToTree(com.intellij.psi.PsiElement element) { return element != null ? element.getNode() : null; }
    public static com.intellij.psi.PsiElement treeElementToPsi(com.intellij.lang.ASTNode node) { return node != null ? node.getPsi() : null; }
    public static com.intellij.psi.PsiElement treeToPsiNotNull(com.intellij.lang.ASTNode node) { return node.getPsi(); }
    public static com.intellij.psi.impl.source.tree.TreeElement psiToTreeNotNull(com.intellij.psi.PsiElement element) { return null; }
}
