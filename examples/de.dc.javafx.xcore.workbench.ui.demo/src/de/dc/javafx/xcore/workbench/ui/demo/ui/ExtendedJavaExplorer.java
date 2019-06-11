package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.resource.Folder;
import de.dc.javafx.xcore.resource.PackageFolder;
import de.dc.javafx.xcore.resource.Project;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.ui.view.JavaExplorerTreeView;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;

public class ExtendedJavaExplorer extends JavaExplorerTreeView {

	public ExtendedJavaExplorer() {
		Project project = ResourceFactory.eINSTANCE.createProject();
		project.setName("MyNewProject");
		
		Folder src = ResourceFactory.eINSTANCE.createFolder();
		src.setName("src");
		project.getResources().add(src);
		
		PackageFolder pckFolder = ResourceFactory.eINSTANCE.createPackageFolder();
		pckFolder.setName("de.dc.my.newproject");
		src.getResources().add(pckFolder);
		
		File javaFile = ResourceFactory.eINSTANCE.createFile();
		javaFile.setName("HelloWorld.java");
		pckFolder.getResources().add(javaFile);
		
		pckFolder.getResources().add(javaFile);
		
		manager.getRoot().getProjects().add(project);
	}
	
	@Override
	protected void onTreeViewMouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			TreeItem newValue = treeView.getSelectionModel().getSelectedItem();
			if (newValue.getValue() instanceof File) {
				File file = (File) newValue.getValue();
				DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.OPEN_EDITOR, file));
			}
		}

	}
}
