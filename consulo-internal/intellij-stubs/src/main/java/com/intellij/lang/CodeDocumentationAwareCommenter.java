package com.intellij.lang;

@SuppressWarnings("all")
public interface CodeDocumentationAwareCommenter extends Commenter {
    com.intellij.psi.tree.IElementType getLineCommentTokenType();
    com.intellij.psi.tree.IElementType getBlockCommentTokenType();
    com.intellij.psi.tree.IElementType getDocumentationCommentTokenType();
    java.lang.String getDocumentationCommentPrefix();
    java.lang.String getDocumentationCommentLinePrefix();
    java.lang.String getDocumentationCommentSuffix();
    boolean isDocumentationComment(com.intellij.psi.PsiComment p0);
}
