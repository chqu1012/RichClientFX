package de.dc.javafx.xcore.resource.ui.demo;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.BaseResourceManager;
import de.dc.javafx.xcore.resource.ui.view.JavaExplorerTreeView;
import javafx.scene.Parent;

public class JavaExplorerTreeViewApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		IEmfManager<Workspace> manager = new BaseResourceManager();
		// ObservableList<JavaExplorer> JavaExplorers = FXCollections.observableArrayList();
		// for (int i = 0; i < 20; i++) {
		// 	JavaExplorer item = de.dc.javafx.xcore.resource.ResourceFactory.eINSTANCE.createJavaExplorer();
		// 	JavaExplorers.add(item);
		// }
		// manager.getRoot().getJavaExplorers().addAll(JavaExplorers);
		return new JavaExplorerTreeView(manager);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
