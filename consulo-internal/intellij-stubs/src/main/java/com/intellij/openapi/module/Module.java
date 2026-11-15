package com.intellij.openapi.module;

@SuppressWarnings("all")
public interface Module extends com.intellij.openapi.components.ComponentManager, com.intellij.openapi.util.UserDataHolder {
    String getName();
    com.intellij.openapi.project.Project getProject();
    boolean isDisposed();
}
