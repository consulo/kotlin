package consulo.kotlin.compat.intention;

import consulo.localize.LocalizeValue;

/**
 * IntelliJ {@code SuppressIntentionAction}: Consulo's, with IntelliJ's string text (see {@link IntentionAction}).
 * Copied unchanged by the remapper (verbatim), so this getText() keeps its name.
 */
public abstract class SuppressIntentionAction extends consulo.language.editor.intention.SuppressIntentionAction implements IntentionAction {
    @Override
    public LocalizeValue getText() {
        return LocalizeValue.of(getIntentionText());
    }
}
