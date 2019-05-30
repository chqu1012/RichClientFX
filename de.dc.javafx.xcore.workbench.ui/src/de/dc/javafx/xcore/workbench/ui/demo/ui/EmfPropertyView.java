package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.workbench.ui.control.EmfView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class EmfPropertyView extends EmfView {

	@Override
	protected void createPartControl(BorderPane parent) {
		TableView<Object> tableView = new TableView<>();
		tableView.getColumns().add(new TableColumn<>("Property"));
		tableView.getColumns().add(new TableColumn<>("Value"));
		parent.setCenter(tableView);
	}

}
