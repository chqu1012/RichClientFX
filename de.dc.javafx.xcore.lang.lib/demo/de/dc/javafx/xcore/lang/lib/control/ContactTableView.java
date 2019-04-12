package de.dc.javafx.xcore.lang.lib.control;

import java.util.function.Predicate;

import de.dc.javafx.xcore.lang.lib.BaseTableView;
import de.dc.javafx.xcore.lang.lib.feature.ContactCellFeature;
import de.dc.javafx.xcore.lang.lib.model.Contact;
import de.dc.javafx.xcore.lang.lib.model.ContactType;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;

public class ContactTableView extends BaseTableView<Contact> {

	@Override
	protected void onTableViewSelectionChanged(Contact oldV, Contact newV) {
		properties.get(0).setValue(String.valueOf(newV.getName()));
		properties.get(1).setValue(String.valueOf(newV.getAddress()));
		properties.get(2).setValue(String.valueOf(newV.getAge()));
		properties.get(3).setValue(String.valueOf(newV.getName()));
	}

	@Override
	protected void initProperties(ObservableList<PropertyValue> properties) {
		for (ContactType type : ContactType.values()) {
			properties.add(new PropertyValue(type.name(), ""));
		}
	}

	@Override
	protected void initColumns() {
		createColumn(ContactType.Name, 200.0);
		createColumn(ContactType.Address, 200.0);
		createColumn(ContactType.Age, 200.0);
	}

	private void createColumn(ContactType type, double size) {
		createColumn(type.name(), size, new ContactCellFeature(type));
	}

	@Override
	protected ObservableValue initSearchfilterBinding() {
		StringProperty searchTextProperty = searchTextfield.textProperty();

		ObjectProperty<Predicate<Contact>> ageFilter = new SimpleObjectProperty<>();
		ageFilter.bind(Bindings.createObjectBinding(() -> current -> {
			String searchContent = searchTextfield.getText().toLowerCase();
			String data = String.valueOf(current.getAge()).toLowerCase();
			return data.contains(searchContent);
		}, searchTextProperty));

		ObjectProperty<Predicate<Contact>> nameFilter = new SimpleObjectProperty<>();
		nameFilter.bind(Bindings.createObjectBinding(() -> current -> {
			String searchContent = searchTextfield.getText().toLowerCase();
			String data = String.valueOf(current.getName()).toLowerCase();
			return data.contains(searchContent);
		}, searchTextProperty));
		
		return Bindings.createObjectBinding(()->ageFilter.get().or(nameFilter.get()), ageFilter, nameFilter);		
	}
}
