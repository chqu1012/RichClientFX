package de.dc.javafx.xcore.lang.ide.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class BaseWizardHandler<T> extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell activeShell = HandlerUtil.getActiveShell(event);
		
		PackageExplorerPart view = (PackageExplorerPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.jdt.ui.PackageExplorer");
		ISelection selection = view.getTreeViewer().getSelection();
		
		T model = getModel();
		
		WizardDialog dialog = new WizardDialog(activeShell, getWizard(selection, model));
		dialog.open();
		return null;
	}

	protected abstract T getModel();

	protected abstract INewWizard getWizard(ISelection selection, T model);

}
