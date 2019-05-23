package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;
import java.util.EventObject;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.handler.CustomFeedbackHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

public class EMFModelTreeView<T> extends VBox  implements CommandStackListener, ChangeListener<Object> {

	private Logger log = Logger.getLogger(EMFModelTreeView.class.getSimpleName());
	
	@FXML protected MenuItem newMenuItem;
	@FXML protected MenuItem undoMenuItem;
	@FXML protected MenuItem redoMenuItem;
	@FXML protected MenuItem editMenuItem;
	@FXML protected MenuItem copyMenuItem;
	@FXML protected MenuItem pasteMenuItem;
	@FXML protected MenuItem deleteMenuItem;
	@FXML protected Menu newMenu;
	@FXML protected TreeView<Object> treeView;

	protected EObject currentEObject;
	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;

	protected AdapterFactoryTreeCellFactory<Object> treeCellFactory;
	public EMFModelTreeView(IEmfManager<T> manager) {
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

	private void initTreeView() {
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
	}

	/**
	 * EAttributes can get from EPackage#get[ItemName]_[AttributeName]()
	 * @param attribute
	 */
	public void addEditableFor(EAttribute attribute){
		// add edit support
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}
	
	@FXML
	protected void onUndoMenuItemClicked(ActionEvent event) {

	}
	
	@FXML
	protected void onRedoMenuItemClicked(ActionEvent event) {
		
	}

	@FXML
	protected void onDeleteMenuItemClicked(ActionEvent event) {
		
	}

	@FXML
	protected void onEditMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onCopyMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onPasteMenuItemClicked(ActionEvent event) {

	}

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object newValue) {
		
	}

	@Override
	public void commandStackChanged(EventObject event) {
		// TODO Auto-generated method stub
		
	}
}
