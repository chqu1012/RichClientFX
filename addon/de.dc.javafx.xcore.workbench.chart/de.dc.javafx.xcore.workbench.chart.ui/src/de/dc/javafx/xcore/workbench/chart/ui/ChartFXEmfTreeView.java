package de.dc.javafx.xcore.workbench.chart.ui;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.ui.command.CreateChildrenHandler;
import de.dc.javafx.xcore.workbench.chart.ui.command.GenerateDummyValuesHandler;
import de.dc.javafx.xcore.workbench.chart.ui.manager.ChartFXEmfManager;
import de.dc.javafx.xcore.workbench.chart.ui.view.ChartFXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.EmfCommandManager;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;

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

		MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName() + " Preview");
		openPreviewMenuItem.setOnAction(e -> {
			DIPlatform.getInstance(IEventBroker.class)
					.post(new EventContext<FXPreview>("open.preview", new ChartFXPreview()));
		});
		openWithMenu.getItems().add(openPreviewMenuItem);

		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	public IEmfManager<ChartProject> initEmfManager() {
		return new ChartFXEmfManager();
	}

	@Override
	protected void onTreeKeyBinding(KeyCode code) {
		switch (code) {
		case F6:
			DIPlatform.getInstance(EmfCommandManager.class).execute(GenerateDummyValuesHandler.ID);
			break;
		case F5:
			DIPlatform.getInstance(EmfCommandManager.class).execute(CreateChildrenHandler.ID);
			break;
		default:
			break;
		}
	}

	@Subscribe
	public void updateViewByEventBroker(EventContext<EmfCommand> context) {
		if (context.getEventTopic() == EventTopic.COMMAND_STACK_REFRESH) {
			if (context.getInput() instanceof EmfCommand) {
//				manager.getRoot().getValues().add(context.getInput());
			}
		}
	}
}