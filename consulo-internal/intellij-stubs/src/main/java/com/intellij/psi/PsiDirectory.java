package com.intellij.psi;
@SuppressWarnings("all")
public interface PsiDirectory extends PsiElement {
    String getName();
    com.intellij.openapi.vfs.VirtualFile getVirtualFile();
}
