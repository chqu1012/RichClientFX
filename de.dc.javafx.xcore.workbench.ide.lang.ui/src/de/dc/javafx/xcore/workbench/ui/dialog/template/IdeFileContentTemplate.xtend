package de.dc.javafx.xcore.workbench.ui.dialog.template

import de.dc.javafx.xcore.workbench.ui.dialog.model.IdeModel

class IdeFileContentTemplate {

	def static String getContent(IdeModel model)'''
	package �model.packagePath�.ui
	
	class �model.name.toFirstUpper�{
		IdeFactory: �model.geteFactory�
		IdePackage: �model.getePackage�
		IdeItemProviderAdapterFactory: �model.itemProviderAdapterFactory�
		IdeRootModel: �model.rootModel�
		IdeModelSwitch: �model.modelSwitch�
		
		Editable{
			�FOR n : model.editableAttributes�
			IdePackage->�n.elementName�()
			�ENDFOR�
		}
		
		generateDemo
	}
	'''
}