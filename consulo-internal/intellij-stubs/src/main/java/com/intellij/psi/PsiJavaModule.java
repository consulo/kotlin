package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiJavaModule extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner {
    String MODULE_INFO_FILE = "module-info.java";
    String MODULE_INFO_CLASS = "module-info";
    String MODULE_INFO_CLS_FILE = "module-info.class";
    String JAVA_BASE = "java.base";
    String getName();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
}
