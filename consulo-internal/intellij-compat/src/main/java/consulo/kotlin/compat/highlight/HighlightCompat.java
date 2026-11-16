package consulo.kotlin.compat.highlight;

import consulo.application.util.concurrent.JobLauncher;
import consulo.application.util.function.Processor;
import consulo.language.editor.highlight.HighlightingLevelManager;
import consulo.language.editor.intention.QuickFixActionRegistrar;
import consulo.language.editor.intention.UnresolvedReferenceQuickFixProvider;
import consulo.language.editor.rawHighlight.HighlightInfo;
import consulo.language.editor.rawHighlight.HighlightInfoType;
import consulo.language.file.FileViewProvider;
import consulo.language.inject.InjectedLanguageManager;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.PsiReference;

import java.util.List;
import java.util.function.Consumer;

/** IntelliJ highlighting API that Consulo lacks; calls are redirected here by remap.xml. */
public final class HighlightCompat {
    private HighlightCompat() {
    }

    /** IntelliJ {@code HighlightInfoType.DEPRECATED}: Consulo's deprecation highlighting. */
    public static HighlightInfoType deprecated() {
        return HighlightInfoType.RAW_DEPRECATED;
    }

    /** IntelliJ {@code HighlightInfoType.UNUSED_SYMBOL}: Consulo's unused symbol highlighting. */
    public static HighlightInfoType unusedSymbol() {
        return HighlightInfoType.RAW_UNUSED_SYMBOL;
    }

    /** IntelliJ {@code HighlightInfoType.PENDING_REFERENCE}, for an incomplete project model, which Consulo never has. */
    public static HighlightInfoType pendingReference() {
        return HighlightInfoType.WRONG_REF;
    }

    /** IntelliJ {@code InjectedLanguageManager.isInjectedViewProvider}: whether the view provider is of an injected fragment. */
    public static boolean isInjectedViewProvider(InjectedLanguageManager manager, FileViewProvider viewProvider) {
        PsiFile file = viewProvider.getPsi(viewProvider.getBaseLanguage());
        return file != null && manager.isInjectedFragment(file);
    }

    /** IntelliJ {@code HighlightingLevelManager.runEssentialHighlightingOnly}: Consulo always runs full highlighting. */
    public static boolean runEssentialHighlightingOnly(HighlightingLevelManager manager, PsiElement element) {
        return false;
    }

    /**
     * IntelliJ {@code JobLauncher.processConcurrentlyAsync}: processes the things concurrently with {@code runnable}, to
     * warm up caches. Here they are processed first, then the runnable runs.
     */
    public static <T> void processConcurrentlyAsync(JobLauncher launcher, List<? extends T> things, Processor<? super T> processor,
                                                    Runnable runnable) {
        for (T thing : things) {
            if (!processor.process(thing)) {
                break;
            }
        }
        runnable.run();
    }

    /** IntelliJ {@code HighlightInfo.Builder.registerLazyFixes}: Consulo registers the fixes right away. */
    public static HighlightInfo.Builder registerLazyFixes(HighlightInfo.Builder builder, Consumer<? super QuickFixActionRegistrar> registrar) {
        registrar.accept(QuickFixActionRegistrar.create(builder));
        return builder;
    }

    /** IntelliJ {@code UnresolvedReferenceQuickFixProvider.registerUnresolvedReferenceLazyQuickFixes}: right away in Consulo. */
    public static void registerUnresolvedReferenceLazyQuickFixes(PsiReference reference, HighlightInfo.Builder builder) {
        UnresolvedReferenceQuickFixProvider.registerReferenceFixes(reference, QuickFixActionRegistrar.create(builder));
    }
}
