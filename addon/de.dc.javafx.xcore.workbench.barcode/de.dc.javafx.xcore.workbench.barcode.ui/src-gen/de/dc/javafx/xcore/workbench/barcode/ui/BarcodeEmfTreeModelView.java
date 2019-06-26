package de.dc.javafx.xcore.workbench.barcode.ui;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject;
import de.dc.javafx.xcore.workbench.barcode.ui.manager.*;
import de.dc.javafx.xcore.workbench.barcode.ui.renderer.*;
import de.dc.javafx.xcore.workbench.barcode.ui.view.BarcodePreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.*;
import javafx.scene.control.MenuItem;
public class BarcodeEmfTreeModelView extends EmfTreeModelView<BarcodeFXProject> {
	
	public BarcodeEmfTreeModelView() {
		// Set edit mode for several attributes
		addEditableFor(BarcodePackage.eINSTANCE.getBarcodeFX_Name());

		MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+" Preview");
		openPreviewMenuItem.setOnAction(e->{
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>("open.preview", new BarcodePreview()));
		});
		openWithMenu.getItems().add(openPreviewMenuItem);
		
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	public IEmfManager<BarcodeFXProject> getEmfManager() {
		if (manager==null) {
			manager = new BarcodeEmfManager();
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
	public IEmfManager<BarcodeFXProject> initEmfManager() {
		return new BarcodeEmfManager();
	}
}
