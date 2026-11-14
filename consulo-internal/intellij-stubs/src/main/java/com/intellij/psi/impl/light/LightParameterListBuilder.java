package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightParameterListBuilder extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiParameterList {
    public LightParameterListBuilder(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language) { super(manager, language); }
    public LightParameterListBuilder addParameter(com.intellij.psi.PsiParameter p) { return this; }
    public int getParametersCount() { return 0; }
    public com.intellij.psi.PsiParameter[] getParameters() { return new com.intellij.psi.PsiParameter[0]; }
    public com.intellij.psi.PsiParameter getParameter(int index) { return null; }
    public int getParameterIndex(com.intellij.psi.PsiParameter parameter) { return -1; }
    public boolean isEmpty() { return true; }
}
