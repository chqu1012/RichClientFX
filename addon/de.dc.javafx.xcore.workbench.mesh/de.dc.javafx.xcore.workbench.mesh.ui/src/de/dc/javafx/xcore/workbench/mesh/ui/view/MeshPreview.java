package de.dc.javafx.xcore.workbench.mesh.ui.view;

import org.eclipse.emf.ecore.EObject;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.mesh.BoxFX;
import de.dc.javafx.xcore.workbench.mesh.MeshFactory;
import de.dc.javafx.xcore.workbench.mesh.ui.renderer.MeshRenderer;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;

public class MeshPreview extends FXPreview {

	private MeshRenderer renderer = new MeshRenderer();
	
	public MeshPreview() {
		DIPlatform.getInstance(IEmfSelectionService.class).addListener(this);
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}
	
	@Subscribe
	public void updatePreview(EventContext<Object> context) {
		if (context.getEventId()!=null && context.getEventId().equals("preview.update")) {
			Object input = context.getInput();
			setCenter(renderer.doSwitch((EObject) input));
		}
	}
	
	@Override
	public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			TreeItem<Object> treeItem = (TreeItem) newValue;
			Object value = treeItem.getValue();
			if (value instanceof EObject) {
				BoxFX fakeBox = MeshFactory.eINSTANCE.createBoxFX();
				fakeBox.setUseRotation(true);
				Group group = renderer.createGroup(fakeBox);
				Node node = renderer.doSwitch((EObject) value);
				if (node!=null) {
					group.getChildren().add(node);
				}
				setCenter(group);
			}
		}
	}
}
