package de.dc.javafx.xcore.model.editor;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEInternalWorkbenchImages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.osgi.framework.Bundle;

public class PackageExplorerIconBug {

	/**
	 * xxxEditorAdvisor class, call this method on #initialize
	 * @param configurer
	 */
	public static void fix(IWorkbenchConfigurer configurer) {
		final String ICONS_PATH = "icons/full/";
		Bundle ideBundle = Platform.getBundle(IDEWorkbenchPlugin.IDE_WORKBENCH);

		declareWorkbenchImage(configurer, ideBundle, IDE.SharedImages.IMG_OBJ_PROJECT, ICONS_PATH + "obj16/prj_obj.png",
				true);

		declareWorkbenchImage(configurer, ideBundle, IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED,
				ICONS_PATH + "obj16/cprj_obj.png", true);

		declareWorkbenchImage(configurer, ideBundle, IDEInternalWorkbenchImages.IMG_ETOOL_PROBLEMS_VIEW,
				ICONS_PATH + "eview16/problems_view.png", true);

		declareWorkbenchImage(configurer, ideBundle, IDEInternalWorkbenchImages.IMG_ETOOL_PROBLEMS_VIEW_ERROR,
				ICONS_PATH + "eview16/problems_view_error.png", true);

		declareWorkbenchImage(configurer, ideBundle, IDEInternalWorkbenchImages.IMG_ETOOL_PROBLEMS_VIEW_WARNING,
				ICONS_PATH + "eview16/problems_view_warning.png", true);

		declareWorkbenchImage(configurer, ideBundle, IDEInternalWorkbenchImages.IMG_OBJS_ERROR_PATH,
				ICONS_PATH + "obj16/error_tsk.png", true);

		declareWorkbenchImage(configurer, ideBundle, IDEInternalWorkbenchImages.IMG_OBJS_WARNING_PATH,
				ICONS_PATH + "obj16/warn_tsk.png", true);
	}

	private static void declareWorkbenchImage(IWorkbenchConfigurer configurer_p, Bundle ideBundle, String symbolicName,
			String path, boolean shared) {
		URL url = ideBundle.getEntry(path);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		configurer_p.declareImage(symbolicName, desc, shared);
	}
}
