package de.dc.javafx.xcore.resource.ui.preview;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.resource.ui.renderer.ResourceRenderer;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ResourcePreview extends FXPreview {
  private ResourceRenderer renderer ;
  
  private static final String PREVIEW_UPDATE_TOPIC = "/Resource/Preview/Update";
  
  public ResourcePreview() {
    DIPlatform.getInstance(IEventBroker.class).register(this);
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
