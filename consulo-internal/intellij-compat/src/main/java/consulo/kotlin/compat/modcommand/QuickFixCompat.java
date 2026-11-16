package consulo.kotlin.compat.modcommand;

import consulo.language.editor.inspection.QuickFix;
import consulo.localize.LocalizeValue;

/** IntelliJ quick fixes name themselves with strings, Consulo's with {@link LocalizeValue}s (bridges in remap.xml). */
public final class QuickFixCompat {
    private QuickFixCompat() {
    }

    public static LocalizeValue localizeValue(String text) {
        return text == null ? LocalizeValue.empty() : LocalizeValue.of(text);
    }

    /** IntelliJ {@code QuickFix.getName()} on a Consulo quick fix */
    public static String getName(QuickFix<?> fix) {
        return fix.getName().get();
    }

    /** IntelliJ {@code QuickFix.getFamilyName()} on a Consulo quick fix, which has no family name */
    public static String getFamilyName(QuickFix<?> fix) {
        return fix.getName().get();
    }
}
