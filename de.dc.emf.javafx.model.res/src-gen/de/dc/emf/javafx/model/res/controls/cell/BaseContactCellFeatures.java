package de.dc.emf.javafx.model.res.controls.cell;

import de.dc.emf.javafx.model.res.model.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class BaseContactCellFeatures implements Callback<TableColumn.CellDataFeatures<Contact,Contact>, ObservableValue<Contact>>{
	
	private ContactType type;
	
	public BaseContactCellFeatures(ContactType type) {
		this.type = type;
	}		

	@Override
	public ObservableValue call(CellDataFeatures<Contact, Contact> param) {
		return new SimpleStringProperty(getText(param.getValue()));
	}
	
	private String getText(Contact item) {
		switch (type) {
		case Name:
			return getName(item);
		case Age:
			return getAge(item);
		case Gender:
			return getGender(item);
		default:
			return "";
		}
	}

	protected String getName(Contact item) {
		return String.valueOf(item.getName());
	}
	protected String getAge(Contact item) {
		return String.valueOf(item.getAge());
	}
	protected String getGender(Contact item) {
		return String.valueOf(item.getGender());
	}

}
