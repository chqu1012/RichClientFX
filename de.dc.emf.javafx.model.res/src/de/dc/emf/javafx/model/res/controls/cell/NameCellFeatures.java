package de.dc.emf.javafx.model.res.controls.cell;

import de.dc.emf.javafx.model.res.model.Contact;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class NameCellFeatures implements Callback<TableColumn.CellDataFeatures<Contact,Contact>, ObservableValue<Contact>>{

	@Override
	public ObservableValue call(CellDataFeatures<Contact, Contact> param) {
		return new SimpleStringProperty(param.getValue().getName());
	}

}
