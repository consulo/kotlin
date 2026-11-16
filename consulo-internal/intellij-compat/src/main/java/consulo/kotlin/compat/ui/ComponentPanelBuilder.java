package consulo.kotlin.compat.ui;

import consulo.ui.ex.awt.JBLabel;
import consulo.ui.ex.awt.JBUI;
import consulo.ui.ex.awt.UIUtil;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.Component;

/** IntelliJ's {@code ComponentPanelBuilder}, as far as a component with a comment below it. */
public class ComponentPanelBuilder {
    private final JComponent myComponent;
    private String myComment;

    public ComponentPanelBuilder(JComponent component) {
        myComponent = component;
    }

    public ComponentPanelBuilder withComment(String comment) {
        myComment = comment;
        return this;
    }

    public JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        myComponent.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(myComponent);
        if (myComment != null) {
            JBLabel comment = new JBLabel(myComment, UIUtil.ComponentStyle.SMALL, UIUtil.FontColor.BRIGHTER);
            comment.setBorder(JBUI.Borders.emptyLeft(24));
            comment.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(comment);
        }
        return panel;
    }
}
