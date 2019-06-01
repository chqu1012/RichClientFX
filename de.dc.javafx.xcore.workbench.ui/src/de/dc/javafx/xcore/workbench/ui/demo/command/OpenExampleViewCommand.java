package de.dc.javafx.xcore.workbench.ui.demo.command;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.event.EmfCommand;
import javafx.scene.control.Tab;

public class OpenExampleViewCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		EmfWorkbench workbench = controlManager.findBy("root.emf.workbench");
		workbench.getRightTabPane().getTabs().add(new Tab("New Example View*"));
	}

}
