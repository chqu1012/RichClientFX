package de.dc.javafx.xcore.workbench.ui.file;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

public class EmfWorkbenchFile {

	public static final String EXTENSION = "workbench";

	public EmfWorkbenchFile() {
		// Initialize the model
		WorkbenchPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		WorkbenchFactory factory = WorkbenchFactory.eINSTANCE;
	}

	public Workbench load(String filePath) {
		URI uri = URI.createFileURI(filePath);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(EXTENSION, new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		Workbench model = (Workbench) resource.getContents().get(0);
		return model;
	}

	public void write(Workbench model, String path) {
		URI uri = URI.createFileURI(path);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(EXTENSION, new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		resource.getContents().add((EObject) model);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}