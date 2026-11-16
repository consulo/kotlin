package com.intellij.codeInspection;

// IntelliJ shape of consulo.language.editor.inspection.LocalQuickFix
@SuppressWarnings("all")
public interface LocalQuickFix extends com.intellij.codeInspection.QuickFix<com.intellij.codeInspection.ProblemDescriptor>, com.intellij.codeInsight.intention.FileModifier {
    public static final com.intellij.codeInspection.LocalQuickFix[] EMPTY_ARRAY = new com.intellij.codeInspection.LocalQuickFix[0];
}
