package de.dc.spring.bootstrap.blog.model.ui;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.spring.bootstrap.blog.model.Blog;
import de.dc.spring.bootstrap.blog.model.ModelPackage;
import de.dc.spring.bootstrap.blog.model.ui.manager.BlogModelManager;

public class BlogEmfTreeView extends EmfTreeModelView<Blog> {

	public BlogEmfTreeView() {
		// Set edit mode for several attributes
		addEditableFor(ModelPackage.eINSTANCE.getBlog_Title());
		addEditableFor(ModelPackage.eINSTANCE.getTile_Title());
	}

	@Override
	protected IEmfManager<Blog> getEmfManager() {
		return new BlogModelManager();
	}
}
