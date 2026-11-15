package consulo.kotlin.compat.psi;

import consulo.language.psi.event.PsiTreeChangeEvent;

/** Remap target of {@code com.intellij.psi.impl.PsiModificationTrackerImpl}: its static helpers. */
public final class PsiModificationTrackerImpl {
    private PsiModificationTrackerImpl() {
    }

    /** Whether the change can change PSI: not a property change of the writable flag, not a "before property change". */
    public static boolean canAffectPsi(PsiTreeChangeEventImpl event) {
        PsiTreeChangeEventImpl.PsiEventType code = event.getCode();
        return !(code == PsiTreeChangeEventImpl.PsiEventType.BEFORE_PROPERTY_CHANGE
            || code == PsiTreeChangeEventImpl.PsiEventType.PROPERTY_CHANGED && PsiTreeChangeEvent.PROP_WRITABLE.equals(event.getPropertyName()));
    }
}
