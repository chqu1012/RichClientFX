package de.dc.javafx.xcore.workbench.barcode.ui.view;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;
import de.dc.javafx.xcore.workbench.barcode.ui.renderer.BarcodeRenderer;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class BarcodePreview extends FXPreview {
  private BarcodeRenderer renderer  = new BarcodeRenderer();
  
  private static final String PREVIEW_UPDATE_TOPIC = "/Barcode/Preview/Update";
  
  public BarcodePreview() {
    DIPlatform.getInstance(IEventBroker.class).register(this);
    setTitle(BarcodePackage.eNAME+" Preview");
  }
  
  @Subscribe
  public void update(final EventContext context) {
    // React on event sending via EventBus with a defined topic
    if (context.getEventId()!=null && context.getEventId().equals(PREVIEW_UPDATE_TOPIC)) {
    	Object input = context.getInput();
    	setCenter((Node)renderer.doSwitch((EObject) input));
    }
  }
  
  @Override
  public void changed(final ObservableValue observable, final Object oldValue, final Object newValue) {
    // React on selection change of the defined providers
    if (newValue instanceof TreeItem) {
    	TreeItem<Object> treeItem = (TreeItem) newValue;
    	Object value = treeItem.getValue();
    	if (value instanceof EObject) {
    		setCenter((Node)renderer.doSwitch((EObject) value));
    	}
    }
  }
}
