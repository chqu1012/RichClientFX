package de.dc.javafx.xcore.lang.lib;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.layout.FlowPane;

public class BaseTileBar extends FlowPane {

	protected Map<String, BaseTile> tiles = new HashMap<>();
	
	public void add(BaseTile tile) {
		tiles.put(tile.getKey(), tile);
		getChildren().add(tile);
	}
}
