package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiLanguageInjectionHost extends PsiElement {
    boolean isValidHost();
    PsiLanguageInjectionHost updateText(String p0);
    LiteralTextEscaper<? extends PsiLanguageInjectionHost> createLiteralTextEscaper();
}
