/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.jvmmodel

import com.google.inject.Inject
import de.dc.javafx.xcore.workbench.emf.file.EmfFile
import de.dc.javafx.xcore.workbench.ide.IdeContainer
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class IdeDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

	def dispatch void infer(IdeContainer element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass(element.packagePath+'.file.'+element.name+"File")) [
			superTypes += EmfFile.typeRef(element.ideRootModel)
			
			members += element.toMethod("getEPackageEInstance", EPackage.typeRef) [
				annotations+=Override.annotationRef
				body = '''return �element.idePackage�.eINSTANCE;'''
			]
	
			members += element.toMethod("getEFactoryEInstance", EFactory.typeRef) [
				annotations+=Override.annotationRef
				body = '''return �element.ideFactory�.eINSTANCE;'''
			]
	
			members += element.toMethod("getExtension", String.typeRef) [
				annotations+=Override.annotationRef
				body = '''return "�element.idePackage�.eName";'''
			]
		]
	}
}