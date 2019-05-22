package de.dc.javafx.xcore.lang.lib.control;

import de.dc.javafx.xcore.lang.lib.BaseListView;
import de.dc.javafx.xcore.lang.lib.feature.ContactListCellFeature;
import de.dc.javafx.xcore.lang.lib.model.Contact;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ContactListView extends BaseListView<Contact> {

	@Override
	protected void onViewSelectionChanged(Contact oldV, Contact newV) {
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	protected void initProperties(ObservableList<PropertyValue> properties) {
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	protected Callback<ListView<Contact>, ListCell<Contact>> getCellFeature() {
		return new ContactListCellFeature();
	}
}
