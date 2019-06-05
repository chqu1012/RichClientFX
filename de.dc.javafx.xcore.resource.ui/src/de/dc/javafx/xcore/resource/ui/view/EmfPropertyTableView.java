package de.dc.javafx.xcore.resource.ui.view;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class EmfPropertyTableView extends VBox implements ChangeListener<Object>{

	protected TextField propertySearchText;
	protected TableColumn<EAttribute, String> propertyColumn;
	protected TableColumn<EAttribute, String> valueColumn;
	
	protected EObject currentEObject;
	protected ObservableList<EAttribute> eAttributeList = FXCollections.observableArrayList();
	protected ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	protected FilteredList<EAttribute> filteredProperties = new FilteredList<>(properties, p -> true);
	
	public EmfPropertyTableView() {
		getChildren().add(propertySearchText);
	}
	
	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
		
	}

}
