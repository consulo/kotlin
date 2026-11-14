package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiUnaryExpression extends com.intellij.psi.PsiExpression {
    com.intellij.psi.PsiExpression getOperand();
    com.intellij.psi.PsiJavaToken getOperationSign();
    com.intellij.psi.tree.IElementType getOperationTokenType();
}
