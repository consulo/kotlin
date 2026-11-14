package com.intellij.psi.impl.source;

@SuppressWarnings("all")
public interface PsiExtensibleClass extends com.intellij.psi.PsiClass {
    java.util.List<com.intellij.psi.PsiField> getOwnFields();
    java.util.List<com.intellij.psi.PsiMethod> getOwnMethods();
    java.util.List<com.intellij.psi.PsiClass> getOwnInnerClasses();
}
