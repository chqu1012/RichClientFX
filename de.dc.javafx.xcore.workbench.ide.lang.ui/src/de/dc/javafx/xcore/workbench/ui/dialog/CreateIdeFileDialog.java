package de.dc.javafx.xcore.workbench.ui.dialog;

import static org.eclipse.jdt.core.search.IJavaSearchConstants.INTERFACE;
import static org.eclipse.jdt.core.search.IJavaSearchConstants.TYPE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xcore.XPackage;
import org.eclipse.emf.ecore.xcore.mappings.XPackageMapping;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.ui.JavaUIMessages;
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.xcore.workbench.ui.dialog.model.IdeModel;

public class CreateIdeFileDialog extends TitleAreaDialog {

	private Text ecoreFileText;
	private Text filenameText;
	private Text factoryText;
	private Text packageText;
	private Text itemProviderAdapterFactoryText;
	private Text rootModelText;
	private Text modelSwitchText;

	private CompilationUnit ePackage;
	
	private java.util.List<IMethod> availableAttributes = new ArrayList<>();
	private java.util.List<IMethod> usedAttributes = new ArrayList<>();
	private ListViewer editableAttributesListViewer;
	private ListViewer usedAttributeListViewer;
	
	private IdeModel model = new IdeModel();
	
	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public CreateIdeFileDialog(Shell parentShell) {
		super(parentShell);
		setBlockOnOpen(false);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Create *.ide files with following properties.");
		setTitle("Ide File Creator");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblIdeFilename = new Label(container, SWT.NONE);
		lblIdeFilename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeFilename.setText("Ide Filename:");

		filenameText = new Text(container, SWT.BORDER);
		filenameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblEcoreFile = new Label(container, SWT.NONE);
		lblEcoreFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEcoreFile.setText("Ecore File:");

		ecoreFileText = new Text(container, SWT.BORDER);
		ecoreFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button ecoreFileButton = new Button(container, SWT.NONE);
		ecoreFileButton.addListener(SWT.Selection, event-> {
			ResourceDialog dialog = new EcoreResourceDialog(new Shell(), "Select an Ecore Resource", SWT.OPEN | SWT.MULTI);
			if (dialog.open() == ResourceDialog.OK) {
				for (URI uri : dialog.getURIs()) {
					ecoreFileText.setText(uri.toFileString());
					try {
						ResourceSet resourceSet = new ResourceSetImpl();
						resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
						Resource resource = resourceSet.getResource(uri, true);
						resource.load(Collections.emptyMap());
						EObject eObject = resource.getContents().get(0);
						if (eObject instanceof XPackage) {
							XPackage xPackage = (XPackage) eObject;
							EList<Adapter> adapters = xPackage.eAdapters();
							Adapter adapter = adapters.get(2);
							if (adapter instanceof XPackageMapping) {
								XPackageMapping mapping = (XPackageMapping) adapter;
								String basePackage = mapping.getGenPackage().getBasePackage();

								String fileExtensions=xPackage.getAnnotations().get(1).getDetails().get("fileExtensions");
								
								packageText.setText(basePackage+"."+fileExtensions+"Package");
								factoryText.setText(basePackage+"."+fileExtensions+"Factory");
								itemProviderAdapterFactoryText.setText(basePackage+".provider."+fileExtensions+"ItemAdapterFactory");
								modelSwitchText.setText(basePackage+".util."+fileExtensions+"Switch");
								filenameText.setText(fileExtensions);
							}
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		ecoreFileButton.setText("...");
		new Label(container, SWT.NONE);

		Button useCustomPropertiesButton = new Button(container, SWT.CHECK);
		useCustomPropertiesButton.setText("use custom properties");
		new Label(container, SWT.NONE);

		Label lblIdeFactory = new Label(container, SWT.NONE);
		lblIdeFactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeFactory.setText("Ide Factory:");

		factoryText = new Text(container, SWT.BORDER);
		factoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button factoryButton = new Button(container, SWT.NONE);
		factoryButton.setText("...");
		factoryButton.addListener(SWT.Selection, event -> {
			String pattern = factoryText.getText().isEmpty() ? "Factory" : factoryText.getText()+"Factory";	
			openTypeDialog(INTERFACE, pattern, value-> factoryText.setText(value));
		});

		Label lblIdePackage = new Label(container, SWT.NONE);
		lblIdePackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdePackage.setText("Ide Package:");

		packageText = new Text(container, SWT.BORDER);
		packageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button packageButton = new Button(container, SWT.NONE);
		packageButton.setText("...");
		new Label(container, SWT.NONE);
		packageButton.addListener(SWT.Selection, event -> { 
			String pattern = packageText.getText().isEmpty() ? "Package" : packageText.getText()+"Package";	
			ePackage = openTypeDialog(INTERFACE, pattern, value-> packageText.setText(value));
			try {
				availableAttributes.clear();
				for (IType type : ePackage.getAllTypes()) {
					availableAttributes.addAll(Arrays.asList(type.getMethods()));
				}
				editableAttributesListViewer.refresh();
			} catch (JavaModelException e1) {
				e1.printStackTrace();
			}
		});
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Generate ItemProviderAdapterFactory");
		new Label(container, SWT.NONE);

		Label lblIdeAdapterfactory = new Label(container, SWT.NONE);
		lblIdeAdapterfactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeAdapterfactory.setText("Ide AdapterFactory:");

		itemProviderAdapterFactoryText = new Text(container, SWT.BORDER);
		itemProviderAdapterFactoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button itemProviderAdapterFactoryButton = new Button(container, SWT.NONE);
		itemProviderAdapterFactoryButton.setText("...");
		itemProviderAdapterFactoryButton.addListener(SWT.Selection, event -> {
			String pattern = itemProviderAdapterFactoryText.getText().isEmpty() ? "ItemProviderAdapterFactory" : itemProviderAdapterFactoryText.getText()+"ItemProviderAdapterFactory";	
			openTypeDialog(INTERFACE, pattern, value-> itemProviderAdapterFactoryText.setText(value));
		});

		Label lblIdeRootmodel = new Label(container, SWT.NONE);
		lblIdeRootmodel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeRootmodel.setText("Ide RootModel:");

		rootModelText = new Text(container, SWT.BORDER);
		rootModelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button rootModelButton = new Button(container, SWT.NONE);
		rootModelButton.setText("...");
		rootModelButton.addListener(SWT.Selection, event -> openTypeDialog(INTERFACE, "", value-> rootModelText.setText(value)));

		Label lblIdeModelswitchl = new Label(container, SWT.NONE);
		lblIdeModelswitchl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeModelswitchl.setText("Ide ModelSwitch:");

		modelSwitchText = new Text(container, SWT.BORDER);
		modelSwitchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button modelSwitchButton = new Button(container, SWT.NONE);
		modelSwitchButton.setText("...");
		modelSwitchButton.addListener(SWT.Selection, event -> {
			String pattern = modelSwitchText.getText().isEmpty() ? "Switch" : modelSwitchText.getText()+"Switch";	
			openTypeDialog(TYPE, pattern, value-> modelSwitchText.setText(value));
		});

		Label lblEditableAttributes = new Label(container, SWT.NONE);
		lblEditableAttributes.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		lblEditableAttributes.setText("Editable Attributes");

		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite_1.setLayout(new GridLayout(3, false));

		Label lblAvailableAttributes = new Label(composite_1, SWT.NONE);
		lblAvailableAttributes.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblAvailableAttributes.setText("Available Attributes");
		new Label(composite_1, SWT.NONE);

		Label lblUsedAttributesFor = new Label(composite_1, SWT.NONE);
		lblUsedAttributesFor.setText("Used Attributes for Editing");

		editableAttributesListViewer = new ListViewer(composite_1, SWT.BORDER | SWT.V_SCROLL);
		List editableAttributesListView = editableAttributesListViewer.getList();
		GridData gd_editableAttributesListView = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_editableAttributesListView.widthHint = 250;
		editableAttributesListView.setLayoutData(gd_editableAttributesListView);
		editableAttributesListViewer.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				if (element instanceof IMethod) {
					IMethod method = (IMethod) element;
					return method.getElementName();
				}
				return String.valueOf(element);
			};
		});
		editableAttributesListViewer.setContentProvider(ArrayContentProvider.getInstance());
		editableAttributesListViewer.setInput(availableAttributes);
		
		Composite composite = new Composite(composite_1, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Button addButton = new Button(composite, SWT.NONE);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = editableAttributesListViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					usedAttributes.add((IMethod) ss.getFirstElement());
					availableAttributes.remove(ss.getFirstElement());
					editableAttributesListViewer.refresh();
					usedAttributeListViewer.refresh();
				}
			}
		});
		addButton.setBounds(0, 0, 75, 25);
		addButton.setText("->");
		
		Button addAllButton = new Button(composite, SWT.NONE);
		addAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				usedAttributes.addAll(availableAttributes);
				availableAttributes.clear();
				editableAttributesListViewer.refresh();
				usedAttributeListViewer.refresh();
			}
		});
		addAllButton.setText("=>");
		
		Button removeButton = new Button(composite, SWT.NONE);
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		removeButton.setText("<-");
		
		Button removeAllButton = new Button(composite, SWT.NONE);
		removeAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				availableAttributes.addAll(usedAttributes);
				usedAttributes.clear();
				editableAttributesListViewer.refresh();
				usedAttributeListViewer.refresh();
			}
		});
		removeAllButton.setText("<=");
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = usedAttributeListViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					availableAttributes.add((IMethod) ss.getFirstElement());
					usedAttributes.remove(ss.getFirstElement());
					editableAttributesListViewer.refresh();
					usedAttributeListViewer.refresh();
				}
			}
		});
		
		usedAttributeListViewer = new ListViewer(composite_1, SWT.BORDER | SWT.V_SCROLL);
		List usedAttributeListView = usedAttributeListViewer.getList();
		GridData gd_usedAttributeListView = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_usedAttributeListView.widthHint = 250;
		usedAttributeListView.setLayoutData(gd_usedAttributeListView);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		usedAttributeListViewer.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				if (element instanceof IMethod) {
					IMethod method = (IMethod) element;
					return method.getElementName();
				}
				return String.valueOf(element);
			};
		});
		usedAttributeListViewer.setContentProvider(ArrayContentProvider.getInstance());
		usedAttributeListViewer.setInput(usedAttributes);

		Button generateDemoButton = new Button(container, SWT.CHECK);
		generateDemoButton.setText("Generate Demo");
		new Label(container, SWT.NONE);

		return area;
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if(buttonId==IDialogConstants.OK_ID){
			model.setName(filenameText.getText());
			model.getEditableAttributes().addAll(usedAttributes);
			model.setItemProviderAdapterFactory(itemProviderAdapterFactoryText.getText());
			model.setModelSwitch(modelSwitchText.getText());
			model.seteFactory(factoryText.getText());
			model.setePackage(packageText.getText());
			
		}
		super.buttonPressed(buttonId);
	}

	private CompilationUnit openTypeDialog(int type,String filterPattern, Consumer<String> consumer) {
		OpenTypeSelectionDialog dialog = new OpenTypeSelectionDialog(new Shell(), true,
				PlatformUI.getWorkbench().getProgressService(), null, type);
		dialog.setTitle(JavaUIMessages.OpenTypeAction_dialogTitle);
		dialog.setMessage(JavaUIMessages.OpenTypeAction_dialogMessage);
		dialog.setInitialPattern("*"+filterPattern);
		
		int result = dialog.open();
		if (result == 0) {
			for (Object obj : dialog.getResult()) {
				if (obj instanceof SourceType) {
					SourceType sourceType = (SourceType) obj;
					CompilationUnit element = (CompilationUnit) sourceType.getParent();
					try {
						consumer.accept(element.getPackageDeclarations()[0].getElementName() + "."
								+ element.getElementName());
						return element;
					} catch (JavaModelException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(650, 600);
	}
}