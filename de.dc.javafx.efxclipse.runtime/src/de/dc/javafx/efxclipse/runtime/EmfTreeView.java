package de.dc.javafx.efxclipse.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.handler.CustomFeedbackHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeView;

public class EmfTreeView<T> extends TreeView<Object>{

	protected EditingDomain editingDomain;
	protected IEmfManager<T> manager;
	protected AdapterFactoryTreeCellFactory<Object> treeCellFactory;

	public EmfTreeView(IEmfManager<T> manager) {
		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();

		setRoot(new AdapterFactoryTreeItem<Object>(manager.getRoot(), manager.getAdapterFactory()));
		treeCellFactory = new AdapterFactoryTreeCellFactory<Object>(manager.getAdapterFactory());

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(editingDomain);
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		treeCellFactory.addCellCreationListener(dropAdapter);
		setCellFactory(treeCellFactory);
		setShowRoot(false);
		getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		setEditable(true);
	}
	
	public void addEditableFor(EAttribute attribute){
		// add edit support
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}
}
