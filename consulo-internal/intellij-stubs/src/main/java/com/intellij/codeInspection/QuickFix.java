package com.intellij.codeInspection;

// IntelliJ shape of consulo.language.editor.inspection.QuickFix: names are strings (LocalizeValue bridges in remap.xml)
@SuppressWarnings("all")
public interface QuickFix<D extends com.intellij.codeInspection.CommonProblemDescriptor> extends com.intellij.codeInspection.WriteActionAware {
    public default java.lang.String getName() { return getFamilyName(); }
    public java.lang.String getFamilyName();
    public void applyFix(com.intellij.openapi.project.Project project, D descriptor);
}
