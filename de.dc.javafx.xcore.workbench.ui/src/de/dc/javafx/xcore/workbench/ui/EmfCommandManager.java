package de.dc.javafx.xcore.workbench.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.dc.javafx.xcore.workbench.event.IEmfCommand;

public class EmfCommandManager {

	private Map<String, IEmfCommand> commandRegistry = new HashMap<>();

	public void register(String id, IEmfCommand command) {
		commandRegistry.put(id, command);
	}

	public Optional<IEmfCommand> findBy(String id) {
		return Optional.of(commandRegistry.get(id));
	}

	public void execute(String id) {
		findBy(id).ifPresent(IEmfCommand::execute);
	}
}
