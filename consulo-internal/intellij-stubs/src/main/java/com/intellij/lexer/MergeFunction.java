package com.intellij.lexer;
@SuppressWarnings("all")
public interface MergeFunction {
    com.intellij.psi.tree.IElementType merge(com.intellij.psi.tree.IElementType p0, Lexer p1);
}
