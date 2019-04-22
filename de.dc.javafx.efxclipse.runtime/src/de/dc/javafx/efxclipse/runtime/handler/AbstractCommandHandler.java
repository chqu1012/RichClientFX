package de.dc.javafx.efxclipse.runtime.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;

public abstract class AbstractCommandHandler<T> implements ICommandHandler {

	protected Command command;
	protected IEmfManager<T> manager;
	private EditingDomain editingDomain;
	private CommandStack commandStack;

	public AbstractCommandHandler(IEmfManager<T> manager) {
		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		this.commandStack = editingDomain.getCommandStack();
	}
	
	@Override
	public void execute() {
		if (command != null && command.canExecute()) {
			commandStack.execute(command);
		}
	}
}
