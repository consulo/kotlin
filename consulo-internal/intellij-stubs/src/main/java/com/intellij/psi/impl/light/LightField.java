package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightField extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiField {
    public LightField(com.intellij.psi.PsiManager manager, com.intellij.psi.PsiField field, com.intellij.psi.PsiClass containingClass) { super(manager, null); }
    public String getName() { return null; }
    public com.intellij.psi.PsiType getType() { return null; }
    public com.intellij.psi.PsiTypeElement getTypeElement() { return null; }
    public com.intellij.psi.PsiIdentifier getNameIdentifier() { return null; }
    public com.intellij.psi.PsiExpression getInitializer() { return null; }
    public boolean hasInitializer() { return false; }
    public void normalizeDeclaration() {}
    public Object computeConstantValue() { return null; }
    public com.intellij.psi.PsiClass getContainingClass() { return null; }
    public com.intellij.psi.PsiElement setName(String name) { return this; }
    public com.intellij.psi.PsiModifierList getModifierList() { return null; }
    public boolean hasModifierProperty(String name) { return false; }
    public com.intellij.psi.javadoc.PsiDocComment getDocComment() { return null; }
    public boolean isDeprecated() { return false; }
    // Inherited abstract members (genstub.py)
    public void setInitializer(com.intellij.psi.PsiExpression p0) { }
}
