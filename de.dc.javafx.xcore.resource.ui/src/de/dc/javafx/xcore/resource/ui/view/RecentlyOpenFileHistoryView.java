package de.dc.javafx.xcore.resource.ui.view;

import de.dc.javafx.xcore.resource.RecentlyOpenFileHistory;
import de.dc.javafx.xcore.resource.ui.manager.RecentlyOpenedFilesHistoryEmfManager;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfListView;

public class RecentlyOpenFileHistoryView extends EmfListView<RecentlyOpenFileHistory>{

	public static final String ID= "de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView";
	
	@Override
	public IEmfManager<RecentlyOpenFileHistory> initEmfManager() {
		return new RecentlyOpenedFilesHistoryEmfManager();
	}
}
