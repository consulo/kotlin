package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightRecordMethod extends com.intellij.psi.impl.light.LightMethod {
    public LightRecordMethod(com.intellij.psi.PsiManager manager, com.intellij.psi.PsiMethod method, com.intellij.psi.PsiClass containingClass, com.intellij.psi.PsiRecordComponent recordComponent) {
        super(manager, method, containingClass);
    }
    public com.intellij.psi.PsiRecordComponent getRecordComponent() { return null; }
}
