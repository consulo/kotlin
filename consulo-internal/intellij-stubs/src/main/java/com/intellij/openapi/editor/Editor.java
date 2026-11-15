package com.intellij.openapi.editor;

@SuppressWarnings("all")
public interface Editor extends com.intellij.openapi.util.UserDataHolder {
    com.intellij.openapi.editor.Document getDocument();
    com.intellij.openapi.project.Project getProject();
}
