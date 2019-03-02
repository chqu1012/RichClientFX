package de.dc.emf.javafx.model.res.controls.cell;

import de.dc.emf.javafx.model.res.model.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class BasePersonCellFeatures implements Callback<TableColumn.CellDataFeatures<Person,Person>, ObservableValue<Person>>{
	
	private PersonType type;
	
	public BasePersonCellFeatures(PersonType type) {
		this.type = type;
	}		

	@Override
	public ObservableValue call(CellDataFeatures<Person, Person> param) {
		return new SimpleStringProperty(getText(param.getValue()));
	}
	
	private String getText(Person item) {
		switch (type) {
		case Name:
			return getName(item);
		case Age:
			return getAge(item);
		default:
			return "";
		}
	}

	protected String getName(Person item) {
		return String.valueOf(item.getName());
	}
	protected String getAge(Person item) {
		return String.valueOf(item.getAge());
	}

}
