package com.intellij.openapi.extensions;

@SuppressWarnings("all")
public class ExtensionPointName<T> {
    public ExtensionPointName(String name) {}
    public static <T> ExtensionPointName<T> create(String name) { return new ExtensionPointName<T>(name); }
    public T[] getExtensions() { return null; }
    public java.util.List<T> getExtensionList() { return java.util.Collections.<T>emptyList(); }
    public java.util.List<T> getExtensionList(AreaInstance areaInstance) { return java.util.Collections.<T>emptyList(); }
    public T[] getExtensions(AreaInstance areaInstance) { return null; }
    public com.intellij.openapi.extensions.ExtensionPoint<T> getPoint() { return null; }
    public String getName() { return null; }
    public void forEachExtensionSafe(java.util.function.Consumer<? super T> consumer) {}
}
