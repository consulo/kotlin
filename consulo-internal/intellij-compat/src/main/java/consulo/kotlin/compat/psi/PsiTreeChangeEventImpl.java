package consulo.kotlin.compat.psi;

import consulo.language.psi.PsiManager;
import consulo.language.psi.event.PsiTreeChangeEvent;

/**
 * Remap target of {@code com.intellij.psi.impl.PsiTreeChangeEventImpl}: a PSI change with its kind ({@link #getCode()}).
 * Consulo's own event implementation is internal, so {@link PsiTreeChangeDispatcher} builds these from the typed
 * callbacks of a public {@code PsiTreeChangeListener}.
 */
public class PsiTreeChangeEventImpl extends PsiTreeChangeEvent {
    public enum PsiEventType {
        BEFORE_CHILD_ADDITION,
        BEFORE_CHILD_REMOVAL,
        BEFORE_CHILD_REPLACEMENT,
        BEFORE_CHILD_MOVEMENT,
        BEFORE_CHILDREN_CHANGE,
        BEFORE_PROPERTY_CHANGE,
        CHILD_ADDED,
        CHILD_REMOVED,
        CHILD_REPLACED,
        CHILD_MOVED,
        CHILDREN_CHANGED,
        PROPERTY_CHANGED
    }

    private final PsiEventType myCode;
    private final boolean myGenericChange;

    PsiTreeChangeEventImpl(PsiManager manager, PsiTreeChangeEvent source, PsiEventType code, boolean genericChange) {
        super(manager);
        myCode = code;
        myGenericChange = genericChange;
        myParent = source.getParent();
        myOldParent = source.getOldParent();
        myNewParent = source.getNewParent();
        myChild = source.getChild();
        myOldChild = source.getOldChild();
        myNewChild = source.getNewChild();
        myFile = source.getFile();
        myElement = source.getElement();
        myPropertyName = source.getPropertyName();
        myOldValue = source.getOldValue();
        myNewValue = source.getNewValue();
    }

    public PsiEventType getCode() {
        return myCode;
    }

    /** Whether the event only repeats more specific events of the same change ("children changed"). */
    public boolean isGenericChange() {
        return myGenericChange;
    }
}
