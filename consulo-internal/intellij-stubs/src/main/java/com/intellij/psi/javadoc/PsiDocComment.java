package com.intellij.psi.javadoc;

@SuppressWarnings("all")
public interface PsiDocComment extends com.intellij.psi.PsiElement, com.intellij.psi.PsiDocCommentBase {
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.javadoc.PsiDocComment
    public com.intellij.psi.PsiJavaDocumentedElement getOwner();
    public com.intellij.psi.PsiElement[] getDescriptionElements();
    public com.intellij.psi.javadoc.PsiDocTag[] getTags();
    public com.intellij.psi.javadoc.PsiDocTag findTagByName(java.lang.String p0);
    public com.intellij.psi.javadoc.PsiDocTag[] findTagsByName(java.lang.String p0);
    public default boolean isMarkdownComment() { return false; }
}
