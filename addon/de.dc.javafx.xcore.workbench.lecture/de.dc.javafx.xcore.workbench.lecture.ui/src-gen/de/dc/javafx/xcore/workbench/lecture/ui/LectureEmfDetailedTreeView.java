package de.dc.javafx.xcore.workbench.lecture.ui;

import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;

public class LectureEmfDetailedTreeView extends EmfDetailedTreeView<LectureProject>{

	@Override
	protected EmfTreeModelView<LectureProject> initEmfModelTreeView() {
		return new LectureEmfTreeModelView();
	}
}
