package de.dc.javafx.xcore.workbench.chart.ui;

import java.util.Random;

import de.dc.javafx.xcore.workbench.chart.CategorySeriesFX;
import de.dc.javafx.xcore.workbench.chart.CategoryValueFX;
import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;

public class ChartFXEmfDetailedTreeView extends EmfDetailedTreeView<ChartProject>{
	
	private Random random = new Random();

	public ChartFXEmfDetailedTreeView() {
		Button generateButtton = new Button("Generate Random Values");
		generateButtton.setOnAction(e->{
			TreeItem<Object> selection = treeView.getTreeView().getSelectionModel().getSelectedItem();
			if (selection.getValue() instanceof SeriesFX) {
				SeriesFX series = (SeriesFX) selection.getValue();
				for (int i = 0; i < 20; i++) {
					XYValueFX value = ChartFactory.eINSTANCE.createXYValueFX();
					value.setX(i+10);
					value.setY(random.nextDouble());
					series.getValues().add(value);
				}
			}else if (selection.getValue() instanceof CategorySeriesFX) {
				CategorySeriesFX series = (CategorySeriesFX) selection.getValue();
				for (int i = 0; i < 20; i++) {
					CategoryValueFX value = ChartFactory.eINSTANCE.createCategoryValueFX();
					value.setName("Test "+i);
					value.setValue(random.nextDouble());
					series.getValues().add(value);
				}
			}
		});
		addToToolbar(generateButtton);
	}
	
	@Override
	protected EmfTreeModelView<ChartProject> initEmfModelTreeView() {
		return new ChartFXEmfTreeView()	;
	}
	
		
}

