package de.dc.emf.javafx.xtext.demo.cu.feature;

import de.dc.emf.javafx.xtext.demo.cu.model.Contact;
import de.dc.emf.javafx.xtext.demo.cu.model.ContactType;

public class ContactCellFeatures extends BaseContactCellFeatures{

	public ContactCellFeatures(ContactType type) {
		super(type);
	}
	
	@Override
	protected String getGender(Contact item) {
		return item.getGender()? "Man" : "Woman";
	}

}
