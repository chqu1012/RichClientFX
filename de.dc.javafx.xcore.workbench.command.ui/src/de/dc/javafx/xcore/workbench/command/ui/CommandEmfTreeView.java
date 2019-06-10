package de.dc.javafx.xcore.workbench.command.ui;
import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;
import de.dc.javafx.xcore.workbench.command.ui.cell.CommandCellFactory;
import de.dc.javafx.xcore.workbench.command.ui.file.CommandFile;
import de.dc.javafx.xcore.workbench.command.ui.manager.CommandEmfManager;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.ui.file.EmfFile;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;
import javafx.util.Callback;

public class CommandEmfTreeView extends EmfTreeModelView<EmfCommandHistory> {

	public CommandEmfTreeView() {
		// Set edit mode for several attributes
		addEditableFor(CommandPackage.eINSTANCE.getEmfCommand_Name());
		addEditableFor(CommandPackage.eINSTANCE.getEmfResult_Name());
		
		treeView.setCellFactory(new Callback<TreeView<Object>, TreeCell<Object>>() {
			@Override
			public TreeCell call(TreeView<Object> param) {
				return new CommandCellFactory();
			}
		});
	}

	@Override
	protected IEmfManager<EmfCommandHistory> getEmfManager() {
		return new CommandEmfManager();
	}

	@Override
	protected EmfFile<EmfCommandHistory> initEmfFile() {
		return new CommandFile();
	}
}