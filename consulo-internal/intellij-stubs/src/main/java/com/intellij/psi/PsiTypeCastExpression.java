package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiTypeCastExpression extends com.intellij.psi.PsiExpression {
    com.intellij.psi.PsiExpression getOperand();
    com.intellij.psi.PsiTypeElement getCastType();
}
