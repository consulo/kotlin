package com.intellij.util;

@SuppressWarnings("all")
public interface Function<Param, Result> {
    Result fun(Param param);
}
