package de.dc.javafx.xcore.workbench.ui.event;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;

public class SelectionService implements ISelectionService {

	private List<ReadOnlyObjectProperty<?>> providers = new ArrayList<>();
	private List<ChangeListener<?>> listeners = new ArrayList<>();
	
	@Override
	public void addListener(ChangeListener listener) {
		for (ReadOnlyObjectProperty<?> provider : providers) {
			provider.addListener(listener);
		}
		listeners.add(listener);
	}

	@Override
	public void registerProvider(ReadOnlyObjectProperty provider) {
		providers.add(provider);
		listeners.forEach(e->provider.addListener(e));
	}

	@Override
	public void removeListener(ChangeListener listener) {
		for (ReadOnlyObjectProperty<?> provider : providers) {
			provider.removeListener(listener);
		}
	}

	@Override
	public void unregisterProvider(ReadOnlyObjectProperty provider) {
		providers.remove(provider);		
	}
}
