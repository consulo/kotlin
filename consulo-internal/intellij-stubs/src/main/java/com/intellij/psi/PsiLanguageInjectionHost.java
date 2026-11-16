package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiLanguageInjectionHost extends PsiElement {
    boolean isValidHost();
    PsiLanguageInjectionHost updateText(String p0);
    LiteralTextEscaper<? extends PsiLanguageInjectionHost> createLiteralTextEscaper();
    @SuppressWarnings("all")
    public interface Place extends java.util.List<com.intellij.psi.PsiLanguageInjectionHost.Shred> {
        public com.intellij.psi.SmartPsiElementPointer<com.intellij.psi.PsiLanguageInjectionHost> getHostPointer();
    }
    @SuppressWarnings("all")
    public interface InjectedPsiVisitor {
        public void visit(com.intellij.psi.PsiFile p0, java.util.List<com.intellij.psi.PsiLanguageInjectionHost.Shred> p1);
    }
    @SuppressWarnings("all")
    public interface Shred {
        public com.intellij.openapi.util.Segment getHostRangeMarker();
        public com.intellij.openapi.util.TextRange getRangeInsideHost();
        public boolean isValid();
        public void dispose();
        public com.intellij.psi.PsiLanguageInjectionHost getHost();
        public com.intellij.openapi.util.TextRange getRange();
        public java.lang.String getPrefix();
        public java.lang.String getSuffix();
    }
}
