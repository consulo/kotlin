package com.intellij.psi;

@SuppressWarnings("all")
  public interface PsiClass {
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
  public default com.intellij.lang.jvm.JvmMethod[] findMethodsByName(java.lang.String p0) { return null; }
  public abstract com.intellij.psi.PsiMethod[] findMethodsByName(java.lang.String p0, boolean p1);
  public abstract java.util.List<com.intellij.openapi.util.Pair<com.intellij.psi.PsiMethod, com.intellij.psi.PsiSubstitutor>> findMethodsAndTheirSubstitutorsByName(java.lang.String p0, boolean p1);
  public abstract java.util.List<com.intellij.openapi.util.Pair<com.intellij.psi.PsiMethod, com.intellij.psi.PsiSubstitutor>> getAllMethodsAndTheirSubstitutors();
  public abstract com.intellij.psi.PsiClass findInnerClassByName(java.lang.String p0, boolean p1);
  public abstract com.intellij.psi.PsiElement getLBrace();
  public abstract com.intellij.psi.PsiElement getRBrace();
  public abstract com.intellij.psi.PsiIdentifier getNameIdentifier();
  public abstract com.intellij.psi.PsiElement getScope();
  public abstract boolean isInheritor(com.intellij.psi.PsiClass p0, boolean p1);
  public abstract boolean isInheritorDeep(com.intellij.psi.PsiClass p0, com.intellij.psi.PsiClass p1);
  public abstract com.intellij.psi.PsiClass getContainingClass();
  public abstract java.util.Collection<com.intellij.psi.HierarchicalMethodSignature> getVisibleSignatures();
  public abstract com.intellij.psi.PsiElement setName(java.lang.String p0) throws com.intellij.util.IncorrectOperationException;
  public default com.intellij.lang.jvm.JvmClassKind getClassKind() { return null; }
  public default com.intellij.lang.jvm.types.JvmReferenceType getSuperClassType() { return null; }
  public default com.intellij.lang.jvm.types.JvmReferenceType[] getInterfaceTypes() { return null; }
  public default com.intellij.psi.PsiRecordComponent[] getRecordComponents() { return null; }
  public default com.intellij.psi.PsiRecordHeader getRecordHeader() { return null; }
}
