package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.feature.BaseContactCellFeatures;
import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactType;
import de.dc.javafx.xcore.lang.lib.BaseTableView;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import java.util.function.Predicate;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;

@SuppressWarnings("all")
public class BaseContactTable extends BaseTableView<Contact> {
  @Override
  public void onTableViewSelectionChanged(final Contact oldV, final Contact newV) {
    properties.get(0).setValue(String.valueOf(newV.getName()));
    properties.get(1).setValue(String.valueOf(newV.getAge()));
    properties.get(2).setValue(String.valueOf(newV.getGender()));
    properties.get(3).setValue(String.valueOf(newV.getAddress()));
  }
  
  @Override
  public void initProperties(final ObservableList<PropertyValue> properties) {
    for (ContactType type : ContactType.values()) {
    	properties.add(new PropertyValue(type.name(), ""));
    }
  }
  
  @Override
  public void initColumns() {
    createColumn(ContactType.Name, 200.0);
    createColumn(ContactType.Age, 200.0);
    createColumn(ContactType.Gender, 200.0);
    createColumn(ContactType.Address, 200.0);
  }
  
  public void createColumn(final ContactType type, final Double size) {
    createColumn(type.name(), size, new BaseContactCellFeatures(type));
  }
  
  @Override
  public ObservableValue initSearchfilterBinding() {
    StringProperty searchTextProperty = searchTextfield.textProperty();
    ObjectProperty<Predicate<Contact>> ageFilter = new SimpleObjectProperty<>();
    ageFilter.bind(Bindings.createObjectBinding(() -> current -> {
    	String searchContent = searchTextfield.getText().toLowerCase();
    	String data = String.valueOf(current.getAge()).toLowerCase();
    	return data.contains(searchContent);
    }, searchTextProperty));
    return Bindings.createObjectBinding(()->ageFilter.get(), ageFilter);	
  }
}
