package de.dc.javafx.xcore.workbench.ui;

import java.util.Collection;

import javafx.scene.Node;

public interface IEmfControlManager {

	void registrateToolbarItem(String id, Node control);
	
	void registrate(String id, Node control);
	
	<T> T findBy(String id);

	<T> T findToolbarItemBy(String id);

	Collection<Node> findAllToolbar();
	
}
