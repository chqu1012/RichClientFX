package de.dc.javafx.xcore.workbench.lecture.ui.renderer;

import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.util.LectureSwitch;
import javafx.scene.control.Button;

@SuppressWarnings("all")
public class LectureRenderer extends LectureSwitch {
	
	@Override
	public Object caseSection(Section object) {
		// TODO: Replace sample button
		return new Button();
	}
}
