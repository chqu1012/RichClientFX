package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.dc.javafx.xcore.lang.ide.templates.EMFEditTemplate;
import de.dc.javafx.xcore.lang.ide.templates.EmfEditModel;

public class EmfEditNewWizard extends BaseWizard<EmfEditModel> {

	public EmfEditNewWizard(ISelection selection, EmfEditModel model) {
		super(selection, model);
	}

	@Override
	protected BaseWizardPage<EmfEditModel> getWizardPage(ISelection selection, EmfEditModel model) {
		return new EmfEditNewWizardPage(selection, model);
	}

	@Override
	protected String getTemplateContent(EmfEditModel model) {
		return EMFEditTemplate.get(model);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection=selection;
	}
}