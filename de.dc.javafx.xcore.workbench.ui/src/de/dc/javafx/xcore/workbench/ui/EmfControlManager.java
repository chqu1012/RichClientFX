package de.dc.javafx.xcore.workbench.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javafx.scene.Node;

public class EmfControlManager implements IEmfControlManager{

	private Map<String, Optional<Node>> controlRegistry = new HashMap<>();

	@Override
	public void registrate(String id, Node control) {
		controlRegistry.put(id, Optional.of(control));
	}

	@Override
	public Optional<Node> findBy(String id) {
		return controlRegistry.get(id);
	}
}
