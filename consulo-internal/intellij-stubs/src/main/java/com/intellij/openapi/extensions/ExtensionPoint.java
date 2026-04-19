package com.intellij.openapi.extensions;
@SuppressWarnings("all")
public interface ExtensionPoint<T> {
    T[] getExtensions();
    java.util.List<T> getExtensionList();
    void registerExtension(T p0, com.intellij.openapi.Disposable p1);
}
