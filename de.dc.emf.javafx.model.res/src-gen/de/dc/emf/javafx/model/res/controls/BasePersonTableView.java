package de.dc.emf.javafx.model.res.controls;

import de.dc.emf.javafx.model.res.controls.cell.*;
import de.dc.emf.javafx.model.res.model.*;
import javafx.scene.control.*;

public abstract class BasePersonTableView extends TableView<Person>{
	
	protected TableColumn<Person, Person> ageColumn;
	protected TableColumn<Person, Person> nameColumn;
	
	public BasePersonTableView() {
		ageColumn = createColumn("Age", 300, createAgeCellFeatures());
		nameColumn = createColumn("Name", 300, createNameCellFeatures());
	}

	protected BaseAgeCellFeatures createAgeCellFeatures() {
		return new BaseAgeCellFeatures();
	}
	protected BaseNameCellFeatures createNameCellFeatures() {
		return new BaseNameCellFeatures();
	}

	protected TableColumn<Person,Person> createColumn(String name, double width, TableCell<Person, Person> cellFeatures) {
		TableColumn<Person, Person> column = new TableColumn<Person, Person>(name);
		column.setPrefWidth(width);
		column.setCellFactory(view -> cellFeatures);
		getColumns().add(column);
		return column;
	}
}
