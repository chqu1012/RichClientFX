package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.feature.AgeTreeCellFeature;
import de.dc.javafx.xcore.example.feature.BaseContactTableCellFeatures;
import de.dc.javafx.xcore.example.feature.GenderTreeCellFeature;
import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactTableType;
import de.dc.javafx.xcore.lang.lib.BaseTableView;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import java.util.function.Predicate;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;

@SuppressWarnings("all")
public class BaseContactTable extends BaseTableView<Contact> {
  @Override
  public void onViewSelectionChanged(final Contact oldV, final Contact newV) {
    properties.get(0).setValue(String.valueOf(newV.getName()));
    properties.get(1).setValue(String.valueOf(newV.getAge()));
    properties.get(2).setValue(String.valueOf(newV.getGender()));
    properties.get(3).setValue(String.valueOf(newV.getAddress()));
  }
  
  @Override
  public void initProperties(final ObservableList<PropertyValue> properties) {
    for (ContactTableType type : ContactTableType.values()) {
    	properties.add(new PropertyValue(type.name(), ""));
    }
  }
  
  @Override
  public void initColumns() {
    createColumn(ContactTableType.Name, Double.valueOf(200));
    createColumn(ContactTableType.Age, Double.valueOf(200)).setCellValueFactory(new AgeTreeCellFeature());
    createColumn(ContactTableType.Gender, Double.valueOf(200)).setCellValueFactory(new GenderTreeCellFeature());
    createColumn(ContactTableType.Address, Double.valueOf(200));
  }
  
  public TableColumn<Contact, Contact> createColumn(final ContactTableType type, final Double size) {
    return createColumn(type.name(), size, new BaseContactTableCellFeatures(type));
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
