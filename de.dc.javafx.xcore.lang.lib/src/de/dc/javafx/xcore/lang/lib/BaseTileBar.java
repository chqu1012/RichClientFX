package de.dc.javafx.xcore.lang.lib;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.layout.FlowPane;

public class BaseTileBar extends FlowPane {

	private Map<String, BaseTile> tiles = new HashMap<>();
	
	public void add(BaseTile tile) {
		tiles.put(tile.getKey(), tile);
		getChildren().add(tile);
	}
}
