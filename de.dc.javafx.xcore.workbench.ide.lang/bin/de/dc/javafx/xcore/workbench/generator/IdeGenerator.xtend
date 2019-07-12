package de.dc.javafx.xcore.workbench.generator

import com.google.inject.Inject
import de.dc.javafx.xcore.workbench.generator.template.EmfDetailedTreeViewTemplate
import de.dc.javafx.xcore.workbench.ide.IdeContainer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class IdeGenerator implements IGenerator {
	
	@Inject package JvmModelGenerator jvmModelGenerator
	@Inject extension IQualifiedNameProvider

	@Inject EmfDetailedTreeViewTemplate detailedTreeViewTemplate

	override void doGenerate(Resource input, IFileSystemAccess fsa) { 
		jvmModelGenerator.doGenerate(input, fsa)
		for(ide : input.allContents.toIterable.filter(IdeContainer)){
			val path = '''«ide.packagePath.replace('.', '/')»/«ide.name»EmfTreeModelView.java'''
			val code = '''
			package «ide.packagePath»;
			
			import com.google.common.eventbus.Subscribe;
			import de.dc.javafx.xcore.code.preview.ui.FXPreview;
			import «ide.idePackage.qualifiedName»;
			import «ide.ideRootModel.qualifiedName»;
			import «ide.packagePath».manager.*;
			import «ide.packagePath».view.*;
			import de.dc.javafx.xcore.workbench.di.DIPlatform;
			import de.dc.javafx.xcore.workbench.emf.IEmfManager;
			import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
			import de.dc.javafx.xcore.workbench.event.*;
			import javafx.scene.control.MenuItem;
			«val model = ide.ideRootModel.simpleName»
			public class «ide.name»EmfTreeModelView extends EmfTreeModelView<«model»> {
				
				public «ide.name»EmfTreeModelView() {
					// Set edit mode for several attributes
					«FOR n : ide.editables»
						«FOR methodName : n.methodName»
						addEditableFor(«ide.idePackage.simpleName».eINSTANCE.«methodName»());
						«ENDFOR»
					«ENDFOR»
			
					MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+" Preview");
					openPreviewMenuItem.setOnAction(e->{
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>("open.preview", new «ide.name»Preview()));
					});
					openWithMenu.getItems().add(openPreviewMenuItem);
					
					DIPlatform.getInstance(IEventBroker.class).register(this);
				}
			
				@Override
				public IEmfManager<«model»> getEmfManager() {
					if (manager==null) {
						manager = new «ide.name»EmfManager();
					}
					return manager;
				}
			
				@Subscribe
				public void updateViewByEventBroker(EventContext<EmfCommand> context) {
					if (context.getEventTopic()==EventTopic.COMMAND_STACK_REFRESH) {
						if (context.getInput() instanceof EmfCommand) {
			//				manager.getRoot().getValues().add(context.getInput());
						}
					}
				}
				
				@Override
				public IEmfManager<«model»> initEmfManager() {
					return new «ide.name»EmfManager();
				}
			}
			'''
			fsa.generateFile(path, code)
			fsa.generateFile(ide.packagePath.replace('.', '/')+"/"+ide.name+"EmfDetailedTreeView.java", detailedTreeViewTemplate.gen(ide))
		}
	}
}
