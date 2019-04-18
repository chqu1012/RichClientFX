package de.dc.javafx.efxclipse.runtime.handler;

import org.eclipse.emf.common.command.Command;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;

public abstract class AbstractCommandHandler<T> implements ICommandHandler {

	protected Command command;
	protected IEmfManager<T> manager;

	public AbstractCommandHandler(IEmfManager<T> manager) {
		this.manager = manager;
	}
}
