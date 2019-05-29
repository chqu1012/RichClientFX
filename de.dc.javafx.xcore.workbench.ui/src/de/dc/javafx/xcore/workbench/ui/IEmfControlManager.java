package de.dc.javafx.xcore.workbench.ui;

import java.util.Optional;

import javafx.scene.Node;

public interface IEmfControlManager {

	void registrate(String id, Node control);
	
	Optional<Node> findBy(String id);
}
