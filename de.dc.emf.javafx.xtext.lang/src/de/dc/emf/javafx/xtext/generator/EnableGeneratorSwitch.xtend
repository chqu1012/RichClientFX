package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import de.dc.emf.javafx.model.javafx.AttributeFX
import de.dc.emf.javafx.model.javafx.ControlFX
import de.dc.emf.javafx.model.javafx.ModelFX
import de.dc.emf.javafx.model.javafx.NamedElement
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableColumnFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.Binding
import de.dc.emf.javafx.model.javafx.Bean
import de.dc.emf.javafx.model.javafx.DerivedBean
import de.dc.emf.javafx.model.javafx.BindingProperty
import de.dc.emf.javafx.model.javafx.LineChartFX
import de.dc.emf.javafx.model.javafx.PieChartFX

class EnableGeneratorSwitch extends JavafxSwitch<Boolean>{
	
	override caseAttributeFX(AttributeFX object) {false}
	override caseControlFX(ControlFX object) {false}
	override caseNamedElement(NamedElement object) {false}
	override caseProjectFX(ProjectFX object) {false}
	override caseTableColumnFX(TableColumnFX object) {false}
	override caseBindingProperty(BindingProperty object) {false}
		
	override caseLineChartFX(LineChartFX object) {true}
	override casePieChartFX(PieChartFX object) {true}
	override caseDerivedBean(DerivedBean object) {true}
	override caseBean(Bean object) {true}
	override caseBinding(Binding object) {true}
	override caseModelFX(ModelFX object) {true}
	override caseTableViewFX(TableViewFX object) {true}
					
}