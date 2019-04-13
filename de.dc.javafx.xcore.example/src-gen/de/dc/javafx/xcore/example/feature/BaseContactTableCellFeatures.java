package de.dc.javafx.xcore.example.feature;

import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactTableType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseContactTableCellFeatures implements Callback<TableColumn.CellDataFeatures<Contact, Contact>, ObservableValue<Contact>> {
  private ContactTableType type;
  
  public BaseContactTableCellFeatures(final ContactTableType type) {
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
