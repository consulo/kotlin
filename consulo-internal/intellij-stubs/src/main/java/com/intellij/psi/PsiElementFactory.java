package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiElementFactory {
    static PsiElementFactory getInstance(com.intellij.openapi.project.Project project) { return null; }
    com.intellij.psi.PsiClassType createType(com.intellij.psi.PsiClass resolve);
    com.intellij.psi.PsiClassType createType(com.intellij.psi.PsiClass resolve, com.intellij.psi.PsiSubstitutor substitutor);
    com.intellij.psi.PsiClassType createType(com.intellij.psi.PsiClass resolve, com.intellij.psi.PsiType... parameters);
    com.intellij.psi.PsiClass createClass(String name);
    com.intellij.psi.PsiMethod createMethodFromText(String text, com.intellij.psi.PsiElement context);
    com.intellij.psi.PsiField createFieldFromText(String text, com.intellij.psi.PsiElement context);
    com.intellij.psi.PsiCodeBlock createCodeBlock();
    com.intellij.psi.PsiTypeElement createTypeElement(com.intellij.psi.PsiType type);
    com.intellij.psi.PsiType createTypeFromText(String text, com.intellij.psi.PsiElement context);
    com.intellij.psi.PsiAnnotation createAnnotationFromText(String text, com.intellij.psi.PsiElement context);
    com.intellij.psi.PsiClassType getJavaLangString();
    com.intellij.psi.PsiClassType getJavaLangObject();
    com.intellij.psi.PsiClassType getJavaLangThrowable();
    com.intellij.psi.PsiClassType getJavaLangError();
    com.intellij.psi.PsiClassType getJavaLangRuntimeException();
    com.intellij.psi.PsiClassType getJavaLangAnnotationAnnotation();
    com.intellij.psi.PsiClassType getJavaLangClass();
    com.intellij.psi.PsiClassType getJavaLangCloneable();
    com.intellij.psi.PsiClassType getJavaIoSerializable();
    com.intellij.psi.PsiClassType getJavaLangEnum();
    com.intellij.psi.PsiClassType createTypeByFQClassName(String qName);
    com.intellij.psi.PsiClassType createTypeByFQClassName(String qName, com.intellij.psi.search.GlobalSearchScope scope);
}
