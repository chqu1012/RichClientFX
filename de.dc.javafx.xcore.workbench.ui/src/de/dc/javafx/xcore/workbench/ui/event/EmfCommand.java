package de.dc.javafx.xcore.workbench.ui.event;

import com.google.inject.Inject;

public abstract class EmfCommand implements IEmfCommand{
	
	@Inject ISelectionService selectionService;

	protected Object selection;
}
