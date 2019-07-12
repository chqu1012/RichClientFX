package de.dc.javafx.xcore.resource.ui;
import de.dc.javafx.xcore.workbench.emf.ui.*;
import de.dc.javafx.xcore.resource.RecentlyOpenFileHistory;

public class RecentlyOpenedFilesHistoryEmfDetailedTreeView extends EmfDetailedTreeView<RecentlyOpenFileHistory>{

	@Override
	protected EmfTreeModelView<RecentlyOpenFileHistory> initEmfModelTreeView() {
		return new RecentlyOpenedFilesHistoryEmfTreeModelView();
	}
}
