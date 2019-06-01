package de.dc.javafx.xcore.workbench.ui.demo.command;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.event.EmfCommand;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class OpenViewInRightPaneCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		TabPane pane = controlManager.findBy(EmfWorkbench.RIGHT_PANE_ID);
		pane.getTabs().add(new Tab("New Example View*"));
	}

}
