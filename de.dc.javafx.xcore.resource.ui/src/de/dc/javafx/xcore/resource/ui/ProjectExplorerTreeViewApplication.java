package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.model.*;
import javafx.scene.Parent;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;

public class ProjectExplorerTreeViewApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		IEmfManager<Workspace> manager = new BaseResourceManager();
		// ObservableList<ProjectExplorer> ProjectExplorers = FXCollections.observableArrayList();
		// for (int i = 0; i < 20; i++) {
		// 	ProjectExplorer item = de.dc.javafx.xcore.resource.ResourceFactory.eINSTANCE.createProjectExplorer();
		// 	ProjectExplorers.add(item);
		// }
		// manager.getRoot().getProjectExplorers().addAll(ProjectExplorers);
		return new ProjectExplorerTreeView(manager);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
