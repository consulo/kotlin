package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public abstract class LightElement extends com.intellij.psi.impl.PsiElementBase implements com.intellij.psi.LightweightPsiElement {
    public LightElement(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language) {}
    public com.intellij.lang.Language getLanguage() { return null; }
    public com.intellij.psi.PsiManager getManager() { return null; }
    public String toString() { return getClass().getSimpleName(); }
    // Added by consulo-internal/remap/genstub.py from consulo.language.impl.psi.LightElement
    protected com.intellij.psi.PsiManager myManager;
    public com.intellij.psi.PsiElement getParent() { return null; }
    public com.intellij.psi.PsiElement[] getChildren() { return null; }
    public com.intellij.psi.PsiFile getContainingFile() { return null; }
    public com.intellij.openapi.util.TextRange getTextRange() { return null; }
    public int getStartOffsetInParent() { return 0; }
    public int getTextLength() { return 0; }
    public char[] textToCharArray() { return null; }
    public boolean textMatches(java.lang.CharSequence p0) { return false; }
    public boolean textMatches(com.intellij.psi.PsiElement p0) { return false; }
    public com.intellij.psi.PsiElement findElementAt(int p0) { return null; }
    public int getTextOffset() { return 0; }
    public boolean isValid() { return false; }
    public boolean isWritable() { return false; }
    public boolean isPhysical() { return false; }
    public void checkAdd(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException { }
    public com.intellij.psi.PsiElement add(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException { return null; }
    public com.intellij.psi.PsiElement addBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException { return null; }
    public com.intellij.psi.PsiElement addAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException { return null; }
    public void delete() throws com.intellij.util.IncorrectOperationException { }
    public void checkDelete() throws com.intellij.util.IncorrectOperationException { }
    public com.intellij.psi.PsiElement replace(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException { return null; }
    public com.intellij.lang.ASTNode getNode() { return null; }
    public java.lang.String getText() { return null; }
    public void accept(com.intellij.psi.PsiElementVisitor p0) { }
    public com.intellij.psi.PsiElement copy() { return null; }
    public com.intellij.psi.PsiElement getNavigationElement() { return null; }
    public void setNavigationElement(com.intellij.psi.PsiElement p0) { }
    public com.intellij.psi.PsiElement getPrevSibling() { return null; }
    public com.intellij.psi.PsiElement getNextSibling() { return null; }
    protected LightElement() { }
}
