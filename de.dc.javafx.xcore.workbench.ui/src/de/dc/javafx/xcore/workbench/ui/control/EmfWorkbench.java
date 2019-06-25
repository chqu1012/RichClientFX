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
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEmfCommand;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.extensions.CommandExtension;
import de.dc.javafx.xcore.workbench.extensions.ExtensionManager;
import de.dc.javafx.xcore.workbench.extensions.ExtensionPoint;
import de.dc.javafx.xcore.workbench.Perspective;
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
					}
				}
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
					Tab editorTab = new Tab((String) input);
					editor.load(new java.io.File((String) input));
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
		return currentPerspective.getEditorArea().getTabs().stream().filter(e -> e.getText().equalsIgnoreCase(name)).findAny();
	}

	public EmfPerspective getCurrentPerspective() {
		return currentPerspective;
	}

	public void addPerspective(Perspective perspective) {
		currentPerspective = new EmfPerspective();
		for (View view : perspective.getLeftPane().getViews()) {
			currentPerspective.addToLeft(createTab(view));
		}
		perspectiveArea.getChildren().add(currentPerspective);
		perspectiveManager.put(perspective.get_Id(), Optional.of(currentPerspective));
	}
	
	private Tab createTab(View e) {
		Tab tab = new Tab(e.getName());
		tab.setClosable(e.isIsClosable());
		tab.setContent(caseView(e));
		return tab;
	}
	
	public Node caseView(View object) {
		try {
			Class clazz = Class.forName(object.getViewClass());
			Node view = (Node) DIPlatform.getInstance(clazz);

			boolean isChangeListener = ChangeListener.class.isAssignableFrom(view.getClass());
			if (isChangeListener && object.isRegistrateChangeListener()) {
				selectionService.addListener((ChangeListener) view);
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
		if (optionalPerspective!=null) {
			optionalPerspective.ifPresent(perspective-> perspective.toFront());
		}
	}
}