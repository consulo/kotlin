package consulo.kotlin.compat.psi;

import consulo.language.psi.util.PsiTreeUtil;
import consulo.language.psi.scope.LocalSearchScope;
import consulo.language.psi.search.SearchRequestCollector;
import consulo.content.scope.SearchScope;
import consulo.virtualFileSystem.VirtualFile;
import consulo.language.psi.StubBasedPsiElement;
import consulo.language.psi.stub.PsiFileWithStubSupport;
import consulo.language.psi.stub.StubbedSpine;
import consulo.language.psi.search.PsiSearchHelper;
import consulo.language.psi.scope.GlobalSearchScope;
import consulo.document.util.TextRange;
import consulo.language.ast.IElementType;
import consulo.language.ast.LighterASTNode;
import consulo.language.impl.ast.LeafElement;
import consulo.language.psi.LeafPsiElement;
import consulo.language.psi.LiteralTextEscaper;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiLanguageInjectionHost;
import consulo.language.psi.SmartPsiElementPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntelliJ PSI API that Consulo lacks. Calls are redirected here by remap.xml {@code <redirects>}.
 */
public final class PsiCompat {
    private PsiCompat() {
    }

    /** IntelliJ {@code LeafElement.getChars()}; Consulo's LeafPsiElement is an interface. */
    public static CharSequence getChars(LeafPsiElement leaf) {
        return leaf instanceof LeafElement element ? element.getChars() : leaf.getText();
    }

    /** IntelliJ {@code LeafElement.getElementType()}. */
    public static IElementType getElementType(LeafPsiElement leaf) {
        return leaf.getNode().getElementType();
    }

    /** IntelliJ {@code LiteralTextEscaper.createSimple(host, isOneLine)}. */
    public static <T extends PsiLanguageInjectionHost> LiteralTextEscaper<T> createSimple(T element, boolean isOneLine) {
        return new LiteralTextEscaper<T>(element) {
            @Override
            public boolean decode(TextRange rangeInsideHost, StringBuilder outChars) {
                outChars.append(rangeInsideHost.substring(myHost.getText()));
                return true;
            }

            @Override
            public int getOffsetInHost(int offsetInDecoded, TextRange rangeInsideHost) {
                return rangeInsideHost.getStartOffset() + offsetInDecoded;
            }

            @Override
            public boolean isOneLine() {
                return isOneLine;
            }
        };
    }

    /** IntelliJ {@code PsiTreeUtil.getChildrenOfAnyType(element, classes...)}. */
    @SuppressWarnings("unchecked")
    public static <T extends PsiElement> List<T> getChildrenOfAnyType(PsiElement element, Class<? extends T>[] classes) {
        if (element == null) {
            return Collections.emptyList();
        }
        List<T> result = null;
        for (PsiElement child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
            for (Class<? extends T> c : classes) {
                if (c.isInstance(child)) {
                    if (result == null) {
                        result = new ArrayList<>();
                    }
                    result.add((T) child);
                    break;
                }
            }
        }
        return result == null ? Collections.emptyList() : result;
    }

    /** IntelliJ's SmartPsiElementPointer is generic in E; Kotlin calls it through the erased signature. */
    public static Object getElement(SmartPsiElementPointer<?> pointer) {
        return pointer.getElement();
    }

    /**
     * IntelliJ static {@code PsiBuilderImpl.getErrorMessage(node)}: the message of a light tree error element.
     * Consulo keeps it in an internal class, so there is none (used by light tree FIR building, not by the IDE).
     */
    public static String getErrorMessage(LighterASTNode node) {
        return null;
    }

    /** IntelliJ {@code PsiAnchor.calcStubIndex}: the element's index in its file's stubbed spine, or -1. */
    public static int calcStubIndex(StubBasedPsiElement psi) {
        if (!(psi.getContainingFile() instanceof PsiFileWithStubSupport file)) {
            return -1;
        }
        StubbedSpine spine = file.getStubbedSpine();
        for (int i = 0; i < spine.getStubCount(); i++) {
            if (spine.getStubPsi(i) == psi) {
                return i;
            }
        }
        return -1;
    }

    /** IntelliJ {@code PsiSearchHelper.isCheapEnoughToSearch(name, scope, fileToIgnore)}: without a progress indicator. */
    public static PsiSearchHelper.SearchCostResult isCheapEnoughToSearch(PsiSearchHelper helper, String name, GlobalSearchScope scope,
                                                                         consulo.language.psi.PsiFile fileToIgnoreOccurrencesIn) {
        return helper.isCheapEnoughToSearch(name, scope, fileToIgnoreOccurrencesIn, null);
    }

    /** IntelliJ {@code PsiTreeUtil.findFirstParent(element, Condition)}: Consulo takes the Predicate it extends. */
    public static PsiElement findFirstParent(PsiElement element, consulo.util.lang.function.Condition<PsiElement> condition) {
        return PsiTreeUtil.findFirstParent(element, condition);
    }

    /** IntelliJ {@code LocalSearchScope.getVirtualFiles()}: the files of the scope's elements. */
    public static VirtualFile[] getVirtualFiles(LocalSearchScope scope) {
        java.util.Set<VirtualFile> files = new java.util.LinkedHashSet<>();
        for (PsiElement element : scope.getScope()) {
            consulo.language.psi.PsiFile file = element.getContainingFile();
            VirtualFile virtualFile = file != null ? file.getViewProvider().getVirtualFile() : null;
            if (virtualFile != null) {
                files.add(virtualFile);
            }
        }
        return files.toArray(VirtualFile[]::new);
    }

    /** {@code SearchRequestCollector.searchWord} with an IntelliJ-style result processor (a Consulo one). */
    public static void searchWord(SearchRequestCollector collector, String word, SearchScope searchScope, short searchContext,
                                  boolean caseSensitive, PsiElement searchTarget,
                                  consulo.kotlin.compat.search.RequestResultProcessor processor) {
        collector.searchWord(word, searchScope, searchContext, caseSensitive, searchTarget, processor);
    }
}
