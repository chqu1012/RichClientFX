package de.dc.javafx.xcore.example.feature;

import de.dc.javafx.xcore.example.model.Contact;

public class GenderTreeCellFeature extends de.dc.javafx.xcore.lang.lib.feature.CellValueFeature<Contact>{

	@Override
	protected String getText(Contact value) {
		return value.getGender()? "Man" : "Woman";
	}

}
