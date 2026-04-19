package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiFileSystemItem extends PsiNamedElement {
    com.intellij.openapi.vfs.VirtualFile getVirtualFile();
    PsiDirectory getParent();
    boolean isDirectory();
    boolean processChildren(com.intellij.psi.search.PsiElementProcessor<? super PsiFileSystemItem> processor);
}
