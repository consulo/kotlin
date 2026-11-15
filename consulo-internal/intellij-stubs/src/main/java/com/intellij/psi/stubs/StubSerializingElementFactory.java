package com.intellij.psi.stubs;
@SuppressWarnings("all")
public interface StubSerializingElementFactory<Stub extends StubElement<?>, Psi extends com.intellij.psi.PsiElement>
        extends StubSerializer<Stub>, StubElementFactory<Stub, Psi> {
}
