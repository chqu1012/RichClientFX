package de.dc.emf.javafx.xtext.demo.contact;

import de.dc.emf.javafx.xtext.demo.contact.feature.BaseContactTableViewCellFeatures;
import de.dc.emf.javafx.xtext.demo.contact.model.Contact;
import de.dc.emf.javafx.xtext.demo.contact.model.ContactTableViewType;
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
public class BaseContactTableView extends BaseTableView<Contact> {
  @Override
  public void onViewSelectionChanged(final Contact oldV, final Contact newV) {
    properties.get(0).setValue(String.valueOf(newV.getFirstname()));
    properties.get(1).setValue(String.valueOf(newV.getLastname()));
    properties.get(2).setValue(String.valueOf(newV.getAge()));
    properties.get(3).setValue(String.valueOf(newV.getGender()));
  }
  
  @Override
  public void initProperties(final ObservableList<PropertyValue> properties) {
    for (ContactTableViewType type : ContactTableViewType.values()) {
    	properties.add(new PropertyValue(type.name(), ""));
    }
  }
  
  @Override
  public void initColumns() {
    createColumn(ContactTableViewType.Firstname, Double.valueOf(200));
    createColumn(ContactTableViewType.Lastname, Double.valueOf(200));
    createColumn(ContactTableViewType.Age, Double.valueOf(200));
    createColumn(ContactTableViewType.Gender, Double.valueOf(200));
  }
  
  public TableColumn<Contact, Contact> createColumn(final ContactTableViewType type, final Double size) {
    return createColumn(type.name(), size, new BaseContactTableViewCellFeatures(type));
  }
  
  @Override
  public ObservableValue initSearchfilterBinding() {
    StringProperty searchTextProperty = searchTextfield.textProperty();
    ObjectProperty<Predicate<Contact>> firstnameFilter = new SimpleObjectProperty<>();
    firstnameFilter.bind(Bindings.createObjectBinding(() -> current -> {
    	String searchContent = searchTextfield.getText().toLowerCase();
    	String data = String.valueOf(current.getAge()).toLowerCase();
    	return data.contains(searchContent);
    }, searchTextProperty));
    ObjectProperty<Predicate<Contact>> lastnameFilter = new SimpleObjectProperty<>();
    lastnameFilter.bind(Bindings.createObjectBinding(() -> current -> {
    	String searchContent = searchTextfield.getText().toLowerCase();
    	String data = String.valueOf(current.getAge()).toLowerCase();
    	return data.contains(searchContent);
    }, searchTextProperty));
    ObjectProperty<Predicate<Contact>> ageFilter = new SimpleObjectProperty<>();
    ageFilter.bind(Bindings.createObjectBinding(() -> current -> {
    	String searchContent = searchTextfield.getText().toLowerCase();
    	String data = String.valueOf(current.getAge()).toLowerCase();
    	return data.contains(searchContent);
    }, searchTextProperty));
    ObjectProperty<Predicate<Contact>> genderFilter = new SimpleObjectProperty<>();
    genderFilter.bind(Bindings.createObjectBinding(() -> current -> {
    	String searchContent = searchTextfield.getText().toLowerCase();
    	String data = String.valueOf(current.getAge()).toLowerCase();
    	return data.contains(searchContent);
    }, searchTextProperty));
    return Bindings.createObjectBinding(()->firstnameFilter.get().or(lastnameFilter.get()).or(ageFilter.get()).or(genderFilter.get()), firstnameFilter, lastnameFilter, ageFilter, genderFilter);	
  }
}
