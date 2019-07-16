package de.dc.javafx.xcore.workbench.ui.command;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jdt.internal.core.PackageFragmentRoot;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.xcore.workbench.ui.dialog.CreateIdeFileDialog;
import de.dc.javafx.xcore.workbench.ui.dialog.model.IdeModel;
import de.dc.javafx.xcore.workbench.ui.dialog.template.IdeFileContentTemplate;

public class CreateIdeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection("org.eclipse.jdt.ui.PackageExplorer");
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof PackageFragmentRoot) {
				PackageFragmentRoot root = (PackageFragmentRoot) firstElement;
				String path = root.getResource().getLocation().toString();
				System.out.println(path);
				CreateIdeFileDialog dialog = new CreateIdeFileDialog(new Shell());
				int code = dialog.open();
				if (code == 0) {
					IdeModel model = dialog.getModel();
					String name = model.getName();
					String content = IdeFileContentTemplate.getContent(model);
					try {
						FileUtils.write(new File(path+"/"+name+".ide"), content, StandardCharsets.UTF_8);
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(content);
				}
			}
		}
		return null;
	}
}