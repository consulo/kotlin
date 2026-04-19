package com.intellij.openapi.fileTypes;
@SuppressWarnings("all")
public abstract class FileTypeRegistry {
    public static FileTypeRegistry getInstance() { return null; }
    public abstract FileType getFileTypeByFileName(String fileName);
    public abstract boolean isFileOfType(com.intellij.openapi.vfs.VirtualFile file, FileType type);
}
