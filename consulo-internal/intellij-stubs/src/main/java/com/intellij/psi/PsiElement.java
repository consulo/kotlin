package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiElement extends com.intellij.openapi.util.UserDataHolder,com.intellij.openapi.util.Iconable {
  PsiElement[] EMPTY_ARRAY = new PsiElement[0];
  com.intellij.util.ArrayFactory<PsiElement> ARRAY_FACTORY = count -> new PsiElement[count];
  public abstract com.intellij.openapi.project.Project getProject() throws com.intellij.psi.PsiInvalidElementAccessException;
  public abstract com.intellij.lang.Language getLanguage();
  public abstract com.intellij.psi.PsiManager getManager();
  public abstract com.intellij.psi.PsiElement[] getChildren();
  public abstract com.intellij.psi.PsiElement getParent();
  public abstract com.intellij.psi.PsiElement getFirstChild();
  public abstract com.intellij.psi.PsiElement getLastChild();
  public abstract com.intellij.psi.PsiElement getNextSibling();
  public abstract com.intellij.psi.PsiElement getPrevSibling();
  public abstract com.intellij.psi.PsiFile getContainingFile() throws com.intellij.psi.PsiInvalidElementAccessException;
  public abstract com.intellij.openapi.util.TextRange getTextRange();
  public default com.intellij.openapi.util.TextRange getTextRangeInParent() { return null; }
  public abstract int getStartOffsetInParent();
  public abstract int getTextLength();
  public abstract com.intellij.psi.PsiElement findElementAt(int p0);
  public abstract com.intellij.psi.PsiReference findReferenceAt(int p0);
  public abstract int getTextOffset();
  public abstract java.lang.String getText();
  public abstract char[] textToCharArray();
  public abstract com.intellij.psi.PsiElement getNavigationElement();
  public abstract com.intellij.psi.PsiElement getOriginalElement();
  public abstract boolean textMatches(java.lang.CharSequence p0);
  public abstract boolean textMatches(com.intellij.psi.PsiElement p0);
  public abstract boolean textContains(char p0);
  public abstract void accept(com.intellij.psi.PsiElementVisitor p0);
  public abstract void acceptChildren(com.intellij.psi.PsiElementVisitor p0);
  public abstract com.intellij.psi.PsiElement copy();
  public abstract com.intellij.psi.PsiElement add(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement addBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement addAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException;
  public abstract void checkAdd(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement addRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement addRangeBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement addRangeAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2) throws com.intellij.util.IncorrectOperationException;
  public abstract void delete() throws com.intellij.util.IncorrectOperationException;
  public abstract void checkDelete() throws com.intellij.util.IncorrectOperationException;
  public abstract void deleteChildRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException;
  public abstract com.intellij.psi.PsiElement replace(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException;
  public abstract boolean isValid();
  public abstract boolean isWritable();
  public abstract com.intellij.psi.PsiReference getReference();
  public abstract com.intellij.psi.PsiReference[] getReferences();
  public abstract <T> T getCopyableUserData(com.intellij.openapi.util.Key<T> p0);
  public abstract <T> void putCopyableUserData(com.intellij.openapi.util.Key<T> p0, T p1);
  public abstract boolean processDeclarations(com.intellij.psi.scope.PsiScopeProcessor p0, com.intellij.psi.ResolveState p1, com.intellij.psi.PsiElement p2, com.intellij.psi.PsiElement p3);
  public abstract com.intellij.psi.PsiElement getContext();
  public abstract boolean isPhysical();
  public abstract com.intellij.psi.search.GlobalSearchScope getResolveScope();
  public abstract com.intellij.psi.search.SearchScope getUseScope();
  public abstract com.intellij.lang.ASTNode getNode();
  public abstract java.lang.String toString();
  public abstract boolean isEquivalentTo(com.intellij.psi.PsiElement p0);
}
