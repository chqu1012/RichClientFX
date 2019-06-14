package de.dc.javafx.xcore.workbench.chart.ui;

import java.io.IOException;

import de.dc.javafx.xcore.workbench.chart.ui.controller.BaseChartFXEmfDetailedTreeViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class ChartFXEmfDetailedTreeView extends BaseChartFXEmfDetailedTreeViewController {

	public ChartFXEmfDetailedTreeView() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/chart/ui/ChartFXEmfDetailedTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		ChartFXEmfTreeView treeView = new ChartFXEmfTreeView();
		AnchorPane.setBottomAnchor(treeView, 0d);
		AnchorPane.setTopAnchor(treeView, 0d);
		AnchorPane.setLeftAnchor(treeView, 0d);
		AnchorPane.setRightAnchor(treeView, 0d);
		emfModelTreeViewContainer.getChildren().add(treeView);
	}

	@Override
	protected void onAddNewValueAction(ActionEvent event) {
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
