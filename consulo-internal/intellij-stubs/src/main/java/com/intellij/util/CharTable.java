package com.intellij.util;

@SuppressWarnings("all")
public interface CharTable {
    CharSequence intern(CharSequence text);
    CharSequence intern(CharSequence baseText, int startOffset, int endOffset);
}
