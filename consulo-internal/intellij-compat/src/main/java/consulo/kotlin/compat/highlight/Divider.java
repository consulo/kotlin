package consulo.kotlin.compat.highlight;

import consulo.document.util.TextRange;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.PsiRecursiveElementWalkingVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * IntelliJ's {@code Divider}: the elements of a file within a range, split by whether they touch the priority range
 * (children before parents). Consulo's own is internal to the platform.
 */
public final class Divider {
    private Divider() {
    }

    public record DividedElements(PsiFile psiRoot, List<PsiElement> inside, List<PsiElement> outside, List<PsiElement> parents) {
    }

    public static void divideInsideAndOutsideAllRoots(PsiFile file, TextRange restrictRange, TextRange priorityRange,
                                                      Predicate<? super PsiFile> rootFilter, Consumer<? super DividedElements> processor) {
        for (PsiFile root : file.getViewProvider().getAllFiles()) {
            if (rootFilter.test(root)) {
                divideInsideAndOutsideInOneRoot(root, restrictRange, priorityRange, processor);
            }
        }
    }

    public static void divideInsideAndOutsideInOneRoot(PsiFile root, TextRange restrictRange, TextRange priorityRange,
                                                       Consumer<? super DividedElements> processor) {
        List<PsiElement> inside = new ArrayList<>();
        List<PsiElement> outside = new ArrayList<>();
        List<PsiElement> parents = new ArrayList<>();
        root.accept(new PsiRecursiveElementWalkingVisitor() {
            @Override
            public void visitElement(PsiElement element) {
                TextRange range = element.getTextRange();
                if (range == null || !range.intersects(restrictRange)) {
                    return;
                }
                super.visitElement(element);
            }

            @Override
            protected void elementFinished(PsiElement element) {
                TextRange range = element.getTextRange();
                if (range == null || !range.intersects(restrictRange)) {
                    return;
                }
                if (restrictRange.contains(range)) {
                    (range.intersects(priorityRange) ? inside : outside).add(element);
                }
                else {
                    parents.add(element);
                }
            }
        });
        processor.accept(new DividedElements(root, inside, outside, parents));
    }
}
