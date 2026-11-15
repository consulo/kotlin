package com.intellij.openapi.extensions.impl;

// consulo.kotlin.compat.extensions.NamedExtensionPoint
@SuppressWarnings("all")
public abstract class ExtensionPointImpl<T> implements com.intellij.openapi.extensions.ExtensionPoint<T>, kotlin.sequences.Sequence<T> {
    private ExtensionPointImpl() {}
    public java.util.Iterator<T> iterator() { return null; }
    // Inherited abstract members (genstub.py)
    public T[] getExtensions() { return null; }
    public java.util.List<T> getExtensionList() { return null; }
}
