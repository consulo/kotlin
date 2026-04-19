package com.intellij.psi.impl;

@SuppressWarnings("all")
public abstract class ElementBase extends com.intellij.openapi.util.UserDataHolderBase implements com.intellij.psi.NavigatablePsiElement {
    public javax.swing.Icon getIcon(int flags) { return null; }
    public com.intellij.openapi.project.Project getProject() { return null; }
    public com.intellij.lang.Language getLanguage() { return null; }
    public com.intellij.psi.PsiManager getManager() { return null; }
    public com.intellij.psi.PsiElement[] getChildren() { return null; }
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
    public char[] textToCharArray() { return null; }
    public com.intellij.psi.PsiElement getNavigationElement() { return null; }
    public com.intellij.psi.PsiElement getOriginalElement() { return null; }
    public boolean textMatches(CharSequence text) { return false; }
    public boolean textMatches(com.intellij.psi.PsiElement element) { return false; }
    public boolean textContains(char c) { return false; }
    public void accept(com.intellij.psi.PsiElementVisitor visitor) {}
    public void acceptChildren(com.intellij.psi.PsiElementVisitor visitor) {}
    public com.intellij.psi.PsiElement copy() { return null; }
    public com.intellij.psi.PsiElement add(com.intellij.psi.PsiElement element) { return null; }
    public com.intellij.psi.PsiElement addBefore(com.intellij.psi.PsiElement element, com.intellij.psi.PsiElement anchor) { return null; }
    public com.intellij.psi.PsiElement addAfter(com.intellij.psi.PsiElement element, com.intellij.psi.PsiElement anchor) { return null; }
    public void delete() {}
    public com.intellij.psi.PsiElement replace(com.intellij.psi.PsiElement newElement) { return null; }
    public boolean isValid() { return false; }
    public boolean isWritable() { return false; }
    public com.intellij.psi.PsiReference getReference() { return null; }
    public com.intellij.psi.PsiReference[] getReferences() { return null; }
    public boolean isPhysical() { return false; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public com.intellij.psi.search.SearchScope getUseScope() { return null; }
    public com.intellij.lang.ASTNode getNode() { return null; }
    public boolean isEquivalentTo(com.intellij.psi.PsiElement another) { return false; }
    public com.intellij.psi.PsiElement getContext() { return null; }
    public void checkAdd(com.intellij.psi.PsiElement element) {}
    public com.intellij.psi.PsiElement addRange(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last) { return null; }
    public com.intellij.psi.PsiElement addRangeBefore(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement anchor) { return null; }
    public com.intellij.psi.PsiElement addRangeAfter(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement anchor) { return null; }
    public void checkDelete() {}
    public void deleteChildRange(com.intellij.psi.PsiElement first, com.intellij.psi.PsiElement last) {}
    public <T> T getCopyableUserData(com.intellij.openapi.util.Key<T> key) { return null; }
    public <T> void putCopyableUserData(com.intellij.openapi.util.Key<T> key, T value) {}
    public boolean processDeclarations(com.intellij.psi.scope.PsiScopeProcessor processor, com.intellij.psi.ResolveState state, com.intellij.psi.PsiElement lastParent, com.intellij.psi.PsiElement place) { return false; }
    public String getName() { return null; }
    public com.intellij.psi.PsiElement setName(String name) { return null; }
    public void navigate(boolean requestFocus) {}
    public boolean canNavigate() { return false; }
    public boolean canNavigateToSource() { return false; }
    public com.intellij.navigation.ItemPresentation getPresentation() { return null; }
}
