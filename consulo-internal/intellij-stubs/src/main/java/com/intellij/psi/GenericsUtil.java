package com.intellij.psi;

@SuppressWarnings("all")
public final class GenericsUtil {
    public static PsiType getVariableTypeByExpressionType(PsiType type) { return type; }
    public static PsiType getVariableTypeByExpressionType(PsiType type, boolean openCaptured) { return type; }
    public static PsiType getLeastUpperBound(PsiType type1, PsiType type2, PsiManager manager) { return null; }
    public static PsiType eliminateWildcards(PsiType type) { return type; }
}
