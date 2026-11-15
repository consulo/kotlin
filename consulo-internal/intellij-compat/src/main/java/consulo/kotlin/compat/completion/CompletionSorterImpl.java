package consulo.kotlin.compat.completion;

import consulo.language.editor.completion.CompletionSorter;

import java.util.function.Predicate;

/**
 * IntelliJ's sorter implementation, which upstream checks for to drop a weigher. Consulo's is internal, so no sorter is
 * one and the default sorter is kept.
 */
public abstract class CompletionSorterImpl extends CompletionSorter {
    private CompletionSorterImpl() {
    }

    @SuppressWarnings("rawtypes")
    public abstract CompletionSorterImpl withoutClassifiers(Predicate removeCondition);
}
