package de.dc.javafx.xcore.workbench.lecture.ui;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureContentSwitch;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;

public class LectureEmfDetailedTreeView extends EmfDetailedTreeView<LectureProject>{

	private Button showSlideButton = new Button("Show Slide");
	private Button openProjectFolderButton = new Button("Open Project Folder");
	private Button openSectionFolderButton = new Button("Open Section Folder");

	public LectureEmfDetailedTreeView() {
		initToolbar();
	}

	private void initToolbar() {
		addToToolbar(showSlideButton);
		addToToolbar(openProjectFolderButton);
		addToToolbar(openSectionFolderButton);
		
		showSlideButton.setOnAction(e-> showSlide());
		openProjectFolderButton.setOnAction(e-> openProjectFolder());
		openSectionFolderButton.setOnAction(e-> openSectionFolder());
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
			String path = getClass().getResource("/reveal.js-3.8.0/sections/Section_"+sectionName).getFile();
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
