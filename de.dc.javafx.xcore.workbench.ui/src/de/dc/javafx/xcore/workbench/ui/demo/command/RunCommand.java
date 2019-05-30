package de.dc.javafx.xcore.workbench.ui.demo.command;

import de.dc.javafx.xcore.workbench.ui.event.EmfCommand;

public class RunCommand extends EmfCommand {

	@Override
	public void execute() {
		System.out.println("Run Java Code!");
	}
}
