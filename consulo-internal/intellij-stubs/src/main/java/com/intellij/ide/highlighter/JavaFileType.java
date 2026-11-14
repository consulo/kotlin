package com.intellij.ide.highlighter;

@SuppressWarnings("all")
public class JavaFileType extends com.intellij.openapi.fileTypes.LanguageFileType {
    public static final JavaFileType INSTANCE = new JavaFileType();
    public JavaFileType() { super(null); }
    public String getName() { return "JAVA"; }
    public String getDescription() { return ""; }
    public String getDefaultExtension() { return "java"; }
    public javax.swing.Icon getIcon() { return null; }
    public static final String DEFAULT_EXTENSION = "java";
    public static final String DOT_DEFAULT_EXTENSION = ".java";
}
