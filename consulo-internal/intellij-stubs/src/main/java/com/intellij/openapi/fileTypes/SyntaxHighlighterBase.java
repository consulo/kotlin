package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public abstract class SyntaxHighlighterBase implements SyntaxHighlighter {
    public static void fillMap(java.util.Map<com.intellij.psi.tree.IElementType, com.intellij.openapi.editor.colors.TextAttributesKey> p0, com.intellij.psi.tree.TokenSet p1, com.intellij.openapi.editor.colors.TextAttributesKey p2) {}
    public static void fillMap(java.util.Map<com.intellij.psi.tree.IElementType, com.intellij.openapi.editor.colors.TextAttributesKey> p0, com.intellij.openapi.editor.colors.TextAttributesKey p1, com.intellij.psi.tree.IElementType... p2) {}
    public static java.util.Map<com.intellij.psi.tree.IElementType, com.intellij.openapi.editor.colors.TextAttributesKey[]> merge(java.util.Map<com.intellij.psi.tree.IElementType, com.intellij.openapi.editor.colors.TextAttributesKey> p0, java.util.Map<com.intellij.psi.tree.IElementType, com.intellij.openapi.editor.colors.TextAttributesKey> p1) { return null; }
    public static com.intellij.openapi.editor.colors.TextAttributesKey[] pack(com.intellij.openapi.editor.colors.TextAttributesKey p0) { return null; }
    public static com.intellij.openapi.editor.colors.TextAttributesKey[] pack(com.intellij.openapi.editor.colors.TextAttributesKey p0, com.intellij.openapi.editor.colors.TextAttributesKey p1) { return null; }
}
