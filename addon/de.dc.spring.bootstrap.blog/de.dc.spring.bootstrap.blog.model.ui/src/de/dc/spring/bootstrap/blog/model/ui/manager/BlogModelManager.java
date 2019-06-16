package de.dc.spring.bootstrap.blog.model.ui.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import de.dc.spring.bootstrap.blog.model.Blog;
import de.dc.spring.bootstrap.blog.model.ModelFactory;
import de.dc.spring.bootstrap.blog.model.ModelPackage;
import de.dc.spring.bootstrap.blog.model.provider.ModelItemProviderAdapterFactory;
import de.dc.spring.bootstrap.blog.model.ui.factory.ExtendedBlogFactory;
import de.dc.spring.bootstrap.blog.model.ui.file.BlogFile;

public class BlogModelManager extends AbstractEmfManager<Blog>{

	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new ModelItemProviderAdapterFactory();
	}

	@Override
	protected Blog initModel() {
		return ModelFactory.eINSTANCE.createBlog();
	}

	@Override
	public EPackage getModelPackage() {
		return ModelPackage.eINSTANCE;
	}

	@Override
	public ExtendedFactory getExtendedModelFactory() {
		return ExtendedBlogFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<Blog> initFile() {
		return new BlogFile();
	}
}
