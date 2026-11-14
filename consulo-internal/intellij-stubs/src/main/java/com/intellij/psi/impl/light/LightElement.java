package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public abstract class LightElement extends com.intellij.psi.impl.PsiElementBase {
    public LightElement(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language) {}
    public com.intellij.lang.Language getLanguage() { return null; }
    public com.intellij.psi.PsiManager getManager() { return null; }
    public String toString() { return getClass().getSimpleName(); }
}
