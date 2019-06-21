package de.dc.javafx.xcore.workbench.chart.ui.view;

import org.eclipse.emf.ecore.EObject;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.ui.renderer.ChartFXRenderer;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;

public class ChartFXPreview extends FXPreview {

	private ChartFXRenderer renderer = new ChartFXRenderer();
	public static final String PEVIEW_UPDATE = "chartfx.update";

	public ChartFXPreview() {
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Subscribe
	public void updateChart(EventContext<Object> context) {
		if (context.getEventId() != null && context.getEventId().equals("chartfx.update")) {
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
				setCenter(renderer.doSwitch((EObject) value));
			}
		}
	}
}
