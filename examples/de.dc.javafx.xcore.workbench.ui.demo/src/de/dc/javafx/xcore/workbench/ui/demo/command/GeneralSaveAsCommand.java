package de.dc.javafx.xcore.workbench.ui.demo.command;

import java.io.File;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.emf.file.IEmfFileService;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class GeneralSaveAsCommand extends EmfCommand {

	@Inject
	IEmfControlManager controlManager;

	@Override
	public void execute() {
		TabPane editorArea = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);
		Tab tab = editorArea.getSelectionModel().getSelectedItem();
		Node content = tab.getContent();
		if (content instanceof IEmfFileService) {
			IEmfFileService service = (IEmfFileService) content;
			FileChooser chooser = new FileChooser();
			chooser.setTitle("Save "+service.getExtension()+" File");
			chooser.getExtensionFilters().add(new ExtensionFilter(service.getExtension()+" File", "*."+service.getExtension()));
			chooser.setInitialFileName(tab.getText());
			File file = chooser.showSaveDialog(new Stage());
			if (file != null) {
				service.save(file);
			}
		}
	}

}