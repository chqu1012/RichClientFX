package de.dc.javafx.xcore.workbench.ui.demo;

import de.dc.javafx.xcore.workbench.ui.EmfWorkbench;
import javafx.scene.Parent;

public class EmfWorkbenchDemo extends AbstractDemoApplication {

	@Override
	protected Parent getRoot() {
		return new EmfWorkbench();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
