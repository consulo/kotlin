package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiClassObjectAccessExpression extends com.intellij.psi.PsiExpression {
    com.intellij.psi.PsiTypeElement getOperand();
}
