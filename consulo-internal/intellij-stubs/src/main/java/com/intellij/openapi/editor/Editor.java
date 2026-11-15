package com.intellij.openapi.editor;

@SuppressWarnings("all")
public interface Editor extends com.intellij.openapi.util.UserDataHolder {
    com.intellij.openapi.editor.Document getDocument();
    com.intellij.openapi.project.Project getProject();
    // Added by consulo-internal/remap/genstub.py from consulo.codeEditor.Editor
    public static final com.intellij.openapi.editor.Editor[] EMPTY_ARRAY = null;
    public static final com.intellij.openapi.util.Key<com.intellij.openapi.editor.Editor> KEY = null;
    public boolean isViewer();
    public default boolean isShowing() { return false; }
    public default javax.swing.JComponent getComponent() { return null; }
    public default consulo.ui.Component getUIComponent() { return null; }
    public default javax.swing.JComponent getContentComponent() { return null; }
    public default consulo.ui.Component getContentUIComponent() { return null; }
    public default java.awt.Insets getInsets() { return null; }
    public consulo.codeEditor.SelectionModel getSelectionModel();
    public consulo.codeEditor.markup.MarkupModel getMarkupModel();
    public consulo.codeEditor.FoldingModel getFoldingModel();
    public consulo.codeEditor.ScrollingModel getScrollingModel();
    public consulo.codeEditor.CaretModel getCaretModel();
    public consulo.codeEditor.SoftWrapModel getSoftWrapModel();
    public default consulo.codeEditor.FocusModeModel getFocusModeModel() { return null; }
    public consulo.codeEditor.EditorSettings getSettings();
    public consulo.colorScheme.EditorColorsScheme getColorsScheme();
    public int getLineHeight();
    public default java.awt.Point logicalPositionToXY(consulo.codeEditor.LogicalPosition p0) { return null; }
    public int logicalPositionToOffset(consulo.codeEditor.LogicalPosition p0);
    public consulo.codeEditor.VisualPosition logicalToVisualPosition(consulo.codeEditor.LogicalPosition p0);
    public default java.awt.Point visualPositionToXY(consulo.codeEditor.VisualPosition p0) { return null; }
    public default java.awt.geom.Point2D visualPositionToPoint2D(consulo.codeEditor.VisualPosition p0) { return null; }
    public consulo.codeEditor.LogicalPosition visualToLogicalPosition(consulo.codeEditor.VisualPosition p0);
    public consulo.codeEditor.LogicalPosition offsetToLogicalPosition(int p0);
    public consulo.codeEditor.VisualPosition offsetToVisualPosition(int p0);
    public consulo.codeEditor.VisualPosition offsetToVisualPosition(int p0, boolean p1, boolean p2);
    public default consulo.codeEditor.LogicalPosition xyToLogicalPosition(java.awt.Point p0) { return null; }
    public default consulo.codeEditor.VisualPosition xyToVisualPosition(java.awt.Point p0) { return null; }
    public default consulo.codeEditor.VisualPosition xyToVisualPosition(java.awt.geom.Point2D p0) { return null; }
    public default java.awt.Point offsetToXY(int p0) { return null; }
    public default java.awt.Point offsetToXY(int p0, boolean p1, boolean p2) { return null; }
    public default java.awt.geom.Point2D offsetToPoint2D(int p0) { return null; }
    public default java.awt.geom.Point2D offsetToPoint2D(int p0, boolean p1, boolean p2) { return null; }
    public default int visualLineToY(int p0) { return 0; }
    public default int yToVisualLine(int p0) { return 0; }
    public void addEditorMouseListener(consulo.codeEditor.event.EditorMouseListener p0);
    public default void addEditorMouseListener(consulo.codeEditor.event.EditorMouseListener p0, com.intellij.openapi.Disposable p1) { }
    public void removeEditorMouseListener(consulo.codeEditor.event.EditorMouseListener p0);
    public void addEditorMouseMotionListener(consulo.codeEditor.event.EditorMouseMotionListener p0);
    public void removeEditorMouseMotionListener(consulo.codeEditor.event.EditorMouseMotionListener p0);
    public boolean isDisposed();
    public boolean isInsertMode();
    public boolean isColumnMode();
    public boolean isOneLineMode();
    public consulo.codeEditor.EditorGutter getGutter();
    public default consulo.codeEditor.event.EditorMouseEventArea getMouseEventArea(java.awt.event.MouseEvent p0) { return null; }
    public default void setHeaderComponent(consulo.ui.Component p0) { }
    public boolean hasHeaderComponent();
    public default consulo.ui.Component getHeaderComponent() { return null; }
    public consulo.codeEditor.IndentsModel getIndentsModel();
    public consulo.codeEditor.InlayModel getInlayModel();
    public consulo.codeEditor.EditorKind getEditorKind();
    public int getAscent();
    public default void showPopupInBestPositionFor(consulo.ui.ex.popup.JBPopup p0) { }
    public default int getExpectedCaretOffset() { return 0; }
    public consulo.dataContext.DataContext getDataContext();
    public default consulo.codeEditor.EditorHighlighter getHighlighter() { return null; }
    public default com.intellij.openapi.vfs.VirtualFile getVirtualFile() { return null; }
    public default int visualPositionToOffset(consulo.codeEditor.VisualPosition p0) { return 0; }
    public default int[] visualLineToYRange(int p0) { return null; }
}
