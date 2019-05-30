package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.workbench.ui.control.EmfView;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class EmfExampleView extends EmfView{
	
	@Override
	protected void createPartControl(BorderPane parent) {
		Button button = new Button("Press Me");
		parent.setCenter(button);
	}

}
