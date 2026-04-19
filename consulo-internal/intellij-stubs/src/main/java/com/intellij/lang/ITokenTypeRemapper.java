package com.intellij.lang;

@SuppressWarnings("all")
public interface ITokenTypeRemapper {
    com.intellij.psi.tree.IElementType filter(com.intellij.psi.tree.IElementType source, int start, int end, CharSequence text);
}
