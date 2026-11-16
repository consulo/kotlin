package consulo.kotlin.compat.find;

import com.intellij.java.analysis.impl.find.findUsages.JavaClassFindUsagesOptions;
import com.intellij.java.language.psi.PsiClass;
import com.intellij.java.language.psi.PsiModifier;
import consulo.find.FindUsagesHandler;
import consulo.find.FindUsagesOptions;
import consulo.find.localize.FindLocalize;
import consulo.language.psi.PsiElement;
import consulo.project.Project;
import consulo.ui.ex.StateRestoringCheckBoxWrapper;
import consulo.ui.ex.awt.StateRestoringCheckBox;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/** IntelliJ's {@code FindClassUsagesDialog}, on Consulo's Swing find usages dialog. */
public class FindClassUsagesDialog extends JavaFindUsagesDialog<JavaClassFindUsagesOptions> {
    private StateRestoringCheckBox myCbUsages;
    private StateRestoringCheckBox myCbMethodsUsages;
    private StateRestoringCheckBox myCbFieldsUsages;
    private StateRestoringCheckBox myCbImplementingClasses;
    private StateRestoringCheckBox myCbDerivedInterfaces;
    private StateRestoringCheckBox myCbDerivedClasses;

    public FindClassUsagesDialog(PsiElement element, Project project, FindUsagesOptions findUsagesOptions, boolean toShowInNewTab,
                                 boolean mustOpenInNewTab, boolean isSingleFile, FindUsagesHandler handler) {
        super(element, project, findUsagesOptions, toShowInNewTab, mustOpenInNewTab, isSingleFile, handler);
    }

    @Override
    public JComponent getPreferredFocusedControl() {
        return myCbUsages;
    }

    @Override
    public void calcFindUsagesOptions(JavaClassFindUsagesOptions options) {
        super.calcFindUsagesOptions(options);

        if (isToChange(myCbUsages)) {
            options.isUsages = isSelected(myCbUsages);
        }
        if (isToChange(myCbMethodsUsages)) {
            options.isMethodsUsages = isSelected(myCbMethodsUsages);
        }
        if (isToChange(myCbFieldsUsages)) {
            options.isFieldsUsages = isSelected(myCbFieldsUsages);
        }
        if (isToChange(myCbDerivedClasses)) {
            options.isDerivedClasses = isSelected(myCbDerivedClasses);
        }
        if (isToChange(myCbImplementingClasses)) {
            options.isImplementingClasses = isSelected(myCbImplementingClasses);
        }
        if (isToChange(myCbDerivedInterfaces)) {
            options.isDerivedInterfaces = isSelected(myCbDerivedInterfaces);
        }
        options.isSkipImportStatements = false;
        options.isCheckDeepInheritance = true;
        options.isIncludeInherited = false;
    }

    @Override
    protected JPanel createFindWhatPanel() {
        JPanel findWhatPanel = new JPanel();
        findWhatPanel.setLayout(new BoxLayout(findWhatPanel, BoxLayout.Y_AXIS));

        JavaClassFindUsagesOptions options = getFindUsagesOptions();
        myCbUsages = addCheckboxToPanel(FindLocalize.findWhatUsagesCheckbox().get(), options.isUsages, findWhatPanel, true);

        PsiClass psiClass = (PsiClass) getPsiElement();
        myCbMethodsUsages = addCheckboxToPanel(FindLocalize.findWhatMethodsUsagesCheckbox().get(), options.isMethodsUsages, findWhatPanel, true);

        if (!psiClass.isAnnotationType()) {
            myCbFieldsUsages = addCheckboxToPanel(FindLocalize.findWhatFieldsUsagesCheckbox().get(), options.isFieldsUsages, findWhatPanel, true);
            if (psiClass.isInterface()) {
                myCbImplementingClasses =
                    addCheckboxToPanel(FindLocalize.findWhatImplementingClassesCheckbox().get(), options.isImplementingClasses, findWhatPanel, true);
                myCbDerivedInterfaces =
                    addCheckboxToPanel(FindLocalize.findWhatDerivedInterfacesCheckbox().get(), options.isDerivedInterfaces, findWhatPanel, true);
            }
            else if (!psiClass.hasModifierProperty(PsiModifier.FINAL)) {
                myCbDerivedClasses =
                    addCheckboxToPanel(FindLocalize.findWhatDerivedClassesCheckbox().get(), options.isDerivedClasses, findWhatPanel, true);
            }
        }
        return findWhatPanel;
    }

    @Override
    protected void update() {
        StateRestoringCheckBoxWrapper searchForTextOccurrences = myCbToSearchForTextOccurrences;
        if (searchForTextOccurrences != null) {
            if (isSelected(myCbUsages)) {
                searchForTextOccurrences.makeSelectable();
            }
            else {
                searchForTextOccurrences.makeUnselectable(false);
            }
        }

        boolean hasSelected = isSelected(myCbUsages) ||
            isSelected(myCbMethodsUsages) ||
            isSelected(myCbFieldsUsages) ||
            isSelected(myCbDerivedClasses) ||
            isSelected(myCbImplementingClasses) ||
            isSelected(myCbDerivedInterfaces);
        setOKActionEnabled(hasSelected);
    }

    protected void updateStateOnUsagesStateChange(StateRestoringCheckBox dependantCb) {
        if (isSelected(myCbUsages)) {
            dependantCb.makeSelectable();
        }
        else {
            dependantCb.makeUnselectable(false);
        }
    }
}
