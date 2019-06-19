package de.dc.javafx.xcore.resource.ui.demo;

import java.io.File;

import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.PackageFolder;
import de.dc.javafx.xcore.resource.Project;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.view.JavaExplorerTreeView;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import javafx.scene.Parent;

public class ResourceViewApplication extends AbstractApplication{

	@Override
	public Parent getRoot() {
		JavaExplorerTreeView view = new JavaExplorerTreeView();
		IEmfManager<Workspace> manager = view.getEmfManager();
		
		Project javProject = createProject("Java");
		PackageFolder packageFolder = createPackage("de.dc.java.example");
		createJavaFile(packageFolder, "HelloWorld1.java");
		createJavaFile(packageFolder, "HelloWorld2.java");
		createJavaFile(packageFolder, "HelloWorld3.java");
		createJavaFile(packageFolder, "HelloWorld4.java");
		javProject.getResources().add(packageFolder);
		manager.getRoot().getProjects().add(javProject);
		
		manager.getRoot().getProjects().add(createProject("Dot.net"));
		manager.getRoot().getProjects().add(createProject("Dart"));
		manager.getRoot().getProjects().add(createProject("Flutter"));
		manager.getRoot().getProjects().add(createProject("JavaScript"));
		return view;
	}

	private void createJavaFile(PackageFolder packageFolder, String name) {
		de.dc.javafx.xcore.resource.File javaFile = ResourceFactory.eINSTANCE.createFile();
		javaFile.setName( name);
		packageFolder.getResources().add(javaFile);
	}

	private PackageFolder createPackage(String packageFolderPath) {
		PackageFolder packageFolder = ResourceFactory.eINSTANCE.createPackageFolder();
		packageFolder.setName(packageFolderPath);
		return packageFolder;
	}

	private Project createProject(String name) {
		Project project = ResourceFactory.eINSTANCE.createProject();
		project.setName(name);
		return project;
	}
	
	public static void main(String[] args) {
		DIPlatform.init();
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
