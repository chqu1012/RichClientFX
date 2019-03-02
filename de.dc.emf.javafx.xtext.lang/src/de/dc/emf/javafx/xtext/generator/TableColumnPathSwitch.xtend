package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.ModelFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import de.dc.emf.javafx.model.javafx.TableViewFX

class TableColumnPathSwitch extends JavafxSwitch<String>{
	
	override caseModelFX(ModelFX object)'''«FilePathSwitch.getPackage(object)»/controls/cell/«object.name.toFirstUpper»Type.java'''
	override caseTableViewFX(TableViewFX object)'''«FilePathSwitch.getPackage(object)»/controls/cell/Base«object.usedModel.name.toFirstUpper»CellFeatures.java'''
}