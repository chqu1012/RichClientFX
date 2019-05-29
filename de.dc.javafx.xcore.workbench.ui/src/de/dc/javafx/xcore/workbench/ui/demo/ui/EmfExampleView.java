package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.workbench.ui.control.EmfView;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class EmfExampleView extends EmfView{
	
	@Override
	protected String title() {
		return "HelloWorld";
	}

	@Override
	protected void createPartControl(AnchorPane parent) {
		Button button = new Button("Press Me");
		parent.getChildren().add(button);
	}

}
