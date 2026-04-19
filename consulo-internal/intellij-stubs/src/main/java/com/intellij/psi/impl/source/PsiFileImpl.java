package com.intellij.psi.impl.source;

@SuppressWarnings("all")
public abstract class PsiFileImpl implements com.intellij.psi.PsiFile {
    public static final com.intellij.openapi.util.Key<Boolean> BUILDING_STUB = com.intellij.openapi.util.Key.create("BUILDING_STUB");
    protected com.intellij.psi.PsiFile myOriginalFile;
    protected com.intellij.psi.tree.IElementType myContentElementType;
    protected PsiFileImpl(com.intellij.psi.tree.IElementType p0, com.intellij.psi.tree.IElementType p1, com.intellij.psi.FileViewProvider p2) {}
    protected PsiFileImpl(com.intellij.psi.FileViewProvider p0) {}
    public com.intellij.psi.FileViewProvider getViewProvider() { return null; }
    public com.intellij.openapi.vfs.VirtualFile getVirtualFile() { return null; }
    public String getName() { return null; }
    public com.intellij.openapi.project.Project getProject() { return null; }
    public com.intellij.lang.Language getLanguage() { return null; }
    public com.intellij.psi.PsiManager getManager() { return null; }
    public com.intellij.psi.PsiElement[] getChildren() { return null; }
    public com.intellij.psi.PsiDirectory getParent() { return null; }
    public com.intellij.psi.PsiElement getFirstChild() { return null; }
    public com.intellij.psi.PsiElement getLastChild() { return null; }
    public com.intellij.psi.PsiElement getNextSibling() { return null; }
    public com.intellij.psi.PsiElement getPrevSibling() { return null; }
    public com.intellij.psi.PsiFile getContainingFile() { return this; }
    public com.intellij.openapi.util.TextRange getTextRange() { return null; }
    public int getStartOffsetInParent() { return 0; }
    public int getTextLength() { return 0; }
    public int getTextOffset() { return 0; }
    public String getText() { return null; }
    public char[] textToCharArray() { return null; }
    public com.intellij.psi.PsiElement findElementAt(int p0) { return null; }
    public com.intellij.psi.PsiReference findReferenceAt(int p0) { return null; }
    public com.intellij.lang.FileASTNode getNode() { return null; }
    public boolean textContains(char p0) { return false; }
    public void accept(com.intellij.psi.PsiElementVisitor p0) {}
    public void acceptChildren(com.intellij.psi.PsiElementVisitor p0) {}
    public com.intellij.psi.PsiElement copy() { return null; }
    public com.intellij.psi.PsiElement add(com.intellij.psi.PsiElement p0) { return null; }
    public com.intellij.psi.PsiElement addBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
    public com.intellij.psi.PsiElement addAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
    public void delete() {}
    public com.intellij.psi.PsiElement replace(com.intellij.psi.PsiElement p0) { return null; }
    public boolean isValid() { return false; }
    public boolean isWritable() { return false; }
    public com.intellij.psi.PsiReference getReference() { return null; }
    public com.intellij.psi.PsiReference[] getReferences() { return null; }
    public boolean isPhysical() { return false; }
    public boolean textMatches(CharSequence p0) { return false; }
    public boolean textMatches(com.intellij.psi.PsiElement p0) { return false; }
    public <T> T getUserData(com.intellij.openapi.util.Key<T> p0) { return null; }
    public <T> void putUserData(com.intellij.openapi.util.Key<T> p0, T p1) {}
    public <T> T getCopyableUserData(com.intellij.openapi.util.Key<T> p0) { return null; }
    public <T> void putCopyableUserData(com.intellij.openapi.util.Key<T> p0, T p1) {}
    public javax.swing.Icon getIcon(int p0) { return null; }
    public com.intellij.psi.impl.source.tree.FileElement getTreeElement() { return null; }
    protected <T> T findChildByClass(Class<T> p0) { return null; }
    protected <T> T[] findChildrenByClass(Class<T> p0) { return null; }
    public <T extends com.intellij.psi.PsiElement> T findChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
    public com.intellij.psi.PsiDirectory getContainingDirectory() { return null; }
    public long getModificationStamp() { return 0; }
    public com.intellij.psi.PsiFile getOriginalFile() { return this; }
    public com.intellij.openapi.fileTypes.FileType getFileType() { return null; }
    public com.intellij.psi.PsiFile[] getPsiRoots() { return new com.intellij.psi.PsiFile[]{this}; }
    public boolean isDirectory() { return false; }
    public <T extends com.intellij.psi.PsiElement> T findChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
    public com.intellij.psi.PsiElement findNotNullChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
    public com.intellij.psi.PsiElement findNotNullChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
    public <T extends com.intellij.psi.PsiElement> java.util.List<T> findChildrenByType(com.intellij.psi.tree.IElementType p0) { return null; }
    public com.intellij.psi.PsiElement[] findChildrenByType(com.intellij.psi.tree.TokenSet p0) { return null; }
    public void subtreeChanged() {}
    public boolean processChildren(com.intellij.psi.search.PsiElementProcessor p0) { return false; }
    public com.intellij.psi.PsiElement getNavigationElement() { return this; }
    public com.intellij.psi.PsiElement getOriginalElement() { return this; }
    public com.intellij.psi.PsiElement setName(String p0) { return this; }


    public void checkAdd(com.intellij.psi.PsiElement p0) {}
    public com.intellij.psi.PsiElement addRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
    public com.intellij.psi.PsiElement addRangeBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2) { return null; }
    public com.intellij.psi.PsiElement addRangeAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2) { return null; }
    public void deleteChildRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) {}
    public void checkDelete() {}


    public boolean processDeclarations(com.intellij.psi.scope.PsiScopeProcessor p0, com.intellij.psi.ResolveState p1, com.intellij.psi.PsiElement p2, com.intellij.psi.PsiElement p3) { return false; }
    public com.intellij.psi.search.SearchScope getUseScope() { return null; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public boolean isEquivalentTo(com.intellij.psi.PsiElement p0) { return false; }
    public com.intellij.psi.PsiElement getContext() { return null; }


    public com.intellij.navigation.ItemPresentation getPresentation() { return null; }
    public void navigate(boolean p0) {}
    public boolean canNavigate() { return false; }
    public boolean canNavigateToSource() { return false; }
    protected void init(com.intellij.psi.tree.IElementType p0, com.intellij.psi.tree.IElementType p1) {}
    public com.intellij.psi.stubs.StubElement<?> getStub() { return null; }
    public com.intellij.psi.impl.source.tree.FileElement calcTreeElement() { return null; }
    protected com.intellij.psi.impl.source.PsiFileImpl cloneImpl(com.intellij.psi.impl.source.tree.FileElement p0) { return null; }
    public com.intellij.psi.stubs.StubElement getGreenStub() { return null; }
    public com.intellij.psi.impl.source.PsiFileImpl clone() { return null; }
}
