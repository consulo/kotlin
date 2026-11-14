package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiImportStatementBase extends com.intellij.psi.PsiElement {
    boolean isOnDemand();
    com.intellij.psi.PsiJavaCodeReferenceElement getImportReference();
}
