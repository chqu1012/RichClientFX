package de.dc.javafx.xcore.workbench.barcode.ui;
import de.dc.javafx.xcore.workbench.emf.ui.*;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject;

public class BarcodeeEmfDetailedTreeView extends EmfDetailedTreeView<BarcodeFXProject>{

	@Override
	protected EmfTreeModelView<BarcodeFXProject> initEmfModelTreeView() {
		return new BarcodeEmfTreeModelView();
	}
}
