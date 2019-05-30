package de.dc.javafx.xcore.workbench.ui.renderer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.dc.javafx.xcore.workbench.BottomPane;
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.RightPane;
import de.dc.javafx.xcore.workbench.Toolbar;
import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.ui.control.EmfView;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.util.WorkbenchSwitch;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.Tooltip;

public class EmfWorkbenchRenderer extends WorkbenchSwitch<Node>{

	private Logger log = Logger.getLogger(EmfWorkbenchRenderer.class.getSimpleName());
	
	private EmfWorkbench workbench;
	
	public void setWorkbench(EmfWorkbench workbench) {
		this.workbench=workbench;
	}
	
	@Override
	public Node caseToolbar(Toolbar object) {
		if (workbench!=null) {
			object.getItems().forEach(e->workbench.getToolBar().getItems().add(doSwitch(e)));
		}
		return super.caseToolbar(object);
	}
	
	@Override
	public Node caseToolbarItem(ToolbarItem object) {
		String text = object.getName()==null?"":object.getName();
		Button control = new Button();
		if (object.getIcon()==null) {
			control.setText(text);
		}
		control.setOnAction(event-> invokeOnActionMethod(object.getOnAction(), event));
		control.setTooltip(new Tooltip(text));
		return control;
	}

	private void invokeOnActionMethod(String actionName, ActionEvent event) {
		try {
			Method method = workbench.getClass().getMethod(actionName, ActionEvent.class);
			method.invoke(workbench, event);
		} catch (NullPointerException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			log.log(Level.SEVERE, "Method "+actionName+" not found ("+e.getLocalizedMessage()+")");
		}
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
			object.getViews().stream().forEach(e->workbench.getLeftTabPane().getTabs().add(createTab(e)));
		}
		return super.caseLeftPane(object);
	}
	
	@Override
	public Node caseRightPane(RightPane object) {
		if (workbench!=null) {
			object.getViews().stream().forEach(e-> workbench.getRightTabPane().getTabs().add(createTab(e)));
		}
		return super.caseRightPane(object);
	}

	@Override
	public Node caseBottomPane(BottomPane object) {
		if (workbench!=null) {
			object.getViews().stream().forEach(e->workbench.getBottomTabPane().getTabs().add(createTab(e)));
		}
		return super.caseBottomPane(object);
	}

	private Tab createTab(View e) {
		Tab tab = new Tab(e.getName());
		tab.setContent(caseView(e));
		return tab;
	}
	
	@Override
	public Node caseView(View object) {
		try {
			Class<?> clazz = Class.forName(object.getViewClass());
			EmfView viewPart = (EmfView)clazz.newInstance();
			return viewPart;
		} catch (NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			log.log(Level.SEVERE, "Viewpart cannot created ("+e.getMessage()+")");
		}
		return new Label("ViewPart cannot be created!");
	}
}
