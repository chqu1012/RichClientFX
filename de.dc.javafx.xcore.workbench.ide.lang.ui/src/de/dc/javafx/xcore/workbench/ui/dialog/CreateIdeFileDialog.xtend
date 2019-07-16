package de.dc.javafx.xcore.workbench.ui.dialog

import static org.eclipse.jdt.core.search.IJavaSearchConstants.INTERFACE
import static org.eclipse.jdt.core.search.IJavaSearchConstants.TYPE
import java.io.IOException
import java.util.ArrayList
import java.util.Arrays
import java.util.Collections
import java.util.function.Consumer
import org.eclipse.emf.common.notify.Adapter
import org.eclipse.emf.common.ui.dialogs.ResourceDialog
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xcore.XPackage
import org.eclipse.emf.ecore.xcore.mappings.XPackageMapping
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.jdt.internal.core.CompilationUnit
import org.eclipse.jdt.internal.core.SourceType
import org.eclipse.jdt.internal.ui.JavaUIMessages
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog
import org.eclipse.jface.dialogs.IDialogConstants
import org.eclipse.jface.dialogs.TitleAreaDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.graphics.Point
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.List
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.PlatformUI
import de.dc.javafx.xcore.workbench.ui.dialog.model.IdeModel

class CreateIdeFileDialog extends TitleAreaDialog {
	Text ecoreFileText
	Text filenameText
	Text factoryText
	Text packageText
	Text itemProviderAdapterFactoryText
	Text rootModelText
	Text modelSwitchText
	CompilationUnit ePackage
	java.util.List<IMethod> availableAttributes = new ArrayList()
	java.util.List<IMethod> usedAttributes = new ArrayList()
	ListViewer editableAttributesListViewer
	ListViewer usedAttributeListViewer
	IdeModel model = new IdeModel()

	new(Shell parentShell) {
		super(parentShell)
	}

	def IdeModel getModel() {
		return model
	}

	/** 
	 * Create contents of the dialog.
	 * @param parent
	 */
	override protected Control createDialogArea(Composite parent) {
		setMessage("Create *.ide files with following properties.")
		setTitle("Ide File Creator")
		var Composite area = (super.createDialogArea(parent) as Composite)
		var Composite container = new Composite(area, SWT.NONE)
		container.setLayout(new GridLayout(3, false))
		container.setLayoutData(new GridData(GridData.FILL_BOTH))
		var Label lblIdeFilename = new Label(container, SWT.NONE)
		lblIdeFilename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblIdeFilename.setText("Ide Filename:")
		filenameText = new Text(container, SWT.BORDER)
		filenameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		new Label(container, SWT.NONE)
		var Label lblEcoreFile = new Label(container, SWT.NONE)
		lblEcoreFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblEcoreFile.setText("Ecore File:")
		ecoreFileText = new Text(container, SWT.BORDER)
		ecoreFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		var Button ecoreFileButton = new Button(container, SWT.NONE)
		ecoreFileButton.addListener(SWT.Selection, [ event |
			var dialog = new EcoreResourceDialog(new Shell, "Select an Ecore Resource", SWT.OPEN.bitwiseOr(SWT.MULTI))
			if (dialog.open === ResourceDialog.OK) {
				for (URI uri : dialog.getURIs()) {
					ecoreFileText.text = uri.toFileString
					var resourceSet = new ResourceSetImpl
					resourceSet.URIConverter.URIMap.putAll(EcorePlugin.computePlatformURIMap(true))
					var resource = resourceSet.getResource(uri, true)
					resource.load(Collections.emptyMap)
					var eObject = resource.contents.get(0)
					if (eObject instanceof XPackage) {
						var xPackage = eObject as XPackage
						var adapters = xPackage.eAdapters
						var adapter = adapters.get(2)
						if (adapter instanceof XPackageMapping) {
							var mapping = adapter as XPackageMapping
							var basePackage = mapping.genPackage.basePackage
							var fileExtensions = xPackage.annotations.get(1).details.get("fileExtensions")
							model.packagePath = basePackage+'.'+fileExtensions
							packageText.setText('''«basePackage».«fileExtensions».«fileExtensions.toFirstUpper»Package''')
							factoryText.setText('''«basePackage».«fileExtensions».«fileExtensions.toFirstUpper»Factory''')
							itemProviderAdapterFactoryText.text ='''«basePackage».«fileExtensions».provider.«fileExtensions.toFirstUpper»ItemProviderAdapterFactory'''
							modelSwitchText.text = '''«basePackage».«fileExtensions».util.«fileExtensions.toFirstUpper»Switch'''
							filenameText.text = fileExtensions
						}
					}

				}
			}
		])
		ecoreFileButton.setText("...")
		new Label(container, SWT.NONE)
		var Button useCustomPropertiesButton = new Button(container, SWT.CHECK)
		useCustomPropertiesButton.setText("use custom properties")
		new Label(container, SWT.NONE)
		var Label lblIdeFactory = new Label(container, SWT.NONE)
		lblIdeFactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblIdeFactory.setText("Ide Factory:")
		factoryText = new Text(container, SWT.BORDER)
		factoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		var Button factoryButton = new Button(container, SWT.NONE)
		factoryButton.setText("...")
		factoryButton.addListener(SWT.Selection, [ event |
			var pattern = if(factoryText.text.isEmpty) "Factory" else '''«factoryText.text»Factory'''
			openTypeDialog(INTERFACE, pattern, [value|factoryText.text=value])
		])
		var Label lblIdePackage = new Label(container, SWT.NONE)
		lblIdePackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblIdePackage.setText("Ide Package:")
		packageText = new Text(container, SWT.BORDER)
		packageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		var Button packageButton = new Button(container, SWT.NONE)
		packageButton.setText("...")
		new Label(container, SWT.NONE)
		packageButton.addListener(SWT.Selection, [ event |
			var pattern = if(packageText.text.isEmpty) "Package" else '''«packageText.text»Package'''
			ePackage = openTypeDialog(INTERFACE, pattern, [value|packageText.text=value])
			availableAttributes.clear
			for (IType type : ePackage.allTypes) {
				availableAttributes+=type.methods
			}
			editableAttributesListViewer.refresh
		])
		var Label lblNewLabel = new Label(container, SWT.NONE)
		lblNewLabel.setText("Generate ItemProviderAdapterFactory")
		new Label(container, SWT.NONE)
		var Label lblIdeAdapterfactory = new Label(container, SWT.NONE)
		lblIdeAdapterfactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblIdeAdapterfactory.setText("Ide AdapterFactory:")
		itemProviderAdapterFactoryText = new Text(container, SWT.BORDER)
		itemProviderAdapterFactoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		var Button itemProviderAdapterFactoryButton = new Button(container, SWT.NONE)
		itemProviderAdapterFactoryButton.setText("...")
		itemProviderAdapterFactoryButton.addListener(SWT.Selection, [ event |
				var String pattern = if(itemProviderAdapterFactoryText.getText().
						isEmpty()) "ItemProviderAdapterFactory" else '''«itemProviderAdapterFactoryText.getText()»ItemProviderAdapterFactory'''
				openTypeDialog(INTERFACE, pattern, [value|itemProviderAdapterFactoryText.setText(value)])
		])
		var Label lblIdeRootmodel = new Label(container, SWT.NONE)
		lblIdeRootmodel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblIdeRootmodel.setText("Ide RootModel:")
		rootModelText = new Text(container, SWT.BORDER)
		rootModelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		var Button rootModelButton = new Button(container, SWT.NONE)
		rootModelButton.setText("...")
		rootModelButton.addListener(SWT.Selection, [ event |
			openTypeDialog(INTERFACE, "", [value|rootModelText.setText(value)])
		])
		var Label lblIdeModelswitchl = new Label(container, SWT.NONE)
		lblIdeModelswitchl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1))
		lblIdeModelswitchl.setText("Ide ModelSwitch:")
		modelSwitchText = new Text(container, SWT.BORDER)
		modelSwitchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		var Button modelSwitchButton = new Button(container, SWT.NONE)
		modelSwitchButton.setText("...")
		modelSwitchButton.addListener(SWT.Selection, [ event |
			{
				var String pattern = if(modelSwitchText.getText().
						isEmpty()) "Switch" else '''«modelSwitchText.getText()»Switch'''
				openTypeDialog(TYPE, pattern, [value|modelSwitchText.setText(value)])
			}
		])
		var Label lblEditableAttributes = new Label(container, SWT.NONE)
		lblEditableAttributes.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1))
		lblEditableAttributes.setText("Editable Attributes")
		var Composite composite_1 = new Composite(container, SWT.NONE)
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1))
		composite_1.setLayout(new GridLayout(3, false))
		var Label lblAvailableAttributes = new Label(composite_1, SWT.NONE)
		lblAvailableAttributes.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1))
		lblAvailableAttributes.setText("Available Attributes")
		new Label(composite_1, SWT.NONE)
		var Label lblUsedAttributesFor = new Label(composite_1, SWT.NONE)
		lblUsedAttributesFor.setText("Used Attributes for Editing")
		editableAttributesListViewer = new ListViewer(composite_1, SWT.BORDER.bitwiseOr(SWT.V_SCROLL))
		var List editableAttributesListView = editableAttributesListViewer.getList()
		var GridData gd_editableAttributesListView = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1)
		gd_editableAttributesListView.widthHint = 250
		editableAttributesListView.setLayoutData(gd_editableAttributesListView)
		editableAttributesListViewer.setLabelProvider(new LabelProvider() {
			override String getText(Object element) {
				if (element instanceof IMethod) {
					var IMethod method = (element as IMethod)
					return method.getElementName()
				}
				return String.valueOf(element)
			}
		})
		editableAttributesListViewer.setContentProvider(ArrayContentProvider.getInstance())
		editableAttributesListViewer.setInput(availableAttributes)
		var Composite composite = new Composite(composite_1, SWT.NONE)
		composite.setLayout(new GridLayout(1, false))
		var Button addButton = new Button(composite, SWT.NONE)
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1))
		addButton.addSelectionListener(new SelectionAdapter() {
			override void widgetSelected(SelectionEvent e) {
				var ISelection selection = editableAttributesListViewer.getSelection()
				if (selection instanceof IStructuredSelection) {
					var IStructuredSelection ss = (selection as IStructuredSelection)
					usedAttributes.add((ss.getFirstElement() as IMethod))
					availableAttributes.remove(ss.getFirstElement())
					editableAttributesListViewer.refresh()
					usedAttributeListViewer.refresh()
				}
			}
		})
		addButton.setBounds(0, 0, 75, 25)
		addButton.setText("->")
		var Button addAllButton = new Button(composite, SWT.NONE)
		addAllButton.addSelectionListener(new SelectionAdapter() {
			override void widgetSelected(SelectionEvent e) {
				usedAttributes.addAll(availableAttributes)
				availableAttributes.clear()
				editableAttributesListViewer.refresh()
				usedAttributeListViewer.refresh()
			}
		})
		addAllButton.setText("=>")
		var Button removeButton = new Button(composite, SWT.NONE)
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1))
		removeButton.setText("<-")
		var Button removeAllButton = new Button(composite, SWT.NONE)
		removeAllButton.addSelectionListener(new SelectionAdapter() {
			override void widgetSelected(SelectionEvent e) {
				availableAttributes.addAll(usedAttributes)
				usedAttributes.clear()
				editableAttributesListViewer.refresh()
				usedAttributeListViewer.refresh()
			}
		})
		removeAllButton.setText("<=")
		removeButton.addSelectionListener(new SelectionAdapter() {
			override void widgetSelected(SelectionEvent e) {
				var ISelection selection = usedAttributeListViewer.getSelection()
				if (selection instanceof IStructuredSelection) {
					var IStructuredSelection ss = (selection as IStructuredSelection)
					availableAttributes.add((ss.getFirstElement() as IMethod))
					usedAttributes.remove(ss.getFirstElement())
					editableAttributesListViewer.refresh()
					usedAttributeListViewer.refresh()
				}
			}
		})
		usedAttributeListViewer = new ListViewer(composite_1, SWT.BORDER.bitwiseOr(SWT.V_SCROLL))
		var List usedAttributeListView = usedAttributeListViewer.getList()
		var GridData gd_usedAttributeListView = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1)
		gd_usedAttributeListView.widthHint = 250
		usedAttributeListView.setLayoutData(gd_usedAttributeListView)
		new Label(container, SWT.NONE)
		new Label(container, SWT.NONE)
		usedAttributeListViewer.setLabelProvider(new LabelProvider() {
			override String getText(Object element) {
				if (element instanceof IMethod) {
					var method = (element as IMethod)
					return method.elementName
				}
				return String.valueOf(element)
			}
		})
		usedAttributeListViewer.setContentProvider(ArrayContentProvider.getInstance())
		usedAttributeListViewer.setInput(usedAttributes)
		var Button generateDemoButton = new Button(container, SWT.CHECK)
		generateDemoButton.setText("Generate Demo")
		new Label(container, SWT.NONE)
		return area
	}

	override protected void buttonPressed(int buttonId) {
		model.setName(filenameText.getText())
		model.getEditableAttributes().addAll(usedAttributes)
		model.setItemProviderAdapterFactory(itemProviderAdapterFactoryText.getText())
		model.setModelSwitch(modelSwitchText.getText())
		model.seteFactory(factoryText.getText())
		model.setePackage(packageText.getText())
		super.buttonPressed(buttonId)
	}

	def CompilationUnit openTypeDialog(int type, String filterPattern, Consumer<String> consumer) {
		var dialog = new OpenTypeSelectionDialog(new Shell, true, PlatformUI.workbench.progressService, null, type)
		dialog.setTitle(JavaUIMessages.OpenTypeAction_dialogTitle)
		dialog.setMessage(JavaUIMessages.OpenTypeAction_dialogMessage)
		dialog.setInitialPattern('''*«filterPattern»''')
		var result = dialog.open
		if (result === 0) {
			for (Object obj : dialog.result) {
				if (obj instanceof SourceType) {
					var sourceType = obj as SourceType
					var element = sourceType.parent as CompilationUnit
					consumer.accept('''«element.packageDeclarations.get(0).elementName».«element.elementName»''')
					return element
				}
			}
		}
		return null
	}

	override protected createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true)
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false)
	}

	override protected getInitialSize() {
		new Point(650, 600)
	}
}
