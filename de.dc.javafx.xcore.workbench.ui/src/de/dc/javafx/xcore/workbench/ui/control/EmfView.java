package de.dc.javafx.xcore.workbench.ui.control;

import javafx.scene.layout.BorderPane;

public abstract class EmfView extends BorderPane {

	public EmfView() {
		createPartControl(this);
	}

	protected abstract void createPartControl(BorderPane parent);
}
