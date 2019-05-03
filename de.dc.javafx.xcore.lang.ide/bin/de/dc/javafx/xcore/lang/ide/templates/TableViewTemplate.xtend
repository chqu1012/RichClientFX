package de.dc.javafx.xcore.lang.ide.templates

import de.dc.javafx.xcore.lang.ide.wizards.model.TableModel

class TableViewTemplate {
	
	def static String getTemplate(TableModel model)'''
	packagePath "«model.packagePath»"
	
	controls{ 
		TableViewFX { 
			name: «model.name»
			// usedModel: Contact
			// column(name: Firstname usedAttribute:"Contact.firstname" useFilter)
			showPropertyView: «model.showPropertyView»
			showToolbar: «model.showToolbar»
			generateDemo: «model.generateDemo»
		} 
	}
	'''
}