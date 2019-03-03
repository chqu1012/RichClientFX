package de.dc.emf.javafx.xtext.demo.contact.controls.cell;

import de.dc.emf.javafx.xtext.demo.contact.model.*;
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
		case Forename:
			return getForename(item);
		case FamilyName:
			return getFamilyName(item);
		case Age:
			return getAge(item);
		case Address:
			return getAddress(item);
		default:
			return "";
		}
	}

	protected String getForename(Contact item) {
		return String.valueOf(item.getForename());
	}
	protected String getFamilyName(Contact item) {
		return String.valueOf(item.getFamilyName());
	}
	protected String getAge(Contact item) {
		return String.valueOf(item.getAge());
	}
	protected String getAddress(Contact item) {
		return String.valueOf(item.getAddress());
	}

}
