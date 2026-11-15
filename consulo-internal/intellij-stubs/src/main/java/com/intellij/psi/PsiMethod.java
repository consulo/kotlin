package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiMethod extends com.intellij.lang.jvm.JvmMethod, com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.PsiTypeParameterListOwner, com.intellij.psi.PsiMember, com.intellij.psi.PsiDocCommentOwner, com.intellij.psi.PsiNamedElement, com.intellij.psi.PsiNameIdentifierOwner, com.intellij.lang.pom.PomRenameableTarget<com.intellij.psi.PsiElement>, com.intellij.psi.PsiTarget, com.intellij.psi.PsiParameterListOwner {
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
    default java.util.List<com.intellij.psi.PsiMethod> findSuperMethods(com.intellij.psi.PsiClass parentClass, boolean checkAccess) { return java.util.Collections.emptyList(); }
    com.intellij.psi.PsiMethod findDeepestSuperMethod();
    com.intellij.psi.PsiMethod[] findDeepestSuperMethods();
    java.util.List<com.intellij.psi.util.MethodSignatureBackedByPsiMethod> findSuperMethodSignaturesIncludingStatic(boolean checkAccess);
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    com.intellij.psi.PsiElement setName(String name);
    com.intellij.psi.HierarchicalMethodSignature getHierarchicalMethodSignature();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiMethod
    public static final com.intellij.util.ArrayFactory<com.intellij.psi.PsiMethod> ARRAY_FACTORY = null;
    public com.intellij.psi.util.MethodSignature getSignature(com.intellij.psi.PsiSubstitutor p0);
    public default boolean hasParameters() { return false; }
    public default com.intellij.lang.jvm.JvmParameter[] getParameters() { return null; }
    public default com.intellij.lang.jvm.types.JvmReferenceType[] getThrowsTypes() { return null; }
    public default boolean isDefaultConstructor() { return false; }
}
