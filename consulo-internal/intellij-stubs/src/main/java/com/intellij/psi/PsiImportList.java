package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiImportList extends com.intellij.psi.PsiElement {
    com.intellij.psi.PsiImportStatement[] getImportStatements();
    com.intellij.psi.PsiImportStatementBase findSingleClassImportStatement(String qName);
    com.intellij.psi.PsiImportStatementBase findOnDemandImportStatement(String packageName);
}
