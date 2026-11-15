package com.intellij.openapi.vfs.jrt;

/** Consulo: com.intellij.java.language.vfs.jrt.JrtFileSystem (a helper); instanceof and getInstance() go through compat. */
@SuppressWarnings("all")
public abstract class JrtFileSystem extends com.intellij.openapi.vfs.VirtualFileSystem {
    public static final java.lang.String PROTOCOL = "jrt";
    public static final java.lang.String PROTOCOL_PREFIX = "jrt://";
    public static final java.lang.String SEPARATOR = "!/";
    public static JrtFileSystem getInstance() { return null; }
    public static boolean isJrt(com.intellij.openapi.vfs.VirtualFileSystem p0) { return false; }
    public static boolean isRoot(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
    public static boolean isModuleRoot(com.intellij.openapi.vfs.VirtualFile p0) { return false; }
}
