package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnonymousClass extends com.intellij.psi.PsiClass {
    com.intellij.psi.PsiJavaCodeReferenceElement getBaseClassReference();
    com.intellij.psi.PsiClassType getBaseClassType();
}
