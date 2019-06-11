package de.dc.spring.bootstrap.blog.model.gen;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.dc.spring.bootstrap.blog.model.Blog;
import de.dc.spring.bootstrap.blog.model.ModelFactory;
import de.dc.spring.bootstrap.blog.model.ModelPackage;

public class BlogFile {

	public static final String EXTENSION = "blog";

	public BlogFile() {
		// Initialize the model
		ModelPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		ModelFactory factory = ModelFactory.eINSTANCE;
	}

	@SuppressWarnings("unchecked")
	public Blog load(String filePath) {
		URI uri = URI.createFileURI(filePath);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(EXTENSION, new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		Blog model = (Blog) resource.getContents().get(0);
		return model;
	}

	public void write(Blog model, String path) {
		URI uri = URI.createFileURI(path);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(EXTENSION, new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		resource.getContents().add((EObject) model);

		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}