package de.dc.javafx.xcore.workbench.ide.model.template

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer

class PreviewTemplate implements IGenerator<IdeContainer> {
	
	override gen(IdeContainer project)'''
	package «project.packagePath».view;
	
	import org.eclipse.emf.ecore.*;
	import org.eclipse.emf.ecore.util.*;
	
	import com.google.common.eventbus.Subscribe;
	
	import de.dc.javafx.xcore.code.preview.ui.FXPreview;
	import «project.packagePath».renderer.*;
	import de.dc.javafx.xcore.workbench.di.DIPlatform;
	import de.dc.javafx.xcore.workbench.event.*;
	import javafx.beans.value.ObservableValue;
	import javafx.scene.control.TreeItem;
	«val modelName = project.modelName»
	public class «modelName»Preview extends FXPreview{
	
		private «modelName»Renderer renderer = new «modelName»Renderer();
		
		public static final String TOPIC_UPDATE = "«modelName».update.preview";
		
		public «modelName»Preview() {
			DIPlatform.getInstance(IEventBroker.class).register(this);
		}
		
		@Subscribe
		public void updateChart(EventContext<Object> context) {
			if (context.getEventId()!=null && context.getEventId().equals(TOPIC_UPDATE)) {
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
	'''
	
	override genName(IdeContainer t)'''«t.modelName»Preview'''
	
	override genPath(IdeContainer t)'''«t.packagePath.replace('.', '/')»/view/''' 
	
	override getSourceType() {SourceType::SRC}
}