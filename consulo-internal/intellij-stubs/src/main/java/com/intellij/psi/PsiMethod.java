package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiMethod extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiTypeParameterListOwner, com.intellij.psi.PsiMember, com.intellij.psi.PsiDocCommentOwner, com.intellij.psi.PsiNamedElement {
    PsiMethod[] EMPTY_ARRAY = new PsiMethod[0];
    String getName();
    com.intellij.psi.PsiType getReturnType();
    com.intellij.psi.PsiTypeElement getReturnTypeElement();
    com.intellij.psi.PsiParameterList getParameterList();
    com.intellij.psi.PsiReferenceList getThrowsList();
    com.intellij.psi.PsiCodeBlock getBody();
    boolean isConstructor();
    boolean isVarArgs();
    com.intellij.psi.PsiMethod[] findSuperMethods();
    com.intellij.psi.PsiMethod[] findSuperMethods(boolean checkAccess);
    com.intellij.psi.PsiMethod[] findSuperMethods(com.intellij.psi.PsiClass parentClass);
    java.util.List<com.intellij.psi.PsiMethod> findSuperMethods(com.intellij.psi.PsiClass parentClass, boolean checkAccess);
    com.intellij.psi.PsiMethod findDeepestSuperMethod();
    com.intellij.psi.PsiMethod[] findDeepestSuperMethods();
    java.util.List<com.intellij.psi.util.MethodSignatureBackedByPsiMethod> findSuperMethodSignaturesIncludingStatic(boolean checkAccess);
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiElement setName(String name);
    com.intellij.psi.HierarchicalMethodSignature getHierarchicalMethodSignature();
}
