package de.dc.javafx.xcore.workbench.ui.demo.command;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class OpenFileCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		FileChooser chooser = new FileChooser();
		chooser.setTitle("Open File");
		chooser.getExtensionFilters().add(new ExtensionFilter("All Files", "*.*"));
		File file = chooser.showOpenDialog(new Stage());
		if (file!=null) {
			try {
				String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
				TabPane editorArea = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);
				
				Tab editorTab = new Tab(file.getName());
				StyledTextArea styledTextArea = new StyledTextArea();
				styledTextArea.getContent().setText(content);
				editorTab.setContent(styledTextArea);
				editorArea.getTabs().add(editorTab);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
