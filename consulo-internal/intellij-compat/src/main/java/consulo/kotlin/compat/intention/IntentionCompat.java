package consulo.kotlin.compat.intention;

/** IntelliJ intention API that Consulo lacks; calls are redirected here by remap.xml. */
public final class IntentionCompat {
    private IntentionCompat() {
    }

    /** IntelliJ {@code CommonIntentionAction.asIntention()}: Kotlin's quick fixes are intentions already. */
    public static IntentionAction asIntention(consulo.language.editor.intention.IntentionAction action) {
        return (IntentionAction) action;
    }
}
