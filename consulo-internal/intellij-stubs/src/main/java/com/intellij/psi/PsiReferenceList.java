package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiReferenceList extends com.intellij.psi.PsiElement {
    com.intellij.psi.PsiClassType[] getReferencedTypes();
    com.intellij.psi.PsiJavaCodeReferenceElement[] getReferenceElements();
    enum Role { EXTENDS_LIST, IMPLEMENTS_LIST, THROWS_LIST, EXTENDS_BOUNDS_LIST, PERMITS_LIST }
    Role getRole();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiReferenceList
    public static final com.intellij.psi.PsiReferenceList[] EMPTY_ARRAY = null;
}
