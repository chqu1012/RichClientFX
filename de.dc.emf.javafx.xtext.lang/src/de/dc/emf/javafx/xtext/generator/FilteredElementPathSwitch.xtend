package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch

class FilteredElementPathSwitch extends JavafxSwitch<String>{
	
	override caseTableViewFX(TableViewFX object)'''«FilePathSwitch.getPackage(object)»/controls/Filtered«object.name.toFirstUpper».java'''
}