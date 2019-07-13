package de.dc.javafx.xcore.workbench.lecture.ui;

import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;

public class LectureEmfDetailedTreeView extends EmfDetailedTreeView<LectureProject>{
	@Override
	protected EmfTreeModelView<LectureProject> initEmfModelTreeView() {
		return new LectureEmfTreeModelView();
	}
	
	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		super.changed(observable, oldValue, newValue);
	}
}
