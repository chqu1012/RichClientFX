package de.dc.javafx.xcore.workbench.ui.control;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbenchContext;
import de.dc.javafx.xcore.workbench.ui.event.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.file.EmfWorkbenchFile;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;

public class EmfWorkbench extends AbstractFxmlControl implements ChangeListener{

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
	
	@Inject
	protected EmfWorkbenchFile workbenchFile;

	protected Workbench workbench;

	public EmfWorkbench() {
		EmfWorkbenchContext.getInstance(ISelectionService.class).addListener(this);
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
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		statusLineLabel.setText("Selection: "+newValue.toString());		
	}
}
