package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiPrimitiveType extends com.intellij.psi.PsiType {
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiPrimitiveType
    public PsiPrimitiveType(java.lang.String p0, com.intellij.psi.PsiAnnotation[] p1) { }
    public PsiPrimitiveType(java.lang.String p0, com.intellij.psi.TypeAnnotationProvider p1) { }
    public com.intellij.psi.PsiPrimitiveType annotate(com.intellij.psi.TypeAnnotationProvider p0) { return null; }
    public java.lang.String getPresentableText(boolean p0) { return null; }
    public java.lang.String getCanonicalText(boolean p0) { return null; }
    public java.lang.String getInternalCanonicalText() { return null; }
    public boolean isValid() { return false; }
    public boolean equalsToText(java.lang.String p0) { return false; }
    public <A extends java.lang.Object> A accept(com.intellij.psi.PsiTypeVisitor<A> p0) { return null; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public com.intellij.psi.PsiType[] getSuperTypes() { return null; }
    public static com.intellij.psi.PsiPrimitiveType getUnboxedType(com.intellij.psi.PsiType p0) { return null; }
    public static com.intellij.psi.PsiPrimitiveType getOptionallyUnboxedType(com.intellij.psi.PsiType p0) { return null; }
    public java.lang.String getBoxedTypeName() { return null; }
    public com.intellij.psi.PsiClassType getBoxedType(com.intellij.psi.PsiElement p0) { return null; }
    public com.intellij.psi.PsiClassType getBoxedType(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static java.util.Collection<java.lang.String> getAllBoxedTypeNames() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected PsiPrimitiveType() { }
}
