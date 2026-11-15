package consulo.kotlin.compat.search;

import consulo.application.util.function.Processor;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiReference;

import java.util.function.Predicate;

/**
 * IntelliJ {@code RequestResultProcessor}: implementations process with a {@link Processor}; Consulo's passes a
 * {@link Predicate}.
 */
public abstract class RequestResultProcessor extends consulo.language.psi.search.RequestResultProcessor {
    protected RequestResultProcessor(Object... equality) {
        super(equality);
    }

    @Override
    public final boolean processTextOccurrence(PsiElement element, int offsetInElement, Predicate<? super PsiReference> consumer) {
        return processTextOccurrence(element, offsetInElement, SearchCompat.<PsiReference>asProcessor(consumer));
    }

    public abstract boolean processTextOccurrence(PsiElement element, int offsetInElement, Processor<? super PsiReference> consumer);
}
