package de.dc.javafx.xcore.workbench.ui.factory;

import java.time.LocalDateTime;

import org.eclipse.emf.common.command.Command;

import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.command.EmfResult;

public class CommandFactory {

	public static EmfCommand create(Command command) {
		return create(command, command.getLabel(), command.getDescription());
	}
	
	public static EmfCommand create(Command command, String name, String description) {
		EmfCommand emfCommand = de.dc.javafx.xcore.workbench.command.CommandFactory.eINSTANCE.createEmfCommand();
		emfCommand.setCommand(command);
		emfCommand.setName(name);
		emfCommand.setDescription(description);
		emfCommand.setTimestamp(LocalDateTime.now());

		command.getResult().forEach(e -> {
			EmfResult result = de.dc.javafx.xcore.workbench.command.CommandFactory.eINSTANCE.createEmfResult();
			result.setName("");
			result.setObject(e);
			emfCommand.getResults().add(result);
		});
		return emfCommand;
	}
}
