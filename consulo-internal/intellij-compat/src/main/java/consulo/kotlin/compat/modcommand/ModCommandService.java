package consulo.kotlin.compat.modcommand;

import consulo.kotlin.compat.intention.ModCommandAction;
import consulo.language.editor.inspection.LocalQuickFix;
import consulo.language.editor.inspection.ProblemDescriptor;
import consulo.language.psi.PsiElement;
import consulo.localize.LocalizeValue;
import consulo.project.Project;

/** IntelliJ's {@code ModCommandService}, as far as wrapping an action into a quick fix. */
public final class ModCommandService {
    private static final ModCommandService INSTANCE = new ModCommandService();

    public static ModCommandService getInstance() {
        return INSTANCE;
    }

    public LocalQuickFix wrapToQuickFix(ModCommandAction action) {
        return new LocalQuickFix() {
            @Override
            public LocalizeValue getName() {
                return action.getText();
            }

            @Override
            public boolean startInWriteAction() {
                return action.startInWriteAction();
            }

            @Override
            public void applyFix(Project project, ProblemDescriptor descriptor) {
                PsiElement element = descriptor.getPsiElement();
                if (element != null && element.isValid()) {
                    action.invoke(project, null, element.getContainingFile());
                }
            }
        };
    }
}
