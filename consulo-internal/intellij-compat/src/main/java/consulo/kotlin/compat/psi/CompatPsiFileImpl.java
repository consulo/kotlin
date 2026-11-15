package consulo.kotlin.compat.psi;

import consulo.language.ast.IElementType;
import consulo.language.file.FileViewProvider;
import consulo.language.impl.ast.FileElement;
import consulo.language.impl.psi.PsiFileImpl;
import consulo.language.psi.stub.StubTree;
import consulo.util.lang.Pair;

/**
 * Remap target of {@code com.intellij.psi.impl.source.PsiFileImpl}: adds {@link #getStubTreeOrFileElement()}.
 */
public abstract class CompatPsiFileImpl extends PsiFileImpl {
    protected CompatPsiFileImpl(IElementType elementType, IElementType contentElementType, FileViewProvider provider) {
        super(elementType, contentElementType, provider);
    }

    protected CompatPsiFileImpl(FileViewProvider provider) {
        super(provider);
    }

    /**
     * Narrowed so subclasses compiled against IntelliJ (whose cloneImpl returns this class after remap)
     * still override Consulo's cloneImpl through the generated bridge.
     */
    @Override
    protected CompatPsiFileImpl cloneImpl(FileElement treeElement) {
        return (CompatPsiFileImpl) super.cloneImpl(treeElement);
    }

    /** Like IntelliJ: the stub tree if the file is stub-based right now, otherwise its AST. */
    public final Pair<StubTree, FileElement> getStubTreeOrFileElement() {
        FileElement tree = getTreeElement();
        if (tree != null) {
            return Pair.create(null, tree);
        }
        return Pair.create(getGreenStubTree(), null);
    }
}
