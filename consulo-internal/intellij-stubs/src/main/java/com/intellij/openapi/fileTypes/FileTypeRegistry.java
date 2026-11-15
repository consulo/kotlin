package com.intellij.openapi.fileTypes;
@SuppressWarnings("all")
public abstract class FileTypeRegistry {
    public static FileTypeRegistry getInstance() { return null; }
    public FileType getFileTypeByFileName(String fileName) { return null; }
    public FileType getFileTypeByFile(com.intellij.openapi.vfs.VirtualFile file) { return null; }
    public boolean isFileOfType(com.intellij.openapi.vfs.VirtualFile file, FileType type) { return false; }
    // Added by consulo-internal/remap/genstub.py from consulo.virtualFileSystem.fileType.FileTypeRegistry
    public boolean isFileIgnored(java.lang.String p0) { return false; }
    public boolean isFileIgnored(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
    public com.intellij.openapi.fileTypes.FileType[] getRegisteredFileTypes() { return null; }
    public com.intellij.openapi.fileTypes.FileType getFileTypeByFile(com.intellij.openapi.vfs.VirtualFile p0, byte[] p1) { return null; }
    public com.intellij.openapi.fileTypes.FileType getFileTypeByFileName(java.lang.CharSequence p0) { return null; }
    public com.intellij.openapi.fileTypes.FileType getFileTypeByExtension(java.lang.String p0) { return null; }
    public com.intellij.openapi.fileTypes.FileType findFileTypeByName(java.lang.String p0) { return null; }
    public com.intellij.openapi.fileTypes.FileType getKnownFileTypeOrAssociate(com.intellij.openapi.vfs.VirtualFile p0, com.intellij.openapi.components.ComponentManager p1) { return null; }
    public com.intellij.openapi.fileTypes.FileType getKnownFileTypeOrAssociate(java.lang.String p0) { return null; }
    public com.intellij.openapi.fileTypes.FileType getFileTypeByMimeType(java.lang.String p0) { return null; }
}
