package com.intellij.psi;

@SuppressWarnings("all")
public class PsiArrayType extends com.intellij.psi.PsiType implements com.intellij.lang.jvm.types.JvmArrayType {
    public com.intellij.psi.PsiType getComponentType() { return null; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiArrayType
    public PsiArrayType(com.intellij.psi.PsiType p0) { }
    public PsiArrayType(com.intellij.psi.PsiType p0, com.intellij.psi.PsiAnnotation[] p1) { }
    public PsiArrayType(com.intellij.psi.PsiType p0, com.intellij.psi.TypeAnnotationProvider p1) { }
    public java.lang.String getPresentableText(boolean p0) { return null; }
    public java.lang.String getCanonicalText(boolean p0) { return null; }
    public java.lang.String getInternalCanonicalText() { return null; }
    protected java.lang.String getText(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) { return null; }
    public boolean isValid() { return false; }
    public boolean equalsToText(java.lang.String p0) { return false; }
    public <A extends java.lang.Object> A accept(com.intellij.psi.PsiTypeVisitor<A> p0) { return null; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public com.intellij.psi.PsiType[] getSuperTypes() { return null; }
    public com.intellij.psi.PsiType withContainerNullability(com.intellij.psi.PsiModifierListOwner p0) { return null; }
    public com.intellij.psi.PsiType withContainerNullability(com.intellij.psi.PsiArrayType p0) { return null; }
    public com.intellij.pom.java.codeInsight.TypeNullability getNullability() { return null; }
    public com.intellij.psi.PsiArrayType withNullability(com.intellij.pom.java.codeInsight.TypeNullability p0) { return null; }
    public com.intellij.psi.PsiArrayType annotate(com.intellij.psi.TypeAnnotationProvider p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    protected PsiArrayType() { }
}
