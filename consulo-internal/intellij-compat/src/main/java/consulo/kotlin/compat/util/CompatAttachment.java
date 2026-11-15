package consulo.kotlin.compat.util;

import consulo.logging.attachment.Attachment;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * IntelliJ's {@code Attachment} is a class built with {@code new Attachment(path, content)}; in Consulo it is an
 * interface. remap.xml {@code <new>} instantiates this class instead.
 */
public class CompatAttachment implements Attachment {
    private final String myPath;
    private final String myDisplayText;
    private final byte[] myBytes;
    private boolean myIncluded = true;

    public CompatAttachment(String path, String content) {
        this(path, content.getBytes(StandardCharsets.UTF_8), content);
    }

    public CompatAttachment(String path, byte[] bytes, String displayText) {
        myPath = path;
        myBytes = bytes;
        myDisplayText = displayText;
    }

    /** IntelliJ {@code Attachment.getBytes()}. */
    public byte[] getBytes() {
        return myBytes;
    }

    @Override
    public String getDisplayText() {
        return myDisplayText;
    }

    @Override
    public String getPath() {
        return myPath;
    }

    @Override
    public String getName() {
        int slash = myPath.lastIndexOf('/');
        return slash < 0 ? myPath : myPath.substring(slash + 1);
    }

    @Override
    public String getEncodedBytes() {
        return Base64.getEncoder().encodeToString(myBytes);
    }

    @Override
    public boolean isIncluded() {
        return myIncluded;
    }

    @Override
    public void setIncluded(Boolean included) {
        myIncluded = included;
    }

    @Override
    public Attachment copy(String newPath) {
        CompatAttachment copy = new CompatAttachment(newPath, myBytes, myDisplayText);
        copy.myIncluded = myIncluded;
        return copy;
    }

    /** IntelliJ {@code Attachment.getBytes()} on any Consulo attachment. */
    public static byte[] getBytes(Attachment attachment) {
        return attachment instanceof CompatAttachment compat ? compat.getBytes() : Base64.getDecoder().decode(attachment.getEncodedBytes());
    }
}
