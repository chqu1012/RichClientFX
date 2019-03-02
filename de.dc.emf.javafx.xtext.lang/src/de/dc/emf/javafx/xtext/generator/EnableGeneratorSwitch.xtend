package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import de.dc.emf.javafx.model.javafx.AttributeFX
import de.dc.emf.javafx.model.javafx.ControlFX
import de.dc.emf.javafx.model.javafx.ModelFX
import de.dc.emf.javafx.model.javafx.NamedElement
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableColumnFX
import de.dc.emf.javafx.model.javafx.TableViewFX

class EnableGeneratorSwitch extends JavafxSwitch<Boolean>{
	
	override caseAttributeFX(AttributeFX object) {false}
	override caseControlFX(ControlFX object) {false}
	override caseNamedElement(NamedElement object) {false}
	override caseProjectFX(ProjectFX object) {false}
	override caseTableColumnFX(TableColumnFX object) {false}
	
	override caseModelFX(ModelFX object) {true}
	override caseTableViewFX(TableViewFX object) {true}
					
}