package de.dc.javafx.lang.contact.ui.contact.feature;

import de.dc.javafx.lang.contact.ui.contact.model.ContactTableViewType;
import de.dc.javafx.lang.contact.ui.model.Contact;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseContactTableViewCellFeatures implements Callback<TableColumn.CellDataFeatures<Contact, Contact>, ObservableValue<Contact>> {
  private ContactTableViewType type;
  
  public BaseContactTableViewCellFeatures(final ContactTableViewType type) {
    this.type = type;
  }
  
  @Override
  public ObservableValue call(final TableColumn.CellDataFeatures<Contact, Contact> feature) {
    return new SimpleStringProperty(getText(feature.getValue()));
  }
  
  protected String getText(final Contact item) {
    switch (type) {
    	case Firstname:
    		return getFirstname(item);
    	case Lastname:
    		return getLastname(item);
    	case Age:
    		return getAge(item);
    	case Gender:
    		return getGender(item);
    	default:
    		return "";
    	}
  }
  
  protected String getFirstname(final Contact item) {
    return String.valueOf(item.getFirstname());
  }
  
  protected String getLastname(final Contact item) {
    return String.valueOf(item.getLastname());
  }
  
  protected String getAge(final Contact item) {
    return String.valueOf(item.getAge());
  }
  
  protected String getGender(final Contact item) {
    return String.valueOf(item.getGender());
  }
}
