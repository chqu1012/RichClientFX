package de.dc.javafx.xcore.workbench.ui.demo.command;

import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbenchContext;

public class RunCommand extends EmfCommand {

	@Override
	public void execute() {
		ISelectionService selectionService = EmfWorkbenchContext.getInstance(ISelectionService.class);
		System.out.println("Run Java Code! Selection: "+selectionService.getSelection().get());
	}

}
