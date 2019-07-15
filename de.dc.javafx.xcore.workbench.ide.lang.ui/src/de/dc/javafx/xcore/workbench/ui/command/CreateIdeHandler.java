package de.dc.javafx.xcore.workbench.ui.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;

import de.dc.javafx.xcore.workbench.ui.dialog.CreateIdeFileDialog;

public class CreateIdeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CreateIdeFileDialog dialog = new CreateIdeFileDialog(new Shell());
		dialog.open();
		return null;
	}
}