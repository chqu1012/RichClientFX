package de.dc.javafx.xcore.workbench.emf.ui;

import java.io.File;
import java.util.EventObject;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import javafx.beans.value.ChangeListener;
import javafx.scene.layout.VBox;

public abstract class EmfModelView<T> extends VBox implements CommandStackListener, ChangeListener<Object>, IEmfEditorPart<T> {

	private Logger log = Logger.getLogger(EmfModelView.class.getSimpleName());
	
	protected EObject currentEObject;
	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;
	
	@Override
	public void save(File f) {
		manager.getFile().write(manager.getRoot(), f.getAbsolutePath());
		log.log(Level.INFO, "Write emf model to path " + f.getAbsolutePath());
	}

	@Override
	public T load(File file) {
		return load(file.getAbsolutePath());
	}
	
	public T load(String filepath) {
		T model = manager.getFile().load(filepath);
		manager.setRoot(model);
		return model;
	}

	public abstract IEmfManager<T> initEmfManager();
	
	public IEmfManager<T> getEmfManager() {
		if (manager==null) {
			manager = initEmfManager();
		}
		return manager;
	}
	
	@Override
	public String getExtension() {
		return manager.getFile().getExtension();
	}

}
