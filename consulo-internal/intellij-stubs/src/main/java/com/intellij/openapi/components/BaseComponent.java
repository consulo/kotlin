package com.intellij.openapi.components;

@SuppressWarnings("all")
public interface BaseComponent {
    default void initComponent() {}
    default void disposeComponent() {}
    default String getComponentName() { return null; }
}
