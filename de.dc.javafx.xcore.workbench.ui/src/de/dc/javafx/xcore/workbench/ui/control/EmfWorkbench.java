package de.dc.javafx.xcore.workbench.ui.control;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ui.controls.styledtext.StyleRange;
import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.BottomPane;
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileService;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEmfCommand;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.extensions.CommandExtension;
import de.dc.javafx.xcore.workbench.extensions.Editor;
import de.dc.javafx.xcore.workbench.extensions.EditorExtension;
import de.dc.javafx.xcore.workbench.extensions.ExtensionManager;
import de.dc.javafx.xcore.workbench.extensions.ExtensionPoint;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.RightPane;
import de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension;
import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.extensions.file.ExtensionFile;
import de.dc.javafx.xcore.workbench.ui.EmfCommandManager;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.file.EmfWorkbenchFile;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public abstract class EmfWorkbench extends AbstractFxmlControl implements ChangeListener<Object> {

	private Logger log = Logger.getLogger(EmfWorkbench.class.getSimpleName());

	public static final String ID = "de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench";
	public static final String TOOLBAR_ID = "de.dc.javafx.xcore.workbench.ui.control.Toolbar";
	public static final String PERSPECTIVE_TOOLBAR_ID = "de.dc.javafx.xcore.workbench.ui.control.Perspective";
	public static final String STATUSLINE_ID = "de.dc.javafx.xcore.workbench.ui.control.Statusline";
	public static final String EDITOR_AREA_ID = "de.dc.javafx.xcore.workbench.ui.control.EditorArea";

	@FXML
	protected StackPane perspectiveArea;

	@FXML
	protected BorderPane root;

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

	protected EmfPerspective currentPerspective;

	protected Map<String, Optional<EmfPerspective>> perspectiveManager = new HashMap<>();

	private double leftWidth = 150d;
	
	public EmfWorkbench() {
		selectionService = DIPlatform.getInstance(IEmfSelectionService.class);
		eventBroker = DIPlatform.getInstance(IEventBroker.class);

		selectionService.addListener(this);
		eventBroker.register(this);

		IEmfControlManager controlManager = DIPlatform.getInstance(IEmfControlManager.class);
		controlManager.registrate(TOOLBAR_ID, getToolBar());
		controlManager.registrate(PERSPECTIVE_TOOLBAR_ID, getPerspectiveToolBar());
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
					} else if (point instanceof CommandExtension) {
						CommandExtension commandExtension = (CommandExtension) point;
						initCommand(commandExtension);
					} else if (point instanceof EditorExtension) {
						EditorExtension editorExtension = (EditorExtension) point;
						initEditors(editorExtension);
					}
				}
			}
		}
	}

	private void initEditors(EditorExtension editorExtension) {
		for (Editor editor : editorExtension.getEditors()) {
			try {
				Class<?> clazz = Class.forName(editor.getExtensionUri());
				IEmfEditorPart<?> view = (IEmfEditorPart) DIPlatform.getInstance(clazz);
				DIPlatform.getInstance(IEmfFileManager.class).register(view);
			} catch (NullPointerException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	private void initCommand(CommandExtension commandExtension) {
		for (de.dc.javafx.xcore.workbench.extensions.Command c : commandExtension.getCommands()) {
			try {
				Class<IEmfCommand> commandClass = (Class<IEmfCommand>) Class.forName(c.getId());
				IEmfCommand command = DIPlatform.getInstance(commandClass);
				DIPlatform.getInstance(EmfCommandManager.class).register(c.getId(), command);
			} catch (ClassNotFoundException e) {
				log.log(Level.SEVERE, "Error on register command id " + c.getId() + ", message: " + e.getMessage());
			}
		}
	}

	private void initPerspective(PerspectiveExtension perspectiveExtions) {
		for (de.dc.javafx.xcore.workbench.extensions.Perspective p : perspectiveExtions.getPerspectives()) {
			Perspective perspective = WorkbenchFactory.eINSTANCE.createPerspective();
			perspective.setName(p.getName());
			perspective.set_Id(p.getId());

			LeftPane leftPane = WorkbenchFactory.eINSTANCE.createLeftPane();
			RightPane rightPane = WorkbenchFactory.eINSTANCE.createRightPane();
			BottomPane bottomPane = WorkbenchFactory.eINSTANCE.createBottomPane();
			perspective.setLeftPane(leftPane);
			perspective.setRightPane(rightPane);
			perspective.setBottomPane(bottomPane);

			p.getLeft().forEach(e-> leftPane.getViews().add(createView(e)));
			p.getRight().forEach(e-> rightPane.getViews().add(createView(e)));
			p.getBottom().forEach(e-> bottomPane.getViews().add(createView(e)));
			
			DIPlatform.getInstance(EmfWorkbenchRenderer.class).createPerspective(perspective);
		}
	}

	private de.dc.javafx.xcore.workbench.View createView(de.dc.javafx.xcore.workbench.extensions.View view) {
		de.dc.javafx.xcore.workbench.View currentView = WorkbenchFactory.eINSTANCE.createView();
		currentView.set_Id(view.getId());
		currentView.setName(view.getName());
		currentView.setRegistrateChangeListener(true);
		currentView.setViewClass(view.getExtensionUri());
		return currentView;
	}

	public Workbench getWorkbench() {
		if (workbench == null) {
			String name = getClass().getResource(getClass().getSimpleName() + ".workbench").getPath();
			workbench = workbenchFile.load(name);
		}
		return workbench;
	}

	public ToolBar getToolBar() {
		return toolbar;
	}

	public ToolBar getPerspectiveToolBar() {
		return perspectiveToolbar;
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
	public void hideBottomTabPane(EventContext<Boolean> context) {
		if (context.getEventTopic()==null && context.getEventId().equals("workbench/hide/bottom")) {
			Boolean hide = (Boolean) context.getInput();
			currentPerspective.hideBottom(hide);
		}
	}
	
	@Subscribe
	public void hideLeftTabPane(EventContext<Boolean> context) {
		if (context.getEventTopic()==null && context.getEventId().equals("workbench/hide/left")) {
			Boolean hide = (Boolean) context.getInput();
			currentPerspective.hideLeft(hide);
		}
	}

	@Subscribe
	public void hideRightTabPane(EventContext<Boolean> context) {
		if (context.getEventTopic()==null && context.getEventId().equals("workbench/hide/right")) {
			Boolean hide = (Boolean) context.getInput();
			currentPerspective.hideRight(hide);
		}
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
				Optional<IEmfEditorPart<?>> editorPart = DIPlatform.getInstance(IEmfFileManager.class)
						.getEditorByExtension(FilenameUtils.getExtension(filename));
				editorPart.ifPresent(editor -> {
					java.io.File file = new java.io.File((String) input);
					Tab editorTab = new Tab(file.getName());
					editor.load(file);
					editorTab.setContent((Node) editor);
					currentPerspective.getEditorArea().getTabs().add(editorTab);
				});
			} else {
				StyledTextArea styledTextArea = new StyledTextArea();
				styledTextArea.getContent().setText("This is a styled text!\nThis is the 2nd line with data\nBlaBla");
				styledTextArea.setStyleRanges(new StyleRange("text-highlight", 0, 30, null, null),
						new StyleRange("text-highlight", 34, 5, null, null));

				Tab editorTab = new Tab(filename);
				editorTab.setContent(styledTextArea);
				currentPerspective.getEditorArea().getTabs().add(editorTab);
			}
			getTabByName(filename).ifPresent(e -> currentPerspective.getEditorArea().getSelectionModel().select(e));
		}
	}

	@Subscribe
	public void openPreview(EventContext<FXPreview> context) {
		if (context.getEventId() != null && context.getEventId().equals("open.preview")) {
			FXPreview input = context.getInput();
			Tab preview = new Tab(input.getTitle());
			DIPlatform.getInstance(IEmfSelectionService.class).addListener(input);
			preview.setContent(input);
			currentPerspective.getBottomTabPane().getTabs().add(preview);
			currentPerspective.getBottomTabPane().getSelectionModel().select(preview);
		}
	}

	protected abstract String showTabTextByObject(Object input);

	public boolean isFileOpen(String name) {
		return currentPerspective.getEditorArea().getTabs().stream().anyMatch(e -> e.getText().equalsIgnoreCase(name));
	}

	public Optional<Tab> getTabByName(String name) {
		return currentPerspective.getEditorArea().getTabs().stream().filter(e -> e.getText().equalsIgnoreCase(name))
				.findAny();
	}

	public EmfPerspective getCurrentPerspective() {
		return currentPerspective;
	}

	public void addPerspective(Perspective perspective) {
		currentPerspective = new EmfPerspective();
		RightPane rightPane = perspective.getRightPane();
		LeftPane leftPane = perspective.getLeftPane();
		BottomPane bottomPane = perspective.getBottomPane();
		if (leftPane != null) {
			for (View view : leftPane.getViews()) {
				currentPerspective.addToLeft(createTab(view));
			}
		}
		if (rightPane != null) {
			for (View view : rightPane.getViews()) {
				currentPerspective.addToRight(createTab(view));
			}
		}
		if (bottomPane != null) {
			for (View view : bottomPane.getViews()) {
				currentPerspective.addToBottom(createTab(view));
			}
		}
		perspectiveArea.getChildren().add(currentPerspective);
		perspectiveManager.put(perspective.get_Id(), Optional.of(currentPerspective));
	}

	private Tab createTab(View e) {
		Tab tab = new Tab(e.getName());
		tab.setClosable(e.isIsClosable());
		AnchorPane pane = new AnchorPane();
		pane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		Node node = caseView(e);
		AnchorPane.setBottomAnchor(node, 0d);
		AnchorPane.setTopAnchor(node, 0d);
		AnchorPane.setLeftAnchor(node, 0d);
		AnchorPane.setRightAnchor(node, 0d);
		pane.getChildren().add(node);
		tab.setContent(pane);
		return tab;
	}

	public Node caseView(View object) {
		try {
			Class<?> clazz = Class.forName(object.getViewClass());
			Node view = (Node) DIPlatform.getInstance(clazz);

			boolean isChangeListener = ChangeListener.class.isAssignableFrom(view.getClass());
			if (isChangeListener && object.isRegistrateChangeListener()) {
				selectionService.addListener((ChangeListener<?>) view);
			}

			DIPlatform.getInstance(IEmfControlManager.class).registrate(object.get_Id(), view);
			return view;
		} catch (NullPointerException | ClassNotFoundException e) {
			log.log(Level.SEVERE, "Viewpart cannot created (id: " + object.get_Id() + "instance: "
					+ object.getViewClass() + ", name: " + object.getName() + ") ");
		}
		return new Label("ViewPart cannot be created!");
	}

	public void switchPerspective(String id) {
		Optional<EmfPerspective> optionalPerspective = perspectiveManager.get(id);
		if (optionalPerspective != null) {
			optionalPerspective.ifPresent(perspective -> {
				currentPerspective = perspective;
				DIPlatform.getInstance(IEmfControlManager.class).registrate(EmfWorkbench.EDITOR_AREA_ID, currentPerspective.getEditorArea());
				perspective.toFront();
			});
		}
	}
}