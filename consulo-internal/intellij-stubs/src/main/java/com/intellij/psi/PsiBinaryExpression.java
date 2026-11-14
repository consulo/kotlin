package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiBinaryExpression extends com.intellij.psi.PsiPolyadicExpression {
    com.intellij.psi.PsiExpression getLOperand();
    com.intellij.psi.PsiExpression getROperand();
    com.intellij.psi.PsiJavaToken getOperationSign();
}
