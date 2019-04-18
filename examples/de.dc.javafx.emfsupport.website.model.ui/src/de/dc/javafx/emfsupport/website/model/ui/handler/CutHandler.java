package de.dc.javafx.emfsupport.website.model.ui.handler;

import java.util.List;

import org.eclipse.emf.edit.command.CutToClipboardCommand;

import de.dc.javafx.efxclipse.runtime.handler.AbstractCommandHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class CutHandler extends AbstractCommandHandler<Website>{

	public CutHandler(IEmfManager<Website> manager) {
		super(manager);
	}

	@Override
	public boolean canExecute(List<?> selection) {
		if (selection != null) {
			command = CutToClipboardCommand.create(manager.getEditingDomain(), selection);
			return command.canExecute();
		}
		return false;
	}

	@Override
	public void execute() {
		if (command != null && command.canExecute()) {
			manager.getEditingDomain().getCommandStack().execute(command);		
		}
	}

}
