package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiType implements com.intellij.psi.PsiAnnotationOwner {
    public static final PsiType[] EMPTY_ARRAY = new PsiType[0];
    public abstract String getCanonicalText();
    public String getCanonicalText(boolean annotated) { return getCanonicalText(); }
    public abstract String getPresentableText();
    public String getPresentableText(boolean annotated) { return getPresentableText(); }
    public String getInternalCanonicalText() { return getCanonicalText(); }
    public com.intellij.psi.PsiType[] getSuperTypes() { return EMPTY_ARRAY; }
    public boolean isValid() { return true; }
    public boolean equalsToText(String text) { return false; }
    public com.intellij.psi.PsiAnnotation[] getAnnotations() { return new com.intellij.psi.PsiAnnotation[0]; }
    public com.intellij.psi.PsiAnnotation[] getApplicableAnnotations() { return new com.intellij.psi.PsiAnnotation[0]; }
    public com.intellij.psi.PsiAnnotation findAnnotation(String qualifiedName) { return null; }
    public com.intellij.psi.PsiAnnotation addAnnotation(String qualifiedName) { return null; }
    public boolean hasAnnotation(String qualifiedName) { return false; }
    public <A> A accept(com.intellij.psi.PsiTypeVisitor<A> visitor) { return visitor.visitType(this); }
    public com.intellij.psi.PsiType createArrayType() { return null; }
    public com.intellij.psi.PsiType annotate(com.intellij.psi.TypeAnnotationProvider provider) { return this; }
    public com.intellij.psi.TypeAnnotationProvider getAnnotationProvider() { return com.intellij.psi.TypeAnnotationProvider.EMPTY; }
}
