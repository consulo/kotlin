package com.intellij.psi;

@SuppressWarnings("all")
public interface TokenType {
    com.intellij.psi.tree.IElementType WHITE_SPACE = new com.intellij.psi.tree.IElementType("WHITE_SPACE", com.intellij.lang.Language.ANY);
    com.intellij.psi.tree.IElementType BAD_CHARACTER = new com.intellij.psi.tree.IElementType("BAD_CHARACTER", com.intellij.lang.Language.ANY);
    com.intellij.psi.tree.IElementType ERROR_ELEMENT = new com.intellij.psi.tree.IElementType("ERROR_ELEMENT", com.intellij.lang.Language.ANY);
    com.intellij.psi.tree.IElementType CODE_FRAGMENT = new com.intellij.psi.tree.IElementType("CODE_FRAGMENT", com.intellij.lang.Language.ANY);
}
