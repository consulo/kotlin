package consulo.kotlin.compat.messagebus;

/**
 * IntelliJ {@code com.intellij.util.messages.Topic}. Consulo identifies a topic by its listener interface (annotated
 * with {@code @TopicAPI}), so this only carries the listener class; {@link MessageBusCompat} publishes and subscribes
 * with it.
 */
public class Topic<L> {
    public enum BroadcastDirection {
        TO_CHILDREN, TO_DIRECT_CHILDREN, NONE, TO_PARENT
    }

    private final String myDisplayName;
    private final Class<L> myListenerClass;
    private final BroadcastDirection myBroadcastDirection;

    public Topic(String displayName, Class<L> listenerClass) {
        this(displayName, listenerClass, BroadcastDirection.TO_CHILDREN);
    }

    public Topic(String displayName, Class<L> listenerClass, BroadcastDirection broadcastDirection) {
        myDisplayName = displayName;
        myListenerClass = listenerClass;
        myBroadcastDirection = broadcastDirection;
    }

    public Topic(Class<L> listenerClass) {
        this(listenerClass.getSimpleName(), listenerClass);
    }

    public Topic(Class<L> listenerClass, BroadcastDirection broadcastDirection) {
        this(listenerClass.getSimpleName(), listenerClass, broadcastDirection);
    }

    public Topic(Class<L> listenerClass, BroadcastDirection broadcastDirection, boolean immediateDelivery) {
        this(listenerClass.getSimpleName(), listenerClass, broadcastDirection);
    }

    public static <L> Topic<L> create(String displayName, Class<L> listenerClass) {
        return new Topic<>(displayName, listenerClass);
    }

    public String getDisplayName() {
        return myDisplayName;
    }

    public Class<L> getListenerClass() {
        return myListenerClass;
    }

    public BroadcastDirection getBroadcastDirection() {
        return myBroadcastDirection;
    }

    @Override
    public String toString() {
        return myDisplayName;
    }
}
