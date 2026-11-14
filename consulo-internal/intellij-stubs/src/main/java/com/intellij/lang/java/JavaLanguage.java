package com.intellij.lang.java;

@SuppressWarnings("all")
public class JavaLanguage extends com.intellij.lang.Language {
    public static final JavaLanguage INSTANCE = new JavaLanguage();
    protected JavaLanguage() { super("JAVA"); }
}
