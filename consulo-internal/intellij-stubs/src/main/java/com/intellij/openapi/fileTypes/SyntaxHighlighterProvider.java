package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public interface SyntaxHighlighterProvider {
    SyntaxHighlighter create(FileType p0, com.intellij.openapi.project.Project p1, com.intellij.openapi.vfs.VirtualFile p2);
}
