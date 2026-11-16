package consulo.kotlin.compat.find;

import com.intellij.java.analysis.impl.find.findUsages.JavaMethodFindUsagesOptions;
import com.intellij.java.language.psi.PsiAnonymousClass;
import com.intellij.java.language.psi.PsiClass;
import com.intellij.java.language.psi.PsiMethod;
import com.intellij.java.language.psi.PsiModifier;
import consulo.find.FindUsagesHandler;
import consulo.find.FindUsagesOptions;
import consulo.find.localize.FindLocalize;
import consulo.language.psi.PsiElement;
import consulo.project.Project;
import consulo.ui.ex.awt.StateRestoringCheckBox;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/** IntelliJ's {@code FindMethodUsagesDialog}, on Consulo's Swing find usages dialog. */
public class FindMethodUsagesDialog extends JavaFindUsagesDialog<JavaMethodFindUsagesOptions> {
    private StateRestoringCheckBox myCbUsages;
    private StateRestoringCheckBox myCbImplementingMethods;
    private StateRestoringCheckBox myCbOverridingMethods;
    private boolean myHasFindWhatPanel;

    public FindMethodUsagesDialog(PsiElement element, Project project, FindUsagesOptions findUsagesOptions,
                                  boolean toShowInNewTab, boolean mustOpenInNewTab, boolean isSingleFile, FindUsagesHandler handler) {
        super(element, project, findUsagesOptions, toShowInNewTab, mustOpenInNewTab, isSingleFile, handler);
    }

    @Override
    public JComponent getPreferredFocusedControl() {
        return myHasFindWhatPanel ? myCbUsages : null;
    }

    @Override
    public void calcFindUsagesOptions(JavaMethodFindUsagesOptions options) {
        super.calcFindUsagesOptions(options);

        options.isUsages = isSelected(myCbUsages) || !myHasFindWhatPanel;
        if (isToChange(myCbOverridingMethods)) {
            options.isOverridingMethods = isSelected(myCbOverridingMethods);
        }
        if (isToChange(myCbImplementingMethods)) {
            options.isImplementingMethods = isSelected(myCbImplementingMethods);
        }
        options.isCheckDeepInheritance = true;
    }

    @Override
    protected JPanel createFindWhatPanel() {
        JPanel findWhatPanel = new JPanel();
        findWhatPanel.setLayout(new BoxLayout(findWhatPanel, BoxLayout.Y_AXIS));

        JavaMethodFindUsagesOptions options = getFindUsagesOptions();
        myCbUsages = addCheckboxToPanel(FindLocalize.findWhatUsagesCheckbox().get(), options.isUsages, findWhatPanel, true);

        PsiElement method = getPsiElement();
        if (noSpecificOptions(method)) {
            myHasFindWhatPanel = false;
            return null;
        }

        if (canSearchForImplementingMethods(method)) {
            myCbImplementingMethods =
                addCheckboxToPanel(FindLocalize.findWhatImplementingMethodsCheckbox().get(), options.isImplementingMethods, findWhatPanel, true);
        }
        else if (canSearchForOverridingMethods(method)) {
            myCbOverridingMethods =
                addCheckboxToPanel(FindLocalize.findWhatOverridingMethodsCheckbox().get(), options.isOverridingMethods, findWhatPanel, true);
        }

        myHasFindWhatPanel = true;
        return findWhatPanel;
    }

    protected boolean noSpecificOptions(PsiElement element) {
        return !(element instanceof PsiMethod method) || method.getContainingClass() == null;
    }

    protected boolean canSearchForOverridingMethods(PsiElement element) {
        if (!(element instanceof PsiMethod method)) {
            return false;
        }
        PsiClass aClass = method.getContainingClass();
        return aClass != null &&
            !(aClass instanceof PsiAnonymousClass) &&
            !aClass.hasModifierProperty(PsiModifier.FINAL) &&
            !method.isConstructor() &&
            !method.hasModifierProperty(PsiModifier.FINAL) &&
            !method.hasModifierProperty(PsiModifier.STATIC) &&
            !method.hasModifierProperty(PsiModifier.PRIVATE);
    }

    protected boolean canSearchForImplementingMethods(PsiElement element) {
        return element instanceof PsiMethod method && method.hasModifierProperty(PsiModifier.ABSTRACT);
    }

    protected boolean canSearchForBaseMethod(PsiElement element) {
        return element instanceof PsiMethod method &&
            !method.hasModifierProperty(PsiModifier.STATIC) &&
            !method.hasModifierProperty(PsiModifier.PRIVATE) &&
            !method.isConstructor();
    }

    @Override
    protected void update() {
        if (!myHasFindWhatPanel) {
            setOKActionEnabled(true);
        }
        else {
            setOKActionEnabled(isSelected(myCbUsages) ||
                isSelected(myCbImplementingMethods) ||
                isSelected(myCbOverridingMethods));
        }
    }
}
