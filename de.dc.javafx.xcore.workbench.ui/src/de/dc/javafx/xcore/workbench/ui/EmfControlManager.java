package de.dc.javafx.xcore.workbench.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javafx.scene.Node;

public class EmfControlManager implements IEmfControlManager{

	private Map<String, Optional<Node>> controlRegistry = new HashMap<>();
	private Map<String, Optional<Node>> toolbarRegistry = new HashMap<>();

	@Override
	public void registrate(String id, Node control) {
		controlRegistry.put(id, Optional.of(control));
	}

	@Override
	public Optional<Node> findBy(String id) {
		return controlRegistry.get(id);
	}

	@Override
	public void registrateToolbarItem(String id, Node control) {
		toolbarRegistry.put(id, Optional.of(control));		
	}

	@Override
	public Optional<Node> findToolbarItemBy(String id) {
		return toolbarRegistry.get(id);
	}

	@Override
	public Collection<Optional<Node>> findAllToolbar() {
		return toolbarRegistry.values();
	}
	
}
