package de.dc.javafx.emfsupport.website.model.ui.handler;

import java.util.List;

import org.eclipse.emf.edit.command.DeleteCommand;

import de.dc.javafx.efxclipse.runtime.handler.AbstractCommandHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class DeleteContactHandler extends AbstractCommandHandler<Website>{

	public DeleteContactHandler(IEmfManager<Website> manager) {
		super(manager);
	}

	@Override
	public boolean canExecute(List<?> selection) {
		if (selection != null) {
			command = DeleteCommand.create(manager.getEditingDomain(), selection);
			return command.canExecute();
		}
		return false;
	}



}
