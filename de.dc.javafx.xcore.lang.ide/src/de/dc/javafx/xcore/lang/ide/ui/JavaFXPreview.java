package de.dc.javafx.xcore.lang.ide.ui;

import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class JavaFXPreview extends ViewPart implements ISelectionListener{

	@Override
	public void createPartControl(Composite parent) {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof TextSelection) {
			TextSelection new_name = (TextSelection) selection;
			
		}
	}

}
