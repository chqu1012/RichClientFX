package de.dc.javafx.efxclipse.runtime;

import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

public class EMFModelTreeViewApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		return new EMFModelTreeView<>(null);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
