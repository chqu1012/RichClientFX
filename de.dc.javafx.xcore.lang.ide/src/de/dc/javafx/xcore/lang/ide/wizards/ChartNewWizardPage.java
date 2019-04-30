package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.swt.widgets.Combo;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (javafxlang).
 */

public class ChartNewWizardPage extends WizardPage {
	private Text containerText;

	private Text fileText;

	private ISelection selection;
	private Text chartTitleText;
	private Text xAxisText;
	private Text yAxisText;

	private Combo chartCombo;
	private Text chartClassNameText;

	private ChartModel model;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ChartNewWizardPage(ISelection selection, ChartModel model) {
		super("wizardPage");
		this.model = model;
		setTitle("Multi-page Editor File");
		setDescription("This wizard creates a new file with *.javafxlang extension that can be opened by a multi-page editor.");
		this.selection = selection;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(e -> dialogChanged());

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");
		
		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(e -> dialogChanged());
		new Label(container, SWT.NONE);
		
		Label lblChartType = new Label(container, SWT.NONE);
		lblChartType.setText("Chart Type:");
		
		chartCombo = new Combo(container, SWT.READ_ONLY);
		chartCombo.setItems(new String[] {"PieChart", "AreaChart", "BarChart", "BubbleChart", "LineChart", "ScatterChart", "StackedAreaChart", "DoughnutChart"});
		chartCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		chartCombo.select(0);
		
		new Label(container, SWT.NONE);
		
		Label lblChartClassName = new Label(container, SWT.NONE);
		lblChartClassName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblChartClassName.setText("Chart Class name:");
		
		chartClassNameText = new Text(container, SWT.BORDER);
		chartClassNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		chartClassNameText.addModifyListener(e -> dialogChanged());
		new Label(container, SWT.NONE);
		
		Label lblChartTitle = new Label(container, SWT.NONE);
		lblChartTitle.setText("Chart Title:");
		
		chartTitleText = new Text(container, SWT.BORDER);
		chartTitleText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		chartTitleText.addModifyListener(e -> dialogChanged());
		new Label(container, SWT.NONE);
		
		Label xAxisLabel = new Label(container, SWT.NONE);
		xAxisLabel.setText("XAxis Label");
		
		xAxisText = new Text(container, SWT.BORDER);
		xAxisText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		xAxisText.addModifyListener(e -> dialogChanged());
		new Label(container, SWT.NONE);
		
		Label lblYaxisLabel = new Label(container, SWT.NONE);
		lblYaxisLabel.setText("YAxis Label");
		
		yAxisText = new Text(container, SWT.BORDER);
		yAxisText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		yAxisText.addModifyListener(e -> dialogChanged());
		new Label(container, SWT.NONE);
		initialize();
		dialogChanged();
		setControl(container);
	}


	
	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}else if (obj instanceof PackageFragment) {
				PackageFragment fragment = (PackageFragment) obj;
				containerText.setText(fragment.getPath().toFile().getPath());
				
			}
		}
		fileText.setText("chart.javafxlang");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String fileName = getFileName();

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("javafxlang") == false) {
				updateStatus("File extension must be \"javafxlang\"");
				return;
			}
		}
		
		model.setChartName(getChartClassName());
		model.setChartType(getChartIndex());
		model.setTitle(getChartTitle());
		model.setxAxis(getXAxis());
		model.setyAxis(getYAxis());
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public int getChartIndex() {
		int selectionIndex = chartCombo.getSelectionIndex();
		return selectionIndex;
	}

	public String getChartTitle() {
		String value = chartTitleText.getText();
		return value==null? "" : value;
	}

	public String getChartClassName() {
		String value = chartClassNameText.getText();
		return value==null? "" : value;
	}
	
	public String getXAxis() {
		String value = xAxisText.getText();
		return value==null? "" : value;
	}

	public String getYAxis() {
		String value = yAxisText.getText();
		return value==null? "" : value;
	}
	
	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	
	
}