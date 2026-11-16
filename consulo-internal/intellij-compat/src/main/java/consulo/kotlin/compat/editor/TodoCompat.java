package consulo.kotlin.compat.editor;

import consulo.language.editor.todo.TodoConfiguration;

/** IntelliJ's TodoConfiguration API that Consulo lacks. */
public final class TodoCompat {
    private TodoCompat() {
    }

    /** IntelliJ {@code TodoConfiguration.isMultiLine()}: Consulo's TODO items are single-line. */
    public static boolean isMultiLine(TodoConfiguration configuration) {
        return false;
    }
}
