package consulo.kotlin.compat.search;

import consulo.application.util.function.Processor;

import java.util.function.Predicate;

/**
 * IntelliJ {@code QueryExecutorBase}: implementations process with a {@link Processor}; Consulo's passes a
 * {@link Predicate}.
 */
public abstract class QueryExecutorBase<Result, Params> extends consulo.project.util.query.QueryExecutorBase<Result, Params> {
    protected QueryExecutorBase() {
    }

    protected QueryExecutorBase(boolean requireReadAction) {
        super(requireReadAction);
    }

    @Override
    public final void processQuery(Params queryParameters, Predicate<? super Result> consumer) {
        processQuery(queryParameters, SearchCompat.<Result>asProcessor(consumer));
    }

    public abstract void processQuery(Params queryParameters, Processor<? super Result> consumer);
}
