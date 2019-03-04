package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.Bean
import de.dc.emf.javafx.model.javafx.DerivedBean
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableColumnFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.emf.javafx.model.javafx.Binding
import de.dc.emf.javafx.model.javafx.LineChartFX
import de.dc.emf.javafx.model.javafx.FilteredTableViewFX

class FilePathSwitch extends JavafxSwitch<String>{
	
	override caseTableViewFX(TableViewFX object)'''«object.package»/controls/«object.name.toFirstUpper».java'''
	override caseFilteredTableViewFX(FilteredTableViewFX object)'''«object.package»/controls/«object.name.toFirstUpper».java'''
	override caseTableColumnFX(TableColumnFX object)'''
	«val modelName = (object.eContainer as TableViewFX).usedModel.name.toFirstUpper»
	«object.package»/controls/cell/«modelName»«object.usedAttribute.name.toFirstUpper»CellFeatures.java'''
	override caseBean(Bean object)'''«object.package»/model/«object.name.toFirstUpper».java'''
	override caseDerivedBean(DerivedBean object)'''«object.package»/model/«object.name.toFirstUpper».java'''
	override caseBinding(Binding object)'''«object.package»/binding/«object.name.toFirstUpper».java'''
	override caseLineChartFX(LineChartFX object)'''«object.package»/chart/«object.name.toFirstUpper».java'''
	
	def static getPackage(EObject obj)'''«(EcoreUtil.getRootContainer(obj.eContainer) as ProjectFX).packagePath.replace('.', '/')»'''
}