package com.intellij.psi.util;

@SuppressWarnings("all")
public class PsiUtil {
    public static final com.intellij.openapi.util.Key<com.intellij.pom.java.LanguageLevel> FILE_LANGUAGE_LEVEL_KEY = com.intellij.openapi.util.Key.create("FILE_LANGUAGE_LEVEL_KEY");
    public static boolean isAccessible(com.intellij.psi.PsiMember member, com.intellij.psi.PsiElement place, com.intellij.psi.PsiClass accessObjectClass) { return true; }
    public static boolean isAccessible(com.intellij.openapi.project.Project project, com.intellij.psi.PsiMember member, com.intellij.psi.PsiElement place, com.intellij.psi.PsiClass accessObjectClass) { return true; }
    public static boolean isLocalOrAnonymousClass(com.intellij.psi.PsiClass psiClass) { return false; }
    public static boolean isInnerClass(com.intellij.psi.PsiClass psiClass) { return false; }
    public static com.intellij.psi.PsiClass getTopLevelClass(com.intellij.psi.PsiElement element) { return null; }
    public static String getName(com.intellij.psi.PsiElement element) { return null; }
    public static com.intellij.pom.java.LanguageLevel getLanguageLevel(com.intellij.psi.PsiElement element) { return com.intellij.pom.java.LanguageLevel.HIGHEST; }
    public static com.intellij.pom.java.LanguageLevel getLanguageLevel(com.intellij.openapi.project.Project project) { return com.intellij.pom.java.LanguageLevel.HIGHEST; }
    public static int getAccessLevel(com.intellij.psi.PsiModifierList modifierList) { return 0; }
    public static String getAccessModifier(int accessLevel) { return null; }
    public static boolean isCompileTimeConstant(com.intellij.psi.PsiVariable field) { return false; }
    public static com.intellij.psi.PsiClassType.ClassResolveResult resolveGenericsClassInType(com.intellij.psi.PsiType type) { return null; }
    public static com.intellij.psi.PsiClass resolveClassInType(com.intellij.psi.PsiType type) { return null; }
    public static com.intellij.psi.PsiClass resolveClassInClassTypeOnly(com.intellij.psi.PsiType type) { return null; }
    public static com.intellij.psi.PsiSubstitutor resolveSubstitutor(com.intellij.psi.PsiType type) { return null; }
    public static boolean canBeOverridden(com.intellij.psi.PsiMethod method) { return false; }
    public static boolean isExtensionMethod(com.intellij.psi.PsiMethod method) { return false; }
    public static int ACCESS_LEVEL_PUBLIC = 4;
    public static int ACCESS_LEVEL_PROTECTED = 3;
    public static int ACCESS_LEVEL_PACKAGE_LOCAL = 2;
    public static int ACCESS_LEVEL_PRIVATE = 1;
    public static boolean isInJspFile(com.intellij.psi.PsiElement element) { return false; }
    public static com.intellij.psi.PsiClass getEnclosingStaticElement(com.intellij.psi.PsiElement element, com.intellij.psi.PsiClass containingClass) { return null; }
    public static java.util.List<com.intellij.psi.PsiTypeParameter> typeParametersIterable(com.intellij.psi.PsiTypeParameterListOwner owner) { return java.util.Collections.emptyList(); }
    public static boolean ensureValidType(com.intellij.psi.PsiType type) { return type != null && type.isValid(); }
    public static void ensureValidType(com.intellij.psi.PsiType type, String msg) {}
    public static com.intellij.psi.PsiClass getPsiClassByName(com.intellij.psi.PsiClass aClass, String name) { return null; }
}
