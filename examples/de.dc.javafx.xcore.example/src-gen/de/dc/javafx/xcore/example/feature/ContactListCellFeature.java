package de.dc.javafx.xcore.example.feature;

import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.lang.lib.feature.AbstractFxmlListCellFeature;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class ContactListCellFeature extends AbstractFxmlListCellFeature<Contact>{

	@FXML GridPane root;
	
	@Override
	protected String getFxmlPath() {
		return "ContactListCell.fxml";
	}

	@Override
	protected Node getGraphic(Contact item) {
		return root;
	}

	@Override
	protected String getValue(Contact item) {
		return null;
	}

}
