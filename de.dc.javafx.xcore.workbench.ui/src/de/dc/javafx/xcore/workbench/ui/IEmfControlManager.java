package de.dc.javafx.xcore.workbench.ui;

import java.util.Collection;
import java.util.Optional;

import javafx.scene.Node;

public interface IEmfControlManager {

	void registrateToolbarItem(String id, Node control);
	
	void registrate(String id, Node control);
	
	Optional<Node> findBy(String id);

	Optional<Node> findToolbarItemBy(String id);

	Collection<Optional<Node>> findAllToolbar();
	
}
