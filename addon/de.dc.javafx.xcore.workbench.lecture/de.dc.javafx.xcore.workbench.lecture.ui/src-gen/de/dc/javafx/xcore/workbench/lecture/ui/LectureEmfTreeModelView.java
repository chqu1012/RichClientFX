package de.dc.javafx.xcore.workbench.lecture.ui;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.ui.manager.*;
import de.dc.javafx.xcore.workbench.lecture.ui.view.*;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.*;
import javafx.scene.control.MenuItem;
public class LectureEmfTreeModelView extends EmfTreeModelView<LectureProject> {
	
	public LectureEmfTreeModelView() {
		// Set edit mode for several attributes
		addEditableFor(LecturePackage.eINSTANCE.getSection_Name());

		MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+" Preview");
		openPreviewMenuItem.setOnAction(e->{
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>("open.preview", new LecturePreview()));
		});
		openWithMenu.getItems().add(openPreviewMenuItem);
		
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	public IEmfManager<LectureProject> getEmfManager() {
		if (manager==null) {
			manager = new LectureEmfManager();
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
	public IEmfManager<LectureProject> initEmfManager() {
		return new LectureEmfManager();
	}
}
