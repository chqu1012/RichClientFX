package de.dc.spring.bootstrap.blog.model.ui.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.ui.file.EmfFile;
import de.dc.spring.bootstrap.blog.model.Blog;
import de.dc.spring.bootstrap.blog.model.ModelFactory;
import de.dc.spring.bootstrap.blog.model.ModelPackage;

public class BlogFile extends EmfFile<Blog> {

	@Override
	protected EPackage getEPackageEInstance() {
		return ModelPackage.eINSTANCE;
	}

	@Override
	protected EFactory getEFactoryEInstance() {
		return ModelFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "blog";
	}

}
