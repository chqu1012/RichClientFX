package de.dc.javafx.xcore.example.tiles;

import de.dc.javafx.xcore.lang.lib.BaseKeyValueTile;
import de.dc.javafx.xcore.lang.lib.BaseTileBar;
import javafx.geometry.Insets;

@SuppressWarnings("all")
public class ContactTileBar extends BaseTileBar {
  public ContactTileBar() {
    setPadding(new Insets(10d));
    setHgap(10d);
    setVgap(10d);
    BaseKeyValueTile contactCounter1Tile = new BaseKeyValueTile("ContactCounter1");
    contactCounter1Tile.setValue("200");
    add(contactCounter1Tile);
    BaseKeyValueTile contactCounter2Tile = new BaseKeyValueTile("ContactCounter2");
    contactCounter2Tile.setValue("200");
    add(contactCounter2Tile);
    BaseKeyValueTile contactCounter3Tile = new BaseKeyValueTile("ContactCounter3");
    contactCounter3Tile.setValue("200");
    add(contactCounter3Tile);
    BaseKeyValueTile contactCounter4Tile = new BaseKeyValueTile("ContactCounter4");
    contactCounter4Tile.setValue("200");
    add(contactCounter4Tile);
  }
  
  public BaseKeyValueTile findByKey(final String key) {
    return (BaseKeyValueTile) tiles.get(key);
  }
}
