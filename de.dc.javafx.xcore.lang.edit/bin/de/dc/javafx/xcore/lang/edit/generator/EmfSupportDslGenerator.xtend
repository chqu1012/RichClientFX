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
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		jvmModelGenerator.doGenerate(input, fsa);
		
		input.contents.get(0).eAllContents.filter[it instanceof Ecore].forEach[content|
			val ecore = content as Ecore
			fsa.generateFile(applicationTemplate.path(ecore), SourceOutputConfigurationProvider.DEFAULT_SRC, applicationTemplate.code(ecore))
			fsa.generateFile(modelViewTemplate.path(ecore), SourceOutputConfigurationProvider.DEFAULT_SRC, modelViewTemplate.code(ecore))
		]
		
	}

}