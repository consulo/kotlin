package com.intellij.psi.tree;
@SuppressWarnings("all")
public class StubFileElementType<T extends com.intellij.psi.stubs.PsiFileStub> extends com.intellij.psi.tree.IFileElementType {
    public StubFileElementType(com.intellij.lang.Language language) { super("stub.file", language); }
    public StubFileElementType(String debugName, com.intellij.lang.Language language) { super(debugName, language); }
    public int getStubVersion() { return 0; }
    public String getExternalId() { return null; }
}
