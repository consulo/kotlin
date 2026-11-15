package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiClass extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiTypeParameterListOwner, com.intellij.psi.PsiMember, com.intellij.psi.PsiDocCommentOwner, com.intellij.psi.PsiNamedElement, com.intellij.psi.PsiNameIdentifierOwner, com.intellij.psi.PsiQualifiedNamedElement, com.intellij.psi.PsiTarget, com.intellij.lang.pom.PomRenameableTarget<com.intellij.psi.PsiElement>, com.intellij.lang.jvm.JvmClass {
    PsiClass[] EMPTY_ARRAY = new PsiClass[0];
    public abstract java.lang.String getQualifiedName();
    public abstract boolean isInterface();
    public abstract boolean isAnnotationType();
    public abstract boolean isEnum();
    public default boolean isRecord() { return false; }
    public default boolean isValueClass() { return false; }
    public abstract com.intellij.psi.PsiReferenceList getExtendsList();
    public abstract com.intellij.psi.PsiReferenceList getImplementsList();
    public abstract com.intellij.psi.PsiClassType[] getExtendsListTypes();
    public abstract com.intellij.psi.PsiClassType[] getImplementsListTypes();
    public default com.intellij.psi.PsiReferenceList getPermitsList() { return null; }
    public default com.intellij.psi.PsiClassType[] getPermitsListTypes() { return null; }
    public abstract com.intellij.psi.PsiClass getSuperClass();
    public abstract com.intellij.psi.PsiClass[] getInterfaces();
    public abstract com.intellij.psi.PsiClass[] getSupers();
    public abstract com.intellij.psi.PsiClassType[] getSuperTypes();
    public abstract com.intellij.psi.PsiField[] getFields();
    public abstract com.intellij.psi.PsiMethod[] getMethods();
    public abstract com.intellij.psi.PsiMethod[] getConstructors();
    public abstract com.intellij.psi.PsiClass[] getInnerClasses();
    public abstract com.intellij.psi.PsiClassInitializer[] getInitializers();
    public abstract com.intellij.psi.PsiField[] getAllFields();
    public abstract com.intellij.psi.PsiMethod[] getAllMethods();
    public abstract com.intellij.psi.PsiClass[] getAllInnerClasses();
    public abstract com.intellij.psi.PsiField findFieldByName(java.lang.String p0, boolean p1);
    public abstract com.intellij.psi.PsiMethod findMethodBySignature(com.intellij.psi.PsiMethod p0, boolean p1);
    public abstract com.intellij.psi.PsiMethod[] findMethodsBySignature(com.intellij.psi.PsiMethod p0, boolean p1);
    public default com.intellij.psi.PsiMethod[] findMethodsByName(java.lang.String p0) { return new com.intellij.psi.PsiMethod[0]; }
    public abstract com.intellij.psi.PsiMethod[] findMethodsByName(java.lang.String p0, boolean p1);
    public abstract java.util.List<? extends Object> findMethodsAndTheirSubstitutorsByName(java.lang.String p0, boolean p1);
    public abstract java.util.List<? extends Object> getAllMethodsAndTheirSubstitutors();
    public abstract com.intellij.psi.PsiClass findInnerClassByName(java.lang.String p0, boolean p1);
    public default com.intellij.psi.PsiClass findInnerByName(java.lang.String p0) { return findInnerClassByName(p0, false); }
    public abstract com.intellij.psi.PsiElement getLBrace();
    public abstract com.intellij.psi.PsiElement getRBrace();
    public abstract com.intellij.psi.PsiIdentifier getNameIdentifier();
    public abstract com.intellij.psi.PsiElement getScope();
    public abstract boolean isInheritor(com.intellij.psi.PsiClass p0, boolean p1);
    public abstract boolean isInheritorDeep(com.intellij.psi.PsiClass p0, com.intellij.psi.PsiClass p1);
    public abstract com.intellij.psi.PsiClass getContainingClass();
    public abstract java.util.Collection<? extends Object> getVisibleSignatures();
    public abstract com.intellij.psi.PsiElement setName(java.lang.String p0);
    public default com.intellij.psi.PsiRecordComponent[] getRecordComponents() { return null; }
    public default boolean hasModifier(com.intellij.lang.jvm.JvmModifier modifier) { return false; }
    public default com.intellij.pom.java.LanguageLevel getLanguageLevel() { return com.intellij.pom.java.LanguageLevel.HIGHEST; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiClass
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiClass> ARRAY_FACTORY = null;
    public default com.intellij.lang.jvm.JvmClassKind getClassKind() { return null; }
    public default com.intellij.lang.jvm.types.JvmReferenceType getSuperClassType() { return null; }
    public default com.intellij.lang.jvm.types.JvmReferenceType[] getInterfaceTypes() { return null; }
    public default com.intellij.psi.PsiRecordHeader getRecordHeader() { return null; }
}
