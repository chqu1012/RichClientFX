package de.dc.javafx.xcore.workbench.emf.event;

import java.util.Optional;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.event.SelectionService;
import javafx.beans.property.ReadOnlyObjectProperty;

public class EmfSelectionService extends SelectionService implements IEmfSelectionService {

	protected IEmfManager<?> manager;

	@Override
	public void registerProvider(ReadOnlyObjectProperty<?> provider, IEmfManager<?> manager) {
		this.manager=manager;
		registerProvider(provider);
	}

	@Override
	public Optional<? extends IEmfManager<?>> getEmfManager() {
		return Optional.of(manager);
	}
}
