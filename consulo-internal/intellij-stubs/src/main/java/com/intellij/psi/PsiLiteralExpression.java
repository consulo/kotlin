package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiLiteralExpression extends com.intellij.psi.PsiExpression, com.intellij.psi.PsiLiteral {
    Object getValue();
    default com.intellij.psi.tree.IElementType getLiteralElementType() { return null; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiLiteralExpression
    public default boolean isTextBlock() { return false; }
}
