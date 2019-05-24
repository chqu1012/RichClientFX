package de.dc.javafx.xcore.di;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;

public interface SelectionService {

	void addListener(ChangeListener listener);

	void removeListener(ChangeListener listener);
	
	void registerProvider(ReadOnlyObjectProperty provider);

	void unregisterProvider(ReadOnlyObjectProperty provider);
}
