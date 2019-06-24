package de.dc.javafx.xcore.resource.ui.view;

import java.io.File;

import org.eclipse.emf.common.util.ECollections;

import de.dc.javafx.xcore.resource.OpenedFile;
import de.dc.javafx.xcore.resource.RecentlyOpenFileHistory;
import de.dc.javafx.xcore.resource.ui.manager.RecentlyOpenedFilesHistoryEmfManager;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfListView;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;

public class RecentlyOpenFileHistoryView extends EmfListView<RecentlyOpenFileHistory>{

	public static final String ID= "de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView";
	private File historyFile = new File("./workspace/history.resource");
	
	public RecentlyOpenFileHistoryView() {
		new File("./workspace").mkdirs();
		if (historyFile.exists()) {
			RecentlyOpenFileHistory root = getEmfManager().getFile().load(historyFile.getAbsolutePath());
			ECollections.sort(root.getFiles(), (arg0, arg1) -> {
				String a1 = arg1.getTimestamp()==null? "" : arg1.getTimestamp();
				String a0 = arg0.getTimestamp()==null? "" : arg0.getTimestamp();
				return a0.compareTo(a1)*-1;
			});
			setInput(root);
		}
		
		setOnMouseClicked(e -> {
			if (e.getClickCount()==2) {
				OpenedFile selection = (OpenedFile) getSelectionModel().getSelectedItem();
				DIPlatform.getInstance(IEventBroker.class).post(new EventContext<String>(EventTopic.OPEN_EDITOR, selection.getPath()));
			}
		});
	}
	
	@Override
	public IEmfManager<RecentlyOpenFileHistory> initEmfManager() {
		return new RecentlyOpenedFilesHistoryEmfManager();
	}
	
	public void save() {
		save(historyFile);
	}
}
