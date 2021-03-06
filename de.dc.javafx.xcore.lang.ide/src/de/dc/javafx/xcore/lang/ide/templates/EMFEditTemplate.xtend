package de.dc.javafx.xcore.lang.ide.templates

class EMFEditTemplate {
	
	def static String get(EmfEditModel model)'''
	EMFSupport for �model.name�{
		packagePath: '�model.packagePath�' 
		modelItemProviderAdapterFactory: de.dc.javafx.emfsupport.website.model.provider.ModelItemProviderAdapterFactory
		modelPackage: de.dc.javafx.emfsupport.website.model.ModelPackage
		modelFactory: de.dc.javafx.emfsupport.website.model.ModelFactory
		rootType: de.dc.javafx.emfsupport.website.model.Website
		useUndoRedo: true  
		showCommandStack: true 
		showPropertyView: true 
	 
		// Generate an example application
	    generateDemo: true 
	
		// Edit Suppport, EAttributes is taken from EMF generated ModelPackage
		// This attribute should exist, otherwise you will get a compile error.
		editables += EAttribute(Website_Name)
		editables += EAttribute(Page_Name)	
		editables += EAttribute(Author_Firstname)
	
		// Context Menu
		contextMenus += addContextMenu(
			id:AddPage 
			parentType: de.dc.javafx.emfsupport.website.model.Website
			createType: de.dc.javafx.emfsupport.website.model.Page 
		)
		contextMenus += addContextMenu(
			id:AddAuthor 
			parentType: de.dc.javafx.emfsupport.website.model.Page
			createType: de.dc.javafx.emfsupport.website.model.Author
		)
		 
		controls += TableView(name: Page, model: de.dc.javafx.emfsupport.website.model.Page)
		controls += TreeView(name: Page, model: de.dc.javafx.emfsupport.website.model.Page)
		controls += ListView(name: Page, model: de.dc.javafx.emfsupport.website.model.Page)
	}
	'''	
}