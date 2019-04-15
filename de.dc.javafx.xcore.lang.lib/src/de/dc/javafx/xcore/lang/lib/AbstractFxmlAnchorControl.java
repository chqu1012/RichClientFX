package de.dc.javafx.xcore.lang.lib;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public abstract class AbstractFxmlAnchorControl extends AnchorPane {

	public AbstractFxmlAnchorControl() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getFxmlPath()));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	protected abstract String getFxmlPath();
}
