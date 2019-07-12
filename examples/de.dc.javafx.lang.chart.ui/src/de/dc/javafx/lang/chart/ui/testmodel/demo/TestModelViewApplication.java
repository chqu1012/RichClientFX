package de.dc.javafx.lang.chart.ui.testmodel.demo;

import java.io.File;

import de.dc.javafx.lang.chart.ui.testmodel.*;
import de.dc.javafx.lang.chart.ui.testmodel.view.*;
import de.dc.javafx.xcore.di.ApplicationContext;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

public class TestModelViewApplication extends AbstractApplication{

	@Override
	public Parent getRoot() {
		BaseTestModelManager manager = new BaseTestModelManager();
		return new TestModelModelView(manager);
	}
	
	public static void main(String[] args) {
		ApplicationContext.init();
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
