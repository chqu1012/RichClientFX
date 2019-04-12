package de.dc.javafx.xcore.lang.generator

import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class JavaFXDslGenerator implements IGenerator {
	
	@Inject
	JvmModelGenerator jvmModelGenerator;
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		println("GENERATE")
	}
}