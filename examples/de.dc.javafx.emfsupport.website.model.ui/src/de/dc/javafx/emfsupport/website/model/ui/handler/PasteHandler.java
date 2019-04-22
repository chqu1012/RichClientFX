package de.dc.javafx.emfsupport.website.model.ui.handler;

import java.util.List;

import de.dc.javafx.efxclipse.runtime.handler.AbstractCommandHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class PasteHandler extends AbstractCommandHandler<Website> {

	public PasteHandler(IEmfManager<Website> manager) {
		super(manager);
	}
	
	public boolean canExecute(Object selection) {
//		Group group = null;
//
//		if (selectedItem instanceof Contact)
//			// get containing Group if selection is a Contact
//			group = (Group) ((Contact) selectedItem).eContainer();
//
//		else if (selectedItem instanceof Group)
//			group = (Group) selectedItem;
//
//		if (group != null) {
//			command = PasteFromClipboardCommand.create(contactsManager.getEditingDomain(), group,
//					ContactsPackage.eINSTANCE.getGroup_Contacts());
//			return command.canExecute();
//		}
		return false;
	}

	@Override
	public boolean canExecute(List<?> selection) {
		return false;
	}

}
