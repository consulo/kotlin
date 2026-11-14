package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightMethod extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiMethod {
    public LightMethod(com.intellij.psi.PsiManager manager, com.intellij.psi.PsiMethod method, com.intellij.psi.PsiClass containingClass) { super(manager, null); }
    public LightMethod(com.intellij.psi.PsiManager manager, com.intellij.psi.PsiMethod method, com.intellij.psi.PsiClass containingClass, com.intellij.lang.Language language) { super(manager, language); }
    public String getName() { return null; }
    public com.intellij.psi.PsiType getReturnType() { return null; }
    public com.intellij.psi.PsiParameterList getParameterList() { return null; }
    public com.intellij.psi.PsiReferenceList getThrowsList() { return null; }
    public com.intellij.psi.PsiCodeBlock getBody() { return null; }
    public boolean isConstructor() { return false; }
    public boolean isVarArgs() { return false; }
    public com.intellij.psi.PsiMethod[] findSuperMethods() { return new com.intellij.psi.PsiMethod[0]; }
    public com.intellij.psi.PsiMethod[] findSuperMethods(boolean checkAccess) { return new com.intellij.psi.PsiMethod[0]; }
    public com.intellij.psi.PsiMethod[] findSuperMethods(com.intellij.psi.PsiClass parentClass) { return new com.intellij.psi.PsiMethod[0]; }
    public java.util.List<com.intellij.psi.PsiMethod> findSuperMethods(com.intellij.psi.PsiClass parentClass, boolean checkAccess) { return new java.util.ArrayList<>(); }
    public com.intellij.psi.PsiMethod findDeepestSuperMethod() { return null; }
    public com.intellij.psi.PsiMethod[] findDeepestSuperMethods() { return new com.intellij.psi.PsiMethod[0]; }
    public com.intellij.psi.PsiIdentifier getNameIdentifier() { return null; }
    public com.intellij.psi.PsiElement setName(String name) { return null; }
    public com.intellij.psi.HierarchicalMethodSignature getHierarchicalMethodSignature() { return null; }
    public java.util.List<com.intellij.psi.util.MethodSignatureBackedByPsiMethod> findSuperMethodSignaturesIncludingStatic(boolean checkAccess) { return new java.util.ArrayList<>(); }
    public com.intellij.psi.PsiClass getContainingClass() { return null; }
    public com.intellij.psi.PsiModifierList getModifierList() { return null; }
    public boolean hasModifierProperty(String name) { return false; }
    public com.intellij.psi.javadoc.PsiDocComment getDocComment() { return null; }
    public boolean isDeprecated() { return false; }
    public com.intellij.psi.PsiTypeParameterList getTypeParameterList() { return null; }
    public com.intellij.psi.PsiTypeParameter[] getTypeParameters() { return new com.intellij.psi.PsiTypeParameter[0]; }
    public boolean hasTypeParameters() { return false; }
    public com.intellij.psi.PsiTypeElement getReturnTypeElement() { return null; }
}
