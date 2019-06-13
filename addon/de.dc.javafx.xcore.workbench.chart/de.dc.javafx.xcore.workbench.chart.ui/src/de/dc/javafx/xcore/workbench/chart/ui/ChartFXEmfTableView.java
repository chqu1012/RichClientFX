package de.dc.javafx.xcore.workbench.chart.ui;

import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfTableView;

public class ChartFXEmfTableView extends EmfTableView<SeriesFX> {

	public ChartFXEmfTableView(IEmfManager<SeriesFX> manager) {
		super(manager);
	}
}