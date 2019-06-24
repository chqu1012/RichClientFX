package de.dc.javafx.xcore.workbench.extensions;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.extensions.manager.ExtensionEmfManager;
import de.dc.javafx.xcore.workbench.extensions.view.ExtensionPreview;
import javafx.scene.control.MenuItem;
public class ExtensionEmfTreeModelView extends EmfTreeModelView<ExtensionManager> {
	
	public ExtensionEmfTreeModelView() {
		// Set edit mode for several attributes

		MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+" Preview");
		openPreviewMenuItem.setOnAction(e->{
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>("open.preview", new ExtensionPreview()));
		});
		openWithMenu.getItems().add(openPreviewMenuItem);
		
		DIPlatform.getInstance(IEventBroker.class).register(this);
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
	public IEmfManager<ExtensionManager> initEmfManager() {
		return new ExtensionEmfManager();
	}
}
