package com.intellij.psi.util;

@SuppressWarnings("all")
public class TypeConversionUtil {
    public static com.intellij.psi.PsiSubstitutor getSuperClassSubstitutor(com.intellij.psi.PsiClass superClass, com.intellij.psi.PsiClass derivedClass, com.intellij.psi.PsiSubstitutor derivedSubstitutor) { return null; }
    public static boolean isAssignable(com.intellij.psi.PsiType left, com.intellij.psi.PsiType right) { return false; }
    public static com.intellij.psi.PsiType erasure(com.intellij.psi.PsiType t) { return null; }
    public static boolean isPrimitive(String s) { return false; }
    public static boolean isPrimitiveAndNotNull(com.intellij.psi.PsiType t) { return false; }
    public static boolean isPrimitiveAndNotNullOrWrapper(com.intellij.psi.PsiType t) { return false; }
    public static boolean isBooleanType(com.intellij.psi.PsiType t) { return false; }
    public static boolean isNumericType(com.intellij.psi.PsiType t) { return false; }
    public static boolean isIntegralNumberType(com.intellij.psi.PsiType t) { return false; }
    public static boolean isEnumType(com.intellij.psi.PsiType t) { return false; }
    public static boolean isNullType(com.intellij.psi.PsiType t) { return false; }
    public static boolean areTypesAssignmentCompatible(com.intellij.psi.PsiType left, com.intellij.psi.PsiExpression right) { return false; }
    public static com.intellij.psi.PsiType binaryNumericPromotion(com.intellij.psi.PsiType left, com.intellij.psi.PsiType right) { return null; }
    public static com.intellij.psi.PsiType unboxAndBalanceTypes(com.intellij.psi.PsiType type1, com.intellij.psi.PsiType type2) { return null; }
    public static com.intellij.psi.PsiType calcTypeForBinaryExpression(com.intellij.psi.PsiType lType, com.intellij.psi.PsiType rType, com.intellij.psi.tree.IElementType sign, boolean accessLType) { return null; }
}
