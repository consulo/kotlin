package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiConstantEvaluationHelper {
    Object computeConstantExpression(com.intellij.psi.PsiElement expression);
    Object computeConstantExpression(com.intellij.psi.PsiElement expression, boolean throwExceptionOnOverflow);
    Object computeExpression(com.intellij.psi.PsiElement expression, boolean throwExceptionOnOverflow, AuxEvaluator auxEvaluator);
    interface AuxEvaluator { Object computeExpression(com.intellij.psi.PsiElement expression, AuxEvaluator auxEvaluator); }
}
