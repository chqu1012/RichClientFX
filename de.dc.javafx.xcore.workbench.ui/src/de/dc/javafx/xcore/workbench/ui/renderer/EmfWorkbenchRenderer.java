package de.dc.javafx.xcore.workbench.ui.renderer;

import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.util.WorkbenchSwitch;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class EmfWorkbenchRenderer extends WorkbenchSwitch<Node>{

	@Override
	public Node caseToolbarItem(ToolbarItem object) {
		String text = object.getName()==null?"":object.getName();
		Button control = new Button();
		if (object.getIcon()==null) {
			control.setText(text);
		}
		control.setTooltip(new Tooltip(text));
		return control;
	}
}
