package com.intellij.psi;

@SuppressWarnings("all")
public class PsiTypeVisitor<A> {
    public A visitType(com.intellij.psi.PsiType type) { return null; }
    public A visitPrimitiveType(com.intellij.psi.PsiPrimitiveType primitiveType) { return visitType(primitiveType); }
    public A visitArrayType(com.intellij.psi.PsiArrayType arrayType) { return visitType(arrayType); }
    public A visitClassType(com.intellij.psi.PsiClassType classType) { return visitType(classType); }
    public A visitCapturedWildcardType(com.intellij.psi.PsiCapturedWildcardType capturedWildcardType) { return visitWildcardType(capturedWildcardType.getWildcard()); }
    public A visitWildcardType(com.intellij.psi.PsiWildcardType wildcardType) { return visitType(wildcardType); }
    public A visitEllipsisType(com.intellij.psi.PsiEllipsisType ellipsisType) { return visitArrayType(ellipsisType); }
    public A visitDisjunctionType(com.intellij.psi.PsiDisjunctionType disjunctionType) { return visitType(disjunctionType); }
    public A visitIntersectionType(com.intellij.psi.PsiIntersectionType intersectionType) { return visitType(intersectionType); }
    public A visitLambdaExpressionType(com.intellij.psi.PsiLambdaExpressionType lambdaExpressionType) { return visitType(lambdaExpressionType); }
    public A visitMethodReferenceType(com.intellij.psi.PsiMethodReferenceType methodReferenceType) { return visitType(methodReferenceType); }
}
