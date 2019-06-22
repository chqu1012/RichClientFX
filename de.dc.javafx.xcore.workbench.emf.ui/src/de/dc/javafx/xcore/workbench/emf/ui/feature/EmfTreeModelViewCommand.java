package de.dc.javafx.xcore.workbench.emf.ui.feature;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EmfCommand;

public abstract class EmfTreeModelViewCommand extends EmfCommand {

	protected IEmfSelectionService selectionService;

	@Override
	public void execute() {
		selectionService = DIPlatform.getInstance(IEmfSelectionService.class);
		Optional<AdapterFactoryTreeItem<EObject>> currentSelection = (Optional<AdapterFactoryTreeItem<EObject>>) selectionService.getSelection();
		currentSelection.ifPresent(selection->executeSelection(selection.getValue()));
	}

	protected abstract void executeSelection(EObject value);
}
