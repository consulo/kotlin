package consulo.kotlin.compat.find;

import com.intellij.java.analysis.impl.find.findUsages.JavaFindUsagesOptions;
import com.intellij.java.analysis.impl.find.findUsages.JavaMethodFindUsagesOptions;
import com.intellij.java.language.psi.PsiMethod;
import com.intellij.java.language.psi.util.MethodSignatureUtil;
import consulo.find.FindSettings;
import consulo.find.FindUsagesHandler;
import consulo.find.FindUsagesOptions;
import consulo.find.localize.FindLocalize;
import consulo.language.psi.PsiElement;
import consulo.project.Project;
import consulo.ui.ex.awt.StateRestoringCheckBox;

import javax.swing.JPanel;

/** IntelliJ's {@code JavaFindUsagesDialog}, on Consulo's Swing find usages dialog (see {@link CommonFindUsagesDialog}). */
public abstract class JavaFindUsagesDialog<T extends JavaFindUsagesOptions> extends CommonFindUsagesDialog {
    protected StateRestoringCheckBox myCbIncludeOverloadedMethods;
    private boolean myIncludeOverloadedMethodsAvailable;

    protected JavaFindUsagesDialog(PsiElement element,
                                   Project project,
                                   FindUsagesOptions findUsagesOptions,
                                   boolean toShowInNewTab,
                                   boolean mustOpenInNewTab,
                                   boolean isSingleFile,
                                   FindUsagesHandler handler) {
        super(element, project, findUsagesOptions, toShowInNewTab, mustOpenInNewTab, isSingleFile, handler);
    }

    @Override
    protected void init() {
        myIncludeOverloadedMethodsAvailable = isIncludeOverloadedMethodsAvailable();
        super.init();
    }

    public boolean isIncludeOverloadedMethodsAvailable() {
        return myPsiElement instanceof PsiMethod method && MethodSignatureUtil.hasOverloads(method);
    }

    public void calcFindUsagesOptions(T options) {
        if (options instanceof JavaMethodFindUsagesOptions methodOptions) {
            methodOptions.isIncludeOverloadUsages =
                myIncludeOverloadedMethodsAvailable && isToChange(myCbIncludeOverloadedMethods) && myCbIncludeOverloadedMethods.isSelected();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void calcFindUsagesOptions(FindUsagesOptions options) {
        super.calcFindUsagesOptions(options);
        calcFindUsagesOptions((T) options);
    }

    @Override
    protected void doOKAction() {
        if (!shouldDoOkAction()) {
            return;
        }
        if (myIncludeOverloadedMethodsAvailable && myCbIncludeOverloadedMethods != null) {
            FindSettings.getInstance().setSearchOverloadedMethods(myCbIncludeOverloadedMethods.isSelected());
        }
        super.doOKAction();
    }

    @Override
    protected void addUsagesOptions(JPanel optionsPanel) {
        if (myIncludeOverloadedMethodsAvailable) {
            myCbIncludeOverloadedMethods = addCheckboxToPanel(FindLocalize.findOptionsIncludeOverloadedMethodsCheckbox().get(),
                FindSettings.getInstance().isSearchOverloadedMethods(), optionsPanel, false);
        }
        addDefaultOptions(optionsPanel);
    }

    protected void addDefaultOptions(JPanel optionsPanel) {
        super.addUsagesOptions(optionsPanel);
    }

    protected final PsiElement getPsiElement() {
        return myPsiElement;
    }

    @SuppressWarnings("unchecked")
    protected T getFindUsagesOptions() {
        return (T) myFindUsagesOptions;
    }
}
