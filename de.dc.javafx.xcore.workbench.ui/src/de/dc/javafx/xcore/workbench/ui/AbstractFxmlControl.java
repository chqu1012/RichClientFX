package de.dc.javafx.xcore.workbench.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public abstract class AbstractFxmlControl extends BorderPane {

	private Logger log = Logger.getLogger(AbstractFxmlControl.class.getSimpleName());

	public static final String BASE_PATH = "/de/dc/javafx/xcore/workbench/ui/";
	
	public AbstractFxmlControl() {
		String fxmlName = fxmlName().replace(".fxml", "");
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(BASE_PATH+fxmlName+".fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}
	}
	
	protected String fxmlName() {
		return getClass().getSimpleName();
	}
}
