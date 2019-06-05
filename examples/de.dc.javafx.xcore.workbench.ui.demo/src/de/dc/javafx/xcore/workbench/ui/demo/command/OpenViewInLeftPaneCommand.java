package de.dc.javafx.xcore.workbench.ui.demo.command;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.event.EmfCommand;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class OpenViewInLeftPaneCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		TabPane leftPane = controlManager.findBy(EmfWorkbench.LEFT_PANE_ID);
		leftPane.getTabs().add(new Tab("New Left View*"));
	}

}
