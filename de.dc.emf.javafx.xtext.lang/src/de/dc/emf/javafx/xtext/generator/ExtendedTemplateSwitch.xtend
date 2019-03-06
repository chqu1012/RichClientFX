package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.FilteredTableViewFX
import de.dc.emf.javafx.model.javafx.LineChartFX
import de.dc.emf.javafx.model.javafx.PieChartFX
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import org.eclipse.emf.ecore.util.EcoreUtil

class ExtendedTemplateSwitch extends JavafxSwitch<String>{
	
	override caseFilteredTableViewFX(FilteredTableViewFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object) as ProjectFX).packagePath»
	package «packagePath».controls;
	«val tableName = object.name.toFirstUpper»
	public class «tableName» extends Base«tableName» {
	}
	'''
		
	override caseTableViewFX(TableViewFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath»
	package «packagePath».controls;
	public class «object.name.toFirstUpper» extends Base«object.name.toFirstUpper»{
	}
	'''	
	
	override caseLineChartFX(LineChartFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath»
	package «packagePath».chart;
	public class «object.name.toFirstUpper» extends Base«object.name.toFirstUpper» {
	}
	'''

	override casePieChartFX(PieChartFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath»
	package «packagePath».chart;
	public class «object.name.toFirstUpper» extends Base«object.name.toFirstUpper» {
	}
	'''
}