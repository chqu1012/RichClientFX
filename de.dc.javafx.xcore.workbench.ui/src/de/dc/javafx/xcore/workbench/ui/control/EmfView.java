package de.dc.javafx.xcore.workbench.ui.control;

import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

public abstract class EmfView extends Tab {

	public EmfView() {
		setText(title());
		AnchorPane parent = new AnchorPane();
		setContent(parent);
		createPartControl(parent);
	}

	protected abstract void createPartControl(AnchorPane parent);

	protected abstract String title();
}
