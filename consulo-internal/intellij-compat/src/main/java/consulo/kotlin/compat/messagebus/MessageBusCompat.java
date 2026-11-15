package consulo.kotlin.compat.messagebus;

import consulo.component.messagebus.MessageBus;
import consulo.component.messagebus.MessageBusConnection;
import consulo.language.psi.PsiModificationTrackerListener;
import consulo.virtualFileSystem.event.BulkFileListener;

/**
 * IntelliJ's {@link Topic}-based message bus calls, on Consulo's listener-class topics. Calls are redirected here by
 * remap.xml.
 */
public final class MessageBusCompat {
    private static final Topic<PsiModificationTrackerListener> PSI_MODIFICATION =
        new Topic<>("PSI modification", PsiModificationTrackerListener.class);
    private static final Topic<BulkFileListener> VFS_CHANGES = new Topic<>("VFS changes", BulkFileListener.class);

    private MessageBusCompat() {
    }

    /** {@code MessageBus.syncPublisher(Topic)} */
    public static Object syncPublisher(MessageBus bus, Topic<?> topic) {
        return bus.syncPublisher(topic.getListenerClass());
    }

    /** {@code MessageBusConnection.subscribe(Topic, L)} */
    @SuppressWarnings("unchecked")
    public static void subscribe(MessageBusConnection connection, Topic<?> topic, Object handler) {
        connection.subscribe((Class<Object>) topic.getListenerClass(), handler);
    }

    /** {@code PsiModificationTracker.TOPIC} */
    public static Topic<PsiModificationTrackerListener> psiModificationTopic() {
        return PSI_MODIFICATION;
    }

    /** {@code VirtualFileManager.VFS_CHANGES} */
    public static Topic<BulkFileListener> vfsChangesTopic() {
        return VFS_CHANGES;
    }
}
