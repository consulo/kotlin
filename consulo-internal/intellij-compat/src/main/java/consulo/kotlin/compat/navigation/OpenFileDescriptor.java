package consulo.kotlin.compat.navigation;

import consulo.codeEditor.Editor;
import consulo.fileEditor.FileEditorManager;
import consulo.navigation.OpenFileDescriptorFactory;
import consulo.project.Project;
import consulo.virtualFileSystem.VirtualFile;

/**
 * IntelliJ {@code com.intellij.openapi.fileEditor.OpenFileDescriptor}, a class; Consulo's is an interface built by
 * {@link OpenFileDescriptorFactory}. {@code FileEditorManager.openTextEditor} with one is redirected to
 * {@link #openTextEditor}.
 */
public class OpenFileDescriptor {
    private final Project myProject;
    private final VirtualFile myFile;
    private final int myOffset;

    public OpenFileDescriptor(Project project, VirtualFile file, int offset) {
        myProject = project;
        myFile = file;
        myOffset = offset;
    }

    public OpenFileDescriptor(Project project, VirtualFile file) {
        this(project, file, -1);
    }

    public Project getProject() {
        return myProject;
    }

    public VirtualFile getFile() {
        return myFile;
    }

    public int getOffset() {
        return myOffset;
    }

    public consulo.navigation.OpenFileDescriptor toConsulo() {
        OpenFileDescriptorFactory.Builder builder = OpenFileDescriptorFactory.getInstance(myProject).newBuilder(myFile);
        if (myOffset >= 0) {
            builder.offset(myOffset);
        }
        return builder.build();
    }

    public static Editor openTextEditor(FileEditorManager manager, OpenFileDescriptor descriptor, boolean focusEditor) {
        return manager.openTextEditor(descriptor.toConsulo(), focusEditor);
    }
}
