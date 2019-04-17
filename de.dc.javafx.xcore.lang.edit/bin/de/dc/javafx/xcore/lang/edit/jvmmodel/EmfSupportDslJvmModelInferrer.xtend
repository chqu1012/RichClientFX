/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.jvmmodel

import com.google.inject.Inject
import de.dc.javafx.efxclipse.runtime.command.CommandStackImpl
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model
import org.eclipse.emf.ecore.change.util.ChangeRecorder
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.emf.edit.provider.ComposedAdapterFactory
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import de.dc.javafx.efxclipse.runtime.model.IEmfManager

class EmfSupportDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

	def dispatch void infer(Model element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for(model : element.ecore){
			val name = model.name
	 		acceptor.accept(element.toClass(name+'Manager')[
	 			superTypes += IEmfManager.typeRef(model.rootType)
	 			
	 			members += element.toField('root', model.rootType)
	 			members += element.toField('editingDomain', EditingDomain.typeRef)
	 			members += element.toField('adapterFactory', ComposedAdapterFactory.typeRef)
	 			members += element.toField('changeRecorder', ChangeRecorder.typeRef)
	 			members += element.toField('commandStack', CommandStackImpl.typeRef)
	 			
	 			members += model.toConstructor[
	 				body = '''
					adapterFactory = new «ComposedAdapterFactory»(«ComposedAdapterFactory».Descriptor.Registry.INSTANCE);
					adapterFactory.addAdapterFactory(new «model.modelItemProviderAdapterFactory»());
					adapterFactory.addAdapterFactory(new «ResourceItemProviderAdapterFactory»());
					adapterFactory.addAdapterFactory(new «ReflectiveItemProviderAdapterFactory»());
					
					commandStack = new «CommandStackImpl»();
					editingDomain = new «AdapterFactoryEditingDomain»(adapterFactory, commandStack);
					changeRecorder = new «ChangeRecorder»();
«««					initModel();
	 				'''
	 			]
	 			
//	 			members += model.toMethod('initModel', 'void'.typeRef)[]
	 			
	 			members += element.toGetter('root', model.rootType)
	 			members += element.toGetter('editingDomain', EditingDomain.typeRef)
	 			members += element.toGetter('adapterFactory', ComposedAdapterFactory.typeRef)
	 			members += element.toGetter('changeRecorder', ChangeRecorder.typeRef)
	 			members += element.toGetter('commandStack', CommandStackImpl.typeRef)
	 		])
		}
	}
}
