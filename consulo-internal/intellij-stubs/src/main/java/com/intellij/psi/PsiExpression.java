package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiExpression extends com.intellij.psi.PsiElement, com.intellij.psi.PsiAnnotationMemberValue, com.intellij.psi.PsiCaseLabelElement {
    PsiExpression[] EMPTY_ARRAY = new PsiExpression[0];
    com.intellij.psi.PsiType getType();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiExpression
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiExpression> ARRAY_FACTORY = null;
    public static final java.util.function.Function<com.intellij.psi.PsiExpression, com.intellij.psi.PsiType> EXPRESSION_TO_TYPE = null;
}
