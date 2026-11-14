package com.intellij.psi;

@SuppressWarnings("all")
public abstract class JavaPsiFacade {
    public static JavaPsiFacade getInstance(com.intellij.openapi.project.Project project) { return null; }
    public static com.intellij.psi.PsiElementFactory getElementFactory(com.intellij.openapi.project.Project project) { return getInstance(project).getElementFactory(); }
    public abstract com.intellij.psi.PsiClass findClass(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope);
    public abstract com.intellij.psi.PsiClass[] findClasses(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope);
    public abstract com.intellij.psi.PsiPackage findPackage(String qualifiedName);
    public abstract com.intellij.psi.PsiElementFactory getElementFactory();
    public abstract com.intellij.psi.PsiConstantEvaluationHelper getConstantEvaluationHelper();
    public abstract com.intellij.psi.JavaParserFacade getParserFacade();
    public abstract boolean isInPackage(com.intellij.psi.PsiElement element, com.intellij.psi.PsiPackage aPackage);
}
