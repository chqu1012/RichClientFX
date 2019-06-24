package de.dc.javafx.xcore.resource.ui;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.manager.*;
import de.dc.javafx.xcore.resource.ui.view.*;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.*;
import javafx.scene.control.MenuItem;
public class ResourceEmfTreeModelView extends EmfTreeModelView<Workspace> {
	
	public ResourceEmfTreeModelView() {
		// Set edit mode for several attributes
		addEditableFor(ResourcePackage.eINSTANCE.getFile_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getProject_Name());

		MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+" Preview");
		openPreviewMenuItem.setOnAction(e->{
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>("open.preview", new ResourcePreview()));
		});
		openWithMenu.getItems().add(openPreviewMenuItem);
		
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	public IEmfManager<Workspace> getEmfManager() {
		if (manager==null) {
			manager = new ResourceEmfManager();
		}
		return manager;
	}

	@Subscribe
	public void updateViewByEventBroker(EventContext<EmfCommand> context) {
		if (context.getEventTopic()==EventTopic.COMMAND_STACK_REFRESH) {
			if (context.getInput() instanceof EmfCommand) {
//				manager.getRoot().getValues().add(context.getInput());
			}
		}
	}
	
	@Override
	public IEmfManager<Workspace> initEmfManager() {
		return new ResourceEmfManager();
	}
}
