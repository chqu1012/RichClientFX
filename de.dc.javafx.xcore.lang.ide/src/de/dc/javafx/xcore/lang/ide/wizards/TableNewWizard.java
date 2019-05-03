package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.jface.viewers.ISelection;

import de.dc.javafx.xcore.lang.ide.templates.TableViewTemplate;
import de.dc.javafx.xcore.lang.ide.wizards.model.TableModel;

public class TableNewWizard extends BaseWizard<TableModel>{

	public TableNewWizard(ISelection selection, TableModel model) {
		super(selection, model);
	}
	
	@Override
	protected BaseWizardPage<TableModel> getWizardPage(ISelection selection, TableModel model) {
		return new TableNewWizardPage(selection, model);
	}
	@Override
	protected String getTemplateContent(TableModel model) {
		return TableViewTemplate.getTemplate(model);
	}

}