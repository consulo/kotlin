package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiSubstitutor {
    PsiSubstitutor EMPTY = null;
    PsiSubstitutor UNKNOWN = null;
    com.intellij.psi.PsiType substitute(com.intellij.psi.PsiType type);
    com.intellij.psi.PsiType substitute(com.intellij.psi.PsiTypeParameter typeParameter);
    com.intellij.psi.PsiType substituteWithBoundsPromotion(com.intellij.psi.PsiTypeParameter typeParameter);
    java.util.Map<com.intellij.psi.PsiTypeParameter, com.intellij.psi.PsiType> getSubstitutionMap();
    PsiSubstitutor put(com.intellij.psi.PsiTypeParameter classParameter, com.intellij.psi.PsiType mapping);
    PsiSubstitutor putAll(com.intellij.psi.PsiClass parentClass, com.intellij.psi.PsiType[] mappings);
    PsiSubstitutor putAll(PsiSubstitutor another);
    boolean isValid();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiSubstitutor
    public static final com.intellij.openapi.util.Key<com.intellij.psi.PsiSubstitutor> KEY = null;
    public default com.intellij.psi.PsiType substituteIgnoringNullability(com.intellij.psi.PsiType p0) { return null; }
    public default boolean hasRawSubstitution() { return false; }
    public default com.intellij.psi.PsiSubstitutor putAll(java.util.Map<? extends com.intellij.psi.PsiTypeParameter, ? extends com.intellij.psi.PsiType> p0) { return null; }
    public static com.intellij.psi.PsiSubstitutor createSubstitutor(java.util.Map<? extends com.intellij.psi.PsiTypeParameter, ? extends com.intellij.psi.PsiType> p0) { return null; }
    public void ensureValid();
}
