package com.intellij.psi.tree;
@SuppressWarnings("all")
public abstract class IReparseableElementType extends ILazyParseableElementType {
    public IReparseableElementType(String debugName) { super(debugName); }
    public IReparseableElementType(String debugName, com.intellij.lang.Language language) { super(debugName, language); }
}
