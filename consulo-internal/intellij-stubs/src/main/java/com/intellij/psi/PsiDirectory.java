package com.intellij.psi;
@SuppressWarnings("all")
public interface PsiDirectory extends PsiElement {
    PsiFile findFile(String name);
    String getName();
    com.intellij.openapi.vfs.VirtualFile getVirtualFile();
}
