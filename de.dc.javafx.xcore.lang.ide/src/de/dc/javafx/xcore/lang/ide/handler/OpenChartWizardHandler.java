package de.dc.javafx.xcore.lang.ide.handler;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.INewWizard;

import de.dc.javafx.xcore.lang.ide.wizards.ChartNewWizard;
import de.dc.javafx.xcore.lang.ide.wizards.model.ChartModel;

public class OpenChartWizardHandler extends BaseWizardHandler<ChartModel> {

	@Override
	protected INewWizard getWizard(ISelection selection, ChartModel model) {
		return new ChartNewWizard(selection, model);
	}

	@Override
	protected ChartModel getModel() {
		return new ChartModel();
	}

}
