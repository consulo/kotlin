package consulo.kotlin.compat.psi;

import consulo.application.util.function.Processor;
import consulo.index.io.IdIterator;
import consulo.language.psi.scope.GlobalSearchScope;
import consulo.language.psi.stub.StubIndex;
import consulo.language.psi.stub.StubIndexKey;
import consulo.project.Project;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.VirtualFileManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** {@code StubIndex} methods of IntelliJ that Consulo has under another shape. */
public final class StubIndexCompat {
    private StubIndexCompat() {
    }

    /** The files in {@code scope} with stubs indexed under {@code dataKey}. */
    public static <K> Iterator<VirtualFile> getContainingFilesIterator(StubIndex index, StubIndexKey<K, ?> indexKey, K dataKey,
                                                                       Project project, GlobalSearchScope scope) {
        IdIterator ids = index.getContainingIds(indexKey, dataKey, project, scope);
        VirtualFileManager fileManager = VirtualFileManager.getInstance();
        List<VirtualFile> files = new ArrayList<>(ids.size());
        while (ids.hasNext()) {
            VirtualFile file = fileManager.findFileById(ids.next());
            if (file != null && scope.contains(file)) {
                files.add(file);
            }
        }
        return files.iterator();
    }

    /** IntelliJ's processAllKeys(key, processor, scope): Consulo's takes an id filter too. */
    public static <K> boolean processAllKeys(StubIndex index, StubIndexKey<K, ?> indexKey, Processor<? super K> processor, GlobalSearchScope scope) {
        return index.processAllKeys(indexKey, processor, scope, null);
    }
}
