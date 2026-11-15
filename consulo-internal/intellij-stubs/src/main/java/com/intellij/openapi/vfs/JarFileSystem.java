package com.intellij.openapi.vfs;

/** Consulo: consulo.virtualFileSystem.archive.ArchiveFileSystem (getLocalByEntry -> getLocalVirtualFileFor). */
@SuppressWarnings("all")
public abstract class JarFileSystem extends com.intellij.openapi.vfs.VirtualFileSystem {
    public static final java.lang.String PROTOCOL = "jar";
    public static final java.lang.String PROTOCOL_PREFIX = "jar://";
    public static final java.lang.String JAR_SEPARATOR = "!/";
    public abstract com.intellij.openapi.vfs.VirtualFile getLocalByEntry(com.intellij.openapi.vfs.VirtualFile entry);
}
