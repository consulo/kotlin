package consulo.kotlin.compat.uast;

/** IntelliJ's UAST service. Consulo has no UAST, so it is never registered and callers take their non-UAST path. */
public interface UastContext {
}
