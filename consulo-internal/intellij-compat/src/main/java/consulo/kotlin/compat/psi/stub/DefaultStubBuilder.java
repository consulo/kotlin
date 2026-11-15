package consulo.kotlin.compat.psi.stub;

import consulo.language.ast.ASTNode;
import consulo.language.ast.FileASTNode;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.StubBasedPsiElement;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.psi.stub.ObjectStubBase;
import consulo.language.psi.stub.StubBuilder;
import consulo.language.psi.stub.StubElement;
import consulo.logging.Logger;
import consulo.util.collection.BooleanStack;
import consulo.util.collection.Stack;

/**
 * Remap target of {@code com.intellij.psi.stubs.DefaultStubBuilder}: Consulo's walk over the AST, with IntelliJ's
 * factory lookup. A node gets a stub when its element type has a factory in {@link StubBridge} (Consulo's own
 * builder only asks {@code IStubElementType} element types, which Kotlin's are not).
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DefaultStubBuilder implements StubBuilder {
    private static final Logger LOG = Logger.getInstance(DefaultStubBuilder.class);

    @Override
    public StubElement buildStubTree(PsiFile file) {
        return buildStubTreeFor(file.getNode(), createStubForFile(file));
    }

    protected StubElement createStubForFile(PsiFile file) {
        return new CompatPsiFileStubImpl(file);
    }

    @Override
    public boolean skipChildProcessingWhenBuildingStubs(ASTNode parent, ASTNode node) {
        return false;
    }

    protected final StubElement buildStubTreeFor(ASTNode root, StubElement parentStub) {
        Stack<StubElement> parentStubs = new Stack<>();
        Stack<ASTNode> parentNodes = new Stack<>();
        BooleanStack parentNodesStubbed = new BooleanStack();
        parentStubs.push(parentStub);
        parentNodes.push(root);
        parentNodesStubbed.push(true);
        while (!parentStubs.isEmpty()) {
            StubElement stub = parentStubs.pop();
            ASTNode node = parentNodes.pop();
            boolean immediateParentStubbed = parentNodesStubbed.pop();

            StubElement created = createStub(stub, node);
            if (created != null && !immediateParentStubbed) {
                ((ObjectStubBase) created).markDangling();
            }
            boolean hasStub = node instanceof FileASTNode || created != null;
            StubElement childParent = created != null ? created : stub;
            for (ASTNode child = node.getLastChildNode(); child != null; child = child.getTreePrev()) {
                if (!skipChildProcessingWhenBuildingStubs(node, child)) {
                    parentStubs.push(childParent);
                    parentNodes.push(child);
                    parentNodesStubbed.push(hasStub);
                }
            }
        }
        return parentStub;
    }

    private StubElement createStub(StubElement parentStub, ASTNode node) {
        IElementType type = node.getElementType();
        if (type instanceof IStubElementType stubType) {
            return stubType.shouldCreateStub(node) ? stubType.createStub(psiOf(node), parentStub) : null;
        }
        StubElementFactory factory = StubBridge.getInstance().getFactory(type);
        if (factory != null && factory.shouldCreateStub(node)) {
            return factory.createStub(psiOf(node), parentStub);
        }
        return null;
    }

    private static PsiElement psiOf(ASTNode node) {
        PsiElement psi = node.getPsi();
        if (!(psi instanceof StubBasedPsiElement)) {
            LOG.error("Stub creation for a non stub based element: " + node.getElementType() + ", PSI: " + psi);
        }
        return psi;
    }
}
