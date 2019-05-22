package de.dc.javafx.xcore.lang.ide.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.core.JavaElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public abstract class BaseWizardPage<T> extends WizardPage{

	public static final String DEFAULT_DESCRIPTION = "This wizard creates a new file with *.javafxlang extension that can be opened by a JavaFX Lang Editor.";
	public static final String DEFAULT_FILE_EXTENSTION = "javafxlang";
	
	protected T model;
	protected ISelection selection;

	protected Text containerText;
	protected Text fileText;
	protected Text packageText;
	
	protected BaseWizardPage(ISelection selection, T model) {
		super("wizardPage");
		this.model = model;
		setTitle(title());
		setDescription(description());
		this.selection = selection;
	}

	private String description() {
		return DEFAULT_DESCRIPTION;
	}

	protected abstract String title();

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
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		fileText = createLabelText(container, "&File name");
		packageText = createLabelText(container, "Package");
		
		createContent(container);
		
		initialize();
		dialogChanged();
		setControl(container);
	}
	
	protected Combo createLabelCombo(Composite parent, String labelContent) {
		new Label(parent, SWT.NONE).setText(labelContent+":");
		
		Combo text = new Combo(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addModifyListener(e -> dialogChanged());
		new Label(parent, SWT.NONE);
		
		return text;
	}

	protected Text createLabelText(Composite parent, String labelContent) {
		new Label(parent, SWT.NONE).setText(labelContent+":");
		
		Text text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addModifyListener(e -> dialogChanged());
		new Label(parent, SWT.NONE);
		
		return text;
	}
	
	protected Button createLabelCheck(Composite parent, String labelContent) {
		new Label(parent, SWT.NONE);
		
		Button button = new Button(parent, SWT.CHECK);
		button.setText(labelContent);
		button.setLayoutData(new GridData(SWT.FILL, SWT.LEFT, true, false, 1, 1));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
		});
		new Label(parent, SWT.NONE);
		
		return button;
	}
	
	protected abstract void createContent(Composite container);

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
			if (!ext.equalsIgnoreCase(getFileExtension())) {
				updateStatus("File extension must be \""+getFileExtension()+"\"");
				return;
			}
		}
		
		fillModel();
		
		updateStatus(null);
	}
	
	protected String getFileExtension() {
		return DEFAULT_FILE_EXTENSTION;
	}

	protected abstract void fillModel();

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	protected void initialize() {
		if (selection != null && !selection.isEmpty()
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
				packageText.setText(container.getProject().getName());
				containerText.setText(container.getFullPath().toString());
			}else if (obj instanceof JavaElement) {
				JavaElement fragment = (JavaElement) obj;
				packageText.setText(fragment.getJavaProject().getElementName());
				containerText.setText(fragment.getPath().toFile().getPath());
			}
		}
		fileText.setText("chart.javafxlang");
	}
	
	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	
}
