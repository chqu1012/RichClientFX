package de.dc.javafx.xcore.lang.lib.feature;

import de.dc.javafx.xcore.lang.lib.model.Contact;
import de.dc.javafx.xcore.lang.lib.model.ContactType;

public class ContactCellFeature extends CellValueFeature<Contact> {

	protected ContactType type;
	
	public ContactCellFeature(ContactType type) {
		this.type = type;
	}
	
	@Override
	protected String getText(Contact value) {
		switch (type) {
		case Name:
			return String.valueOf(value.getName());
		case Address:
			return String.valueOf(value.getAddress());
		case Age:
			return String.valueOf(value.getAge());
		default:
			return "";
		}
	}

}
