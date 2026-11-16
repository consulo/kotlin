package consulo.kotlin.compat.modcommand;

import consulo.language.editor.inspection.ProblemDescriptor;
import consulo.language.psi.PsiElement;
import consulo.project.Project;

/**
 * IntelliJ's {@code PsiUpdateModCommandQuickFix} as a Consulo quick fix applied in place: remap.xml adds Consulo's
 * {@code LocalQuickFix} and its {@code LocalizeValue getName()} (from this {@code String getName()}), which Java cannot
 * declare next to each other.
 */
public abstract class PsiUpdateModCommandQuickFix {
    public abstract String getFamilyName();

    public String getName() {
        return getFamilyName();
    }

    public boolean startInWriteAction() {
        return true;
    }

    public final void applyFix(Project project, ProblemDescriptor descriptor) {
        PsiElement element = descriptor.getStartElement();
        if (element != null && element.isValid()) {
            applyFix(project, element, ModPsiUpdater.DIRECT);
        }
    }

    protected abstract void applyFix(Project project, PsiElement element, ModPsiUpdater updater);
}
