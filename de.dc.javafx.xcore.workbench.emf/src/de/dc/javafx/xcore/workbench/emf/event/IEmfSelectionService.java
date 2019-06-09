package de.dc.javafx.xcore.workbench.emf.event;

import java.util.Optional;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.event.ISelectionService;
import javafx.beans.property.ReadOnlyObjectProperty;

public interface IEmfSelectionService extends ISelectionService{
	
	Optional<? extends IEmfManager<?>> getEmfManager();
	
	void registerProvider(ReadOnlyObjectProperty<?> provider, IEmfManager<?> manager);
}
