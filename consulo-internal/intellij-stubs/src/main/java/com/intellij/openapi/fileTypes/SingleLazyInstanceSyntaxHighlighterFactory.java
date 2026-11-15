package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public abstract class SingleLazyInstanceSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    protected abstract SyntaxHighlighter createHighlighter();
    public final SyntaxHighlighter getSyntaxHighlighter(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1) { return null; }
}
