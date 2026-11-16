package com.intellij.application.options.codeStyle.properties;

import java.lang.reflect.Field;
import java.util.List;

public abstract class ValueListPropertyAccessor<T> extends CodeStyleFieldAccessor<T, List<String>> {
    public ValueListPropertyAccessor(Object object, Field field) {
        super(object, field);
    }

    @Override
    public List<String> parseString(String string) {
        return CodeStylePropertiesUtil.getValueList(string);
    }

    @Override
    public String valueToString(List<String> value) {
        return CodeStylePropertiesUtil.toCommaSeparatedString(value);
    }

    public boolean isEmptyListAllowed() {
        return true;
    }
}
