package com.intellij.psi;

@SuppressWarnings("all")
public abstract class LiteralTextEscaper<T extends PsiLanguageInjectionHost> {
    protected final T myHost;
    public LiteralTextEscaper(T p0) { this.myHost = p0; }
    public abstract boolean decode(com.intellij.openapi.util.TextRange p0, StringBuilder p1);
    public abstract int getOffsetInHost(int p0, com.intellij.openapi.util.TextRange p1);
    public abstract com.intellij.openapi.util.TextRange getRelevantTextRange();
    public abstract boolean isOneLine();
    public static <T extends PsiLanguageInjectionHost> LiteralTextEscaper<T> createSimple(T p0) { return null; }
    public static <T extends PsiLanguageInjectionHost> LiteralTextEscaper<T> createSimple(T p0, boolean p1) { return null; }
}
