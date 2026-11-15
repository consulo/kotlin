package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiField extends com.intellij.psi.PsiElement, com.intellij.psi.PsiVariable, com.intellij.psi.PsiMember, com.intellij.psi.PsiDocCommentOwner, com.intellij.lang.jvm.JvmField, com.intellij.psi.PsiJvmModifiersOwner {
    PsiField[] EMPTY_ARRAY = new PsiField[0];
    com.intellij.psi.PsiClass getContainingClass();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiExpression getInitializer();
    boolean hasInitializer();
    void normalizeDeclaration();
    Object computeConstantValue();
    com.intellij.psi.PsiElement setName(String name);
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiField
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiField> ARRAY_FACTORY = null;
    public void setInitializer(com.intellij.psi.PsiExpression p0) throws com.intellij.util.IncorrectOperationException;
    default boolean isVisibilitySupported() { return true; }
}
