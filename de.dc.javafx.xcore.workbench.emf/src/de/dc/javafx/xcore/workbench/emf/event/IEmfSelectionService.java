package de.dc.javafx.xcore.workbench.emf.event;

import java.util.Optional;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;

public interface IEmfSelectionService{
	
	void setFocusedProvider(ReadOnlyObjectProperty provider);
	
	Optional<?> getSelection();
	
	void addListener(ChangeListener listener);

	void removeListener(ChangeListener listener);
	
	void registerProvider(ReadOnlyObjectProperty provider);

	void unregisterProvider(ReadOnlyObjectProperty provider);
	
	Optional<? extends IEmfManager<?>> getEmfManager();
	
	void registerProvider(ReadOnlyObjectProperty<?> provider, IEmfManager<?> manager);
}
