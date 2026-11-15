package com.intellij.openapi.vfs;

@SuppressWarnings("all")
public class StandardFileSystems {
    public static final String FILE_PROTOCOL = "file";
    public static final String FILE_PROTOCOL_PREFIX = "file://";
    public static String JAR_PROTOCOL = "jar";
    public static String JAR_PROTOCOL_PREFIX = "jar://";
    public static VirtualFileSystem local() { return null; }
}
