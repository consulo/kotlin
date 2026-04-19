package com.intellij.openapi.extensions;
@SuppressWarnings("all")
public class ExtensionPointName<T> {
    private final String name;
    public ExtensionPointName(String p0) { this.name = p0; }
    public static <T> ExtensionPointName<T> create(String p0) { return new ExtensionPointName<>(p0); }
    public String getName() { return name; }
    public java.util.List<T> getExtensionList() { return java.util.Collections.emptyList(); }
}
