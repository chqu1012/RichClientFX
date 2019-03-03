package de.dc.emf.javafx.xtext.demo.contact.controls;

import de.dc.emf.javafx.xtext.demo.contact.controls.cell.*;
import de.dc.emf.javafx.xtext.demo.contact.model.*;
import javafx.scene.control.*;
import javafx.beans.value.ObservableValue;
import javafx.util.Callback;

public abstract class BaseContactTableView extends TableView<Contact>{
	
	protected TableColumn<Contact, Contact> forenameColumn;
	protected TableColumn<Contact, Contact> familyNameColumn;
	protected TableColumn<Contact, Contact> ageColumn;
	protected TableColumn<Contact, Contact> addressColumn;
	
	public BaseContactTableView() {
		forenameColumn = createColumn("Forename", 100,  new BaseContactCellFeatures(ContactType.Forename));
		familyNameColumn = createColumn("FamilyName", 100,  new BaseContactCellFeatures(ContactType.FamilyName));
		ageColumn = createColumn("Age", 200,  new BaseContactCellFeatures(ContactType.Age));
		addressColumn = createColumn("Address", 50,  new BaseContactCellFeatures(ContactType.Address));
	}

	protected TableColumn<Contact,Contact> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<Contact,Contact>, ObservableValue<Contact>> cellFeatures) {
		TableColumn<Contact, Contact> column = new TableColumn<Contact, Contact>(name);
		column.setPrefWidth(width);
		column.setCellValueFactory(cellFeatures);
		getColumns().add(column);
		return column;
	}
}
