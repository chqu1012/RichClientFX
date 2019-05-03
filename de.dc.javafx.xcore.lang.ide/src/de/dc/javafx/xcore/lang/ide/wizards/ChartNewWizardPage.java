package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.dc.javafx.xcore.lang.ide.wizards.model.ChartModel;

public class ChartNewWizardPage extends BaseWizardPage<ChartModel> {
	
	private Text chartTitleText;
	private Text xAxisText;
	private Text yAxisText;
	private Text chartClassNameText;
	private Combo chartCombo;

	protected ChartNewWizardPage(ISelection selection, ChartModel model) {
		super(selection, model);
	}

	@Override
	protected String title() {
		return "JavaFX Lang Chart File";
	}
	@Override
	protected void createContent(Composite container) {
		chartCombo = createLabelCombo(container, "Chart Type");
		chartCombo.setItems(new String[] {"PieChart", "AreaChart", "BarChart", "BubbleChart", "LineChart", "ScatterChart", "StackedAreaChart", "DoughnutChart"});
		
		chartClassNameText = createLabelText(container, "Class Name");
		chartTitleText = createLabelText(container, "Chart Title");
		xAxisText = createLabelText(container, "XAxis Label");
		yAxisText = createLabelText(container, "YAxis Label");
		
	}
	@Override
	protected void fillModel() {
		if (chartClassNameText!=null) {
			model.setChartName(chartClassNameText.getText());
		}
		model.setTitle(chartTitleText.getText());
		model.setxAxis(xAxisText.getText());
		model.setyAxis(yAxisText.getText());
	}
}