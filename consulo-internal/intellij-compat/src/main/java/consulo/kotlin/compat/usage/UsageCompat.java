package consulo.kotlin.compat.usage;

import consulo.localize.LocalizeValue;
import consulo.usage.UsageType;
import consulo.usage.UsageViewBundle;

import java.util.function.Supplier;

/** IntelliJ usage view API that Consulo lacks. */
public final class UsageCompat {
    private UsageCompat() {
    }

    /** IntelliJ's {@code new UsageType(Supplier)}: Consulo's final UsageType is named by a string or LocalizeValue */
    public static UsageType usageType(Supplier<String> name) {
        return new UsageType(LocalizeValue.of(name.get()));
    }

    /** IntelliJ {@code UsageViewBundle.messagePointer} */
    public static Supplier<String> messagePointer(String key, Object... params) {
        return () -> UsageViewBundle.message(key, params);
    }
}
