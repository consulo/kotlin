package consulo.kotlin.compat.search;

import consulo.application.util.function.Processor;

import java.util.function.Predicate;

/** IntelliJ {@code AbstractQuery}: implementations process with a {@link Processor}; Consulo's passes a {@link Predicate}. */
public abstract class AbstractQuery<Result> extends consulo.application.util.query.AbstractQuery<Result> {
    @Override
    protected final boolean processResults(Predicate<? super Result> consumer) {
        return processResults(SearchCompat.<Result>asProcessor(consumer));
    }

    protected abstract boolean processResults(Processor<? super Result> consumer);
}
