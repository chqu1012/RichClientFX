package de.dc.emf.javafx.xtext.demo.cu.feature;

import de.dc.emf.javafx.xtext.demo.cu.model.Contact;
import de.dc.emf.javafx.xtext.demo.cu.model.ContactType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseContactCellFeatures implements Callback<TableColumn.CellDataFeatures<Contact, Contact>, ObservableValue<Contact>> {
  private ContactType type;
  
  public BaseContactCellFeatures(final ContactType type) {
    this.type = type;
  }
  
  @Override
  public ObservableValue call(final TableColumn.CellDataFeatures<Contact, Contact> feature) {
    return new SimpleStringProperty(getText(feature.getValue()));
  }
  
  protected String getText(final Contact item) {
    switch (type) {
    	case Name:
    		return getName(item);
    	case Age:
    		return getAge(item);
    	case Gender:
    		return getGender(item);
    	case Address:
    		return getAddress(item);
    	default:
    		return "";
    	}
  }
  
  protected String getName(final Contact item) {
    return String.valueOf(item.getName());
  }
  
  protected String getAge(final Contact item) {
    return String.valueOf(item.getAge());
  }
  
  protected String getGender(final Contact item) {
    return String.valueOf(item.getGender());
  }
  
  protected String getAddress(final Contact item) {
    return String.valueOf(item.getAddress());
  }
}
