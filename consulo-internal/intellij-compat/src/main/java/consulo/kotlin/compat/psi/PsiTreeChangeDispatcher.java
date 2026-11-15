package consulo.kotlin.compat.psi;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.psi.PsiManager;
import consulo.language.psi.event.PsiTreeChangeEvent;
import consulo.language.psi.event.PsiTreeChangeListener;
import consulo.project.Project;
import consulo.project.startup.PostStartupActivity;
import consulo.ui.UIAccess;

/**
 * Feeds the {@link PsiTreeChangePreprocessor} extensions: a PSI listener per project whose callbacks give the kind of
 * each change.
 */
@ExtensionImpl
public class PsiTreeChangeDispatcher implements PostStartupActivity {
    @Override
    public void runActivity(Project project, UIAccess uiAccess) {
        PsiManager manager = PsiManager.getInstance(project);
        manager.addPsiTreeChangeListener(new Listener(project, manager), project);
    }

    /**
     * IntelliJ marks "children changed" as generic when it accompanies specific events (child added, removed, replaced or
     * moved) of the same change; without them, e.g. after the text of a leaf changed, it is the change itself. Consulo's
     * events do not say, so the listener tracks whether specific events came since the "before children change".
     */
    private static final class Listener implements PsiTreeChangeListener {
        private final Project project;
        private final PsiManager manager;
        private boolean mySpecificEventSeen;

        Listener(Project project, PsiManager manager) {
            this.project = project;
            this.manager = manager;
        }

        private void specific(PsiTreeChangeEvent event, PsiTreeChangeEventImpl.PsiEventType code) {
            mySpecificEventSeen = true;
            dispatch(event, code, false);
        }

        private void dispatch(PsiTreeChangeEvent event, PsiTreeChangeEventImpl.PsiEventType code, boolean genericChange) {
            PsiTreeChangeEventImpl compatEvent = new PsiTreeChangeEventImpl(manager, event, code, genericChange);
            for (PsiTreeChangePreprocessor preprocessor : project.getExtensionList(PsiTreeChangePreprocessor.class)) {
                preprocessor.treeChanged(compatEvent);
            }
        }

        @Override
        public void beforeChildAddition(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_ADDITION);
        }

        @Override
        public void beforeChildRemoval(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_REMOVAL);
        }

        @Override
        public void beforeChildReplacement(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_REPLACEMENT);
        }

        @Override
        public void beforeChildMovement(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_MOVEMENT);
        }

        @Override
        public void beforeChildrenChange(PsiTreeChangeEvent event) {
            mySpecificEventSeen = false;
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILDREN_CHANGE, true);
        }

        @Override
        public void beforePropertyChange(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_PROPERTY_CHANGE, false);
        }

        @Override
        public void childAdded(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_ADDED);
        }

        @Override
        public void childRemoved(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_REMOVED);
        }

        @Override
        public void childReplaced(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_REPLACED);
        }

        @Override
        public void childrenChanged(PsiTreeChangeEvent event) {
            boolean generic = mySpecificEventSeen;
            mySpecificEventSeen = false;
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.CHILDREN_CHANGED, generic);
        }

        @Override
        public void childMoved(PsiTreeChangeEvent event) {
            specific(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_MOVED);
        }

        @Override
        public void propertyChanged(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.PROPERTY_CHANGED, false);
        }
    }
}
