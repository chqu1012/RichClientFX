package de.dc.javafx.emfsupport.website.model.ui.handler;

import java.util.List;

import org.eclipse.emf.edit.command.CopyToClipboardCommand;

import de.dc.javafx.efxclipse.runtime.handler.AbstractCommandHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class CopyHandler extends AbstractCommandHandler<Website>{

	public CopyHandler(IEmfManager<Website> manager) {
		super(manager);
	}

	@Override
	public boolean canExecute(List<?> selection) {
		if (selection != null) {
			command = CopyToClipboardCommand.create(manager.getEditingDomain(), selection);
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
