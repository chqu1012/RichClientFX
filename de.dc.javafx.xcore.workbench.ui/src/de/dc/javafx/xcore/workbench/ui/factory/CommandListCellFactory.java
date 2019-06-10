package de.dc.javafx.xcore.workbench.ui.factory;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import de.dc.javafx.xcore.workbench.command.EmfCommand;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * Display command list elements in a readable way. Reuse the common adapter
 * factory to get {@link EObject}s labels.
 * 
 */
public class CommandListCellFactory implements Callback<ListView<EmfCommand>, ListCell<EmfCommand>> {

	private AdapterFactory adapterFactory;
	private CommandStack commandStack;

	public CommandListCellFactory(AdapterFactory adapterFactory, CommandStack commandStack) {
		this.adapterFactory = adapterFactory;
		this.commandStack = commandStack;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ListCell<EmfCommand> call(ListView<EmfCommand> param) {
		return new ListCell<EmfCommand>() {
			@Override
			protected void updateItem(EmfCommand command, boolean empty) {
				super.updateItem(command, empty);
				if (command ==null || empty) {
					setText(null);
					setGraphic(null);
					setStyle(null);
				}else{
					if (commandStack.canUndo() && commandStack.getUndoCommand() == command) {
						setStyle("-fx-background-color: red; -fx-text-fill: white");
					} else if (commandStack.canRedo() && commandStack.getRedoCommand() == command) {
						setStyle("-fx-background-color: blue; -fx-text-fill: white");
					} else {
						setStyle("");
					}
					setText(prettyPrint(command));
				}
			}
		};
	}

	private String prettyPrint(EmfCommand ehc) {
		String res = null;
		Command command = ehc.getCommand();
		if (command instanceof SetCommand) {
			SetCommand setCommand = (SetCommand) command;
			Object value = setCommand.getValue();
			String featureName = setCommand.getFeature().getName();
			String owner = ((IItemLabelProvider) adapterFactory.adapt(setCommand.getOwner(), IItemLabelProvider.class))
					.getText(setCommand.getOwner());
			if (value == null || value.equals(setCommand.getFeature().getDefaultValue())) {
				res = "Unset " + featureName + " in " + owner;
			} else {
				res = "Set " + featureName + " to \"" + value + "\" in " + owner;
			}
		} else if (command instanceof ChangeCommand) {
			res = command.getDescription();
		} else if (command instanceof AddCommand) {
			AddCommand addCommand = (AddCommand) command;
			String owner = ((IItemLabelProvider) adapterFactory.adapt(addCommand.getOwner(), IItemLabelProvider.class))
					.getText(addCommand.getOwner());
			res = "Add new " + owner;
		} else if (command instanceof DeleteCommand) {
			DeleteCommand aCommand = (DeleteCommand) command;
			res = "Delete " + aCommand.getResult().stream().map(e -> e.toString()).reduce((e1, e2) -> e1 + ", " + e2).get();
		} else if (command instanceof DragAndDropCommand) {
			DragAndDropCommand dndCommand = (DragAndDropCommand) command;
			String owner = ((IItemLabelProvider) adapterFactory.adapt(dndCommand.getOwner(), IItemLabelProvider.class))
					.getText(dndCommand.getOwner());
			res = "DND for " + owner;
		}else {
			res = command.getDescription();
		}
		return res;
	}
}