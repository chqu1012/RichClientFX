package de.dc.javafx.xcore.lang.edit.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import de.dc.javafx.xcore.lang.edit.configuration.SourceOutputConfigurationProvider
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class EmfSupportDslGenerator implements IGenerator {
	
	@Inject JvmModelGenerator jvmModelGenerator;
	@Inject ApplicationTemplate applicationTemplate
	@Inject ModelViewTemplate modelViewTemplate
	@Inject SupportedControlApplicationTemplate supportedCotnrolApplicationTemplate
	@Inject SupportedControlViewTemplate supportedCotnrolViewTemplate
	@Inject ExtendedFactoryTemplate extFactoryTemplate
	@Inject ExtendedFactoryImplTemplate extFactoryImplTemplate

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		jvmModelGenerator.doGenerate(input, fsa);
		
		val src = SourceOutputConfigurationProvider.DEFAULT_SRC
		
		input.contents.get(0).eAllContents.filter[it instanceof Ecore].forEach[content|
			val ecore = content as Ecore
			fsa.generateFile(applicationTemplate.path(ecore), src, applicationTemplate.code(ecore))
			fsa.generateFile(modelViewTemplate.path(ecore), src, modelViewTemplate.code(ecore))
			fsa.generateFile(extFactoryTemplate.path(ecore), src, extFactoryTemplate.code(ecore))
			fsa.generateFile(extFactoryImplTemplate.path(ecore), src, extFactoryImplTemplate.code(ecore))
			
			ecore.supportedControls.forEach[i|
				val path = supportedCotnrolApplicationTemplate.path(i)
				val code = supportedCotnrolApplicationTemplate.code(i)
				fsa.generateFile(path, src, code)
			]

			ecore.supportedControls.forEach[i|
				val path = supportedCotnrolViewTemplate.path(i)
				val code = supportedCotnrolViewTemplate.code(i)
				fsa.generateFile(path, src, code)
			]
		]
		
	}

}