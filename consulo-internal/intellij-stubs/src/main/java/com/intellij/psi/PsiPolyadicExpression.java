package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiPolyadicExpression extends com.intellij.psi.PsiExpression {
    com.intellij.psi.PsiExpression[] getOperands();
    com.intellij.psi.tree.IElementType getOperationTokenType();
    com.intellij.psi.PsiJavaToken getTokenBeforeOperand(com.intellij.psi.PsiExpression operand);
}
