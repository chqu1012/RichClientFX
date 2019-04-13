package de.dc.javafx.xcore.lang.lib.feature;

import de.dc.javafx.xcore.lang.lib.model.Contact;

public class ContactListCellFeature extends ListCellFeature<Contact> {

	@Override
	protected String getValue(Contact item) {
		return item.getName();
	}

}
