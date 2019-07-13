package de.dc.javafx.xcore.workbench.lecture.ui;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureContentSwitch;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;

public class LectureEmfDetailedTreeViewFX extends LectureEmfDetailedTreeView {

	private boolean hideLeft = true;
	private boolean hideRight = true;
	private boolean hideBottom = true;

	private Button showSlideButton = new Button("Show Slide");
	private Button openProjectFolderButton = new Button("Open Project Folder");
	private Button openSectionFolderButton = new Button("Open Section Folder");
	private Button hideLeftFolderButton = new Button("Hide Left");
	private Button hideRightFolderButton = new Button("Hide Right");
	private Button hideBottomFolderButton = new Button("Hide Bottom");

	public LectureEmfDetailedTreeViewFX() {
		initToolbar();
	}

	private void initToolbar() {
		addToToolbar(showSlideButton);
		addToToolbar(openProjectFolderButton);
		addToToolbar(openSectionFolderButton);
		addToToolbar(hideLeftFolderButton);
		addToToolbar(hideRightFolderButton);
		addToToolbar(hideBottomFolderButton);

		showSlideButton.setOnAction(e -> showSlide());
		openProjectFolderButton.setOnAction(e -> openProjectFolder());
		openSectionFolderButton.setOnAction(e -> openSectionFolder());
		hideLeftFolderButton.setOnAction(e -> hideLeft());
		hideRightFolderButton.setOnAction(e -> hideRight());
		hideBottomFolderButton.setOnAction(e -> hideBottom());
	}

	private void hideLeft() {
		DIPlatform.getInstance(IEventBroker.class).post(new EventContext<Boolean>("workbench/hide/left", hideLeft));
		hideLeft = !hideLeft;
	}

	private void hideBottom() {
		DIPlatform.getInstance(IEventBroker.class).post(new EventContext<Boolean>("workbench/hide/bottom", hideBottom));
		hideBottom = !hideBottom;
	}

	private void hideRight() {
		DIPlatform.getInstance(IEventBroker.class).post(new EventContext<Boolean>("workbench/hide/right", hideRight));
		hideRight = !hideRight;
	}

	private void showSlide() {
		try {
			Desktop.getDesktop().browse(getClass().getResource("/reveal.js-3.8.0/demo.html").toURI());
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	private void openSectionFolder() {
		Object value = treeView.getTreeView().getSelectionModel().getSelectedItem().getValue();
		if (value instanceof Section) {
			Section s = (Section) value;
			LectureProject project = (LectureProject) s.eContainer();
			int indexOf = project.getSections().indexOf(s);
			String sectionName = LectureContentSwitch.df.format(indexOf);
			String path = getClass().getResource("/reveal.js-3.8.0/sections/Section_" + sectionName).getFile();
			try {
				Desktop.getDesktop().open(new File(path));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void openProjectFolder() {
		Object value = treeView.getTreeView().getSelectionModel().getSelectedItem().getValue();
		if (value instanceof LectureProject) {
			String path = getClass().getResource("/reveal.js-3.8.0/").getFile();
			try {
				Desktop.getDesktop().open(new File(path));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected EmfTreeModelView<LectureProject> initEmfModelTreeView() {
		return new LectureEmfTreeModelView();
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		super.changed(observable, oldValue, newValue);
		openProjectFolderButton.setDisable(!(newValue.getValue() instanceof LectureProject));
		openSectionFolderButton.setDisable(!(newValue.getValue() instanceof Section));
	}
}
