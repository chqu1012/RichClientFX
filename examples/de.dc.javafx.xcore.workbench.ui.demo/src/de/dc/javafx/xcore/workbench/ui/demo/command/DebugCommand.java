package de.dc.javafx.xcore.workbench.ui.demo.command;

import de.dc.javafx.xcore.workbench.event.EmfCommand;

public class DebugCommand extends EmfCommand {

	@Override
	public void execute() {
		System.out.println("Debug Java Code!");
	}

}
