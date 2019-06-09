package de.dc.javafx.xcore.workbench.event;

import java.util.Optional;

import javafx.beans.property.ReadOnlyObjectProperty;
import org.eclipse.emf.edit.domain.EditingDomain;

public interface IEmfSelectionService extends ISelectionService{
	
	Optional<? extends EditingDomain> getEditingDomain();
	
	void registerProvider(ReadOnlyObjectProperty provider, EditingDomain editingDomain);
}
