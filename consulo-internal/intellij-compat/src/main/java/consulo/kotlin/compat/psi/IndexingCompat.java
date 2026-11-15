package consulo.kotlin.compat.psi;

import consulo.index.io.ID;
import consulo.language.psi.scope.GlobalSearchScope;
import consulo.language.psi.stub.FileBasedIndex;
import consulo.virtualFileSystem.VirtualFile;

import java.util.Iterator;

/** IntelliJ indexing API that Consulo does not define. */
public final class IndexingCompat {
    private IndexingCompat() {
    }

    /** IntelliJ {@code FileBasedIndex.getContainingFilesIterator(indexId, dataKey, scope)}. */
    public static <K, V> Iterator<VirtualFile> getContainingFilesIterator(FileBasedIndex index, ID<K, V> indexId, K dataKey, GlobalSearchScope scope) {
        return index.getContainingFiles(indexId, dataKey, scope).iterator();
    }

    /** IntelliJ {@code FileBasedIndexExtension.USE_FORWARD_INDEX_FOR_KEYS_FILTERING}: Consulo filters keys by file via the forward index. */
    public static boolean useForwardIndexForKeysFiltering() {
        return true;
    }
}
