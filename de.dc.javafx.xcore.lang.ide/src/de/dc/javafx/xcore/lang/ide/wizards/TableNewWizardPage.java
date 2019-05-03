package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.dc.javafx.xcore.lang.ide.wizards.model.TableModel;

public class TableNewWizardPage extends BaseWizardPage<TableModel> {

	private Text tableViewNameText;
	private Button showPropertyButton;
	private Button showToolbarButton;
	private Button generateDemoButton;

	protected TableNewWizardPage(ISelection selection, TableModel model) {
		super(selection, model);
	}

	@Override
	protected String title() {
		return "JavaFX Lang TableView File";
	}

	
//	packagePath 'de.dc.emf.javafx.xtext.demo.contact'
//
//	controls{ 
//		TableViewFX { 
//			name: ContactTableView
//			usedModel: Contact
//			column(name: Firstname usedAttribute:"Contact.firstname" useFilter)
//			column(name: Lastname usedAttribute:"Contact.firstname" useFilter)
//			column(name: Age usedAttribute:"Contact.age" useFilter)
//			column(name: Gender usedAttribute:"Contact.gender" useFilter)
//			showPropertyView: true
//			showToolbar: true
//			generateDemo: true
//		} 
//	}
	
	@Override
	protected void createContent(Composite container) {
		tableViewNameText = createLabelText(container, "TableView Name");
		showPropertyButton = createLabelCheck(container, "Show PropertyView");
		showToolbarButton = createLabelCheck(container, "Show Toolbar");
		generateDemoButton = createLabelCheck(container, "Generate Demo");
		
		
	}

	@Override
	protected void fillModel() {
		model.setGenerateDemo(generateDemoButton.getSelection());
		model.setShowPropertyView(showPropertyButton.getSelection());
		model.setShowToolbar(showToolbarButton.getSelection());
		model.setPackagePath(packageText.getText());
		model.setName(tableViewNameText.getText());
	}
}