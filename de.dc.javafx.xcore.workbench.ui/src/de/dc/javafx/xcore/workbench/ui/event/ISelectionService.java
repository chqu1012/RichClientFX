package de.dc.javafx.xcore.workbench.ui.event;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;

public interface ISelectionService {

	void addListener(ChangeListener listener);

	void removeListener(ChangeListener listener);
	
	void registerProvider(ReadOnlyObjectProperty provider);

	void unregisterProvider(ReadOnlyObjectProperty provider);
}
