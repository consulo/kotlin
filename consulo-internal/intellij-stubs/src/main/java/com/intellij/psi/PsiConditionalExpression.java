package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiConditionalExpression extends com.intellij.psi.PsiExpression {
    com.intellij.psi.PsiExpression getCondition();
    com.intellij.psi.PsiExpression getThenExpression();
    com.intellij.psi.PsiExpression getElseExpression();
}
