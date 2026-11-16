package consulo.kotlin.compat.modcommand;

/** IntelliJ's {@code ModPlanOptionValues}: options of a ModPlan refactoring, which Consulo's dialogs ask instead. */
public final class ModPlanOptionValues {
    public static final ModPlanOptionValues EMPTY = new ModPlanOptionValues();

    public <T> ModPlanOptionValues with(Object option, T value) {
        return this;
    }
}
