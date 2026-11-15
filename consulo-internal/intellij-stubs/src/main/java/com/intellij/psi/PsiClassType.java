package com.intellij.psi;

@SuppressWarnings("all")
public abstract class PsiClassType extends com.intellij.psi.PsiType implements com.intellij.lang.jvm.types.JvmReferenceType {
    public static final PsiClassType[] EMPTY_ARRAY = new PsiClassType[0];
    public String getCanonicalText() { return null; }
    public String getPresentableText() { return null; }
    public String getClassName() { return null; }
    public com.intellij.psi.PsiType[] getParameters() { return null; }
    public int getParameterCount() { return 0; }
    public com.intellij.psi.PsiClass resolve() { return null; }
    public ClassResolveResult resolveGenerics() { return null; }
    public boolean isRaw() { return false; }
    public static boolean isRaw(ClassResolveResult result) { return false; }
    public boolean isValid() { return false; }
    public boolean equals(Object obj) { return false; }
    public int hashCode() { return 0; }
    public PsiClassType rawType() { return null; }
    public PsiClassType setLanguageLevel(com.intellij.pom.java.LanguageLevel languageLevel) { return this; }
    public interface ClassResolveResult {
        com.intellij.psi.PsiClass getElement();
        com.intellij.psi.PsiSubstitutor getSubstitutor();
        boolean isValidResult();
        boolean isAccessible();
    }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiClassType
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiClassType> ARRAY_FACTORY = null;
    protected com.intellij.pom.java.LanguageLevel myLanguageLevel;
    protected PsiClassType(com.intellij.pom.java.LanguageLevel p0, com.intellij.psi.PsiAnnotation[] p1) { }
    public PsiClassType(com.intellij.pom.java.LanguageLevel p0, com.intellij.psi.TypeAnnotationProvider p1) { }
    public com.intellij.psi.PsiClassType annotate(com.intellij.psi.TypeAnnotationProvider p0) { return null; }
    public com.intellij.psi.PsiClassType withNullability(com.intellij.pom.java.codeInsight.TypeNullability p0) { return null; }
    public boolean hasParameters() { return false; }
    public boolean hasNonTrivialParameters() { return false; }
    public com.intellij.psi.PsiType[] getSuperTypes() { return null; }
    public com.intellij.psi.search.GlobalSearchScope getResolveScope() { return null; }
    public <A extends java.lang.Object> A accept(com.intellij.psi.PsiTypeVisitor<A> p0) { return null; }
    public com.intellij.pom.java.LanguageLevel getLanguageLevel() { return null; }
    public java.lang.String getName() { return null; }
    public com.intellij.psi.PsiElement getPsiContext() { return null; }
    public com.intellij.lang.jvm.types.JvmTypeResolveResult resolveType() { return null; }
    public java.lang.Iterable<com.intellij.lang.jvm.types.JvmType> typeArguments() { return null; }
    protected PsiClassType() { }
    @SuppressWarnings("all")
    public static abstract class Stub extends com.intellij.psi.PsiClassType {
        protected Stub(com.intellij.pom.java.LanguageLevel p0, com.intellij.psi.PsiAnnotation[] p1) { }
        protected Stub(com.intellij.pom.java.LanguageLevel p0, com.intellij.psi.TypeAnnotationProvider p1) { }
        public java.lang.String getPresentableText() { return null; }
        public java.lang.String getPresentableText(boolean p0) { return null; }
        public java.lang.String getCanonicalText() { return null; }
        public java.lang.String getCanonicalText(boolean p0) { return null; }
        protected Stub() { }
    }
}
