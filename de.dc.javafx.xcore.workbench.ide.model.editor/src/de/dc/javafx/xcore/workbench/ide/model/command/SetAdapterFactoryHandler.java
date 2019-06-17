package de.dc.javafx.xcore.workbench.ide.model.command;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;

public class SetAdapterFactoryHandler implements IActionDelegate{

	@Override
	public void run(IAction action) {
		System.out.println("Set AddapterFactory");		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
