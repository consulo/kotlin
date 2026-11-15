package com.intellij.openapi.fileTypes;

@SuppressWarnings("all")
public final class UnknownFileType implements FileType {
    public static final FileType INSTANCE = null;
    private UnknownFileType() {}
    public String getName() { return null; }
    public String getDescription() { return null; }
    public String getDefaultExtension() { return null; }
    public javax.swing.Icon getIcon() { return null; }
    public boolean isBinary() { return false; }
    // Inherited abstract members (genstub.py)
    public java.lang.String getId() { return null; }
}
