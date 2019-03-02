package de.dc.emf.javafx.model.res.controls;

import de.dc.emf.javafx.model.res.controls.cell.*;
import de.dc.emf.javafx.model.res.model.*;
import javafx.scene.control.*;
import javafx.beans.value.ObservableValue;
import javafx.util.Callback;

public abstract class BasePersonTableView extends TableView<Person>{
	
	protected TableColumn<Person, Person> nameColumn;
	protected TableColumn<Person, Person> ageColumn;
	
	public BasePersonTableView() {
		nameColumn = createColumn("Name", 300,  new BasePersonCellFeatures(PersonType.Name));
		ageColumn = createColumn("Age", 300,  new BasePersonCellFeatures(PersonType.Age));
	}

	protected TableColumn<Person,Person> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<Person,Person>, ObservableValue<Person>> cellFeatures) {
		TableColumn<Person, Person> column = new TableColumn<Person, Person>(name);
		column.setPrefWidth(width);
		column.setCellValueFactory(cellFeatures);
		getColumns().add(column);
		return column;
	}
}
