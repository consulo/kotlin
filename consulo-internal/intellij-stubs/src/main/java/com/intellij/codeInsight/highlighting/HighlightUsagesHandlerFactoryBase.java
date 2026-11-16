package com.intellij.codeInsight.highlighting;

// IntelliJ shape of consulo.language.editor.highlight.usage.HighlightUsagesHandlerFactoryBase (generic there)
@SuppressWarnings("all")
public abstract class HighlightUsagesHandlerFactoryBase implements com.intellij.codeInsight.highlighting.HighlightUsagesHandlerFactory {
    public final com.intellij.codeInsight.highlighting.HighlightUsagesHandlerBase createHighlightUsagesHandler(com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) { return null; }
    public abstract com.intellij.codeInsight.highlighting.HighlightUsagesHandlerBase<?> createHighlightUsagesHandler(com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file, com.intellij.psi.PsiElement target);
}
