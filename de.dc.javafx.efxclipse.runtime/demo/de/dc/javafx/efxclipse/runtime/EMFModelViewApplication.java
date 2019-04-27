package de.dc.javafx.efxclipse.runtime;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

public class EMFModelViewApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		IEmfManager<Object> manager = null;
		return new EMFModelView<>(manager);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
