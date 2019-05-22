package de.dc.javafx.efxclipse.runtime.ui.features;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.filechooser.FileSystemView;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class FileTreeCellFactory implements Callback<TreeView<File>, TreeCell<File>> {

	@Override
	public TreeCell<File> call(TreeView<File> arg0) {
		return new TreeCell<File>() {
			@Override
			protected void updateItem(File item, boolean empty) {
				super.updateItem(item, empty);
				if (item == null || empty) {
					setText(null);
					setGraphic(null);
				} else {
					setText(item.getName());
					Image fileIcon = getFileIcon(item.getName());
					if (item.isDirectory()) {
						fileIcon = mapOfFileExtToSmallIcon.get("folder");
						if (fileIcon==null) {
							fileIcon = new Image("/de/dc/javafx/efxclipse/runtime/icons/icons8-opened-folder-16.png");
						}
					}
					setGraphic(new ImageView(fileIcon));
				}
			}
		};
	}

	static HashMap<String, Image> mapOfFileExtToSmallIcon = new HashMap<>();

	private static String getFileExt(String fname) {
		String ext = ".";
		int p = fname.lastIndexOf('.');
		if (p >= 0) {
			ext = fname.substring(p);
		}
		return ext.toLowerCase();
	}

	private static javax.swing.Icon getJSwingIconFromFileSystem(File file) {
		FileSystemView view = FileSystemView.getFileSystemView();
		return view.getSystemIcon(file);
	}

	private static Image getFileIcon(String fname) {
		final String ext = getFileExt(fname);

		Image fileIcon = mapOfFileExtToSmallIcon.get(ext);
		if (fileIcon == null) {

			javax.swing.Icon jswingIcon = null;

			File file = new File(fname);
			if (file.exists()) {
				jswingIcon = getJSwingIconFromFileSystem(file);
			} else {
				File tempFile = null;
				try {
					tempFile = File.createTempFile("icon", ext);
					jswingIcon = getJSwingIconFromFileSystem(tempFile);
				} catch (IOException ignored) {
					// Cannot create temporary file.
				} finally {
					if (tempFile != null)
						tempFile.delete();
				}
			}

			if (jswingIcon != null) {
				fileIcon = jswingIconToImage(jswingIcon);
				mapOfFileExtToSmallIcon.put(ext, fileIcon);
			}
		}

		return fileIcon;
	}

	private static Image jswingIconToImage(javax.swing.Icon jswingIcon) {
		BufferedImage bufferedImage = new BufferedImage(jswingIcon.getIconWidth(), jswingIcon.getIconHeight(),
				BufferedImage.TYPE_INT_ARGB);
		jswingIcon.paintIcon(null, bufferedImage.getGraphics(), 0, 0);
		return SwingFXUtils.toFXImage(bufferedImage, null);
	}

}
