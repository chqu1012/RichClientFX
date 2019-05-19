package de.dc.javafx.xcore.lang.ide.handler;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.INewWizard;

import de.dc.javafx.xcore.lang.ide.templates.EmfEditModel;
import de.dc.javafx.xcore.lang.ide.wizards.EmfEditNewWizard;

public class OpenEmfEditWizardHandler extends BaseWizardHandler<EmfEditModel> {

	@Override
	protected INewWizard getWizard(ISelection selection, EmfEditModel model) {
		return new EmfEditNewWizard(selection, model);
	}

	@Override
	protected EmfEditModel getModel() {
		return new EmfEditModel();
	}
}
