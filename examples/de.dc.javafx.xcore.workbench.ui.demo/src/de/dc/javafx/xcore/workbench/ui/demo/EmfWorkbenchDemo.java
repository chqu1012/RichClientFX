package de.dc.javafx.xcore.workbench.ui.demo;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.ui.BaseEmfModule;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbenchContext;
import de.dc.javafx.xcore.workbench.ui.demo.module.CommandsModule;
import de.dc.javafx.xcore.workbench.ui.demo.ui.ExampleEmfWorkbench;
import javafx.scene.Parent;

public class EmfWorkbenchDemo extends AbstractDemoApplication {

	private static ExampleEmfWorkbench workbench;

	@Override
	protected Parent getRoot() {
		return workbench;
	}

	
	public static void main(String[] args) {
		DIPlatform.add(new BaseEmfModule());
		DIPlatform.add(new CommandsModule());
		DIPlatform.init();
		workbench = EmfWorkbenchContext.getInstance(ExampleEmfWorkbench.class);
		workbench.render();
		launch(args);
	}
}
