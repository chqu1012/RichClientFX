package de.dc.javafx.xcore.workbench.chart.ui;
import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.ui.file.ChartFXFile;
import de.dc.javafx.xcore.workbench.chart.ui.manager.ChartFXEmfManager;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.control.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.ui.file.EmfFile;
import javafx.scene.control.TreeView;

public class ChartFXEmfTreeView extends EmfTreeModelView<LineChartFX> {

	public ChartFXEmfTreeView() {
		// Set edit mode for several attributes
		addEditableFor(ChartPackage.eINSTANCE.getXYChartFX_XAxisLabel());
		addEditableFor(ChartPackage.eINSTANCE.getXYChartFX_YAxisLabel());
		addEditableFor(ChartPackage.eINSTANCE.getXYValueFX_X());
		addEditableFor(ChartPackage.eINSTANCE.getXYValueFX_Y());
		addEditableFor(ChartPackage.eINSTANCE.getSeriesFX_Name());
		
//		treeView.setCellFactory(new Callback<TreeView<Object>, TreeCell<Object>>() {
//			@Override
//			public TreeCell call(TreeView<Object> param) {
//				return new CommandCellFactory(manager.getAdapterFactory());
//			}
//		});

		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	protected IEmfManager<LineChartFX> getEmfManager() {
		return new ChartFXEmfManager();
	}

	@Override
	protected EmfFile<LineChartFX> initEmfFile() {
		return new ChartFXFile();
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