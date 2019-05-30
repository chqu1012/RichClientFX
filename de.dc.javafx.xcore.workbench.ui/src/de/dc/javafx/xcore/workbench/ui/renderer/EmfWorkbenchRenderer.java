package de.dc.javafx.xcore.workbench.ui.renderer;

import de.dc.javafx.xcore.workbench.BottomPane;
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.RightPane;
import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.util.WorkbenchSwitch;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.Tooltip;

public class EmfWorkbenchRenderer extends WorkbenchSwitch<Node>{

	private EmfWorkbench workbench;
	
	public void setWorkbench(EmfWorkbench workbench) {
		this.workbench=workbench;
	}
	
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
	
	@Override
	public Node casePerspective(Perspective object) {
		if (workbench!=null) {
			LeftPane leftPane = object.getLeftPane();
			doSwitch(leftPane);
			
			RightPane rightPane = object.getRightPane();
			doSwitch(rightPane);
			
			BottomPane bottomPane = object.getBottomPane();
			doSwitch(bottomPane);
		}
		return super.casePerspective(object);
	}
	
	@Override
	public Node caseLeftPane(LeftPane object) {
		if (workbench!=null) {
			object.getViews().stream().forEach(e->{ 
				Tab tab = new Tab(e.getName());
				tab.setContent(caseView(e));
				workbench.getLeftTabPane().getTabs().add(tab);
			});
		}
		return super.caseLeftPane(object);
	}
	
	@Override
	public Node caseRightPane(RightPane object) {
		if (workbench!=null) {
			object.getViews().stream().forEach(e->{ 
				Tab tab = new Tab(e.getName());
				tab.setContent(caseView(e));
				workbench.getRightTabPane().getTabs().add(tab);
			});
		}
		return super.caseRightPane(object);
	}

	@Override
	public Node caseBottomPane(BottomPane object) {
		if (workbench!=null) {
			object.getViews().stream().forEach(e->{ 
				Tab tab = new Tab(e.getName());
				tab.setContent(caseView(e));
				workbench.getBottomTabPane().getTabs().add(tab);
			});
		}
		return super.caseBottomPane(object);
	}
	
	@Override
	public Node caseView(View object) {
//		Class<?> clazz = Class.forName(object.getViewClass());
//		Tab viewPart = (Tab) clazz.newInstance();
//		viewPart.setText(object.getName());
		return new Button(object.getName());
	}
}
