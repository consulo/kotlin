package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnnotation extends com.intellij.psi.PsiElement, com.intellij.psi.PsiAnnotationMemberValue, com.intellij.lang.jvm.JvmAnnotation {
    PsiAnnotation[] EMPTY_ARRAY = new PsiAnnotation[0];
    String DEFAULT_REFERENCED_METHOD_NAME = "value";
    String getQualifiedName();
    com.intellij.psi.PsiJavaCodeReferenceElement getNameReferenceElement();
    com.intellij.psi.PsiAnnotationParameterList getParameterList();
    com.intellij.psi.PsiAnnotationMemberValue findAttributeValue(String attributeName);
    com.intellij.psi.PsiAnnotationMemberValue findDeclaredAttributeValue(String attributeName);
    default boolean hasQualifiedName(String qualifiedName) { return false; }
    default java.util.List<com.intellij.psi.PsiNameValuePair> getAttributes() { return null; }
    com.intellij.psi.PsiAnnotationOwner getOwner();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiAnnotation
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiAnnotation> ARRAY_FACTORY = null;
    public default com.intellij.psi.PsiAnnotationMemberValue findDeclaredAttributeDetachedValue(java.lang.String p0) { return null; }
    public <T extends com.intellij.psi.PsiAnnotationMemberValue> T setDeclaredAttributeValue(java.lang.String p0, T p1);
    public default com.intellij.psi.PsiClass resolveAnnotationType() { return null; }
    @SuppressWarnings("all")
    public enum TargetType {
        TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE, TYPE_USE, TYPE_PARAMETER, MODULE, RECORD_COMPONENT, UNKNOWN;
        public static final com.intellij.psi.PsiAnnotation.TargetType[] EMPTY_ARRAY = null;
        public consulo.localize.LocalizeValue getPresentableText() { return null; }
    }
}
