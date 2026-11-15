package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiVariable extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiNamedElement, com.intellij.psi.PsiNameIdentifierOwner, com.intellij.psi.PsiTarget, com.intellij.lang.pom.PomRenameableTarget<com.intellij.psi.PsiElement> {
    com.intellij.psi.PsiType getType();
    com.intellij.psi.PsiTypeElement getTypeElement();
    String getName();
    com.intellij.psi.PsiExpression getInitializer();
    boolean hasInitializer();
    Object computeConstantValue();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiElement setName(String name);
    void normalizeDeclaration();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiVariable
    public default void setInitializer(com.intellij.psi.PsiExpression p0) throws com.intellij.util.IncorrectOperationException { }
    public default boolean isUnnamed() { return false; }
}
