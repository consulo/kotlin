package org.jetbrains.uast;

// compile-time only (see UElement)
@SuppressWarnings("all")
public interface UParameter extends UElement {
    UExpression getUastInitializer();
    boolean isVarArgs();
}
