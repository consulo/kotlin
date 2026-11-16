package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightParameter extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiParameter {
    public LightParameter(String name, com.intellij.psi.PsiType type, com.intellij.psi.PsiElement declarationScope) { super(declarationScope.getManager(), null); }
    public LightParameter(String name, com.intellij.psi.PsiType type, com.intellij.psi.PsiElement declarationScope, com.intellij.lang.Language language) { super(declarationScope.getManager(), language); }
    public LightParameter(String name, com.intellij.psi.PsiType type, com.intellij.psi.PsiElement declarationScope, com.intellij.lang.Language language, boolean isVarArgs) { super(declarationScope.getManager(), language); }
    public String getName() { return null; }
    public com.intellij.psi.PsiType getType() { return null; }
    public com.intellij.psi.PsiTypeElement getTypeElement() { return null; }
    public com.intellij.psi.PsiIdentifier getNameIdentifier() { return null; }
    public com.intellij.psi.PsiExpression getInitializer() { return null; }
    public boolean hasInitializer() { return false; }
    public Object computeConstantValue() { return null; }
    public void normalizeDeclaration() {}
    public com.intellij.psi.PsiElement setName(String name) { return null; }
    public com.intellij.psi.PsiModifierList getModifierList() { return null; }
    public boolean hasModifierProperty(String name) { return false; }
    public com.intellij.psi.PsiElement getDeclarationScope() { return null; }
    public boolean isVarArgs() { return false; }
    // Inherited abstract members (genstub.py)
    public void navigate(boolean p0) { }
}
