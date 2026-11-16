package com.intellij.application.options.codeStyle.properties;

import java.lang.reflect.Field;
import java.util.Locale;

public abstract class CodeStyleFieldAccessor<T, V> extends CodeStylePropertyAccessor<V> {
    private final Object myObject;
    private final Field myField;

    public CodeStyleFieldAccessor(Object object, Field field) {
        myObject = object;
        myField = field;
    }

    @Override
    public boolean set(V extVal) {
        return false;
    }

    @Override
    public V get() {
        return null;
    }

    @Override
    public String getPropertyName() {
        return myField.getName().toLowerCase(Locale.ROOT);
    }

    protected abstract T fromExternal(V extVal);

    protected abstract V toExternal(T value);
}
