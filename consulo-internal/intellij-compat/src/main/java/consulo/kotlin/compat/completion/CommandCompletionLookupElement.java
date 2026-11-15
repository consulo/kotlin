package consulo.kotlin.compat.completion;

import consulo.language.editor.completion.lookup.LookupElement;

/** IntelliJ's command completion items; Consulo has no command completion, so no element is one. */
public abstract class CommandCompletionLookupElement extends LookupElement {
    private CommandCompletionLookupElement() {
    }
}
