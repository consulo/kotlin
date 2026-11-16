package consulo.kotlin.compat.codeStyle;

import consulo.language.codeStyle.CodeStyleSettings;
import consulo.localize.LocalizeValue;

/** IntelliJ's code style configurable, named by a string. */
public abstract class CodeStyleAbstractConfigurable extends consulo.language.codeStyle.ui.setting.CodeStyleAbstractConfigurable {
    public CodeStyleAbstractConfigurable(CodeStyleSettings settings, CodeStyleSettings cloneSettings, String displayName) {
        super(settings, cloneSettings, LocalizeValue.of(displayName));
    }
}
