package de.dc.javafx.xcore.workbench.ui.renderer;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.BottomPane;
import de.dc.javafx.xcore.workbench.Command;
import de.dc.javafx.xcore.workbench.Editor;
import de.dc.javafx.xcore.workbench.EditorRegistry;
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.RightPane;
import de.dc.javafx.xcore.workbench.Toolbar;
import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEmfCommand;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.EmfCommandManager;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.util.WorkbenchSwitch;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EmfWorkbenchRenderer extends WorkbenchSwitch<Node> {

	private Logger log = Logger.getLogger(EmfWorkbenchRenderer.class.getSimpleName());

	private EmfWorkbench workbench;

	private Map<String, Perspective> perspectives = new HashMap<>();

	@Inject
	EmfCommandManager commands;
	@Inject
	IEmfSelectionService selectionService;
	@Inject
	IEventBroker eventBroker;
	@Inject
	IEmfControlManager controlManager;
	@Inject
	IEmfFileManager fileManager;

	public void setWorkbench(EmfWorkbench workbench) {
		this.workbench = workbench;
		controlManager.registrate(EmfWorkbench.ID, workbench);
	}

	@Override
	public Node caseWorkbench(Workbench object) {
		populateCommands(object);
		populatePerspectives(object);
		registrateEditors(object);
		return super.caseWorkbench(object);
	}

	private void registrateEditors(Workbench object) {
		doSwitch(object.getEditorRegistry());
	}

	private void populatePerspectives(Workbench object) {
		for (Perspective perspective : object.getPerspectives()) {
			Button perspectiveButton = new Button(perspective.getName());
			perspectiveButton.setId(perspective.get_Id());
			perspectiveButton.setOnAction(e -> switchPerspective(perspectiveButton.getId()));
			workbench.getPerspectiveToolBar().getItems().add(perspectiveButton);

			perspectives.put(perspective.get_Id(), perspective);
			switchPerspective(perspective.get_Id());
			eventBroker.post(new EventContext<>("switch.perspective", perspective.getName()));

			controlManager.registrate(perspective.get_Id(), perspectiveButton);
		}
	}

	private void switchPerspective(String id) {
		workbench.getLeftTabPane().getTabs().clear();
		workbench.getRightTabPane().getTabs().clear();
		workbench.getBottomTabPane().getTabs().clear();
		workbench.getEditorArea().getTabs().clear();

		Perspective perspective = perspectives.get(id);
		doSwitch(perspective);
		eventBroker.post(new EventContext<>("switch.perspective", perspective.getName()));

	}

	private void populateCommands(Workbench object) {
		for (Command c : object.getCommands()) {
			try {
				Class<IEmfCommand> commandClass = (Class<IEmfCommand>) Class.forName(c.get_Id());
				IEmfCommand command = DIPlatform.getInstance(commandClass);
				commands.register(c.get_Id(), command);
			} catch (ClassNotFoundException e) {
				log.log(Level.SEVERE, "Error on register command id " + c.get_Id() + ", message: " + e.getMessage());
			}
		}
	}

	@Override
	public Node caseToolbar(Toolbar object) {
		if (workbench != null) {
			object.getItems().forEach(e -> workbench.getToolBar().getItems().add(doSwitch(e)));
		}
		return super.caseToolbar(object);
	}

	@Override
	public Node caseToolbarItem(ToolbarItem object) {
		String text = object.getName() == null ? "" : object.getName();
		Button control = new Button();
		control.setTooltip(new Tooltip(text));
		if (object.getIcon() == null) {
			control.setText(text);
		} else {
			InputStream resource = getClass().getResourceAsStream(object.getIcon());
			control.setGraphic(new ImageView(new Image(resource)));
		}
		control.setOnAction(event -> {
			String onAction = object.getOnAction();
			Command command = object.getCommand();
			if (onAction != null) {
				invokeOnActionMethod(onAction, event);
			}
			if (command != null) {
				commands.execute(object.getCommand().get_Id());
			}
		});
		control.setTooltip(new Tooltip(text));

		controlManager.registrateToolbarItem(object.get_Id(), control);
		return control;
	}

	private void invokeOnActionMethod(String actionName, ActionEvent event) {
		try {
			Method method = workbench.getClass().getMethod(actionName, ActionEvent.class);
			method.invoke(workbench, event);
		} catch (NullPointerException | NoSuchMethodException | SecurityException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			log.log(Level.SEVERE, "Method " + actionName + " not found (" + e.getLocalizedMessage() + ")");
		}
	}

	@Override
	public Node casePerspective(Perspective object) {
		if (workbench != null) {
			LeftPane leftPane = object.getLeftPane();
			if (leftPane != null) {
				doSwitch(leftPane);
			}

			RightPane rightPane = object.getRightPane();
			if (rightPane != null) {
				doSwitch(rightPane);
			}

			BottomPane bottomPane = object.getBottomPane();
			if (bottomPane != null) {
				doSwitch(bottomPane);
			}
		}
		return super.casePerspective(object);
	}

	@Override
	public Node caseLeftPane(LeftPane object) {
		if (workbench != null) {
			object.getViews().stream().forEach(e -> workbench.getLeftTabPane().getTabs().add(createTab(e)));
		}
		return super.caseLeftPane(object);
	}

	@Override
	public Node caseRightPane(RightPane object) {
		if (workbench != null) {
			object.getViews().stream().forEach(e -> workbench.getRightTabPane().getTabs().add(createTab(e)));
		}
		return super.caseRightPane(object);
	}

	@Override
	public Node caseBottomPane(BottomPane object) {
		if (workbench != null) {
			object.getViews().stream().forEach(e -> workbench.getBottomTabPane().getTabs().add(createTab(e)));
		}
		return super.caseBottomPane(object);
	}

	private Tab createTab(View e) {
		Tab tab = new Tab(e.getName());
		tab.setClosable(e.isIsClosable());
		tab.setContent(caseView(e));
		return tab;
	}

	@Override
	public Node caseEditorRegistry(EditorRegistry object) {
		object.getEditor().forEach(e -> doSwitch(e));
		return super.caseEditorRegistry(object);
	}

	@Override
	public Node caseEditor(Editor object) {
		try {
			Class<?> clazz = Class.forName(object.getEditorUri());
			IEmfEditorPart<?> view = (IEmfEditorPart) DIPlatform.getInstance(clazz);
			fileManager.register(view);
		} catch (NullPointerException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return super.caseEditor(object);
	}

	@Override
	public Node caseView(View object) {
		try {
			Class clazz = Class.forName(object.getViewClass());
			Node view = (Node) DIPlatform.getInstance(clazz);

			boolean isChangeListener = ChangeListener.class.isAssignableFrom(view.getClass());
			if (isChangeListener && object.isRegistrateChangeListener()) {
				selectionService.addListener((ChangeListener) view);
			}

			controlManager.registrate(object.get_Id(), view);
			return view;
		} catch (NullPointerException | ClassNotFoundException e) {
			log.log(Level.SEVERE, "Viewpart cannot created (id: " + object.get_Id() + "instance: "
					+ object.getViewClass() + ", name: " + object.getName() + ") ");
		}
		return new Label("ViewPart cannot be created!");
	}
}
