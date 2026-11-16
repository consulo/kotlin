package com.intellij.util;

// consulo.kotlin.compat.search.QueryExecutor: IntelliJ's processor variant over Consulo's predicate one
@SuppressWarnings("all")
public interface QueryExecutor<Result extends java.lang.Object, Param extends java.lang.Object> extends com.intellij.openapi.application.util.query.QueryExecutor<Result, Param> {
    public boolean execute(Param p0, com.intellij.util.Processor<? super Result> p1);
    public default boolean execute(Param p0, java.util.function.Predicate<? super Result> p1) { return false; }
}
