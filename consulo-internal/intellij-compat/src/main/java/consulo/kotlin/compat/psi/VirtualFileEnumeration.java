package consulo.kotlin.compat.psi;

/**
 * Remap target of {@code com.intellij.psi.search.impl.VirtualFileEnumeration}: a scope listing its files by id. IntelliJ
 * uses it to speed up index queries; Consulo does not, so it is only a marker with the same methods.
 */
public interface VirtualFileEnumeration {
    boolean contains(int fileId);

    int[] asArray();
}
