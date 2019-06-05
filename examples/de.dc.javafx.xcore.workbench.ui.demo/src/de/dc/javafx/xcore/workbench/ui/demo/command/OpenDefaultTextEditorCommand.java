package de.dc.javafx.xcore.workbench.ui.demo.command;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.demo.ui.EmfDefaultTextEditor;
import javafx.scene.control.TabPane;

public class OpenDefaultTextEditorCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		TabPane pane = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);
		pane.getTabs().add(new EmfDefaultTextEditor());
	}

}
