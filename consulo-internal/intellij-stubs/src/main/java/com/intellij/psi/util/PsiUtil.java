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
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.util.PsiUtil
    public static final com.intellij.openapi.util.Key<java.lang.Boolean> VALID_VOID_TYPE_IN_CODE_FRAGMENT = null;
    public static final java.util.Comparator<com.intellij.psi.PsiElement> BY_POSITION = null;
    public static boolean isOnAssignmentLeftHand(com.intellij.psi.PsiExpression p0) { return false; }
    public static boolean isAccessibleFromPackage(com.intellij.psi.PsiModifierListOwner p0, com.intellij.psi.PsiPackage p1) { return false; }
    public static boolean isAccessedForWriting(com.intellij.psi.PsiExpression p0) { return false; }
    public static boolean isAccessedForReading(com.intellij.psi.PsiExpression p0) { return false; }
    public static com.intellij.psi.JavaResolveResult getAccessObjectClass(com.intellij.psi.PsiExpression p0) { return null; }
    public static boolean isConstantExpression(com.intellij.psi.PsiExpression p0) { return false; }
    public static void addException(com.intellij.psi.PsiMethod p0, java.lang.String p1) throws com.intellij.util.IncorrectOperationException { }
    public static void addException(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiClass p1) throws com.intellij.util.IncorrectOperationException { }
    public static void removeException(com.intellij.psi.PsiMethod p0, java.lang.String p1) throws com.intellij.util.IncorrectOperationException { }
    public static boolean isVariableNameUnique(java.lang.String p0, com.intellij.psi.PsiElement p1) { return false; }
    public static com.intellij.psi.PsiElement getTopLevelEnclosingCodeBlock(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
    public static boolean isLocalClass(com.intellij.psi.PsiClass p0) { return false; }
    public static boolean isAbstractClass(com.intellij.psi.PsiClass p0) { return false; }
    public static com.intellij.psi.PsiElement getVariableCodeBlock(com.intellij.psi.PsiVariable p0, com.intellij.psi.PsiElement p1) { return null; }
    public static boolean isIncrementDecrementOperation(com.intellij.psi.PsiElement p0) { return false; }
    public static java.util.List<com.intellij.psi.PsiExpression> getSwitchResultExpressions(com.intellij.psi.PsiSwitchExpression p0) { return null; }
    public static boolean isStatement(com.intellij.psi.PsiElement p0) { return false; }
    public static com.intellij.psi.PsiElement getEnclosingStatement(com.intellij.psi.PsiElement p0) { return null; }
    public static com.intellij.psi.PsiElement getElementInclusiveRange(com.intellij.psi.PsiElement p0, com.intellij.openapi.util.TextRange p1) { return null; }
    public static com.intellij.psi.PsiType convertAnonymousToBaseType(com.intellij.psi.PsiType p0) { return null; }
    public static boolean isApplicable(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiExpressionList p2) { return false; }
    public static boolean isApplicable(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiExpression[] p2) { return false; }
    public static int getApplicabilityLevel(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiExpressionList p2) { return 0; }
    public static int getApplicabilityLevel(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiType[] p2, com.intellij.pom.java.LanguageLevel p3) { return 0; }
    public static int getApplicabilityLevel(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiType[] p2, com.intellij.pom.java.LanguageLevel p3, boolean p4, boolean p5) { return 0; }
    public static int getApplicabilityLevel(com.intellij.psi.PsiMethod p0, com.intellij.psi.PsiSubstitutor p1, com.intellij.psi.PsiType[] p2, com.intellij.pom.java.LanguageLevel p3, boolean p4, boolean p5, com.intellij.psi.util.PsiUtil.ApplicabilityChecker p6) { return 0; }
    public static boolean equalOnEquivalentClasses(com.intellij.psi.PsiClassType p0, com.intellij.psi.PsiClass p1, com.intellij.psi.PsiClassType p2, com.intellij.psi.PsiClass p3) { return false; }
    public static boolean equalOnEquivalentClasses(com.intellij.psi.PsiSubstitutor p0, com.intellij.psi.PsiClass p1, com.intellij.psi.PsiSubstitutor p2, com.intellij.psi.PsiClass p3) { return false; }
    public static boolean isCompileTimeConstant(com.intellij.psi.PsiField p0) { return false; }
    public static boolean allMethodsHaveSameSignature(com.intellij.psi.PsiMethod[] p0) { return false; }
    public static com.intellij.psi.PsiExpression deparenthesizeExpression(com.intellij.psi.PsiExpression p0) { return null; }
    public static com.intellij.psi.PsiElement findModifierInList(com.intellij.psi.PsiModifierList p0, java.lang.String p1) { return null; }
    public static com.intellij.psi.PsiClass getContainingClass(com.intellij.psi.PsiElement p0) { return null; }
    public static java.lang.String getPackageName(com.intellij.psi.PsiClass p0) { return null; }
    public static com.intellij.psi.PsiType getTypeByPsiElement(com.intellij.psi.PsiElement p0) { return null; }
    public static com.intellij.psi.PsiType captureToplevelWildcards(com.intellij.psi.PsiType p0, com.intellij.psi.PsiElement p1) { return null; }
    public static com.intellij.psi.PsiType captureTypeParameterBounds(com.intellij.psi.PsiTypeParameter p0, com.intellij.psi.PsiType p1, com.intellij.psi.PsiElement p2, com.intellij.psi.PsiSubstitutor p3) { return null; }
    public static boolean isInsideJavadocComment(com.intellij.psi.PsiElement p0) { return false; }
    public static java.util.List<com.intellij.psi.PsiTypeElement> getParameterTypeElements(com.intellij.psi.PsiParameter p0) { return null; }
    public static void checkIsIdentifier(com.intellij.psi.PsiManager p0, java.lang.String p1) throws com.intellij.util.IncorrectOperationException { }
    public static com.intellij.openapi.vfs.VirtualFile getJarFile(com.intellij.psi.PsiElement p0) { return null; }
    public static boolean isAnnotationMethod(com.intellij.psi.PsiElement p0) { return false; }
    public static java.lang.String getMaximumModifierForMember(com.intellij.psi.PsiClass p0) { return null; }
    public static java.lang.String getMaximumModifierForMember(com.intellij.psi.PsiClass p0, boolean p1) { return null; }
    public static java.util.Iterator<com.intellij.psi.PsiTypeParameter> typeParametersIterator(com.intellij.psi.PsiTypeParameterListOwner p0) { return null; }
    public static boolean canBeOverriden(com.intellij.psi.PsiMethod p0) { return false; }
    public static com.intellij.psi.PsiElement[] mapElements(com.intellij.psi.ResolveResult[] p0) { return null; }
    public static com.intellij.psi.PsiMember findEnclosingConstructorOrInitializer(com.intellij.psi.PsiElement p0) { return null; }
    public static boolean checkName(com.intellij.psi.PsiElement p0, java.lang.String p1, com.intellij.psi.PsiElement p2) { return false; }
    public static boolean isRawSubstitutor(com.intellij.psi.PsiTypeParameterListOwner p0, com.intellij.psi.PsiSubstitutor p1) { return false; }
    public static boolean isLanguageLevel5OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isLanguageLevel6OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isLanguageLevel7OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isLanguageLevel8OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isLanguageLevel9OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isLanguageLevel10OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isLanguageLevel11OrHigher(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isAvailable(com.intellij.pom.java.JavaFeature p0, com.intellij.psi.PsiElement p1) { return false; }
    public static boolean isInstantiatable(com.intellij.psi.PsiClass p0) { return false; }
    public static boolean hasDefaultConstructor(com.intellij.psi.PsiClass p0) { return false; }
    public static boolean hasDefaultConstructor(com.intellij.psi.PsiClass p0, boolean p1) { return false; }
    public static boolean hasDefaultConstructor(com.intellij.psi.PsiClass p0, boolean p1, boolean p2) { return false; }
    public static com.intellij.psi.PsiType extractIterableTypeParameter(com.intellij.psi.PsiType p0, boolean p1) { return null; }
    public static com.intellij.psi.PsiType substituteTypeParameter(com.intellij.psi.PsiType p0, java.lang.String p1, int p2, boolean p3) { return null; }
    public static void setModifierProperty(com.intellij.psi.PsiModifierListOwner p0, java.lang.String p1, boolean p2) { }
    public static boolean isTryBlock(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isElseBlock(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isJavaToken(com.intellij.psi.PsiElement p0, com.intellij.psi.tree.IElementType p1) { return false; }
    public static boolean isJavaToken(com.intellij.psi.PsiElement p0, com.intellij.psi.tree.TokenSet p1) { return false; }
    public static boolean isCatchParameter(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isIgnoredName(java.lang.String p0) { return false; }
    public static com.intellij.psi.PsiMethod[] getResourceCloserMethodsForType(com.intellij.psi.PsiClassType p0) { return null; }
    public static com.intellij.psi.PsiMethod getResourceCloserMethod(com.intellij.psi.PsiResourceListElement p0) { return null; }
    public static com.intellij.psi.PsiMethod getResourceCloserMethod(com.intellij.psi.PsiResourceVariable p0) { return null; }
    public static com.intellij.psi.PsiMethod getResourceCloserMethodForType(com.intellij.psi.PsiClassType p0) { return null; }
    public static com.intellij.psi.PsiExpression skipParenthesizedExprDown(com.intellij.psi.PsiExpression p0) { return null; }
    public static com.intellij.psi.PsiElement skipParenthesizedExprUp(com.intellij.psi.PsiElement p0) { return null; }
    public static java.lang.String getMemberQualifiedName(com.intellij.psi.PsiMember p0) { return null; }
    public static boolean isFromDefaultPackage(com.intellij.psi.PsiClass p0) { return false; }
    public static boolean isFromDefaultPackage(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isCondition(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return false; }
    public static com.intellij.psi.PsiReturnStatement[] findReturnStatements(com.intellij.psi.PsiMethod p0) { return null; }
    public static com.intellij.psi.PsiReturnStatement[] findReturnStatements(com.intellij.psi.PsiCodeBlock p0) { return null; }
    public static boolean isPackageEmpty(com.intellij.psi.PsiDirectory[] p0, java.lang.String p1) { return false; }
    public static com.intellij.psi.PsiModifierListOwner preferCompiledElement(com.intellij.psi.PsiModifierListOwner p0) { return null; }
    public static boolean isModuleFile(com.intellij.psi.PsiFile p0) { return false; }
    public static boolean isArrayClass(com.intellij.psi.PsiElement p0) { return false; }
    public static boolean isJvmLocalVariable(com.intellij.psi.PsiElement p0) { return false; }
    public static java.util.List<com.intellij.psi.PsiType> substituteTypeParameters(com.intellij.psi.PsiType p0, com.intellij.psi.PsiClass p1, boolean p2) { return null; }
    public static com.intellij.psi.PsiClassType.ClassResolveResult captureTopLevelWildcards(com.intellij.psi.PsiClassType.ClassResolveResult p0) { return null; }
    public static boolean isInMarkdownDocComment(com.intellij.psi.PsiElement p0) { return false; }
    @SuppressWarnings("all")
    public static interface ApplicabilityChecker {
        public static final com.intellij.psi.util.PsiUtil.ApplicabilityChecker ASSIGNABILITY_CHECKER = null;
        public boolean isApplicable(com.intellij.psi.PsiType p0, com.intellij.psi.PsiType p1, boolean p2, int p3);
    }
}
