package com.intellij.lang;

@SuppressWarnings("all")
public interface Commenter {
    java.lang.String getLineCommentPrefix();
    java.lang.String getBlockCommentPrefix();
    java.lang.String getBlockCommentSuffix();
    java.lang.String getCommentedBlockCommentPrefix();
    java.lang.String getCommentedBlockCommentSuffix();
}
