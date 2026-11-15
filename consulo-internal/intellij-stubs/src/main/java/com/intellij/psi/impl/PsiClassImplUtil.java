package com.intellij.psi.impl;

@SuppressWarnings("all")
public class PsiClassImplUtil {
    public static com.intellij.psi.PsiField findFieldByName(com.intellij.psi.PsiClass aClass, String name, boolean checkBases) { return null; }
    public static com.intellij.psi.PsiMethod[] findMethodsByName(com.intellij.psi.PsiClass aClass, String name, boolean checkBases) { return new com.intellij.psi.PsiMethod[0]; }
    public static com.intellij.psi.PsiClass findInnerByName(com.intellij.psi.PsiClass aClass, String name, boolean checkBases) { return null; }
    public static boolean isClassEquivalentTo(com.intellij.psi.PsiClass aClass, com.intellij.psi.PsiElement another) { return aClass == another; }
    public static boolean processDeclarationsInClass(com.intellij.psi.PsiClass aClass, com.intellij.psi.scope.PsiScopeProcessor processor, com.intellij.psi.ResolveState state, java.util.Set<com.intellij.psi.PsiClass> visited, com.intellij.psi.PsiElement last, com.intellij.psi.PsiElement place, com.intellij.pom.java.LanguageLevel languageLevel, boolean isRaw) { return true; }
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.impl.psi.impl.PsiClassImplUtil
    public static com.intellij.psi.PsiField[] getAllFields(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiMethod[] getAllMethods(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiClass[] getAllInnerClasses(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiMethod findMethodBySignature(com.intellij.psi.PsiClass p0, com.intellij.psi.PsiMethod p1, boolean p2) { return null; }
    public static com.intellij.psi.PsiMethod[] findMethodsBySignature(com.intellij.psi.PsiClass p0, com.intellij.psi.PsiMethod p1, boolean p2) { return null; }
    public static <T extends com.intellij.psi.PsiMember> java.util.List<com.intellij.openapi.util.Pair<T, com.intellij.psi.PsiSubstitutor>> getAllWithSubstitutorsByMap(com.intellij.psi.PsiClass p0, com.intellij.psi.impl.PsiClassImplUtil.MemberType p1) { return null; }
    public static com.intellij.psi.search.SearchScope getClassUseScope(com.intellij.psi.PsiClass p0) { return null; }
    public static boolean isMainOrPremainMethod(com.intellij.psi.PsiMethod p0) { return false; }
    public static com.intellij.psi.PsiSubstitutor obtainFinalSubstitutor(com.intellij.psi.PsiClass p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiClass p2, com.intellij.psi.PsiSubstitutor p3, com.intellij.psi.PsiElementFactory p4, com.intellij.pom.java.LanguageLevel p5) { return null; }
    public static <T extends com.intellij.psi.PsiType> T correctType(T p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static java.util.List<com.intellij.psi.PsiClassType.ClassResolveResult> getScopeCorrectedSuperTypes(com.intellij.psi.PsiClass p0, com.intellij.psi.search.GlobalSearchScope p1) { return null; }
    public static com.intellij.psi.PsiClass getSuperClass(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiClass[] getSupers(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiClassType[] getSuperTypes(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiClass[] getInterfaces(com.intellij.psi.PsiTypeParameter p0) { return null; }
    public static com.intellij.psi.PsiClass[] getInterfaces(com.intellij.psi.PsiClass p0) { return null; }
    public static java.util.List<com.intellij.openapi.util.Pair<com.intellij.psi.PsiMethod, com.intellij.psi.PsiSubstitutor>> findMethodsAndTheirSubstitutorsByName(com.intellij.psi.PsiClass p0, java.lang.String p1, boolean p2) { return null; }
    public static com.intellij.psi.PsiClassType[] getExtendsListTypes(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiClassType[] getImplementsListTypes(com.intellij.psi.PsiClass p0) { return null; }
    public static boolean isFieldEquivalentTo(com.intellij.psi.PsiField p0, com.intellij.psi.PsiElement p1) { return false; }
    public static boolean isMethodEquivalentTo(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiElement p1) { return false; }
    @SuppressWarnings("all")
    public static enum MemberType {
        CLASS, FIELD, METHOD;
    }
}
