package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.jface.viewers.ISelection;

import de.dc.javafx.xcore.lang.ide.templates.ChartTemplate;
import de.dc.javafx.xcore.lang.ide.wizards.model.ChartModel;

public class ChartNewWizard extends BaseWizard<ChartModel> {

	public ChartNewWizard(ISelection selection, ChartModel model) {
		super(selection, model);
	}
	
	@Override
	protected BaseWizardPage<ChartModel> getWizardPage(ISelection selection, ChartModel model) {
		return new ChartNewWizardPage(selection, model);
	}

	@Override
	protected String getTemplateContent(ChartModel model) {
		return ChartTemplate.getTemplate(model);
	}
}