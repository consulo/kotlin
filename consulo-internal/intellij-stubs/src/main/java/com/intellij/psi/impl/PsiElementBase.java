package com.intellij.psi.impl;

@SuppressWarnings("all")
public abstract class PsiElementBase extends com.intellij.openapi.util.UserDataHolderBase implements com.intellij.psi.NavigatablePsiElement {
    protected javax.swing.Icon getElementIcon(int flags) { return null; }
    public com.intellij.navigation.ItemPresentation getPresentation() { return null; }
    public String getName() { return null; }
    public com.intellij.openapi.project.Project getProject() { return null; }
    public com.intellij.lang.Language getLanguage() { return null; }
    public com.intellij.psi.PsiManager getManager() { return null; }
    public com.intellij.psi.PsiElement[] getChildren() { return com.intellij.psi.PsiElement.EMPTY_ARRAY; }
    public com.intellij.psi.PsiElement getParent() { return null; }
    public com.intellij.psi.PsiElement getFirstChild() { return null; }
    public com.intellij.psi.PsiElement getLastChild() { return null; }
    public com.intellij.psi.PsiElement getNextSibling() { return null; }
    public com.intellij.psi.PsiElement getPrevSibling() { return null; }
    public com.intellij.psi.PsiFile getContainingFile() { return null; }
    public com.intellij.openapi.util.TextRange getTextRange() { return null; }
    public int getStartOffsetInParent() { return 0; }
    public int getTextLength() { return 0; }
    public com.intellij.psi.PsiElement findElementAt(int offset) { return null; }
    public com.intellij.psi.PsiReference findReferenceAt(int offset) { return null; }
    public int getTextOffset() { return 0; }
    public String getText() { return null; }
    public char[] textToCharArray() { return new char[0]; }
    public com.intellij.psi.PsiElement getNavigationElement() { return this; }
    public com.intellij.psi.PsiElement getOriginalElement() { return this; }
    public boolean textMatches(CharSequence s) { return false; }
    public boolean textMatches(com.intellij.psi.PsiElement e) { return false; }
    public boolean textContains(char c) { return false; }
    public void accept(com.intellij.psi.PsiElementVisitor v) {}
    public void acceptChildren(com.intellij.psi.PsiElementVisitor v) {}
    public com.intellij.psi.PsiElement copy() { return null; }
    public com.intellij.psi.PsiElement add(com.intellij.psi.PsiElement e) { return null; }
    public com.intellij.psi.PsiElement addBefore(com.intellij.psi.PsiElement e, com.intellij.psi.PsiElement anchor) { return null; }
    public com.intellij.psi.PsiElement addAfter(com.intellij.psi.PsiElement e, com.intellij.psi.PsiElement anchor) { return null; }
    public void checkAdd(com.intellij.psi.PsiElement e) {}
    public com.intellij.psi.PsiElement addRange(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last) { return null; }
    public com.intellij.psi.PsiElement addRangeBefore(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement anchor) { return null; }
    public com.intellij.psi.PsiElement addRangeAfter(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement anchor) { return null; }
    public void delete() {}
    public void checkDelete() {}
    public void deleteChildRange(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last) {}
    public com.intellij.psi.PsiElement replace(com.intellij.psi.PsiElement n) { return null; }
    public boolean isValid() { return true; }
    public boolean isWritable() { return true; }
    public com.intellij.psi.PsiReference getReference() { return null; }
    public com.intellij.psi.PsiReference[] getReferences() { return com.intellij.psi.PsiReference.EMPTY_ARRAY; }
    public <T> T getCopyableUserData(com.intellij.openapi.util.Key<T> key) { return null; }
    public <T> void putCopyableUserData(com.intellij.openapi.util.Key<T> key, T value) {}
    public boolean processDeclarations(com.intellij.psi.scope.PsiScopeProcessor p, com.intellij.psi.ResolveState s, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement place) { return true; }
    public com.intellij.psi.PsiElement getContext() { return null; }
    public boolean isPhysical() { return false; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public com.intellij.psi.search.SearchScope getUseScope() { return null; }
    public com.intellij.lang.ASTNode getNode() { return null; }
    public boolean isEquivalentTo(com.intellij.psi.PsiElement other) { return this == other; }
    public <T> T getUserData(com.intellij.openapi.util.Key<T> key) { return null; }
    public <T> void putUserData(com.intellij.openapi.util.Key<T> key, T value) {}
    public javax.swing.Icon getIcon(int flags) { return null; }
    public com.intellij.openapi.util.TextRange getTextRangeInParent() { return null; }
}
