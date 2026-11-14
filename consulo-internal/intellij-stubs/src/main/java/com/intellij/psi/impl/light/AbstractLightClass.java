package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public abstract class AbstractLightClass extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiClass {
    public AbstractLightClass(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language) { super(manager, language); }
    public abstract com.intellij.psi.PsiClass getDelegate();
    public String getName() { return getDelegate().getName(); }
    public String getQualifiedName() { return getDelegate().getQualifiedName(); }
    public com.intellij.psi.PsiIdentifier getNameIdentifier() { return getDelegate().getNameIdentifier(); }
    public boolean isInterface() { return getDelegate().isInterface(); }
    public boolean isAnnotationType() { return getDelegate().isAnnotationType(); }
    public boolean isEnum() { return getDelegate().isEnum(); }
}
