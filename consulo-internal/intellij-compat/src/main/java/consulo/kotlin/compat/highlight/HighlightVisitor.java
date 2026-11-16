package consulo.kotlin.compat.highlight;

import consulo.language.editor.rawHighlight.HighlightVisitorFactory;
import consulo.language.psi.PsiFile;

/**
 * IntelliJ {@code HighlightVisitor}: a visitor that says which files it highlights and clones itself per pass. In
 * Consulo the first is the job of a {@link HighlightVisitorFactory}, so an IntelliJ visitor is registered as its own
 * factory and creates its clones.
 */
public interface HighlightVisitor extends consulo.language.editor.rawHighlight.HighlightVisitor, HighlightVisitorFactory {
    @Override
    boolean suitableForFile(PsiFile file);

    HighlightVisitor clone();

    @Override
    default consulo.language.editor.rawHighlight.HighlightVisitor createVisitor() {
        return clone();
    }
}
