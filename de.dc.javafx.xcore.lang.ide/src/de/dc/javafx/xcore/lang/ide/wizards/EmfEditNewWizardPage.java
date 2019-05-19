package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;

import de.dc.javafx.xcore.lang.ide.templates.EmfEditModel;

public class EmfEditNewWizardPage extends BaseWizardPage<EmfEditModel> {

	protected EmfEditNewWizardPage(ISelection selection, EmfEditModel model) {
		super(selection, model);
	}

	@Override
	protected String title() {
		return "JavaFX Lang EMF.edit File";
	}

	@Override
	protected void createContent(Composite container) {
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		fileText.setText("Model.javafxemf");
	}
	
	@Override
	protected String getFileExtension() {
		return "javafxemf";
	}
	
	@Override
	protected void fillModel() {
		model.setPackagePath(packageText.getText());
		model.setName(fileText.getText());
	}
}