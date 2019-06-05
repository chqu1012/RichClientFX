package de.dc.javafx.xcore.workbench.ui.demo.command;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.ISelectionService;

public class RunCommand extends EmfCommand {

	@Override
	public void execute() {
		ISelectionService selectionService = DIPlatform.getInstance(ISelectionService.class);
		System.out.println("Run Java Code! Selection: "+selectionService.getSelection().get());
	}

}
