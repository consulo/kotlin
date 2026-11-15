package com.intellij.openapi.fileEditor;

// consulo.kotlin.compat.navigation.OpenFileDescriptor
@SuppressWarnings("all")
public class OpenFileDescriptor {
    public OpenFileDescriptor(com.intellij.openapi.project.Project project, com.intellij.openapi.vfs.VirtualFile file, int offset) { }
    public OpenFileDescriptor(com.intellij.openapi.project.Project project, com.intellij.openapi.vfs.VirtualFile file) { }
    public com.intellij.openapi.project.Project getProject() { return null; }
    public com.intellij.openapi.vfs.VirtualFile getFile() { return null; }
    public int getOffset() { return 0; }
}
