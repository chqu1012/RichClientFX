package de.dc.javafx.xcore.lang.lib;

import java.io.IOException;

import org.apache.log4j.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public abstract class AbstractFxmlAnchorControl extends AnchorPane {

	private Logger log = Logger.getLogger(AbstractFxmlAnchorControl.class);
	
	public AbstractFxmlAnchorControl() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getFxmlPath()));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.error("Error on loading fxml", exception);
		}
	}

	protected abstract String getFxmlPath();
}
