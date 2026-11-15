package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public abstract class SyntaxHighlighterFactory {
    public abstract SyntaxHighlighter getSyntaxHighlighter(com.intellij.openapi.project.Project p0, com.intellij.openapi.vfs.VirtualFile p1);
    public static SyntaxHighlighter getSyntaxHighlighter(com.intellij.lang.Language p0, com.intellij.openapi.project.Project p1, com.intellij.openapi.vfs.VirtualFile p2) { return null; }
}
