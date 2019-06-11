package de.dc.javafx.xcore.workbench.ui.demo.command;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EmfCommand;

public class RunCommand extends EmfCommand {

	@Override
	public void execute() {
		IEmfSelectionService selectionService = DIPlatform.getInstance(IEmfSelectionService.class);
		System.out.println("Run Java Code! Selection: "+selectionService.getSelection().get());
	}

}
