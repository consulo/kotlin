package com.intellij.find.findUsages;

// consulo.kotlin.compat.find.CommonFindUsagesDialog
@SuppressWarnings("all")
public class CommonFindUsagesDialog extends com.intellij.find.findUsages.AbstractFindUsagesDialog {
    protected com.intellij.psi.PsiElement myPsiElement;
    protected com.intellij.find.findUsages.FindUsagesHandler myUsagesHandler;
    protected javax.swing.JComponent myCbToSkipResultsWhenOneUsage;
    public CommonFindUsagesDialog(com.intellij.psi.PsiElement element, com.intellij.openapi.project.Project project, com.intellij.find.findUsages.FindUsagesOptions findUsagesOptions, boolean toShowInNewTab, boolean mustOpenInNewTab, boolean isSingleFile, com.intellij.find.findUsages.FindUsagesHandler handler) { }
    protected void init() { }
    protected javax.swing.JPanel createFindWhatPanel() { return null; }
    public void configureLabelComponent(com.intellij.ui.SimpleColoredComponent coloredComponent) { }
    protected com.intellij.ui.StateRestoringCheckBox addCheckboxToPanel(String text, boolean toSelect, javax.swing.JPanel panel, boolean toUpdate) { return null; }
    protected com.intellij.ui.StateRestoringCheckBox createCheckbox(String text, boolean toSelect, boolean toUpdate) { return null; }
    protected static boolean isToChange(com.intellij.ui.StateRestoringCheckBox cb) { return false; }
    protected static boolean isSelected(com.intellij.ui.StateRestoringCheckBox cb) { return false; }
    // Inherited abstract members (genstub.py)
    public boolean canBeHidden() { return false; }
    public boolean isToBeShown() { return false; }
    public boolean shouldSaveOptionsOnCancel() { return false; }
    public void setToBeShown(boolean p0, int p1) { }
}
