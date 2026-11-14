package com.intellij.psi.impl.java.stubs;

@SuppressWarnings("all")
public interface PsiFieldStub {
    String getName();
    String getType();
    String getInitializerText();
    boolean isEnumConstant();
    boolean isDeprecated();
}
