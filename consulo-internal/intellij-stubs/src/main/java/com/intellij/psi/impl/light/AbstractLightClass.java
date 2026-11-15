package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public abstract class AbstractLightClass extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiClass {
    public AbstractLightClass(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language) { super(manager, language); }
    public com.intellij.psi.PsiClass getDelegate() { return null; }
    public String getName() { return getDelegate().getName(); }
    public String getQualifiedName() { return getDelegate().getQualifiedName(); }
    public com.intellij.psi.PsiIdentifier getNameIdentifier() { return getDelegate().getNameIdentifier(); }
    public boolean isInterface() { return getDelegate().isInterface(); }
    public boolean isAnnotationType() { return getDelegate().isAnnotationType(); }
    public boolean isEnum() { return getDelegate().isEnum(); }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.impl.psi.impl.light.AbstractLightClass
    protected AbstractLightClass(com.intellij.psi.PsiManager p0) { }
    public com.intellij.psi.PsiElement copy() { return null; }
    public com.intellij.psi.PsiModifierList getModifierList() { return null; }
    public boolean hasModifierProperty(java.lang.String p0) { return false; }
    public com.intellij.psi.javadoc.PsiDocComment getDocComment() { return null; }
    public boolean isDeprecated() { return false; }
    public boolean hasTypeParameters() { return false; }
    public com.intellij.psi.PsiTypeParameterList getTypeParameterList() { return null; }
    public com.intellij.psi.PsiTypeParameter[] getTypeParameters() { return null; }
    public com.intellij.psi.PsiReferenceList getExtendsList() { return null; }
    public com.intellij.psi.PsiReferenceList getImplementsList() { return null; }
    public com.intellij.psi.PsiClassType[] getExtendsListTypes() { return null; }
    public com.intellij.psi.PsiClassType[] getImplementsListTypes() { return null; }
    public com.intellij.psi.PsiClass getSuperClass() { return null; }
    public com.intellij.psi.PsiClass[] getInterfaces() { return null; }
    public com.intellij.psi.PsiElement getNavigationElement() { return null; }
    public com.intellij.psi.PsiClass[] getSupers() { return null; }
    public com.intellij.psi.PsiClassType[] getSuperTypes() { return null; }
    public com.intellij.psi.PsiField[] getFields() { return null; }
    public com.intellij.psi.PsiMethod[] getMethods() { return null; }
    public com.intellij.psi.PsiMethod[] getConstructors() { return null; }
    public com.intellij.psi.PsiClass[] getInnerClasses() { return null; }
    public com.intellij.psi.PsiClassInitializer[] getInitializers() { return null; }
    public boolean processDeclarations(com.intellij.psi.scope.PsiScopeProcessor p0, com.intellij.psi.ResolveState p1, com.intellij.psi.PsiElement p2, com.intellij.psi.PsiElement p3) { return false; }
    public com.intellij.psi.PsiField[] getAllFields() { return null; }
    public com.intellij.psi.PsiMethod[] getAllMethods() { return null; }
    public com.intellij.psi.PsiClass[] getAllInnerClasses() { return null; }
    public com.intellij.psi.PsiField findFieldByName(java.lang.String p0, boolean p1) { return null; }
    public com.intellij.psi.PsiMethod findMethodBySignature(com.intellij.psi.PsiMethod p0, boolean p1) { return null; }
    public com.intellij.psi.PsiMethod[] findMethodsBySignature(com.intellij.psi.PsiMethod p0, boolean p1) { return null; }
    public com.intellij.psi.PsiMethod[] findMethodsByName(java.lang.String p0, boolean p1) { return null; }
    public java.util.List<com.intellij.openapi.util.Pair<com.intellij.psi.PsiMethod, com.intellij.psi.PsiSubstitutor>> findMethodsAndTheirSubstitutorsByName(java.lang.String p0, boolean p1) { return null; }
    public java.util.List<com.intellij.openapi.util.Pair<com.intellij.psi.PsiMethod, com.intellij.psi.PsiSubstitutor>> getAllMethodsAndTheirSubstitutors() { return null; }
    public com.intellij.psi.PsiClass findInnerClassByName(java.lang.String p0, boolean p1) { return null; }
    public com.intellij.psi.PsiElement getLBrace() { return null; }
    public com.intellij.psi.PsiElement getRBrace() { return null; }
    public com.intellij.psi.PsiElement getScope() { return null; }
    public boolean isInheritor(com.intellij.psi.PsiClass p0, boolean p1) { return false; }
    public boolean isInheritorDeep(com.intellij.psi.PsiClass p0, com.intellij.psi.PsiClass p1) { return false; }
    public com.intellij.psi.PsiClass getContainingClass() { return null; }
    public java.util.Collection<com.intellij.psi.HierarchicalMethodSignature> getVisibleSignatures() { return null; }
    public com.intellij.psi.PsiElement setName(java.lang.String p0) throws com.intellij.util.IncorrectOperationException { return null; }
    public java.lang.String toString() { return null; }
    public java.lang.String getText() { return null; }
    public void accept(com.intellij.psi.PsiElementVisitor p0) { }
    public com.intellij.psi.PsiFile getContainingFile() { return null; }
    public com.intellij.psi.PsiElement getContext() { return null; }
    public boolean isValid() { return false; }
    public boolean isEquivalentTo(com.intellij.psi.PsiElement p0) { return false; }
    protected AbstractLightClass() { }
}
