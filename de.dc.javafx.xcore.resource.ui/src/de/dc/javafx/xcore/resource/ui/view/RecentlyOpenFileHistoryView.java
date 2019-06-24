package de.dc.javafx.xcore.resource.ui.view;

import java.io.File;

import de.dc.javafx.xcore.resource.RecentlyOpenFileHistory;
import de.dc.javafx.xcore.resource.ui.manager.RecentlyOpenedFilesHistoryEmfManager;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfListView;

public class RecentlyOpenFileHistoryView extends EmfListView<RecentlyOpenFileHistory>{

	public static final String ID= "de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView";
	private File historyFile = new File("./workspace/history.resource");
	
	public RecentlyOpenFileHistoryView() {
		new File("./workspace").mkdirs();
		if (historyFile.exists()) {
			RecentlyOpenFileHistory root = getEmfManager().getFile().load(historyFile.getAbsolutePath());
			setInput(root);
		}
	}
	
	@Override
	public IEmfManager<RecentlyOpenFileHistory> initEmfManager() {
		return new RecentlyOpenedFilesHistoryEmfManager();
	}
	
	public void save() {
		save(historyFile);
	}
}
