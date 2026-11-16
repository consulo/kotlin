package consulo.kotlin.compat.search;

import consulo.application.util.function.Processor;

import java.util.function.Predicate;

/** IntelliJ {@code QueryExecutor}: implementations process with a {@link Processor}; Consulo's passes a {@link Predicate}. */
public interface QueryExecutor<Result, Param> extends consulo.application.util.query.QueryExecutor<Result, Param> {
    boolean execute(Param queryParameters, Processor<? super Result> consumer);

    @Override
    default boolean execute(Param queryParameters, Predicate<? super Result> consumer) {
        return execute(queryParameters, SearchCompat.<Result>asProcessor(consumer));
    }
}
