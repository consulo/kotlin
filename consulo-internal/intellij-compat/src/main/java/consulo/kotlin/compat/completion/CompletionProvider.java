package consulo.kotlin.compat.completion;

import consulo.language.editor.completion.CompletionParameters;

/**
 * IntelliJ {@code CompletionProvider<V>}: a class with a type parameter for the parameters; Consulo's is an interface
 * taking {@link CompletionParameters}, which subclasses implement through the erasure of {@code V}.
 * {@code CompletionContributor.extend} with one of these is redirected to {@link CompletionCompat#extend}.
 */
public abstract class CompletionProvider<V extends CompletionParameters> implements consulo.language.editor.completion.CompletionProvider {
}
