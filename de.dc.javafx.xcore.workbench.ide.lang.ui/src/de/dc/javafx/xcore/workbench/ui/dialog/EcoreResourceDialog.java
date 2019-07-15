package de.dc.javafx.xcore.workbench.ui.dialog;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class EcoreResourceDialog extends ResourceDialog {
	public EcoreResourceDialog(Shell parent, String title, int style) {
		super(parent, title, style);
	}

	@Override
	protected void prepareBrowseFileSystemButton(Button browseFileSystemButton) {

		browseFileSystemButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				FileDialog fileDialog = new FileDialog(getShell(), style);
				fileDialog.setFilterExtensions(new String[] { "*.ecore" });
				fileDialog.open();

				String filterPath = fileDialog.getFilterPath();
				if (isMulti()) {
					String[] fileNames = fileDialog.getFileNames();
					StringBuffer uris = new StringBuffer();

					for (int i = 0, len = fileNames.length; i < len; i++) {
						uris.append(URI.createFileURI(filterPath + File.separator + fileNames[i]).toString());
						uris.append("  ");
					}
					uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
				} else {
					String fileName = fileDialog.getFileName();
					if (fileName != null) {
						uriField.setText(URI.createFileURI(filterPath + File.separator + fileName).toString());
					}
				}
			}
		});
	}

	@Override
	protected void prepareBrowseWorkspaceButton(Button browseWorkspaceButton) {
		browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
				filters.add(new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof IFile) {
							return "ecore".equals(((IFile) element).getFileExtension());
						}
						return true;
					}
				});
				if (isMulti()) {
					StringBuffer uris = new StringBuffer();

					IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, true,
							getContextSelection(), filters);
					for (int i = 0, len = files.length; i < len; i++) {
						uris.append(URI.createPlatformResourceURI(files[i].getFullPath().toString(), true));
						uris.append("  ");
					}
					uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
				} else {
					IFile file = null;

					if (isSave()) {
						String path = getContextPath();
						file = WorkspaceResourceDialog.openNewFile(getShell(), null, null,
								path != null ? new Path(path) : null, filters);
					} else {
						IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, false,
								getContextSelection(), filters);
						if (files.length != 0) {
							file = files[0];
						}
					}

					if (file != null) {
						uriField.setText(URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
					}
				}
			}

			private String getContextPath() {
				return context != null && context.isPlatformResource()
						? URI.createURI(".").resolve(context).path().substring(9)
						: null;
			}

			private Object[] getContextSelection() {
				String path = getContextPath();
				if (path != null) {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					IResource resource = root.findMember(path);
					if (resource != null && resource.isAccessible()) {
						return new Object[] { resource };
					}
				}
				return null;
			}
		});
	}
}