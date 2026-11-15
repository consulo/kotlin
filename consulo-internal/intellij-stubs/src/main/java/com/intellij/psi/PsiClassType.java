package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiClassType extends com.intellij.psi.PsiType {
    public static final PsiClassType[] EMPTY_ARRAY = new PsiClassType[0];
    public abstract String getCanonicalText();
    public abstract String getPresentableText();
    public abstract String getClassName();
    public abstract com.intellij.psi.PsiType[] getParameters();
    public abstract int getParameterCount();
    public abstract com.intellij.psi.PsiClass resolve();
    public abstract ClassResolveResult resolveGenerics();
    public abstract boolean isRaw();
    public static boolean isRaw(ClassResolveResult result) { return false; }
    public abstract boolean isValid();
    public boolean equals(Object obj) { return false; }
    public int hashCode() { return 0; }
    public abstract PsiClassType rawType();
    public PsiClassType setLanguageLevel(com.intellij.pom.java.LanguageLevel languageLevel) { return this; }
    public interface ClassResolveResult {
        com.intellij.psi.PsiClass getElement();
        com.intellij.psi.PsiSubstitutor getSubstitutor();
        boolean isValidResult();
        boolean isAccessible();
    }
}
