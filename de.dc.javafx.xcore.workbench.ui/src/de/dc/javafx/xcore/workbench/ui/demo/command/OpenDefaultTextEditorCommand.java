package de.dc.javafx.xcore.workbench.ui.demo.command;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.event.EmfCommand;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class OpenDefaultTextEditorCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		TabPane pane = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);
		Tab tab = new Tab("Default Texteditor*");
		TextArea textArea = new TextArea();
		AnchorPane anchorPane = new AnchorPane();
		anchorPane.getChildren().add(textArea);
		
		AnchorPane.setBottomAnchor(textArea, 0d);
		AnchorPane.setTopAnchor(textArea, 0d);
		AnchorPane.setLeftAnchor(textArea, 0d);
		AnchorPane.setRightAnchor(textArea, 0d);
		tab.setContent(anchorPane);
		pane.getTabs().add(tab);
	}

}
