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

    private record Listener(Project project, PsiManager manager) implements PsiTreeChangeListener {
        private void dispatch(PsiTreeChangeEvent event, PsiTreeChangeEventImpl.PsiEventType code, boolean genericChange) {
            PsiTreeChangeEventImpl compatEvent = new PsiTreeChangeEventImpl(manager, event, code, genericChange);
            for (PsiTreeChangePreprocessor preprocessor : project.getExtensionList(PsiTreeChangePreprocessor.class)) {
                preprocessor.treeChanged(compatEvent);
            }
        }

        @Override
        public void beforeChildAddition(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_ADDITION, false);
        }

        @Override
        public void beforeChildRemoval(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_REMOVAL, false);
        }

        @Override
        public void beforeChildReplacement(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_REPLACEMENT, false);
        }

        @Override
        public void beforeChildMovement(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILD_MOVEMENT, false);
        }

        // "children changed" accompanies the specific events of a change: generic, as IntelliJ marks it
        @Override
        public void beforeChildrenChange(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_CHILDREN_CHANGE, true);
        }

        @Override
        public void beforePropertyChange(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.BEFORE_PROPERTY_CHANGE, false);
        }

        @Override
        public void childAdded(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_ADDED, false);
        }

        @Override
        public void childRemoved(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_REMOVED, false);
        }

        @Override
        public void childReplaced(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_REPLACED, false);
        }

        @Override
        public void childrenChanged(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.CHILDREN_CHANGED, true);
        }

        @Override
        public void childMoved(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.CHILD_MOVED, false);
        }

        @Override
        public void propertyChanged(PsiTreeChangeEvent event) {
            dispatch(event, PsiTreeChangeEventImpl.PsiEventType.PROPERTY_CHANGED, false);
        }
    }
}
