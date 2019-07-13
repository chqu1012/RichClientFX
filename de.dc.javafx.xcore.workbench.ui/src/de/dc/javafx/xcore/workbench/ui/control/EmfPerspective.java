package de.dc.javafx.xcore.workbench.ui.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.dnd.DraggingTabPaneSupport;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class EmfPerspective extends SplitPane {

	public static final String LEFT_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.LeftPane";
	public static final String RIGHT_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.RightPane";
	public static final String BOTTOM_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.BottomPane";
	public static final String EDITOR_AREA_ID = "de.dc.javafx.xcore.workbench.ui.control.EditorArea";

	@FXML
	private SplitPane perspective;

	@FXML
	private TabPane leftTabPane;

	@FXML
	private TabPane editorArea;

	@FXML
	private AnchorPane rightPane;

	@FXML
	private TabPane rightTabPane;

	@FXML
	private TabPane bottomPane;

	@FXML
	private AnchorPane leftAnchorPane;
	
	@FXML
	private SplitPane topSplitPane;
	
	private IEventBroker eventBroker;

	public EmfPerspective() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/ui/EmfPerspective.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		eventBroker = DIPlatform.getInstance(IEventBroker.class);

		eventBroker.register(this);

		IEmfControlManager controlManager = DIPlatform.getInstance(IEmfControlManager.class);
		controlManager.registrate(BOTTOM_PANE_ID, getBottomTabPane());
		controlManager.registrate(LEFT_PANE_ID, getLeftTabPane());
		controlManager.registrate(RIGHT_PANE_ID, getRightTabPane());
		controlManager.registrate(EDITOR_AREA_ID, getEditorArea());

		// TabPane dnd support
		DraggingTabPaneSupport support = new DraggingTabPaneSupport();
		support.addSupport(bottomPane);
		support.addSupport(rightTabPane);
		support.addSupport(leftTabPane);

		editorArea.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<Tab>) (observable, oldValue, newValue) -> {
					if (newValue != null) {
						Node content = newValue.getContent();
						if (content instanceof IEmfEditorPart) {
							IEmfEditorPart<?> editor = (IEmfEditorPart<?>) content;
							DIPlatform.getInstance(IEmfFileManager.class).setCurrentEditor(editor);
						}
					}
				});
	}

	public TabPane getLeftTabPane() {
		return leftTabPane;
	}

	public TabPane getRightTabPane() {
		return rightTabPane;
	}

	public TabPane getBottomTabPane() {
		return bottomPane;
	}

	public TabPane getEditorArea() {
		return editorArea;
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

	public void hideLeft(boolean hide) {
		if (hide) {
			topSplitPane.getItems().remove(topSplitPane.getItems().indexOf(leftAnchorPane));
		}else {
			topSplitPane.getItems().add(0, leftAnchorPane);
		}
	}
	
	public void hideRight(boolean hide) {
		if (hide) {
			topSplitPane.getItems().remove(topSplitPane.getItems().indexOf(rightPane));
		}else {
			topSplitPane.getItems().add(rightPane);
		}
	}

	public void hideBottom(boolean hide) {
		if (hide) {
			perspective.getItems().remove(perspective.getItems().indexOf(bottomPane));
		}else {
			perspective.getItems().add(bottomPane);
		}
	}
	
	
	
	public void addToRight(Tab tab) {
		tab.setOnClosed(event -> {
			if (rightTabPane.getTabs().isEmpty()) {
				hideRight(true);
			}
		});
		rightTabPane.getTabs().add(tab);
	}

	public void addToLeft(Tab tab) {
		tab.setOnClosed(event -> {
			if (leftTabPane.getTabs().isEmpty()) {
				hideLeft(true);
			}
		});
		leftTabPane.getTabs().add(tab);
	}

	public void addToBottom(Tab tab) {
		tab.setOnClosed(event -> {
			if (bottomPane.getTabs().isEmpty()) {
				hideBottom(true);
			}
		});
		bottomPane.getTabs().add(tab);
	}

	public void addToEditorArea(Tab tab) {
		editorArea.getTabs().add(tab);
	}
}
