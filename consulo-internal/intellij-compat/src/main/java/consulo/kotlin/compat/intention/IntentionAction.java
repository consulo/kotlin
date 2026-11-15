package consulo.kotlin.compat.intention;

import consulo.localize.LocalizeValue;

/**
 * IntelliJ {@code IntentionAction}: its text and family name are strings. remap.xml renames IntelliJ's
 * {@code getText()} of implementations and callers to {@link #getIntentionText()}; Consulo reads {@link #getText()}.
 * Copied unchanged by the remapper (verbatim), so this getText() keeps its name.
 */
public interface IntentionAction extends consulo.language.editor.intention.IntentionAction {
    String getIntentionText();

    default String getFamilyName() {
        return getIntentionText();
    }

    @Override
    default LocalizeValue getText() {
        return LocalizeValue.of(getIntentionText());
    }
}
