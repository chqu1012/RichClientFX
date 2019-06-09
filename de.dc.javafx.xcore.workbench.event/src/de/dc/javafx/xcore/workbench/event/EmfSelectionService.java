package de.dc.javafx.xcore.workbench.event;

import java.util.Optional;

import org.eclipse.emf.edit.domain.EditingDomain;

import javafx.beans.property.ReadOnlyObjectProperty;

public class EmfSelectionService extends SelectionService implements IEmfSelectionService {

	private EditingDomain editingDomain;

	@Override
	public Optional<? extends EditingDomain> getEditingDomain() {
		return Optional.of(editingDomain);
	}

	@Override
	public void registerProvider(ReadOnlyObjectProperty provider, EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		registerProvider(provider);
	}

}
