package consulo.kotlin.compat.intention;

import consulo.codeEditor.Editor;
import consulo.language.psi.PsiFile;
import consulo.project.Project;

/** IntelliJ {@code AbstractEmptyIntentionAction}: an intention that only names something; it does nothing. */
public abstract class AbstractEmptyIntentionAction implements IntentionAction {
    @Override
    public final void invoke(Project project, Editor editor, PsiFile file) {
    }

    @Override
    public final boolean startInWriteAction() {
        return false;
    }
}
