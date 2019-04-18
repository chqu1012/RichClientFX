package de.dc.javafx.efxclipse.runtime.handler;

import java.util.List;

public interface ICommandHandler {

	boolean canExecute(List<?> selection);
	void execute();
}
