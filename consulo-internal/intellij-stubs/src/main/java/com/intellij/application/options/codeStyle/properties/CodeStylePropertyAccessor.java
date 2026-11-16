package com.intellij.application.options.codeStyle.properties;

public abstract class CodeStylePropertyAccessor<V> {
    public abstract boolean set(V extVal);

    public abstract V get();

    public abstract V parseString(String string);

    public abstract String valueToString(V value);

    public abstract String getPropertyName();
}
