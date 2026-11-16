package consulo.kotlin.compat.codeStyle;

/**
 * IntelliJ's code style property accessor, which exports a code style setting (e.g. to .editorconfig). Consulo has no
 * such export, so nothing reads them; upstream code style providers still declare theirs.
 */
public abstract class CodeStylePropertyAccessor<V> {
    public abstract boolean set(V extVal);

    public abstract V get();

    public abstract V parseString(String string);

    public abstract String valueToString(V value);

    public abstract String getPropertyName();
}
