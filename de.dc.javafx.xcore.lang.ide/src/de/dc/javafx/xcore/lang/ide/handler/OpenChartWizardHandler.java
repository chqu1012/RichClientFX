package de.dc.javafx.xcore.lang.ide.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.dc.javafx.xcore.lang.ide.wizards.ChartNewWizard;

public class OpenChartWizardHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell activeShell = HandlerUtil.getActiveShell(event);
		
		PackageExplorerPart view = (PackageExplorerPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.jdt.ui.PackageExplorer");
		ISelection selection = view.getTreeViewer().getSelection();
		
		IWizard wizard = new ChartNewWizard(selection);
		WizardDialog dialog = new WizardDialog(activeShell, wizard);
		dialog.open();
		return null;
	}

}
