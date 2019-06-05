package de.dc.javafx.xcore.example.feature;

import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.lang.lib.feature.ListCellFeature;

public class NameListCellFeature extends ListCellFeature<Contact>{

	@Override
	protected String getValue(Contact item) {
		return "Name: "+item.getName();
	}

}
