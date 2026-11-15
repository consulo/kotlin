package consulo.kotlin.compat.psi;

import consulo.document.DocumentWindow;
import consulo.language.inject.InjectedLanguageManager;
import consulo.language.psi.PsiFile;

import java.util.List;

/** Remap target of {@code com.intellij.psi.impl.source.tree.injected.InjectedLanguageUtilBase}: the parts used. */
public final class InjectedLanguageUtilBase {
    private InjectedLanguageUtilBase() {
    }

    public static List<DocumentWindow> getCachedInjectedDocuments(PsiFile hostPsiFile) {
        return InjectedLanguageManager.getInstance(hostPsiFile.getProject())
            .getCachedInjectedDocumentsInRange(hostPsiFile, hostPsiFile.getTextRange());
    }
}
