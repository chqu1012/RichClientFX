package de.dc.javafx.xcore.workbench.emf.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryListCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.handler.CustomFeedbackHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public abstract class EmfListView<T> extends ListView<T>{

	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;
	protected ComposedAdapterFactory adapterFactory;
	private AdapterFactoryListCellFactory<T> listCellFactory;

	public EmfListView() {
		this.manager = initEmfManager();
		this.adapterFactory = manager.getAdapterFactory();
		this.editingDomain = manager.getEditingDomain();
		setEditable(true);
		setItems(new AdapterFactoryObservableList<T>(adapterFactory, manager.getRoot()));
		
		listCellFactory = new AdapterFactoryListCellFactory<>(adapterFactory);
		listCellFactory.addCellCreationListener(new CellDragAdapter());
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(editingDomain);
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		listCellFactory.addCellCreationListener(dropAdapter);
		setCellFactory(listCellFactory);
		
		// add edit support
		setEditable(true);
		getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void setInput(T input) {
		manager.setRoot(input);
		setItems(new AdapterFactoryObservableList<T>(adapterFactory, manager.getRoot()));
	}
	
	public void addEditableFor(EAttribute attribute) {
		listCellFactory.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}
	
	public abstract IEmfManager<T> initEmfManager();
	
	public IEmfManager<T> getEmfManager(){
		return manager;
	}
}
