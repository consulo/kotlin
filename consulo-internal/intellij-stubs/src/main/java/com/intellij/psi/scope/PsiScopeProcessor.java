package com.intellij.psi.scope;
@SuppressWarnings("all")
public interface PsiScopeProcessor {    // Added by consulo-internal/remap/genstub.py from consulo.language.psi.resolve.PsiScopeProcessor
    public boolean execute(com.intellij.psi.PsiElement p0, com.intellij.psi.ResolveState p1);
    public default <T extends java.lang.Object> T getHint(com.intellij.openapi.util.Key<T> p0) { return null; }
    public default void handleEvent(com.intellij.psi.scope.PsiScopeProcessor.Event p0, java.lang.Object p1) { }
    @SuppressWarnings("all")
    public interface Event {
        public static final com.intellij.psi.scope.PsiScopeProcessor.Event SET_DECLARATION_HOLDER = null;
    }
}
