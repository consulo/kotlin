package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiType implements com.intellij.psi.PsiAnnotationOwner, java.lang.Cloneable, com.intellij.lang.jvm.types.JvmType {
    public static com.intellij.psi.PsiClassType getTypeByName(String qName, com.intellij.openapi.project.Project project, com.intellij.psi.search.GlobalSearchScope resolveScope) { return null; }
    public static final PsiType[] EMPTY_ARRAY = new PsiType[0];
    public String getCanonicalText() { return null; }
    public String getCanonicalText(boolean annotated) { return getCanonicalText(); }
    public String getPresentableText() { return null; }
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
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiType
    public static final com.intellij.psi.PsiPrimitiveType BYTE = null;
    public static final com.intellij.psi.PsiPrimitiveType CHAR = null;
    public static final com.intellij.psi.PsiPrimitiveType DOUBLE = null;
    public static final com.intellij.psi.PsiPrimitiveType FLOAT = null;
    public static final com.intellij.psi.PsiPrimitiveType INT = null;
    public static final com.intellij.psi.PsiPrimitiveType LONG = null;
    public static final com.intellij.psi.PsiPrimitiveType SHORT = null;
    public static final com.intellij.psi.PsiPrimitiveType BOOLEAN = null;
    public static final com.intellij.psi.PsiPrimitiveType VOID = null;
    public static final com.intellij.psi.PsiPrimitiveType NULL = null;
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiType> ARRAY_FACTORY = null;
    public static com.intellij.psi.PsiType[] createArray(int p0) { return null; }
    protected PsiType(com.intellij.psi.PsiAnnotation[] p0) { }
    public com.intellij.psi.PsiType withNullability(com.intellij.pom.java.codeInsight.TypeNullability p0) { return null; }
    public com.intellij.psi.PsiArrayType createArrayType(com.intellij.psi.PsiAnnotation... p0) { return null; }
    public boolean isAssignableFrom(com.intellij.psi.PsiType p0) { return false; }
    public boolean isConvertibleFrom(com.intellij.psi.PsiType p0) { return false; }
    public com.intellij.pom.java.codeInsight.TypeNullability getNullability() { return null; }
    public static com.intellij.psi.PsiClassType getJavaLangObject(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static com.intellij.psi.PsiClassType getJavaLangClass(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static com.intellij.psi.PsiClassType getJavaLangThrowable(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static com.intellij.psi.PsiClassType getJavaLangString(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static com.intellij.psi.PsiClassType getJavaLangError(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static com.intellij.psi.PsiClassType getJavaLangRuntimeException(com.intellij.psi.PsiManager p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public int getArrayDimensions() { return 0; }
    public com.intellij.psi.PsiType getDeepComponentType() { return null; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public java.lang.String toString() { return null; }
    protected PsiType() { }
    @SuppressWarnings("all")
    public static abstract class Stub extends com.intellij.psi.PsiType {
        protected Stub(com.intellij.psi.PsiAnnotation[] p0) { }
        protected Stub(com.intellij.psi.TypeAnnotationProvider p0) { }
        public java.lang.String getPresentableText() { return null; }
        public java.lang.String getPresentableText(boolean p0) { return null; }
        public java.lang.String getCanonicalText() { return null; }
        public java.lang.String getCanonicalText(boolean p0) { return null; }
        protected Stub() { }
    }
}
