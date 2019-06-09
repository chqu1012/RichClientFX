package de.dc.javafx.xcore.workbench.ui.demo.command;

import java.io.File;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.spring.bootstrap.blog.model.ui.BlogEmfTreeView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class OpenBlogCommand extends EmfCommand {

	@Inject IEmfControlManager controlManager;
	
	@Override
	public void execute() {
		FileChooser chooser = new FileChooser();
		chooser.setTitle("Open File");
		chooser.getExtensionFilters().add(new ExtensionFilter("Blog File", "*.blog"));
		File file = chooser.showOpenDialog(new Stage());
		if (file!=null) {
			TabPane editorArea = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);
			Tab editorTab = new Tab(file.getName());
			BlogEmfTreeView tree = new BlogEmfTreeView();
			tree.load(file);
			editorTab.setContent(tree);
			editorArea.getTabs().add(editorTab);
		}
	}

}
