package de.dc.javafx.xcore.workbench.chart.ui.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public abstract class BaseChartFXEmfDetailedTreeViewController extends SplitPane {

	@FXML
	protected SplitPane root;
	
    @FXML
    protected AnchorPane emfModelTreeViewContainer;

    @FXML
    protected VBox attributeContainer;

    @FXML
    protected VBox tableContainer;

    @FXML
    protected HBox childAttributeContainer;

    @FXML
    protected TableView<?> tableView;

    @FXML
    protected abstract void onAddNewValueAction(ActionEvent event);

    @FXML
    protected abstract void onDeleteSelectionValueAction(ActionEvent event);

    @FXML
    protected abstract void onEditValueAction(ActionEvent event);

}
