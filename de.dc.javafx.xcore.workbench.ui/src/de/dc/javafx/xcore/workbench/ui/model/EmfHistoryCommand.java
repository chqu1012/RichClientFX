package de.dc.javafx.xcore.workbench.ui.model;

import java.time.LocalDateTime;

import org.eclipse.emf.common.command.Command;

public class EmfHistoryCommand{

	private LocalDateTime timestamp;
	private Command command;
	private String message;
	
	public EmfHistoryCommand() {
	}

	public EmfHistoryCommand(Command command, String message) {
		this.timestamp = LocalDateTime.now();
		this.command = command;
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void undo() {
		if (command.canUndo()) {
			command.undo();
		}
	}
	
	public void redo() {
		command.redo();
	}
}
