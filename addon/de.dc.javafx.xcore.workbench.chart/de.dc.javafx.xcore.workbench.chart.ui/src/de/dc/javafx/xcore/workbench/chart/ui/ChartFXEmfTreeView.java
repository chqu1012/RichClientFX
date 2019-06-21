package de.dc.javafx.xcore.workbench.chart.ui;
import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.ui.manager.ChartFXEmfManager;
import de.dc.javafx.xcore.workbench.chart.ui.view.ChartFXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.scene.control.MenuItem;

public class ChartFXEmfTreeView extends EmfTreeModelView<ChartProject> {

	public ChartFXEmfTreeView() {
		// Set edit mode for several attributes
		addEditableFor(ChartPackage.eINSTANCE.getCategoryValueFX_Name());
		addEditableFor(ChartPackage.eINSTANCE.getCategoryValueFX_Value());
		addEditableFor(ChartPackage.eINSTANCE.getChartFX_XAxisLabel());
		addEditableFor(ChartPackage.eINSTANCE.getChartFX_YAxisLabel());
		addEditableFor(ChartPackage.eINSTANCE.getXYValueFX_X());
		addEditableFor(ChartPackage.eINSTANCE.getXYValueFX_Y());
		addEditableFor(ChartPackage.eINSTANCE.getSeriesFX_Name());
		
		MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+" Preview");
		openPreviewMenuItem.setOnAction(e->{
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>("open.preview", new ChartFXPreview()));
		});
		openWithMenu.getItems().add(openPreviewMenuItem);
		
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	public IEmfManager<ChartProject> getEmfManager() {
		if (emfManager==null) {
			emfManager = new ChartFXEmfManager();
		}
		return emfManager;
	}

	@Subscribe
	public void updateViewByEventBroker(EventContext<EmfCommand> context) {
		if (context.getEventTopic()==EventTopic.COMMAND_STACK_REFRESH) {
			if (context.getInput() instanceof EmfCommand) {
//				manager.getRoot().getValues().add(context.getInput());
			}
		}
	}
}