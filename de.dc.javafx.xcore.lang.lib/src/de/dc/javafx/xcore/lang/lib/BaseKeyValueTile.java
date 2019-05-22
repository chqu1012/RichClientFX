package de.dc.javafx.xcore.lang.lib;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BaseKeyValueTile extends BaseTile {

	@FXML Label valueLabel;
	@FXML Label keyLabel;

	public BaseKeyValueTile(String key) {
		super(key);
		keyLabel.setText(key);
	}
	
	@Override
	protected String getFxmlPath() {
		return "/de/dc/javafx/xcore/lang/lib/KeyValueTile.fxml";
	}
	
	public void setValue(String value) {
		valueLabel.setText(value);
	}

	@Override
	public void setKey(String key) {
		super.setKey(key);
		keyLabel.setText(key);
	}
}
