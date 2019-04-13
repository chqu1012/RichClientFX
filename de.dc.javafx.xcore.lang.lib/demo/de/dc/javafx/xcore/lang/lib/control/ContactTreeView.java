package de.dc.javafx.xcore.lang.lib.control;

import de.dc.javafx.xcore.lang.lib.BaseTreeView;
import de.dc.javafx.xcore.lang.lib.feature.ContactTreeCellFeature;
import de.dc.javafx.xcore.lang.lib.feature.TreeCellFeature;
import de.dc.javafx.xcore.lang.lib.model.Contact;
import de.dc.javafx.xcore.lang.lib.model.ContactType;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

public class ContactTreeView extends BaseTreeView<Contact> {

	@Override
	protected TreeCellFeature<Contact> getCellFeature() {
		return new ContactTreeCellFeature();
	}

	@Override
	protected void initProperties(ObservableList<PropertyValue> properties) {
		for (ContactType type : ContactType.values()) {
			properties.add(new PropertyValue(type.name(), ""));
		}
	}

	@Override
	protected void onTreeViewSelectionChanged(TreeItem<Contact> oldV, TreeItem<Contact> newV) {
		Contact item = newV.getValue();
		properties.get(0).setValue(item.getName());
	}
}
