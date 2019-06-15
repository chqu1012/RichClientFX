package de.dc.javafx.xcore.workbench.ui.file;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public abstract class EmfFile<T> {

	private Logger log = Logger.getLogger(EmfFile.class.getSimpleName());
	
	public EmfFile() {
		// Initialize the model
		getEPackageEInstance().eClass();

		// Retrieve the default factory singleton
		getEFactoryEInstance();
	}

	@SuppressWarnings("unchecked")
	public T load(String filePath) {
		URI uri = URI.createFileURI(filePath);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(getExtension(), new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		T model = (T) resource.getContents().get(0);
		return model;
	}

	public void write(T model, String path) {
		URI uri = URI.createFileURI(path);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(getExtension(), new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		resource.getContents().add((EObject) model);

		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			log.log(Level.SEVERE, "Failed to write emf file with path "+path);
		}
	}
	
	protected abstract EPackage getEPackageEInstance();

	protected abstract EFactory getEFactoryEInstance();
	
	public abstract String getExtension();
}
