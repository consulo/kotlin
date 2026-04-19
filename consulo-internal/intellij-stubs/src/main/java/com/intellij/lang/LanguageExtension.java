package com.intellij.lang;

@SuppressWarnings("all")
public class LanguageExtension<T> {
    public LanguageExtension(String epName) { throw new UnsupportedOperationException("stub"); }
    public LanguageExtension(String epName, T defaultImplementation) { throw new UnsupportedOperationException("stub"); }
    public T forLanguage(Language language) { return null; }
}
