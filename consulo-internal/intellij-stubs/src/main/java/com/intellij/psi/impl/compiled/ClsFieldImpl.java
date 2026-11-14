package com.intellij.psi.impl.compiled;

@SuppressWarnings("all")
public abstract class ClsFieldImpl extends com.intellij.psi.impl.PsiElementBase implements com.intellij.psi.PsiField {
    public String getName() { return null; }
    public com.intellij.psi.PsiType getType() { return null; }
    public com.intellij.psi.PsiTypeElement getTypeElement() { return null; }
    public com.intellij.psi.PsiIdentifier getNameIdentifier() { return null; }
    public com.intellij.psi.PsiExpression getInitializer() { return null; }
    public boolean hasInitializer() { return false; }
    public void normalizeDeclaration() {}
    public Object computeConstantValue() { return null; }
    public com.intellij.psi.PsiClass getContainingClass() { return null; }
    public com.intellij.psi.PsiModifierList getModifierList() { return null; }
    public boolean hasModifierProperty(String name) { return false; }
    public com.intellij.psi.javadoc.PsiDocComment getDocComment() { return null; }
    public boolean isDeprecated() { return false; }
    public com.intellij.psi.impl.java.stubs.PsiFieldStub getStub() { return null; }
}
