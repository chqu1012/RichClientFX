package de.dc.javafx.xcore.workbench.barcode.ui.view;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;
import de.dc.javafx.xcore.workbench.barcode.ui.renderer.BarcodeRenderer;
import de.dc.javafx.xcore.workbench.barcode.ui.util.AnimatedZoomOperator;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.input.ScrollEvent;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class BarcodePreview extends FXPreview {
	private BarcodeRenderer renderer = new BarcodeRenderer();

	private static final String PREVIEW_UPDATE_TOPIC = "/Barcode/Preview/Update";
	private AnimatedZoomOperator zoomOperator = new AnimatedZoomOperator();
	private double zoomFactor = 1.5;

	public BarcodePreview() {
		DIPlatform.getInstance(IEventBroker.class).register(this);
		setTitle(BarcodePackage.eNAME + " Preview");
	}

	@Subscribe
	public void update(final EventContext context) {
		// React on event sending via EventBus with a defined topic
		if (context.getEventId() != null && context.getEventId().equals(PREVIEW_UPDATE_TOPIC)) {
			Object input = context.getInput();
			Node node = (Node) renderer.doSwitch((EObject) input);
			if (node!=null) {
				node.setOnScroll(event -> zoom(node, event));
				setCenter(node);
			}
		}
	}

	@Override
	public void changed(final ObservableValue observable, final Object oldValue, final Object newValue) {
		// React on selection change of the defined providers
		if (newValue instanceof TreeItem) {
			TreeItem<Object> treeItem = (TreeItem) newValue;
			Object value = treeItem.getValue();
			if (value instanceof EObject) {
				Node node = (Node) renderer.doSwitch((EObject) value);
				if (node!=null) {
					node.setOnScroll(event -> zoom(node, event));
					setCenter(node);
				}
			}
		}
	}

	private void zoom(Node node, ScrollEvent event) {
		if (event.getDeltaY() <= 0) {
			zoomFactor = 1 / zoomFactor;
		}
		zoomOperator.zoom(node, zoomFactor, event.getSceneX(), event.getSceneY());
	}

}
