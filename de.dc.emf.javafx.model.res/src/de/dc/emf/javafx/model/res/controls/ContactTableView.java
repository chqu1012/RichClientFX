package de.dc.emf.javafx.model.res.controls;

import de.dc.emf.javafx.model.res.model.Contact;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class ContactTableView extends BaseContactTableView {

	public ContactTableView() {
		super();
		
		nameColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Contact,Contact>, ObservableValue<Contact>>() {
			
			@Override
			public ObservableValue call(CellDataFeatures<Contact, Contact> param) {
				return new SimpleStringProperty(param.getValue().getName());
			}
		});
//		ageColumn.setCellFactory(view->new BaseContactCellFeatures(ContactType.Age));
//		genderColumn.setCellFactory(view->new BaseContactCellFeatures(ContactType.Gender));
	}
}
