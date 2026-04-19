package com.intellij.psi;
@SuppressWarnings("all")
public class SingleRootFileViewProvider implements FileViewProvider {
    public SingleRootFileViewProvider(PsiManager p0, com.intellij.openapi.vfs.VirtualFile p1) {}
    public SingleRootFileViewProvider(PsiManager p0, com.intellij.openapi.vfs.VirtualFile p1, boolean p2) {}
    public com.intellij.openapi.vfs.VirtualFile getVirtualFile() { return null; }
    public com.intellij.openapi.editor.Document getDocument() { return null; }
    public PsiManager getManager() { return null; }
    public com.intellij.lang.Language getBaseLanguage() { return null; }
    public PsiFile getPsi(com.intellij.lang.Language p0) { return null; }
    public java.util.Set<com.intellij.lang.Language> getLanguages() { return null; }
    public boolean isPhysical() { return false; }
    public void forceCachedPsi(PsiFile p0) {}
    public CharSequence getContents() { return ""; }
    public java.util.List<PsiFile> getAllFiles() { return null; }
    public boolean isEventSystemEnabled() { return false; }
    public long getModificationStamp() { return 0; }
    public boolean supportsIncrementalReparse(com.intellij.lang.Language p0) { return false; }
    public void rootChanged(PsiFile p0) {}
    public void beforeContentsSynchronized() {}
    public void contentsSynchronized() {}
    public PsiElement findElementAt(int p0) { return null; }
    public PsiReference findReferenceAt(int p0) { return null; }
    public PsiElement findElementAt(int p0, com.intellij.lang.Language p1) { return null; }
    public PsiElement findElementAt(int p0, Class<? extends com.intellij.lang.Language> p1) { return null; }
    public PsiReference findReferenceAt(int p0, com.intellij.lang.Language p1) { return null; }
    public FileViewProvider createCopy(com.intellij.openapi.vfs.VirtualFile p0) { return null; }
    public PsiFile getStubBindingRoot() { return null; }
    public com.intellij.openapi.fileTypes.FileType getFileType() { return null; }
    public <T> T getUserData(com.intellij.openapi.util.Key<T> p0) { return null; }
    public <T> void putUserData(com.intellij.openapi.util.Key<T> p0, T p1) {}
    public <T> boolean replace(com.intellij.openapi.util.Key<T> p0, T p1, T p2) { return false; }
    public <T> T putUserDataIfAbsent(com.intellij.openapi.util.Key<T> p0, T p1) { return p1; }
    public <T> T getCopyableUserData(com.intellij.openapi.util.Key<T> p0) { return null; }
    public <T> void putCopyableUserData(com.intellij.openapi.util.Key<T> p0, T p1) {}
}
