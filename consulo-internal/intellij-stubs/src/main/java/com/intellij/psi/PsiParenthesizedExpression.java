package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiParenthesizedExpression extends com.intellij.psi.PsiExpression {
    com.intellij.psi.PsiExpression getExpression();
}
