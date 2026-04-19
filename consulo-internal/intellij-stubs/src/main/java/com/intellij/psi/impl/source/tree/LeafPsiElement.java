package com.intellij.psi.impl.source.tree;

@SuppressWarnings("all")
public class LeafPsiElement extends com.intellij.psi.impl.source.tree.LeafElement implements com.intellij.psi.PsiElement,com.intellij.navigation.NavigationItem {
  public LeafPsiElement(com.intellij.psi.tree.IElementType p0, java.lang.CharSequence p1) { super(p0, p1); }
  public com.intellij.psi.PsiElement[] getChildren() { return null; }
  public com.intellij.psi.PsiElement getFirstChild() { return null; }
  public com.intellij.psi.PsiElement getLastChild() { return null; }
  public void acceptChildren(com.intellij.psi.PsiElementVisitor p0) {}
  public com.intellij.psi.PsiElement getParent() { return null; }
  public com.intellij.psi.PsiElement getNextSibling() { return null; }
  public com.intellij.psi.PsiElement getPrevSibling() { return null; }
  public com.intellij.psi.PsiFile getContainingFile() { return null; }
  public com.intellij.psi.PsiElement findElementAt(int p0) { return null; }
  public com.intellij.psi.PsiReference findReferenceAt(int p0) { return null; }
  public com.intellij.psi.PsiElement copy() { return null; }
  public boolean isValid() { return false; }
  public boolean isWritable() { return false; }
  public com.intellij.psi.PsiReference getReference() { return null; }
  public com.intellij.psi.PsiReference[] getReferences() { return null; }
  public com.intellij.psi.PsiElement add(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException { return null; }
  public com.intellij.psi.PsiElement addBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException { return null; }
  public com.intellij.psi.PsiElement addAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException { return null; }
  public void checkAdd(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException {}
  public com.intellij.psi.PsiElement addRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException { return null; }
  public com.intellij.psi.PsiElement addRangeBefore(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2) throws com.intellij.util.IncorrectOperationException { return null; }
  public com.intellij.psi.PsiElement addRangeAfter(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2) throws com.intellij.util.IncorrectOperationException { return null; }
  public void delete() throws com.intellij.util.IncorrectOperationException {}
  public void checkDelete() throws com.intellij.util.IncorrectOperationException {}
  public void deleteChildRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) throws com.intellij.util.IncorrectOperationException {}
  public com.intellij.psi.PsiElement replace(com.intellij.psi.PsiElement p0) throws com.intellij.util.IncorrectOperationException { return null; }
  public java.lang.String toString() { return null; }
  public void accept(com.intellij.psi.PsiElementVisitor p0) {}
  public boolean processDeclarations(com.intellij.psi.scope.PsiScopeProcessor p0, com.intellij.psi.ResolveState p1, com.intellij.psi.PsiElement p2, com.intellij.psi.PsiElement p3) { return false; }
  public com.intellij.psi.PsiElement getContext() { return null; }
  public com.intellij.psi.PsiElement getNavigationElement() { return null; }
  public com.intellij.psi.PsiElement getOriginalElement() { return null; }
  public boolean isPhysical() { return false; }
  public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
  public com.intellij.psi.search.SearchScope getUseScope() { return null; }
  public com.intellij.openapi.project.Project getProject() { return null; }
  public com.intellij.lang.Language getLanguage() { return null; }
  public com.intellij.lang.ASTNode getNode() { return null; }
  public com.intellij.psi.PsiElement getPsi() { return null; }
  public com.intellij.navigation.ItemPresentation getPresentation() { return null; }
  public java.lang.String getName() { return null; }
  public void navigate(boolean p0) {}
  public boolean canNavigate() { return false; }
  public boolean canNavigateToSource() { return false; }
  public boolean isEquivalentTo(com.intellij.psi.PsiElement p0) { return false; }
  public com.intellij.psi.impl.PsiManagerEx getManager() { return null; }
  public <T extends com.intellij.psi.PsiElement> T getPsi(java.lang.Class<T> p0) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.IElementType p0) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.IElementType p0, com.intellij.lang.ASTNode p1) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.TokenSet p0) { return null; }
  public com.intellij.lang.ASTNode findChildByType(com.intellij.psi.tree.TokenSet p0, com.intellij.lang.ASTNode p1) { return null; }
  public com.intellij.lang.ASTNode[] getChildren(com.intellij.psi.tree.TokenSet p0) { return null; }
  public void addChild(com.intellij.lang.ASTNode p0) {}
  public void addChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public void addLeaf(com.intellij.psi.tree.IElementType p0, java.lang.CharSequence p1, com.intellij.lang.ASTNode p2) {}
  public void removeChild(com.intellij.lang.ASTNode p0) {}
  public void removeRange(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public void replaceChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public void replaceAllChildrenToChildrenOf(com.intellij.lang.ASTNode p0) {}
  public void addChildren(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2) {}
  public java.lang.String getText() { return null; }
  public java.lang.CharSequence getChars() { return null; }
  public boolean textContains(char p0) { return false; }
  public int getStartOffset() { return 0; }
  public com.intellij.openapi.util.TextRange getTextRange() { return null; }
  public com.intellij.lang.ASTNode copyElement() { return null; }
}
