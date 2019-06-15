package de.dc.javafx.xcore.workbench.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javafx.scene.Node;

public class EmfControlManager implements IEmfControlManager{

	private Map<String, Node> controlRegistry = new HashMap<>();
	private Map<String, Node> toolbarRegistry = new HashMap<>();

	@Override
	public void registrate(String id, Node control) {
		controlRegistry.put(id, control);
	}

	@Override
	public <T> T findBy(String id) {
		return (T) controlRegistry.get(id);
	}

	@Override
	public void registrateToolbarItem(String id, Node control) {
		toolbarRegistry.put(id, control);		
	}

	@Override
	public Node findToolbarItemBy(String id) {
		return toolbarRegistry.get(id);
	}

	@Override
	public Collection<Node> findAllToolbar() {
		return toolbarRegistry.values();
	}
	
}
