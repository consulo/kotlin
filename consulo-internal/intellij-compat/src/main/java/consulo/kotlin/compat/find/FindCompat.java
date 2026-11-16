package consulo.kotlin.compat.find;

import consulo.application.util.function.Processor;
import consulo.find.FindManager;
import consulo.find.FindUsagesHandler;
import consulo.find.FindUsagesOptions;
import consulo.language.psi.PsiElement;
import consulo.usage.UsageInfo;
import consulo.project.ui.notification.NotificationType;
import consulo.project.ui.wm.ToolWindowManager;
import consulo.ui.image.Image;

import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/** IntelliJ find usages API that Consulo has elsewhere. */
public final class FindCompat {
    private FindCompat() {
    }

    /**
     * IntelliJ {@code FindManagerBase.getFindUsagesManager()}: Consulo's {@link FindManager} itself provides the handlers
     * (IntelliJ's {@code FindUsagesManager} maps to it).
     */
    public static FindManager getFindUsagesManager(FindManager findManager) {
        return findManager;
    }

    /**
     * IntelliJ {@code FindUsagesHandler.processElementUsages} takes a {@link Processor}, Consulo's a predicate (which a
     * processor is); upstream handlers get a bridge to their own processor variant (the plugin's remap.xml).
     */
    public static boolean processElementUsages(FindUsagesHandler handler, PsiElement element, Processor<? super UsageInfo> processor,
                                               FindUsagesOptions options) {
        @SuppressWarnings("unchecked")
        java.util.function.Predicate<UsageInfo> predicate = (java.util.function.Predicate<UsageInfo>) (java.util.function.Predicate<?>) processor;
        return handler.processElementUsages(element, predicate, options);
    }

    /** IntelliJ {@code FindUsagesHandler.processUsagesInText} with a {@link Processor}, Consulo's with a predicate. */
    public static boolean processUsagesInText(FindUsagesHandler handler, PsiElement element, Processor<? super UsageInfo> processor,
                                              consulo.language.psi.scope.GlobalSearchScope searchScope) {
        @SuppressWarnings("unchecked")
        java.util.function.Predicate<UsageInfo> predicate = (java.util.function.Predicate<UsageInfo>) (java.util.function.Predicate<?>) processor;
        return handler.processUsagesInText(element, predicate, searchScope);
    }

    /** IntelliJ {@code PropertiesComponent.getInstance(Project)} */
    public static consulo.component.PropertiesComponent getPropertiesComponent(consulo.project.Project project) {
        return consulo.project.ProjectPropertiesComponent.getInstance(project);
    }

    /** IntelliJ {@code PropertiesComponent.getInstance()} */
    public static consulo.component.PropertiesComponent getPropertiesComponent() {
        return consulo.application.ApplicationPropertiesComponent.getInstance();
    }

    /** The processor of a predicate, for the bridges of upstream handlers' processor variants (the plugin's remap.xml). */
    public static <T> Processor<T> toProcessor(java.util.function.Predicate<? super T> predicate) {
        return predicate::test;
    }

    /** IntelliJ {@code MessageType.INFO} (IntelliJ's {@code MessageType} maps to {@link NotificationType}). */
    public static NotificationType messageTypeInfo() {
        return NotificationType.INFORMATION;
    }

    /** IntelliJ's balloon with a Swing hyperlink listener; Consulo's reports the link of a UI hyperlink event. */
    public static void notifyByBalloon(ToolWindowManager manager, String toolWindowId, NotificationType type, String htmlBody,
                                       Image icon, HyperlinkListener listener) {
        manager.notifyByBalloon(toolWindowId, type, htmlBody, icon, listener == null ? null : event ->
            listener.hyperlinkUpdate(new HyperlinkEvent(manager, HyperlinkEvent.EventType.ACTIVATED, null, event.getDescription())));
    }
}
