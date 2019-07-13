package de.dc.javafx.xcore.workbench.lecture.ui;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.apache.log4j.Logger;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureContentSwitch;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;

public class LectureEmfDetailedTreeViewFX extends LectureEmfDetailedTreeView {

	private static final Logger LOG = Logger.getLogger(LectureEmfDetailedTreeViewFX.class);
	
	private boolean hideLeft = true;
	private boolean hideRight = true;
	private boolean hideBottom = true;

	private Button showSlideButton = new Button();
	private Button openProjectFolderButton = new Button();
	private Button openSectionFolderButton = new Button();
	private Button hideLeftFolderButton = new Button();
	private Button hideRightFolderButton = new Button();
	private Button hideBottomFolderButton = new Button();

	public LectureEmfDetailedTreeViewFX() {
		initToolbar();
	}

	private void initToolbar() {
		try {
			showSlideButton.setGraphic(new ImageView(getClass().getResource("/images/icons8-präsentation-24.png").toURI().toURL().toExternalForm()));
			showSlideButton.setTooltip(new Tooltip("Show Slides in External Browser"));

			openProjectFolderButton.setGraphic(new ImageView(getClass().getResource("/images/icons8-ms-project-24.png").toURI().toURL().toExternalForm()));
			openProjectFolderButton.setTooltip(new Tooltip("Open Project Folder"));
			openProjectFolderButton.setDisable(true);
			
			openSectionFolderButton.setGraphic(new ImageView(getClass().getResource("/images/icons8-mappe-24.png").toURI().toURL().toExternalForm()));
			openSectionFolderButton.setTooltip(new Tooltip("Open Project Folder"));
			openSectionFolderButton.setDisable(true);

			hideLeftFolderButton.setGraphic(new ImageView(getClass().getResource("/images/icons8-ausschalten-24.png").toURI().toURL().toExternalForm()));
			hideLeftFolderButton.setTooltip(new Tooltip("Show / Hide Left View Part"));

			hideRightFolderButton.setGraphic(new ImageView(getClass().getResource("/images/icons8-ausschalten-24 (1).png").toURI().toURL().toExternalForm()));
			hideRightFolderButton.setTooltip(new Tooltip("Show / Hide Right View Part"));
			
			hideBottomFolderButton.setGraphic(new ImageView(getClass().getResource("/images/icons8-ausschalten-24 (2).png").toURI().toURL().toExternalForm()));
			hideBottomFolderButton.setTooltip(new Tooltip("Show / Hide Bottom View Part"));
		} catch (MalformedURLException | URISyntaxException e1) {
			LOG.error("Failed to initialize toolbar with icons", e1);
		}
		
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
