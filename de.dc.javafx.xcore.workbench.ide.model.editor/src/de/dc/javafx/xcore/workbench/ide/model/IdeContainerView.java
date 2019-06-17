package de.dc.javafx.xcore.workbench.ide.model;

import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.ui.JavaUIMessages;
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.part.ViewPart;

public class IdeContainerView extends ViewPart {

	public static final String ID = "de.dc.javafx.xcore.workbench.ide.model.IdeContainerView"; //$NON-NLS-1$

	private Text ideContainerText;
	private Text modelFactoryText;
	private Text modelPackageText;
	private Text modelItemAdapterFactoryText;
	private Text modelNameText;
	private Text packageText;
	private Text generatedPathText;

	public IdeContainerView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(3, false));

		Label lblIdeContainer = new Label(container, SWT.NONE);
		lblIdeContainer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeContainer.setText("Ide Container:");

		ideContainerText = new Text(container, SWT.BORDER);
		ideContainerText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblModefactory = new Label(container, SWT.NONE);
		lblModefactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModefactory.setText("ModeFactory:");

		modelFactoryText = new Text(container, SWT.BORDER);
		modelFactoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button modelFactoryButton = new Button(container, SWT.NONE);
		modelFactoryButton.setText("...");
		modelFactoryButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SelectionDialog dialog = new OpenTypeSelectionDialog(new Shell(), true,
						PlatformUI.getWorkbench().getProgressService(), null, IJavaSearchConstants.TYPE);
				dialog.setTitle(JavaUIMessages.OpenTypeAction_dialogTitle);
				dialog.setMessage(JavaUIMessages.OpenTypeAction_dialogMessage);
				int result = dialog.open();
			}
		});

		Label lblModelpackage = new Label(container, SWT.NONE);
		lblModelpackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModelpackage.setText("ModelPackage:");

		modelPackageText = new Text(container, SWT.BORDER);
		modelPackageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button modelPackageButton = new Button(container, SWT.NONE);
		modelPackageButton.setText("...");

		Label lblModelitemadapterfactory = new Label(container, SWT.NONE);
		lblModelitemadapterfactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModelitemadapterfactory.setText("ModelItemAdapterFactory:");

		modelItemAdapterFactoryText = new Text(container, SWT.BORDER);
		modelItemAdapterFactoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button modelItemAdapterFactoryButton = new Button(container, SWT.NONE);
		modelItemAdapterFactoryButton.setText("...");

		Label lblModelName = new Label(container, SWT.NONE);
		lblModelName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModelName.setText("Model Name:");

		modelNameText = new Text(container, SWT.BORDER);
		modelNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPackage.setText("Package:");

		packageText = new Text(container, SWT.BORDER);
		packageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblGeneratedPath = new Label(container, SWT.NONE);
		lblGeneratedPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblGeneratedPath.setText("Generated Path:");

		generatedPathText = new Text(container, SWT.BORDER);
		generatedPathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button generatedPathButton = new Button(container, SWT.NONE);
		generatedPathButton.setText("...");
		new Label(container, SWT.NONE);

		Button btnGenerateProjectArtefacts = new Button(container, SWT.NONE);
		btnGenerateProjectArtefacts.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnGenerateProjectArtefacts.setText("Generate Project Artefacts");
		new Label(container, SWT.NONE);

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

}
