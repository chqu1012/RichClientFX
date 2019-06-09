package de.dc.javafx.xcore.workbench.ui.demo.command;

import java.io.File;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.spring.bootstrap.blog.model.ui.BlogEmfTreeView;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class SaveBlogCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		TabPane editorArea = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);
		Tab tab = editorArea.getSelectionModel().getSelectedItem();

		FileChooser chooser = new FileChooser();
		chooser.setTitle("Save Blog File");
		chooser.getExtensionFilters().add(new ExtensionFilter("Blog File", "*.blog"));
		chooser.setInitialFileName(tab.getText());
		File file = chooser.showSaveDialog(new Stage());
		if (file!=null) {
			Node content = tab.getContent();
			if (content instanceof BlogEmfTreeView) {
				BlogEmfTreeView tree = (BlogEmfTreeView) content;
				tree.save(file);
			}
		}
	}

}
