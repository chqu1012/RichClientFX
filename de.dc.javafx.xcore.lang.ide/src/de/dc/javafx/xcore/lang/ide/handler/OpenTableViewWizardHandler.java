package de.dc.javafx.xcore.lang.ide.handler;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.INewWizard;

import de.dc.javafx.xcore.lang.ide.wizards.TableNewWizard;
import de.dc.javafx.xcore.lang.ide.wizards.model.TableModel;

public class OpenTableViewWizardHandler extends BaseWizardHandler<TableModel> {

	@Override
	protected INewWizard getWizard(ISelection selection, TableModel model) {
		return new TableNewWizard(selection, model);
	}

	@Override
	protected TableModel getModel() {
		return new TableModel();
	}
}
