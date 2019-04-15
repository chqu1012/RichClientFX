package de.dc.javafx.xcore.lang.lib;

import de.dc.javafx.xcore.lang.lib.control.ContactTile;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ContactTileApplication extends Application {
	
	@Override
	public void start(final Stage primaryStage) {
		primaryStage.setScene(new Scene(getRoot(), 600, 450));
		primaryStage.show();
	}

	public Parent getRoot() {
		FlowPane view = new FlowPane();
		view.setPadding(new Insets(10d));
		view.setHgap(10d);
		view.setVgap(10d);
		for (int i = 0; i < 20; i++) {
			ContactTile contactTile = new ContactTile();
			contactTile.setPrefSize(100d, 100d);
			contactTile.setKey("Maria");
			contactTile.setValue(String.valueOf(20*i));
			view.getChildren().add(contactTile);
		}
		return view ;
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
