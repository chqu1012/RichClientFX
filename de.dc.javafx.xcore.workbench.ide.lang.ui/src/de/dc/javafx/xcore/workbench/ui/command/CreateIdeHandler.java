package de.dc.javafx.xcore.workbench.ui.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;

import de.dc.javafx.xcore.workbench.ui.dialog.CreateIdeFileDialog;
import de.dc.javafx.xcore.workbench.ui.dialog.template.IdeFileContentTemplate;

public class CreateIdeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CreateIdeFileDialog dialog = new CreateIdeFileDialog(new Shell());
		int code = dialog.open();
		if (code == 0) {
			System.out.println(IdeFileContentTemplate.getContent(dialog.getModel()));
		}
		return null;
	}
}