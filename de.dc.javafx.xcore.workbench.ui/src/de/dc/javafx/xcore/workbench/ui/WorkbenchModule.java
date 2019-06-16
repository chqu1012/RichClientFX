package de.dc.javafx.xcore.workbench.ui;

import com.google.inject.AbstractModule;

import de.dc.javafx.xcore.workbench.emf.file.EmfFileManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.ui.file.EmfWorkbenchFile;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;

public class WorkbenchModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IEmfControlManager.class).to(EmfControlManager.class).asEagerSingleton();
		bind(EmfWorkbenchRenderer.class).asEagerSingleton();
		bind(EmfWorkbenchFile.class).asEagerSingleton();
		bind(EmfCommandManager.class).asEagerSingleton();
		bind(IEmfFileManager.class).to(EmfFileManager.class).asEagerSingleton();
	}
}
