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
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(BASE_PATH+getClass().getSimpleName()+".fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}
	}
}
