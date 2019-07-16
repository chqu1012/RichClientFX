package de.dc.javafx.xcore.workbench.ui.dialog;

import com.google.common.collect.Iterables;
import de.dc.javafx.xcore.workbench.ui.dialog.EcoreResourceDialog;
import de.dc.javafx.xcore.workbench.ui.dialog.model.IdeModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xcore.XPackage;
import org.eclipse.emf.ecore.xcore.mappings.XPackageMapping;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CreateIdeFileDialog extends TitleAreaDialog {
  private Text ecoreFileText;
  
  private Text filenameText;
  
  private Text factoryText;
  
  private Text packageText;
  
  private Text itemProviderAdapterFactoryText;
  
  private Text rootModelText;
  
  private Text modelSwitchText;
  
  private CompilationUnit ePackage;
  
  private List<IMethod> availableAttributes = new ArrayList<IMethod>();
  
  private List<IMethod> usedAttributes = new ArrayList<IMethod>();
  
  private ListViewer editableAttributesListViewer;
  
  private ListViewer usedAttributeListViewer;
  
  private IdeModel model = new IdeModel();
  
  public CreateIdeFileDialog(final Shell parentShell) {
    super(parentShell);
  }
  
  public IdeModel getModel() {
    return this.model;
  }
  
  /**
   * Create contents of the dialog.
   * @param parent
   */
  @Override
  protected Control createDialogArea(final Composite parent) {
    this.setMessage("Create *.ide files with following properties.");
    this.setTitle("Ide File Creator");
    Control _createDialogArea = super.createDialogArea(parent);
    Composite area = ((Composite) _createDialogArea);
    Composite container = new Composite(area, SWT.NONE);
    GridLayout _gridLayout = new GridLayout(3, false);
    container.setLayout(_gridLayout);
    GridData _gridData = new GridData(GridData.FILL_BOTH);
    container.setLayoutData(_gridData);
    Label lblIdeFilename = new Label(container, SWT.NONE);
    GridData _gridData_1 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblIdeFilename.setLayoutData(_gridData_1);
    lblIdeFilename.setText("Ide Filename:");
    Text _text = new Text(container, SWT.BORDER);
    this.filenameText = _text;
    GridData _gridData_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.filenameText.setLayoutData(_gridData_2);
    new Label(container, SWT.NONE);
    Label lblEcoreFile = new Label(container, SWT.NONE);
    GridData _gridData_3 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblEcoreFile.setLayoutData(_gridData_3);
    lblEcoreFile.setText("Ecore File:");
    Text _text_1 = new Text(container, SWT.BORDER);
    this.ecoreFileText = _text_1;
    GridData _gridData_4 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.ecoreFileText.setLayoutData(_gridData_4);
    Button ecoreFileButton = new Button(container, SWT.NONE);
    final Listener _function = (Event event) -> {
      try {
        Shell _shell = new Shell();
        EcoreResourceDialog dialog = new EcoreResourceDialog(_shell, "Select an Ecore Resource", (SWT.OPEN | SWT.MULTI));
        int _open = dialog.open();
        boolean _tripleEquals = (_open == ResourceDialog.OK);
        if (_tripleEquals) {
          List<URI> _uRIs = dialog.getURIs();
          for (final URI uri : _uRIs) {
            {
              this.ecoreFileText.setText(uri.toFileString());
              ResourceSetImpl resourceSet = new ResourceSetImpl();
              resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
              Resource resource = resourceSet.getResource(uri, true);
              resource.load(Collections.<Object, Object>emptyMap());
              EObject eObject = resource.getContents().get(0);
              if ((eObject instanceof XPackage)) {
                XPackage xPackage = ((XPackage) eObject);
                EList<Adapter> adapters = xPackage.eAdapters();
                Adapter adapter = adapters.get(2);
                if ((adapter instanceof XPackageMapping)) {
                  XPackageMapping mapping = ((XPackageMapping) adapter);
                  String basePackage = mapping.getGenPackage().getBasePackage();
                  String fileExtensions = StringExtensions.toFirstUpper(xPackage.getAnnotations().get(1).getDetails().get("fileExtensions"));
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append(basePackage);
                  _builder.append(".");
                  _builder.append(fileExtensions);
                  _builder.append("Package");
                  this.packageText.setText(_builder.toString());
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append(basePackage);
                  _builder_1.append(".");
                  _builder_1.append(fileExtensions);
                  _builder_1.append("Factory");
                  this.factoryText.setText(_builder_1.toString());
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append(basePackage);
                  _builder_2.append(".provider.");
                  _builder_2.append(fileExtensions);
                  _builder_2.append("ItemAdapterFactory");
                  this.itemProviderAdapterFactoryText.setText(_builder_2.toString());
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append(basePackage);
                  _builder_3.append(".util.");
                  _builder_3.append(fileExtensions);
                  _builder_3.append("Switch");
                  this.modelSwitchText.setText(_builder_3.toString());
                  this.filenameText.setText(fileExtensions);
                }
              }
            }
          }
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ecoreFileButton.addListener(SWT.Selection, _function);
    ecoreFileButton.setText("...");
    new Label(container, SWT.NONE);
    Button useCustomPropertiesButton = new Button(container, SWT.CHECK);
    useCustomPropertiesButton.setText("use custom properties");
    new Label(container, SWT.NONE);
    Label lblIdeFactory = new Label(container, SWT.NONE);
    GridData _gridData_5 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblIdeFactory.setLayoutData(_gridData_5);
    lblIdeFactory.setText("Ide Factory:");
    Text _text_2 = new Text(container, SWT.BORDER);
    this.factoryText = _text_2;
    GridData _gridData_6 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.factoryText.setLayoutData(_gridData_6);
    Button factoryButton = new Button(container, SWT.NONE);
    factoryButton.setText("...");
    final Listener _function_1 = (Event event) -> {
      String _xifexpression = null;
      boolean _isEmpty = this.factoryText.getText().isEmpty();
      if (_isEmpty) {
        _xifexpression = "Factory";
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _text_3 = this.factoryText.getText();
        _builder.append(_text_3);
        _builder.append("Factory");
        _xifexpression = _builder.toString();
      }
      String pattern = _xifexpression;
      final Consumer<String> _function_2 = (String value) -> {
        this.factoryText.setText(value);
      };
      this.openTypeDialog(IJavaSearchConstants.INTERFACE, pattern, _function_2);
    };
    factoryButton.addListener(SWT.Selection, _function_1);
    Label lblIdePackage = new Label(container, SWT.NONE);
    GridData _gridData_7 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblIdePackage.setLayoutData(_gridData_7);
    lblIdePackage.setText("Ide Package:");
    Text _text_3 = new Text(container, SWT.BORDER);
    this.packageText = _text_3;
    GridData _gridData_8 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.packageText.setLayoutData(_gridData_8);
    Button packageButton = new Button(container, SWT.NONE);
    packageButton.setText("...");
    new Label(container, SWT.NONE);
    final Listener _function_2 = (Event event) -> {
      try {
        String _xifexpression = null;
        boolean _isEmpty = this.packageText.getText().isEmpty();
        if (_isEmpty) {
          _xifexpression = "Package";
        } else {
          StringConcatenation _builder = new StringConcatenation();
          String _text_4 = this.packageText.getText();
          _builder.append(_text_4);
          _builder.append("Package");
          _xifexpression = _builder.toString();
        }
        String pattern = _xifexpression;
        final Consumer<String> _function_3 = (String value) -> {
          this.packageText.setText(value);
        };
        this.ePackage = this.openTypeDialog(IJavaSearchConstants.INTERFACE, pattern, _function_3);
        this.availableAttributes.clear();
        IType[] _allTypes = this.ePackage.getAllTypes();
        for (final IType type : _allTypes) {
          IMethod[] _methods = type.getMethods();
          Iterables.<IMethod>addAll(this.availableAttributes, ((Iterable<? extends IMethod>)Conversions.doWrapArray(_methods)));
        }
        this.editableAttributesListViewer.refresh();
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    packageButton.addListener(SWT.Selection, _function_2);
    Label lblNewLabel = new Label(container, SWT.NONE);
    lblNewLabel.setText("Generate ItemProviderAdapterFactory");
    new Label(container, SWT.NONE);
    Label lblIdeAdapterfactory = new Label(container, SWT.NONE);
    GridData _gridData_9 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblIdeAdapterfactory.setLayoutData(_gridData_9);
    lblIdeAdapterfactory.setText("Ide AdapterFactory:");
    Text _text_4 = new Text(container, SWT.BORDER);
    this.itemProviderAdapterFactoryText = _text_4;
    GridData _gridData_10 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.itemProviderAdapterFactoryText.setLayoutData(_gridData_10);
    Button itemProviderAdapterFactoryButton = new Button(container, SWT.NONE);
    itemProviderAdapterFactoryButton.setText("...");
    final Listener _function_3 = (Event event) -> {
      String _xifexpression = null;
      boolean _isEmpty = this.itemProviderAdapterFactoryText.getText().isEmpty();
      if (_isEmpty) {
        _xifexpression = "ItemProviderAdapterFactory";
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _text_5 = this.itemProviderAdapterFactoryText.getText();
        _builder.append(_text_5);
        _builder.append("ItemProviderAdapterFactory");
        _xifexpression = _builder.toString();
      }
      String pattern = _xifexpression;
      final Consumer<String> _function_4 = (String value) -> {
        this.itemProviderAdapterFactoryText.setText(value);
      };
      this.openTypeDialog(IJavaSearchConstants.INTERFACE, pattern, _function_4);
    };
    itemProviderAdapterFactoryButton.addListener(SWT.Selection, _function_3);
    Label lblIdeRootmodel = new Label(container, SWT.NONE);
    GridData _gridData_11 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblIdeRootmodel.setLayoutData(_gridData_11);
    lblIdeRootmodel.setText("Ide RootModel:");
    Text _text_5 = new Text(container, SWT.BORDER);
    this.rootModelText = _text_5;
    GridData _gridData_12 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.rootModelText.setLayoutData(_gridData_12);
    Button rootModelButton = new Button(container, SWT.NONE);
    rootModelButton.setText("...");
    final Listener _function_4 = (Event event) -> {
      final Consumer<String> _function_5 = (String value) -> {
        this.rootModelText.setText(value);
      };
      this.openTypeDialog(IJavaSearchConstants.INTERFACE, "", _function_5);
    };
    rootModelButton.addListener(SWT.Selection, _function_4);
    Label lblIdeModelswitchl = new Label(container, SWT.NONE);
    GridData _gridData_13 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
    lblIdeModelswitchl.setLayoutData(_gridData_13);
    lblIdeModelswitchl.setText("Ide ModelSwitch:");
    Text _text_6 = new Text(container, SWT.BORDER);
    this.modelSwitchText = _text_6;
    GridData _gridData_14 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    this.modelSwitchText.setLayoutData(_gridData_14);
    Button modelSwitchButton = new Button(container, SWT.NONE);
    modelSwitchButton.setText("...");
    final Listener _function_5 = (Event event) -> {
      String _xifexpression = null;
      boolean _isEmpty = this.modelSwitchText.getText().isEmpty();
      if (_isEmpty) {
        _xifexpression = "Switch";
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _text_7 = this.modelSwitchText.getText();
        _builder.append(_text_7);
        _builder.append("Switch");
        _xifexpression = _builder.toString();
      }
      String pattern = _xifexpression;
      final Consumer<String> _function_6 = (String value) -> {
        this.modelSwitchText.setText(value);
      };
      this.openTypeDialog(IJavaSearchConstants.TYPE, pattern, _function_6);
    };
    modelSwitchButton.addListener(SWT.Selection, _function_5);
    Label lblEditableAttributes = new Label(container, SWT.NONE);
    GridData _gridData_15 = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
    lblEditableAttributes.setLayoutData(_gridData_15);
    lblEditableAttributes.setText("Editable Attributes");
    Composite composite_1 = new Composite(container, SWT.NONE);
    GridData _gridData_16 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    composite_1.setLayoutData(_gridData_16);
    GridLayout _gridLayout_1 = new GridLayout(3, false);
    composite_1.setLayout(_gridLayout_1);
    Label lblAvailableAttributes = new Label(composite_1, SWT.NONE);
    GridData _gridData_17 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
    lblAvailableAttributes.setLayoutData(_gridData_17);
    lblAvailableAttributes.setText("Available Attributes");
    new Label(composite_1, SWT.NONE);
    Label lblUsedAttributesFor = new Label(composite_1, SWT.NONE);
    lblUsedAttributesFor.setText("Used Attributes for Editing");
    ListViewer _listViewer = new ListViewer(composite_1, (SWT.BORDER | SWT.V_SCROLL));
    this.editableAttributesListViewer = _listViewer;
    org.eclipse.swt.widgets.List editableAttributesListView = this.editableAttributesListViewer.getList();
    GridData gd_editableAttributesListView = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    gd_editableAttributesListView.widthHint = 250;
    editableAttributesListView.setLayoutData(gd_editableAttributesListView);
    this.editableAttributesListViewer.setLabelProvider(new LabelProvider() {
      @Override
      public String getText(final Object element) {
        if ((element instanceof IMethod)) {
          IMethod method = ((IMethod) element);
          return method.getElementName();
        }
        return String.valueOf(element);
      }
    });
    this.editableAttributesListViewer.setContentProvider(ArrayContentProvider.getInstance());
    this.editableAttributesListViewer.setInput(this.availableAttributes);
    Composite composite = new Composite(composite_1, SWT.NONE);
    GridLayout _gridLayout_2 = new GridLayout(1, false);
    composite.setLayout(_gridLayout_2);
    Button addButton = new Button(composite, SWT.NONE);
    GridData _gridData_18 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
    addButton.setLayoutData(_gridData_18);
    addButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent e) {
        ISelection selection = CreateIdeFileDialog.this.editableAttributesListViewer.getSelection();
        if ((selection instanceof IStructuredSelection)) {
          IStructuredSelection ss = ((IStructuredSelection) selection);
          Object _firstElement = ss.getFirstElement();
          CreateIdeFileDialog.this.usedAttributes.add(((IMethod) _firstElement));
          CreateIdeFileDialog.this.availableAttributes.remove(ss.getFirstElement());
          CreateIdeFileDialog.this.editableAttributesListViewer.refresh();
          CreateIdeFileDialog.this.usedAttributeListViewer.refresh();
        }
      }
    });
    addButton.setBounds(0, 0, 75, 25);
    addButton.setText("->");
    Button addAllButton = new Button(composite, SWT.NONE);
    addAllButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent e) {
        CreateIdeFileDialog.this.usedAttributes.addAll(CreateIdeFileDialog.this.availableAttributes);
        CreateIdeFileDialog.this.availableAttributes.clear();
        CreateIdeFileDialog.this.editableAttributesListViewer.refresh();
        CreateIdeFileDialog.this.usedAttributeListViewer.refresh();
      }
    });
    addAllButton.setText("=>");
    Button removeButton = new Button(composite, SWT.NONE);
    GridData _gridData_19 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
    removeButton.setLayoutData(_gridData_19);
    removeButton.setText("<-");
    Button removeAllButton = new Button(composite, SWT.NONE);
    removeAllButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent e) {
        CreateIdeFileDialog.this.availableAttributes.addAll(CreateIdeFileDialog.this.usedAttributes);
        CreateIdeFileDialog.this.usedAttributes.clear();
        CreateIdeFileDialog.this.editableAttributesListViewer.refresh();
        CreateIdeFileDialog.this.usedAttributeListViewer.refresh();
      }
    });
    removeAllButton.setText("<=");
    removeButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent e) {
        ISelection selection = CreateIdeFileDialog.this.usedAttributeListViewer.getSelection();
        if ((selection instanceof IStructuredSelection)) {
          IStructuredSelection ss = ((IStructuredSelection) selection);
          Object _firstElement = ss.getFirstElement();
          CreateIdeFileDialog.this.availableAttributes.add(((IMethod) _firstElement));
          CreateIdeFileDialog.this.usedAttributes.remove(ss.getFirstElement());
          CreateIdeFileDialog.this.editableAttributesListViewer.refresh();
          CreateIdeFileDialog.this.usedAttributeListViewer.refresh();
        }
      }
    });
    ListViewer _listViewer_1 = new ListViewer(composite_1, (SWT.BORDER | SWT.V_SCROLL));
    this.usedAttributeListViewer = _listViewer_1;
    org.eclipse.swt.widgets.List usedAttributeListView = this.usedAttributeListViewer.getList();
    GridData gd_usedAttributeListView = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
    gd_usedAttributeListView.widthHint = 250;
    usedAttributeListView.setLayoutData(gd_usedAttributeListView);
    new Label(container, SWT.NONE);
    new Label(container, SWT.NONE);
    this.usedAttributeListViewer.setLabelProvider(new LabelProvider() {
      @Override
      public String getText(final Object element) {
        if ((element instanceof IMethod)) {
          IMethod method = ((IMethod) element);
          return method.getElementName();
        }
        return String.valueOf(element);
      }
    });
    this.usedAttributeListViewer.setContentProvider(ArrayContentProvider.getInstance());
    this.usedAttributeListViewer.setInput(this.usedAttributes);
    Button generateDemoButton = new Button(container, SWT.CHECK);
    generateDemoButton.setText("Generate Demo");
    new Label(container, SWT.NONE);
    return area;
  }
  
  @Override
  protected void buttonPressed(final int buttonId) {
    this.model.setName(this.filenameText.getText());
    this.model.getEditableAttributes().addAll(this.usedAttributes);
    this.model.setItemProviderAdapterFactory(this.itemProviderAdapterFactoryText.getText());
    this.model.setModelSwitch(this.modelSwitchText.getText());
    this.model.seteFactory(this.factoryText.getText());
    this.model.setePackage(this.packageText.getText());
    super.buttonPressed(buttonId);
  }
  
  private CompilationUnit openTypeDialog(final int type, final String filterPattern, final Consumer<String> consumer) {
    Shell _shell = new Shell();
    IProgressService _progressService = PlatformUI.getWorkbench().getProgressService();
    OpenTypeSelectionDialog dialog = new OpenTypeSelectionDialog(_shell, true, _progressService, null, type);
    dialog.setTitle(JavaUIMessages.OpenTypeAction_dialogTitle);
    dialog.setMessage(JavaUIMessages.OpenTypeAction_dialogMessage);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*");
    _builder.append(filterPattern);
    dialog.setInitialPattern(_builder.toString());
    int result = dialog.open();
    if ((result == 0)) {
      Object[] _result = dialog.getResult();
      for (final Object obj : _result) {
        if ((obj instanceof SourceType)) {
          SourceType sourceType = ((SourceType) obj);
          IJavaElement _parent = sourceType.getParent();
          CompilationUnit element = ((CompilationUnit) _parent);
          try {
            StringConcatenation _builder_1 = new StringConcatenation();
            String _elementName = element.getPackageDeclarations()[0].getElementName();
            _builder_1.append(_elementName);
            _builder_1.append(".");
            String _elementName_1 = element.getElementName();
            _builder_1.append(_elementName_1);
            consumer.accept(_builder_1.toString());
            return element;
          } catch (final Throwable _t) {
            if (_t instanceof JavaModelException) {
              final JavaModelException e1 = (JavaModelException)_t;
              e1.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
    }
    return null;
  }
  
  /**
   * Create contents of the button bar.
   * @param parent
   */
  @Override
  protected void createButtonsForButtonBar(final Composite parent) {
    this.createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    this.createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
  }
  
  /**
   * Return the initial size of the dialog.
   */
  @Override
  protected Point getInitialSize() {
    return new Point(650, 600);
  }
}
