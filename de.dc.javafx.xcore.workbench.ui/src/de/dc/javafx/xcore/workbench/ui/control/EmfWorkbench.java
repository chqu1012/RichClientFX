package de.dc.javafx.xcore.workbench.ui.control;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ui.controls.styledtext.StyleRange;
import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.extensions.ExtensionManager;
import de.dc.javafx.xcore.workbench.extensions.ExtensionPoint;
import de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension;
import de.dc.javafx.xcore.workbench.extensions.file.ExtensionFile;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.dnd.DraggingTabPaneSupport;
import de.dc.javafx.xcore.workbench.ui.file.EmfWorkbenchFile;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;

public abstract class EmfWorkbench extends AbstractFxmlControl implements ChangeListener<Object> {

	public static final String ID = "de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench";
	public static final String TOOLBAR_ID = "de.dc.javafx.xcore.workbench.ui.control.Toolbar";
	public static final String PERSPECTIVE_TOOLBAR_ID = "de.dc.javafx.xcore.workbench.ui.control.Perspective";
	public static final String LEFT_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.LeftPane";
	public static final String RIGHT_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.RightPane";
	public static final String BOTTOM_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.BottomPane";
	public static final String EDITOR_AREA_ID = "de.dc.javafx.xcore.workbench.ui.control.EditorArea";
	public static final String STATUSLINE_ID = "de.dc.javafx.xcore.workbench.ui.control.Statusline";

	@FXML
	protected BorderPane root;

	@FXML
	protected TabPane leftTabPane;

	@FXML
	protected TabPane editorArea;

	@FXML
	protected TabPane rightTabPane;

	@FXML
	protected TabPane bottomTabPane;

	@FXML
	protected ToolBar toolbar;

	@FXML
	protected ToolBar statusLine;

	@FXML
	protected ToolBar perspectiveToolbar;

	@FXML
	protected TextField searchText;

	@FXML
	protected Label statusLineLabel;

	@FXML
	protected Label statusLinePerspectiveLabel;

	@Inject
	protected EmfWorkbenchFile workbenchFile;

	protected IEventBroker eventBroker;

	protected IEmfSelectionService selectionService;

	protected Workbench workbench;

	public EmfWorkbench() {
		selectionService = DIPlatform.getInstance(IEmfSelectionService.class);
		eventBroker = DIPlatform.getInstance(IEventBroker.class);

		selectionService.addListener(this);
		eventBroker.register(this);

		IEmfControlManager controlManager = DIPlatform.getInstance(IEmfControlManager.class);
		controlManager.registrate(BOTTOM_PANE_ID, getBottomTabPane());
		controlManager.registrate(LEFT_PANE_ID, getLeftTabPane());
		controlManager.registrate(RIGHT_PANE_ID, getRightTabPane());
		controlManager.registrate(EDITOR_AREA_ID, getEditorArea());
		controlManager.registrate(TOOLBAR_ID, getToolBar());
		controlManager.registrate(PERSPECTIVE_TOOLBAR_ID, getPerspectiveToolBar());

		// TabPane dnd support
		DraggingTabPaneSupport support = new DraggingTabPaneSupport();
		support.addSupport(bottomTabPane);
		support.addSupport(rightTabPane);
		support.addSupport(leftTabPane);

		editorArea.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<Tab>) (observable, oldValue, newValue) -> {
					Node content = newValue.getContent();
					if (content instanceof IEmfEditorPart) {
						IEmfEditorPart<?> editor = (IEmfEditorPart<?>) content;
						DIPlatform.getInstance(IEmfFileManager.class).setCurrentEditor(editor);
					}
				});
	}

	public void registerExtensions() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();

		for (URL url : urls) {
			String file = url.getFile();
			file = file + "plugin.extensions";
			java.io.File extensionFile = new java.io.File(file);
			if (extensionFile.exists()) {
				ExtensionFile efile = new ExtensionFile();
				ExtensionManager mgr = efile.load(extensionFile.getAbsolutePath());

				EList<ExtensionPoint> extensionPoints = mgr.getExtensionPoints();
				for (ExtensionPoint point : extensionPoints) {
					if (point instanceof PerspectiveExtension) {
						PerspectiveExtension perspectiveExtions = (PerspectiveExtension) point;
						initPerspective(perspectiveExtions);
					}
				}
			}
		}
	}

	private void initPerspective(PerspectiveExtension perspectiveExtions) {
		for (de.dc.javafx.xcore.workbench.extensions.Perspective p : perspectiveExtions.getPerspectives()) {
			Perspective perspective = WorkbenchFactory.eINSTANCE.createPerspective();
			perspective.setName(p.getName());
			perspective.set_Id(p.getId());

			LeftPane leftPane = WorkbenchFactory.eINSTANCE.createLeftPane();
			perspective.setLeftPane(leftPane);
			for (de.dc.javafx.xcore.workbench.extensions.View view : p.getLeft()) {
				de.dc.javafx.xcore.workbench.View currentView = WorkbenchFactory.eINSTANCE.createView();
				currentView.set_Id(view.getId());
				currentView.setName(view.getName());
				currentView.setRegistrateChangeListener(true);
				currentView.setViewClass(view.getExtensionUri());
				leftPane.getViews().add(currentView);
			}
			DIPlatform.getInstance(EmfWorkbenchRenderer.class).createPerspective(perspective);
		}
	}

	public Workbench getWorkbench() {
		if (workbench == null) {
			String name = getClass().getResource(getClass().getSimpleName() + ".workbench").getPath();
			workbench = workbenchFile.load(name);
		}
		return workbench;
	}

	public TabPane getLeftTabPane() {
		return leftTabPane;
	}

	public TabPane getRightTabPane() {
		return rightTabPane;
	}

	public TabPane getBottomTabPane() {
		return bottomTabPane;
	}

	public TabPane getEditorArea() {
		return editorArea;
	}

	public ToolBar getToolBar() {
		return toolbar;
	}

	public ToolBar getPerspectiveToolBar() {
		return perspectiveToolbar;
	}

	@FXML
	protected void onEditorAreaCloseMenuItem(ActionEvent event) {
		Tab selection = editorArea.getSelectionModel().getSelectedItem();
		editorArea.getTabs().remove(selection);
	}

	@FXML
	protected void onEditorAreaCloseOthersMenuItem(ActionEvent event) {
		Tab selection = editorArea.getSelectionModel().getSelectedItem();
		List<Tab> toRemoveTabs = new ArrayList<>();
		for (Tab tab : editorArea.getTabs()) {
			if (tab != selection) {
				toRemoveTabs.add(tab);
			}
		}
		editorArea.getTabs().removeAll(toRemoveTabs);
	}

	@FXML
	protected void onEditorAreaCloseAllMenuItem(ActionEvent event) {
		editorArea.getTabs().clear();
	}

	@Override
	protected String fxmlName() {
		return EmfWorkbench.class.getSimpleName();
	}

	@Override
	public void changed(ObservableValue<?> observable, Object oldValue, Object newValue) {
		statusLineLabel.setText("Selection: " + newValue.toString());
	}

	@Subscribe
	public void updateStatusLinePerspectiveLabel(EventContext<String> context) {
		if (context.getEventId() == null) {
			return;
		}
		if (context.getEventId().equals("switch.perspective")) {
			statusLinePerspectiveLabel.setText(context.getInput());
		}
	}

	@Subscribe
	public void openFile(EventContext<?> context) {
		Object input = context.getInput();
		if (context.getEventTopic() == EventTopic.OPEN_EDITOR) {
			String filename = showTabTextByObject(input) == null ? "" : showTabTextByObject(input);
			if (!filename.isEmpty() && !isFileOpen(filename)) {
				StyledTextArea styledTextArea = new StyledTextArea();
				styledTextArea.getContent().setText("This is a styled text!\nThis is the 2nd line with data\nBlaBla");
				styledTextArea.setStyleRanges(new StyleRange("text-highlight", 0, 30, null, null),
						new StyleRange("text-highlight", 34, 5, null, null));

				Tab editorTab = new Tab(filename);
				editorTab.setContent(styledTextArea);
				editorArea.getTabs().add(editorTab);
			}
			getTabByName(filename).ifPresent(e -> editorArea.getSelectionModel().select(e));
		}
	}

	@Subscribe
	public void openPreview(EventContext<FXPreview> context) {
		if (context.getEventId() != null && context.getEventId().equals("open.preview")) {
			FXPreview input = context.getInput();
			Tab preview = new Tab(input.getTitle());
			DIPlatform.getInstance(IEmfSelectionService.class).addListener(input);
			preview.setContent(input);
			bottomTabPane.getTabs().add(preview);
			bottomTabPane.getSelectionModel().select(preview);
		}
	}

	protected abstract String showTabTextByObject(Object input);

	public boolean isFileOpen(String name) {
		return editorArea.getTabs().stream().anyMatch(e -> e.getText().equalsIgnoreCase(name));
	}

	public Optional<Tab> getTabByName(String name) {
		return editorArea.getTabs().stream().filter(e -> e.getText().equalsIgnoreCase(name)).findAny();
	}
}
