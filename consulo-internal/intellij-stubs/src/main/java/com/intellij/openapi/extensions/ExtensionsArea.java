package com.intellij.openapi.extensions;
@SuppressWarnings("all")
public interface ExtensionsArea {
    boolean hasExtensionPoint(String p0);
    <T> ExtensionPoint<T> getExtensionPoint(ExtensionPointName<T> p0);
}
