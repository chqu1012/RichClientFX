package de.dc.javafx.xcore.workbench.extensions.view;

import com.google.common.eventbus.Subscribe;
import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;
import de.dc.javafx.xcore.workbench.extensions.renderer.ExtensionRenderer;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ExtensionPreview extends FXPreview {
  private ExtensionRenderer renderer ;
  
  private static final String PREVIEW_UPDATE_TOPIC = "/Extension/Preview/Update";
  
  public ExtensionPreview() {
    DIPlatform.getInstance(IEventBroker.class).register(this);
    setTitle(ExtensionsPackage.eNAME+" Preview");
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
