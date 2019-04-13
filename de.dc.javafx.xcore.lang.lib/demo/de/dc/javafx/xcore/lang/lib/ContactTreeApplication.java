package de.dc.javafx.xcore.lang.lib;

import de.dc.javafx.xcore.lang.lib.control.ContactTreeView;
import de.dc.javafx.xcore.lang.lib.model.Contact;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactTreeApplication extends Application {

	@Override
	public void start(final Stage primaryStage) {
		primaryStage.setScene(new Scene(getRoot(), 600, 400));
		primaryStage.show();
	}

	public Parent getRoot() {
		ContactTreeView view = new ContactTreeView();
		view.showPropertyView(true);
		for (int i = 0; i < 20; i++) {
			String key = "Eins" + i;
			view.addItemTo(ContactTreeView.ROOT_KEY, new Contact(key, 1, true));
			for (int j = 0; j < 30; j++) {
				view.addItemTo(key, new Contact("Zwei" + j, i + j, true));
			}

		}
		return view;
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
