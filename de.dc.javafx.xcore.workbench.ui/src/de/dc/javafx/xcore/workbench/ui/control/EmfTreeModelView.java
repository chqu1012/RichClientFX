package de.dc.javafx.xcore.workbench.ui.control;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.handler.CustomFeedbackHandler;
import de.dc.javafx.efxclipse.runtime.util.EmfUtil;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileService;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.factory.CommandFactory;
import de.dc.javafx.xcore.workbench.ui.handler.EAttributeCellEditHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public abstract class EmfTreeModelView<T> extends VBox implements CommandStackListener, ChangeListener<Object>, IEmfFileService<T> {

	private Logger log = Logger.getLogger(EmfTreeModelView.class.getSimpleName());

	@FXML
	protected ContextMenu contextMenu;
	
	@FXML
	protected MenuItem newMenuItem;
	
	@FXML
	protected MenuItem undoMenuItem;
	
	@FXML
	protected MenuItem redoMenuItem;
	
	@FXML
	protected MenuItem editMenuItem;
	
	@FXML
	protected MenuItem copyMenuItem;
	
	@FXML
	protected MenuItem pasteMenuItem;
	
	@FXML
	protected MenuItem deleteMenuItem;
	
	@FXML
	protected Menu newMenu;

	@FXML
	protected TreeView<Object> treeView;

	protected EObject currentEObject;
	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;

	protected ObservableList<MenuItem> defaultMenuItems = FXCollections.observableArrayList();
	
	protected AdapterFactoryTreeCellFactory<Object> treeCellFactory;

	protected IEmfSelectionService selectionService;

	protected IEventBroker eventBroker;

	protected EmfFile<T> file;

	protected IEmfManager<T> emfManager;
	
	public EmfTreeModelView() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/xcore/workbench/ui/EmfModelTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}

		initializeEmf(getEmfManager());

		file = initEmfFile();
	}

	public EmfTreeModelView(IEmfManager<T> manager) {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}

		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		initTreeView();
	}

	public void initializeEmf(IEmfManager<T> manager) {
		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		initTreeView();
	}

	public void load(T input) {
		manager.setRoot(input);
		TreeItem<Object> rootItem = new AdapterFactoryTreeItem<>(manager.getRoot(), manager.getAdapterFactory());
		treeView.setRoot(rootItem);
	}

	@Override
	public T load(File file) {
		return load(file.getAbsolutePath());
	}

	public T load(String filepath) {
		T model = file.load(filepath);
		load(model);
		return model;
	}

	private void initTreeView() {
		treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		treeView.getSelectionModel().selectedItemProperty().addListener(this);

		TreeItem<Object> rootItem = new AdapterFactoryTreeItem<>(manager.getRoot(), manager.getAdapterFactory());

		treeView.setRoot(rootItem);

		treeCellFactory = new AdapterFactoryTreeCellFactory<>(manager.getAdapterFactory());

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(manager.getEditingDomain());
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		treeCellFactory.addCellCreationListener(dropAdapter);

		treeView.setCellFactory(treeCellFactory);
		rootItem.setExpanded(true);
		treeView.setEditable(false);

		treeView.setOnKeyPressed(event -> onTreeViewKeyPressed(event));

		selectionService = DIPlatform.getInstance(IEmfSelectionService.class);
		eventBroker = DIPlatform.getInstance(IEventBroker.class);

		selectionService.registerProvider(treeView.getSelectionModel().selectedItemProperty(), getEmfManager());
	}

	private void onTreeViewKeyPressed(KeyEvent event) {
		if (event.getCode() == KeyCode.F2) {
			activateEditModeForSelection();
		}
	}

	private void activateEditModeForSelection() {
		TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
		treeView.setEditable(true);
		treeView.edit(selectedItem);

		List<javafx.scene.Node> cells = new ArrayList<>(treeView.lookupAll(".tree-cell"));
		int row = treeView.getRow(selectedItem);
		TreeCell<Object> cell = ((TreeCell<Object>) cells.get(row));

		Node graphic = cell.getGraphic();
		if (graphic instanceof TextField) {
			TextField textfield = (TextField) graphic;
			textfield.setOnKeyPressed(e -> {
				if (e.getCode() == KeyCode.ENTER) {
					try {
						cell.commitEdit(selectedItem.getValue());
					} catch (Exception e2) {
					}
				}
			});
			textfield.requestFocus();
			textfield.selectAll();
		}
	}

	/**
	 * EAttributes can get from EPackage#get[ItemName]_[AttributeName]()
	 * 
	 * @param attribute
	 */
	public void addEditableFor(EAttribute attribute) {
		// add edit support
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}

	@FXML
	protected void onUndoMenuItemClicked(ActionEvent event) {
		if (editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

	@FXML
	protected void onRedoMenuItemClicked(ActionEvent event) {
		if (editingDomain.getCommandStack().canRedo()) {
			editingDomain.getCommandStack().redo();
		}

	}

	private void execute(Command command, Collection<Object> collection) {
		if (command.canExecute()) {
			command.execute();
			String action = command.getLabel();
			String size = String.valueOf(collection.size());
			log.log(Level.INFO, "{0} {1} selection(s).", new String[] { action, size });
			eventBroker.post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH,
					CommandFactory.create(command, action, action + " " + size + " selection(s)")));
		}
	}

	@FXML
	protected void onDeleteMenuItemClicked(ActionEvent event) {
		ObservableList<TreeItem<Object>> selections = treeView.getSelectionModel().getSelectedItems();
		List<Object> toDeleteList = selections.stream().map(e -> e.getValue()).collect(Collectors.toList());
		Command command = DeleteCommand.create(editingDomain, toDeleteList);
		execute(command, toDeleteList);
	}

	@FXML
	protected void onEditMenuItemClicked(ActionEvent event) {
		activateEditModeForSelection();
	}

	@FXML
	protected void onCopyMenuItemClicked(ActionEvent event) {
		ArrayList<Object> collection = new ArrayList<>();
		collection.add(treeView.getSelectionModel().getSelectedItem().getValue());
		Command command = CopyToClipboardCommand.create(editingDomain, collection);
		execute(command, collection);
	}

	@FXML
	protected void onPasteMenuItemClicked(ActionEvent event) {
		TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
		Object selection = selectedItem.getValue();
		Command command = PasteFromClipboardCommand.create(editingDomain, selection, CommandParameter.NO_INDEX);
		if (command.canExecute()) {
			command.execute();
			
			eventBroker.post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH,
					CommandFactory.create(command, "Paste", "Paste selection to clipboard")));
			selectedItem.setExpanded(true);
		}
	}

	@FXML
	protected void onTreeViewMouseClicked(MouseEvent event) {
		TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
		if (treeView.isEditable()) {
			treeView.setEditable(false);
		}
		if (selection != null) {
			DIPlatform.getInstance(IEventBroker.class)
					.post(new EventContext<>(EventTopic.SELECTION, selection.getValue()));
			if (event.getClickCount() == 2) {
				eventBroker.post(new EventContext<>(EventTopic.OPEN_EDITOR, selection.getValue()));
			}
		}
	}

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object newValue) {
		if (newValue instanceof TreeItem<?>) {
			TreeItem<?> treeItem = (TreeItem<?>) newValue;
			Object value = treeItem.getValue();
			newMenu.getItems().clear();
			Collection<?> collection = editingDomain.getNewChildDescriptors(value, null);
			for (Object object : collection) {
				if (object instanceof CommandParameter) {
					CommandParameter commandParameter = (CommandParameter) object;
					String name = commandParameter.getValue().getClass().getSimpleName().replace("Impl", "");
					String menuText = ((IItemLabelProvider) manager.getAdapterFactory().adapt(commandParameter.getValue(), IItemLabelProvider.class))
							.getText(commandParameter.getValue());
					Object icon = ((IItemLabelProvider) manager.getAdapterFactory().adapt(commandParameter.getValue(), IItemLabelProvider.class))
							.getImage(commandParameter.getValue());
					MenuItem item = new MenuItem(menuText);
					item.setGraphic(new ImageView(new Image(((URL)icon).toExternalForm())));
					item.setOnAction(event -> {
						int id = EmfUtil.getValueByName(getEmfManager().getModelPackage(), name);
						Command command = AddCommand.create(editingDomain, value, id,
								getEmfManager().getExtendedModelFactory().create(id));
						command.execute();

						eventBroker.post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
						treeItem.setExpanded(true);
					});
					newMenu.getItems().add(item);
				}
			}
		}
	}

	@Override
	public void save(File f) {
		file.write(manager.getRoot(), f.getAbsolutePath());
		log.log(Level.INFO, "Write emf model to path " + f.getAbsolutePath());
	}
	
	@Override
	public String getExtension() {
		return file.getExtension();
	}
	
	@Override
	public void commandStackChanged(EventObject event) {
	}

	public void clearDefaultContextMenu() {
		defaultMenuItems.addAll(contextMenu.getItems());
		contextMenu.getItems().clear();
	}
	
	public void restoreDefaultContextMenu() {
		contextMenu.getItems().addAll(defaultMenuItems);
	}
	
	public TreeView<Object> getTreeView(){
		return treeView;
	}
	
	protected abstract IEmfManager<T> getEmfManager();

	protected abstract EmfFile<T> initEmfFile();
}
