package com.intellij.util.indexing;
@SuppressWarnings("all")
public interface FileContent extends com.intellij.openapi.util.UserDataHolder {    // Added by consulo-internal/remap/genstub.py from consulo.language.psi.stub.FileContent
    public com.intellij.openapi.fileTypes.FileType getFileType();
    public com.intellij.openapi.vfs.VirtualFile getFile();
    public java.lang.String getFileName();
    public byte[] getContent();
    public java.lang.CharSequence getContentAsText();
    public com.intellij.openapi.project.Project getProject();
    public com.intellij.psi.PsiFile getPsiFile();
}
