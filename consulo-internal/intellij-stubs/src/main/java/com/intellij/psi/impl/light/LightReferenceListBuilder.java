package com.intellij.psi.impl.light;

@SuppressWarnings("all")
public class LightReferenceListBuilder extends com.intellij.psi.impl.light.LightElement implements com.intellij.psi.PsiReferenceList {
    public LightReferenceListBuilder(com.intellij.psi.PsiManager manager, com.intellij.psi.PsiReferenceList.Role role) { super(manager, null); }
    public LightReferenceListBuilder(com.intellij.psi.PsiManager manager, com.intellij.lang.Language language, com.intellij.psi.PsiReferenceList.Role role) { super(manager, language); }
    public LightReferenceListBuilder addReference(String qualifiedName) { return this; }
    public LightReferenceListBuilder addReference(com.intellij.psi.PsiClass aClass) { return this; }
    public com.intellij.psi.PsiClassType[] getReferencedTypes() { return new com.intellij.psi.PsiClassType[0]; }
    public com.intellij.psi.PsiJavaCodeReferenceElement[] getReferenceElements() { return new com.intellij.psi.PsiJavaCodeReferenceElement[0]; }
    public com.intellij.psi.PsiReferenceList.Role getRole() { return null; }
}
