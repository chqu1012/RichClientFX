package de.dc.javafx.xcore.workbench.chart.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.VBox;

public class ChartFXEmfDetailTreeView extends SplitPane implements ChangeListener<TreeItem<Object>>{

	ChartFXEmfTreeView treeView = new ChartFXEmfTreeView();
	VBox vbox = new VBox(5.0);
	ObservableList<Boolean> values = FXCollections.observableArrayList();
	
	public ChartFXEmfDetailTreeView() {
		setDividerPositions(0.6);
		getItems().add(treeView);
		getItems().add(vbox);
		
		vbox.setPadding(new Insets(5));
		
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
		
		values.add(true);
		values.add(false);
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		vbox.getChildren().clear();
		Object value = newValue.getValue();
		if (value instanceof EObject) {
			EObject eObject = (EObject) value;
			EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
			for (EAttribute eAttribute : attributes) {
				vbox.getChildren().add(new Label(eAttribute.getName()));
				if (eAttribute.getEType().getName().equals("EBoolean")) {
					ComboBox<Boolean> comboBox = new ComboBox<>(values);
					vbox.getChildren().add(comboBox);
				}else {
					String stringValue = eObject.eGet(eAttribute)==null? "" : eObject.eGet(eAttribute).toString();
					TextField textField = new TextField(stringValue);
//					textField.textProperty().addListener((obs, oldV, newV) -> {
//					    System.out.println("textfield changed from " + oldV + " to " + newV);
//					});
					
					textField.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							System.out.println(textField.getText());
						}
					});
					vbox.getChildren().add(textField);
				}
				
				System.out.println(eAttribute.getName()+": "+eObject.eGet(eAttribute)+", type: "+eAttribute.getEType().getName());
			}
		}
	}
}
