package de.dc.javafx.xcore.resource.ui;

import java.io.File;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;

public class ResourceViewApplication extends BaseResourceViewApplication{

	@Override
	public EMFModelView<Workspace> getView(IEmfManager<Workspace> manager) {
		return new ResourceModelView(manager);
	}
	
	public static void main(String[] args) {
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
