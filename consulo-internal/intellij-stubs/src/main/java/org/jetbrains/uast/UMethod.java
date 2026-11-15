package org.jetbrains.uast;

// compile-time only (see UElement)
@SuppressWarnings("all")
public interface UMethod extends UElement {
    java.util.List<UParameter> getUastParameters();
}
