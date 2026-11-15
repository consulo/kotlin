package com.intellij.ide.highlighter;

@SuppressWarnings("all")
public class JavaClassFileType extends com.intellij.openapi.fileTypes.LanguageFileType implements com.intellij.openapi.fileTypes.FileType {
    public static final JavaClassFileType INSTANCE = new JavaClassFileType();
    public JavaClassFileType() { super(null); }
    public String getName() { return "JavaClass"; }
    public String getDescription() { return ""; }
    public String getDefaultExtension() { return "class"; }
    public javax.swing.Icon getIcon() { return null; }
    public static final String DEFAULT_EXTENSION = "class";
    public static final String DOT_DEFAULT_EXTENSION = ".class";
    // Inherited abstract members (genstub.py)
    public java.lang.String getId() { return null; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.impl.JavaClassFileType
}
