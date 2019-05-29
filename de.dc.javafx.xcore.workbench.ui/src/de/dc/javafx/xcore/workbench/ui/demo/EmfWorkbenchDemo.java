package de.dc.javafx.xcore.workbench.ui.demo;

import de.dc.javafx.xcore.workbench.ui.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbenchContext;
import javafx.scene.Parent;

public class EmfWorkbenchDemo extends AbstractDemoApplication {

	private static EmfWorkbench workbench;

	@Override
	protected Parent getRoot() {
		return workbench;
	}

	
	public static void main(String[] args) {
		EmfWorkbenchContext.init();
		workbench = EmfWorkbenchContext.getInstance(EmfWorkbench.class);
		launch(args);
	}
}
