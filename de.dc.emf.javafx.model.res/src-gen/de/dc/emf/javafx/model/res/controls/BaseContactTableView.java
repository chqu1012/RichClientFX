package de.dc.emf.javafx.model.res.controls;

import de.dc.emf.javafx.model.res.controls.cell.*;
import de.dc.emf.javafx.model.res.model.*;
import javafx.scene.control.*;
import javafx.beans.value.ObservableValue;
import javafx.util.Callback;

public abstract class BaseContactTableView extends TableView<Contact>{
	
	protected TableColumn<Contact, Contact> nameColumn;
	protected TableColumn<Contact, Contact> ageColumn;
	protected TableColumn<Contact, Contact> genderColumn;
	
	public BaseContactTableView() {
		nameColumn = createColumn("Name", 200,  new BaseContactCellFeatures(ContactType.Name));
		ageColumn = createColumn("Age", 200,  new BaseContactCellFeatures(ContactType.Age));
		genderColumn = createColumn("Gender", 200,  new BaseContactCellFeatures(ContactType.Gender));
	}

	protected TableColumn<Contact,Contact> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<Contact,Contact>, ObservableValue<Contact>> cellFeatures) {
		TableColumn<Contact, Contact> column = new TableColumn<Contact, Contact>(name);
		column.setPrefWidth(width);
		column.setCellValueFactory(cellFeatures);
		getColumns().add(column);
		return column;
	}
}
