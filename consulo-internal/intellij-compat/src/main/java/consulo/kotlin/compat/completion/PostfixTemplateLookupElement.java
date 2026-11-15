package consulo.kotlin.compat.completion;

import consulo.language.editor.completion.lookup.LookupElement;

/**
 * IntelliJ's postfix template items, which upstream only tells apart from its own; Consulo's are internal, so here no
 * element is one.
 */
public abstract class PostfixTemplateLookupElement extends LookupElement {
    private PostfixTemplateLookupElement() {
    }
}
