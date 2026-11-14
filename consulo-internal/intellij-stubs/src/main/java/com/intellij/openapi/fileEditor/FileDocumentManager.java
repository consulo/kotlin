package com.intellij.openapi.fileEditor;

@SuppressWarnings("all")
public abstract class FileDocumentManager {
    public static FileDocumentManager getInstance() { return null; }
    public abstract com.intellij.openapi.editor.Document getDocument(com.intellij.openapi.vfs.VirtualFile file);
    public abstract com.intellij.openapi.vfs.VirtualFile getFile(com.intellij.openapi.editor.Document document);
    public abstract void saveAllDocuments();
    public abstract void saveDocument(com.intellij.openapi.editor.Document document);
    public abstract void reloadFiles(com.intellij.openapi.vfs.VirtualFile... files);
}
