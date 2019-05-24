package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.javafx.efxclipse.runtime.factory.CommandListCellFactory;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class EMFModelView<T> extends BorderPane implements CommandStackListener {

	private Logger log = Logger.getLogger(EMFModelView.class.getSimpleName());

	@FXML
	protected TabPane leftTabPane;

	@FXML
	protected TabPane rightTabPane;

	@FXML
	protected TabPane bottomTabPane;

	@FXML
	protected ListView<Command> historyList;

	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;

	public EMFModelView(IEmfManager<T> manager) {
		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}

		manager.getCommandStack().addCommandStackListener(this);
		historyList.setCellFactory(
				new CommandListCellFactory(manager.getAdapterFactory(), manager.getEditingDomain().getCommandStack()));
		historyList.setEditable(false);
	}

	@Override
	public void commandStackChanged(EventObject event) {
		historyList.getItems().clear();
		List<Command> commandList = new ArrayList<>(manager.getCommandStack().getCommandList());
		Collections.reverse(commandList);
		historyList.getItems().addAll(commandList);
	}

	@FXML
	protected void onPasteMenuItemClicked(ActionEvent event) {}

	@FXML
	protected void onDeleteMenuItemClicked(ActionEvent event) {}

	@FXML
	protected void onCopyMenuItemClicked(ActionEvent event) {}

	@FXML
	protected void onNewMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onHistoryMenuItemDeleteClicked(ActionEvent event) {
		Command selection = historyList.getSelectionModel().getSelectedItem();
		historyList.getItems().remove(selection);
		log.info("Remove command from list!");
	}

	@FXML
	protected void onHistoryMenuItemRedoClicked(ActionEvent event) {
		Command selection = historyList.getSelectionModel().getSelectedItem();
		if (selection != null) {
			selection.redo();
			log.info("Redo successfully executed!");
		}
	}

	@FXML
	protected void onHistoryMenuItemUndoClicked(ActionEvent event) {
		Command selection = historyList.getSelectionModel().getSelectedItem();
		if (selection != null) {
			selection.undo();
			log.info("Undo successfully executed!");
		}
	}

	@FXML
	protected void onUndoMenuItemClicked(ActionEvent event) {
		CommandStack commandStack = editingDomain.getCommandStack();
		if (commandStack.canUndo()) {
			commandStack.undo();
			log.info("Undo successfully executed!");
		}
	}

	@FXML
	protected void onRedoMenuItemClicked(ActionEvent event) {
		CommandStack commandStack = editingDomain.getCommandStack();
		if (commandStack.canRedo()) {
			commandStack.redo();
			log.info("Redo successfully executed!");
		}
	}

	@FXML
	protected void onHistoryListViewClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation Dialog");
			alert.setHeaderText("Undo for current selection");
			alert.setContentText("Are you ok with this?");

			Optional<ButtonType> result = alert.showAndWait();
			result.ifPresent(res -> {
				if (res == ButtonType.OK) {
					onHistoryMenuItemUndoClicked(null);
				}
			});
		}
	}
}
