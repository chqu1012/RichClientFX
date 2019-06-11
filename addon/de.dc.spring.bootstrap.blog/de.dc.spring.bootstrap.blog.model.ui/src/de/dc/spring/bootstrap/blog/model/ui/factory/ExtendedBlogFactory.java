package de.dc.spring.bootstrap.blog.model.ui.factory;

import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;
import de.dc.spring.bootstrap.blog.model.ModelFactory;

public interface ExtendedBlogFactory extends ModelFactory, ExtendedFactory{

	ExtendedBlogFactory eINSTANCE = ExtendedBlogFactoryImpl.init();
}
