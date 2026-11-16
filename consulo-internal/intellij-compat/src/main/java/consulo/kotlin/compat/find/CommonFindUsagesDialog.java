package consulo.kotlin.compat.find;

import consulo.find.FindUsagesHandler;
import consulo.find.FindUsagesOptions;
import consulo.language.psi.PsiElement;
import consulo.project.Project;
import consulo.ui.ex.awt.StateRestoringCheckBox;
import consulo.ui.ex.awtUnsafe.TargetAWT;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * IntelliJ's {@code CommonFindUsagesDialog}: its options are Swing {@link StateRestoringCheckBox}es with string labels,
 * Consulo's are UI checkbox wrappers with localized labels.
 */
public class CommonFindUsagesDialog extends consulo.find.ui.CommonFindUsagesDialog {
    /** IntelliJ's name of the handler (Consulo's {@code myHandler}) */
    protected FindUsagesHandler myUsagesHandler;
    /** IntelliJ's "skip results when one usage" checkbox as a Swing component, e.g. to focus */
    protected JComponent myCbToSkipResultsWhenOneUsage;

    public CommonFindUsagesDialog(PsiElement element,
                                  Project project,
                                  FindUsagesOptions findUsagesOptions,
                                  boolean toShowInNewTab,
                                  boolean mustOpenInNewTab,
                                  boolean isSingleFile,
                                  FindUsagesHandler handler) {
        super(element, project, findUsagesOptions, toShowInNewTab, mustOpenInNewTab, isSingleFile, rememberHandler(handler));
    }

    // Consulo's constructor calls init() and keeps the handler private: init() takes it from here
    private static final ThreadLocal<FindUsagesHandler> CONSTRUCTING_HANDLER = new ThreadLocal<>();

    private static FindUsagesHandler rememberHandler(FindUsagesHandler handler) {
        CONSTRUCTING_HANDLER.set(handler);
        return handler;
    }

    @Override
    protected void init() {
        // Consulo's constructor calls init(), so the IntelliJ names are set here rather than in the constructor
        FindUsagesHandler handler = CONSTRUCTING_HANDLER.get();
        if (handler != null) {
            myUsagesHandler = handler;
            CONSTRUCTING_HANDLER.remove();
        }
        super.init();
        consulo.ui.ex.StateRestoringCheckBoxWrapper skip = super.myCbToSkipResultsWhenOneUsage;
        myCbToSkipResultsWhenOneUsage = skip == null ? null : (JComponent) TargetAWT.to(skip.getComponent());
    }

    protected StateRestoringCheckBox addCheckboxToPanel(String text, boolean toSelect, JPanel panel, boolean toUpdate) {
        StateRestoringCheckBox checkBox = createCheckbox(text, toSelect, toUpdate);
        panel.add(checkBox);
        return checkBox;
    }

    protected StateRestoringCheckBox createCheckbox(String text, boolean toSelect, boolean toUpdate) {
        StateRestoringCheckBox checkBox = new StateRestoringCheckBox(text, toSelect);
        if (toUpdate) {
            checkBox.addItemListener(e -> update());
        }
        return checkBox;
    }

    protected static boolean isToChange(StateRestoringCheckBox cb) {
        return cb != null && cb.getParent() != null;
    }

    protected static boolean isSelected(StateRestoringCheckBox cb) {
        return cb != null && cb.getParent() != null && cb.isSelected();
    }
}
