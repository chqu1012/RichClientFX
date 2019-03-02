package de.dc.emf.javafx.model.res.controls;

import de.dc.emf.javafx.model.res.controls.cell.*;
import de.dc.emf.javafx.model.res.model.*;
import javafx.scene.control.*;

public abstract class BaseContactTableView extends TableView<Contact>{
	
	protected TableColumn<Contact, Contact> nameColumn;
	protected TableColumn<Contact, Contact> ageColumn;
	protected TableColumn<Contact, Contact> genderColumn;
	
	public BaseContactTableView() {
		nameColumn = createColumn("Name", 200, createNameCellFeatures());
		ageColumn = createColumn("Age", 200, createAgeCellFeatures());
		genderColumn = createColumn("Gender", 200, createGenderCellFeatures());
	}

	protected BaseContactNameCellFeatures createNameCellFeatures() {
		return new BaseContactNameCellFeatures();
	}
	protected BaseContactAgeCellFeatures createAgeCellFeatures() {
		return new BaseContactAgeCellFeatures();
	}
	protected BaseContactGenderCellFeatures createGenderCellFeatures() {
		return new BaseContactGenderCellFeatures();
	}

	protected TableColumn<Contact,Contact> createColumn(String name, double width, TableCell<Contact, Contact> cellFeatures) {
		TableColumn<Contact, Contact> column = new TableColumn<Contact, Contact>(name);
		column.setPrefWidth(width);
		column.setCellFactory(view -> cellFeatures);
		getColumns().add(column);
		return column;
	}
}
