package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiLiteralExpression extends com.intellij.psi.PsiExpression {
    Object getValue();
    com.intellij.psi.tree.IElementType getLiteralElementType();
}
