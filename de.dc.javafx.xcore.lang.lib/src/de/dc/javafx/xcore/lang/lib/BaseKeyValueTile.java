package de.dc.javafx.xcore.lang.lib;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BaseKeyValueTile extends AbstractFxmlAnchorControl {

	@FXML Label valueLabel, keyLabel;
	
	@Override
	protected String getFxmlPath() {
		return "/de/dc/javafx/xcore/lang/lib/KeyValueTile.fxml";
	}
	
	public void setValue(String value) {
		valueLabel.setText(value);
	}

	public void setKey(String key) {
		keyLabel.setText(key);
	}
}
