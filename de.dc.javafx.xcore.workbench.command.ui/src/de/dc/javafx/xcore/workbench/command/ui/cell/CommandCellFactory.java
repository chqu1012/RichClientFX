package de.dc.javafx.xcore.workbench.command.ui.cell;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.dc.javafx.xcore.workbench.command.EmfCommand;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeCell;
import javafx.scene.layout.AnchorPane;

public class CommandCellFactory extends TreeCell<Object> {

	private Logger log = Logger.getLogger(CommandCellFactory.class.getSimpleName());
	
	@FXML
	protected Button undoButton;

	@FXML
	protected Button redoButton;
	
	@FXML
	protected AnchorPane root;
	
	@FXML
	protected Label commandLabel;

	@FXML
	protected Label timestampLabel;

	private FXMLLoader mLLoader;
	
	protected BooleanProperty undoProperty = new SimpleBooleanProperty(true);
	
	@Override
	protected void updateItem(Object item, boolean empty) {
		super.updateItem(item, empty);
		if (empty || item == null) {
			setText(null);
			setGraphic(null);
		} else {
			if (mLLoader == null) {
				mLLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/command/ui/cell/CommandCellFactory.fxml"));
				mLLoader.setController(this);
				try {
					mLLoader.load();
				} catch (IOException e) {
					log.log(Level.SEVERE, "Failed to load "+CommandCellFactory.class.getSimpleName()+"! "+e.getMessage());
				}
			}

			setText(null);
			undoButton.disableProperty().bind(undoProperty);
			
			if (item instanceof EmfCommand) {
				EmfCommand command = (EmfCommand) item;
				
				if (command.getCommand() !=null) {
					undoProperty.bind(new SimpleBooleanProperty(command.getCommand().canUndo()));
				}
				
				timestampLabel.setText(command.getTimestamp()==null? "No tracked timestamp" : command.getTimestamp().toString());
				commandLabel.setText(command.getCommand()==null? "No command name defined" : command.getCommand().getLabel());
				setGraphic(root);
			}else {
				setGraphic(new Label(item.toString()));
			}
		}
	}
	
	@FXML
	protected void onDeleteButtonAction(ActionEvent event) {
		
	}

	@FXML
	protected void onRedoButtonAction(ActionEvent event) {
		
	}

	@FXML
	protected void onUndoButtonAction(ActionEvent event) {
		
	}
}
