package consulo.kotlin.compat.modcommand;

import consulo.codeEditor.Editor;
import consulo.language.editor.inspection.LocalQuickFixAndIntentionActionOnPsiElement;
import consulo.language.editor.refactoring.RefactoringFactory;
import consulo.language.editor.refactoring.localize.RefactoringLocalize;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.localize.LocalizeValue;
import consulo.project.Project;

/** IntelliJ's {@code ModPlanSafeDeleteFix}: Consulo's safe delete refactoring of the element (the options are IntelliJ's). */
public class ModPlanSafeDeleteFix extends LocalQuickFixAndIntentionActionOnPsiElement {
    public ModPlanSafeDeleteFix(PsiElement element, ModPlanOptionValues options) {
        super(element);
    }

    @Override
    public LocalizeValue getText() {
        return RefactoringLocalize.safeDeleteTitle();
    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }

    @Override
    public void invoke(Project project, PsiFile file, Editor editor, PsiElement startElement, PsiElement endElement) {
        RefactoringFactory.getInstance(project).createSafeDelete(new PsiElement[]{startElement}).run();
    }
}
