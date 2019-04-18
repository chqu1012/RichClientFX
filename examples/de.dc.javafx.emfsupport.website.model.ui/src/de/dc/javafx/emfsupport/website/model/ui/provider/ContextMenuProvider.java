package de.dc.javafx.emfsupport.website.model.ui.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.emfsupport.website.model.ui.handler.CopyHandler;
import de.dc.javafx.emfsupport.website.model.ui.handler.CutHandler;
import de.dc.javafx.emfsupport.website.model.ui.handler.DeleteContactHandler;
import de.dc.javafx.emfsupport.website.model.ui.handler.PasteHandler;
import javafx.collections.ObservableList;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableRow;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;

public class ContextMenuProvider implements ICellUpdateListener {

	private IEmfManager<Website> manager;

	private DeleteContactHandler deleteHandler;
	private CutHandler cutHandler;
	private CopyHandler copyHandler;
	private PasteHandler pasteHandler;

	private MenuItem deleteMenuItem;
	private MenuItem cutMenuItem;
	private MenuItem copyMenuItem;
	private MenuItem pasteMenuItem;

	private MenuItem addMenuItem;

	public ContextMenuProvider(IEmfManager<Website> manager) {
		this.manager = manager;
	}

	static List<?> getSelectionModel(Cell<?> cell) {
		if (cell instanceof ListCell<?>) {
			return ((ListCell<?>) cell).getListView().getSelectionModel().getSelectedItems();
		} else if (cell instanceof TreeCell<?>) {
			MultipleSelectionModel<?> selectionModel = ((TreeCell<?>) cell).getTreeView().getSelectionModel();
			ObservableList<?> selectedItems = selectionModel.getSelectedItems();
			ArrayList<Object> unwrappedItems = new ArrayList<>(selectedItems.size());
			for (Object object : selectedItems) {
				TreeItem<?> treeItem = (TreeItem<?>) object;
				unwrappedItems.add(treeItem.getValue());
			}
			return unwrappedItems;
		} else if (cell instanceof TableCell<?, ?>) {
			return ((TableCell<?, ?>) cell).getTableView().getSelectionModel().getSelectedItems();
		} else if (cell instanceof TableRow<?>) {
			return ((TableRow<?>) cell).getTableView().getSelectionModel().getSelectedItems();
		}
		return null;
	}

	@Override
	public void updateItem(final Cell<?> cell, final Object item, boolean empty) {
		final ContextMenu contextMenu = new ContextMenu();
		cell.setContextMenu(contextMenu);
		contextMenu.getItems().add(new MenuItem());
		contextMenu.setOnShowing(event -> {
			List<?> selectedItems = getSelectionModel(cell);
			deleteMenuItem.setDisable(!deleteHandler.canExecute(selectedItems));
			cutMenuItem.setDisable(!cutHandler.canExecute(selectedItems));
			copyMenuItem.setDisable(!copyHandler.canExecute(selectedItems));
			
			Object item2 = cell.getItem();
			
			pasteMenuItem.setDisable(!pasteHandler.canExecute(item2));
			contextMenu.getItems().clear();
			contextMenu.getItems().add(addMenuItem);
			contextMenu.getItems().add(deleteMenuItem);
			contextMenu.getItems().add(cutMenuItem);
			contextMenu.getItems().add(copyMenuItem);
			contextMenu.getItems().add(pasteMenuItem);
		});
		
		addMenuItem = new MenuItem("New");
		addMenuItem.setOnAction(event ->{
			Page page = ModelFactory.eINSTANCE.createPage();
			List<?> selectionModel = getSelectionModel(cell);
			Command command = AddCommand.create(manager.getEditingDomain(), selectionModel.get(0), ModelPackage.Literals.PAGE, page);
			manager.getCommandStack().execute(command);
		});

		deleteMenuItem = new MenuItem("Delete");
		deleteHandler = new DeleteContactHandler(manager);
		deleteMenuItem.setOnAction(event -> deleteHandler.execute());

		cutMenuItem = new MenuItem("Cut");
		cutHandler = new CutHandler(manager);
		cutMenuItem.setOnAction(event -> cutHandler.execute());

		copyMenuItem = new MenuItem("Copy");
		copyHandler = new CopyHandler(manager);
		copyMenuItem.setOnAction(event -> copyHandler.execute());

		pasteMenuItem = new MenuItem("Paste");
		pasteHandler = new PasteHandler(manager);
		pasteMenuItem.setOnAction(event -> pasteHandler.execute());
		
	}
}
