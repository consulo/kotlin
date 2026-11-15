package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiAnonymousClass extends com.intellij.psi.PsiClass {
    com.intellij.psi.PsiJavaCodeReferenceElement getBaseClassReference();
    com.intellij.psi.PsiClassType getBaseClassType();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiAnonymousClass
    public com.intellij.psi.PsiExpressionList getArgumentList();
    public boolean isInQualifiedNew();
}
