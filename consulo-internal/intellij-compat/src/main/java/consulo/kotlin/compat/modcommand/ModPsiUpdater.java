package consulo.kotlin.compat.modcommand;

import consulo.language.psi.PsiElement;

/**
 * IntelliJ's {@code ModPsiUpdater}: IntelliJ applies a ModCommand fix to a copy of the file and diffs it; Consulo applies
 * quick fixes to the file itself, so the writable copy of an element is the element.
 */
public interface ModPsiUpdater {
    default <E extends PsiElement> E getWritable(E element) {
        return element;
    }

    default void moveCaretTo(int offset) {
    }

    default void moveCaretTo(PsiElement element) {
    }

    ModPsiUpdater DIRECT = new ModPsiUpdater() {
    };
}
