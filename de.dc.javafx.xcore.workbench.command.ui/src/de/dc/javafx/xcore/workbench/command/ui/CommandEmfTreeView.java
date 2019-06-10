package de.dc.javafx.xcore.workbench.command.ui;
import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;
import de.dc.javafx.xcore.workbench.command.ui.file.CommandFile;
import de.dc.javafx.xcore.workbench.command.ui.manager.CommandEmfManager;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.ui.file.EmfFile;

public class CommandEmfTreeView extends EmfTreeModelView<EmfCommandHistory> {

	public CommandEmfTreeView() {
		// Set edit mode for several attributes
		addEditableFor(CommandPackage.eINSTANCE.getEmfCommand_Name());
		addEditableFor(CommandPackage.eINSTANCE.getEmfResult_Name());
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