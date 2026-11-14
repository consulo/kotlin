package com.intellij.ide.highlighter;

@SuppressWarnings("all")
public class JavaClassFileType extends com.intellij.openapi.fileTypes.LanguageFileType {
    public static final JavaClassFileType INSTANCE = new JavaClassFileType();
    public JavaClassFileType() { super(null); }
    public String getName() { return "JavaClass"; }
    public String getDescription() { return ""; }
    public String getDefaultExtension() { return "class"; }
    public javax.swing.Icon getIcon() { return null; }
}
