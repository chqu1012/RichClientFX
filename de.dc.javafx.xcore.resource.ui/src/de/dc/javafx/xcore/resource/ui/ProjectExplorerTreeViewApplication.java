package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.Project;
import de.dc.javafx.xcore.resource.Workspace;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;

public class ProjectExplorerTreeViewApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		IEmfManager<Workspace> manager = new BaseResourceManager();
		ObservableList<Project> projects = FXCollections.observableArrayList();
		for (int i = 0; i < 20; i++) {
			Project item = de.dc.javafx.xcore.resource.ResourceFactory.eINSTANCE.createProject();
			projects.add(item);
		}
		manager.getRoot().getProjects().addAll(projects);
		return new ProjectExplorerTreeView(manager);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
