package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableColumnFX
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.emf.javafx.model.javafx.ModelFX
import org.eclipse.emf.ecore.EObject

class FilePathSwitch extends JavafxSwitch<String>{
	
	override caseTableViewFX(TableViewFX object)'''«object.package»/controls/Base«object.name.toFirstUpper».java'''
	override caseTableColumnFX(TableColumnFX object)'''
	«val modelName = (object.eContainer as TableViewFX).usedModel.name.toFirstUpper»
	«object.package»/controls/cell/Base«modelName»«object.usedAttribute.name.toFirstUpper»CellFeatures.java'''
	override caseModelFX(ModelFX object)'''«object.package»/model/«object.name.toFirstUpper».java'''
	
	def static getPackage(EObject obj)'''«(EcoreUtil.getRootContainer(obj.eContainer) as ProjectFX).packagePath.replace('.', '/')»'''
}