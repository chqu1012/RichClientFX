package de.dc.javafx.xcore.workbench.chart.ui;

import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.ui.command.GenerateDummyValuesHandler;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.ui.EmfCommandManager;
import javafx.scene.control.Button;

public class ChartFXEmfDetailedTreeView extends EmfDetailedTreeView<ChartProject>{
	
	public ChartFXEmfDetailedTreeView() {
		EmfCommandManager commandManager = DIPlatform.getInstance(EmfCommandManager.class);
		Button generateButtton = new Button("Generate Random Values");
		generateButtton.setOnAction(e-> commandManager.execute(GenerateDummyValuesHandler.ID));
		addToToolbar(generateButtton);
	}

	@Override
	protected EmfTreeModelView<ChartProject> initEmfModelTreeView() {
		return new ChartFXEmfTreeView()	;
	}
	
		
}

