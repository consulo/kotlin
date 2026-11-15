package com.intellij.openapi.application;

// consulo.kotlin.compat.search.QueryExecutorBase
@SuppressWarnings("all")
public abstract class QueryExecutorBase<Result, Params> implements com.intellij.openapi.application.util.query.QueryExecutor<Result, Params> {
    protected QueryExecutorBase(boolean requireReadAction) { }
    protected QueryExecutorBase() { }
    public boolean execute(Params queryParameters, java.util.function.Predicate<? super Result> consumer) { return false; }
    public abstract void processQuery(Params queryParameters, com.intellij.util.Processor<? super Result> consumer);
}
