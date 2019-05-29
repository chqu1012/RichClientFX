package de.dc.javafx.xcore.workbench.ui.renderer;

import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.util.WorkbenchSwitch;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class EmfWorkbenchRenderer extends WorkbenchSwitch<Node>{

	@Override
	public Node caseToolbarItem(ToolbarItem object) {
		Button control = new Button();
		control.setText(object.getName()==null?"":object.getName());
		return control;
	}
}
