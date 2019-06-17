package de.dc.javafx.xcore.workbench.ide.model.editor;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;

public class IDFindExtBug {

	/**
	 * - {Model}EditorAdvisor.java
	 * - createEditMenu -> nach EDIT_START hinzufügen:
	 */
	public static void fix(IMenuManager menu) {
		menu.add(new GroupMarker(IWorkbenchActionConstants.FIND_EXT));
	}
}
