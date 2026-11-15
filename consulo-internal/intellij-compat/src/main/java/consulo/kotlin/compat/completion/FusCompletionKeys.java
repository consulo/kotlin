package consulo.kotlin.compat.completion;

import consulo.util.dataholder.Key;

/** IntelliJ {@code FusCompletionKeys}: completion usage statistics, which Consulo does not collect; the keys stay unread. */
public final class FusCompletionKeys {
    public static final Key<Class<?>> LOOKUP_ELEMENT_CONTRIBUTOR = Key.create("kotlin.fus.lookup.element.contributor");

    private FusCompletionKeys() {
    }
}
