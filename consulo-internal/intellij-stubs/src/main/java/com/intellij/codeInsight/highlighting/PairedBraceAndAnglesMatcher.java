package com.intellij.codeInsight.highlighting;

@SuppressWarnings("all")
public abstract class PairedBraceAndAnglesMatcher {
    public PairedBraceAndAnglesMatcher(com.intellij.lang.PairedBraceMatcher p0, com.intellij.lang.Language p1, com.intellij.openapi.fileTypes.LanguageFileType p2, com.intellij.psi.tree.TokenSet p3) {}
    public abstract com.intellij.psi.tree.IElementType lt();
    public abstract com.intellij.psi.tree.IElementType gt();
}
