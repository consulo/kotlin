package consulo.kotlin.compat.intention;

import consulo.language.editor.FileModificationService;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;

/** IntelliJ {@code IntentionPreviewUtils}: Consulo has no intention preview, so intentions always run on the real file. */
public final class IntentionPreviewUtils {
    private IntentionPreviewUtils() {
    }

    public static boolean isIntentionPreviewActive() {
        return false;
    }

    public static boolean prepareElementForWrite(PsiElement element) {
        return FileModificationService.getInstance().preparePsiElementForWrite(element);
    }

    public static PsiFile getOriginalFile(PsiFile file) {
        return file;
    }
}
