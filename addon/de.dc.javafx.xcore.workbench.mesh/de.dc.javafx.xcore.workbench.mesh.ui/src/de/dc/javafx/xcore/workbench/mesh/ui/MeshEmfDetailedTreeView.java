package de.dc.javafx.xcore.workbench.mesh.ui;

import java.io.File;
import java.io.IOException;

import de.dc.javafx.xcore.workbench.chart.ui.controller.BaseChartFXEmfDetailedTreeViewController;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.AnchorPane;

public class MeshEmfDetailedTreeView extends BaseChartFXEmfDetailedTreeViewController implements ChangeListener<TreeItem<Object>>, IEmfEditorPart<MeshContainer>{

	private MeshEmfTreeView treeView = new MeshEmfTreeView();
	
	public MeshEmfDetailedTreeView() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/chart/ui/ChartFXEmfDetailedTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		AnchorPane.setBottomAnchor(treeView, 0d);
		AnchorPane.setTopAnchor(treeView, 0d);
		AnchorPane.setLeftAnchor(treeView, 0d);
		AnchorPane.setRightAnchor(treeView, 0d);
		emfModelTreeViewContainer.getChildren().add(treeView);
		
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
	}
	
	@Override
	public void save(File file) {
		
	}

	@Override
	public MeshContainer load(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> arg0, TreeItem<Object> arg1,
			TreeItem<Object> arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onAddNewValueAction(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onDeleteSelectionValueAction(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onEditValueAction(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
