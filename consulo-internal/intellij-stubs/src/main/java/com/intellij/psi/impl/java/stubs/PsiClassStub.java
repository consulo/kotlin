package com.intellij.psi.impl.java.stubs;

@SuppressWarnings("all")
public interface PsiClassStub<T extends com.intellij.psi.PsiClass> extends com.intellij.psi.stubs.StubElement<T> {
    String getName();
    String getQualifiedName();
    boolean isInterface();
    boolean isEnum();
    boolean isAnnotationType();
    boolean isAnonymous();
    boolean isInQualifiedNew();
}
