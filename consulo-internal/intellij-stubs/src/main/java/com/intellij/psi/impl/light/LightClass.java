package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public abstract class LightClass extends com.intellij.psi.impl.light.AbstractLightClass {
    public LightClass(com.intellij.psi.PsiClass delegate) { super(delegate.getManager(), null); }
    public LightClass(com.intellij.psi.PsiClass delegate, com.intellij.lang.Language language) { super(delegate.getManager(), language); }
    public LightClass(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language) { super(manager, language); }
    public static abstract class Static extends LightClass {
        public Static(com.intellij.psi.PsiClass delegate) { super(delegate); }
    }
}
