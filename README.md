# JavaFX based EMF Rich Client Platform
A lightweight JavaFX based EMF Rich Client Platform. This framework is defined by the emf model itself. The workbench is created by the definition. The framework contains a selection service for registration and recognition of selections. Defined views like PropertyView, HistoryView, ProjectExplorer can be included in it.

Eclipse Editor for generating JavaFX Controls by defining meta informations in EMF or in Xtext DSL. For more details, please visit the [wiki site](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/wiki)

### Overview of code generation with Eclipse IDE Support

![Code Generation](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/09-EmfEdit-Eclipse-Support.png)

### Running generated application with EMF support like Undo / Redo, PropertySheet (Optional) and Tree / Table/ List Editing.
This application contains on the generation:
* Workbench
* ProjectExplorer
* Workspace
* EMF Model TreeEditor
* PropertyView
* Flat HistoryView for Undo / Redo
* Hierachical History View for Undo / Redo
* ContextMenu with commands: 
	* New item creation
	* Copy / Paste
	* Edit
	* Delete
	* Duplicate
	* Undo / Redo
* Command Acceleration Binding for Undo / Redo
* Theme switching
* Default dark theme
* Addons:
	* Realtime JavaFX Chart Rendering
		* LineChart
		* BarChart
		* ScatterChart
		* AreaChart
		* PieChart
	* Realtime Orson Chart Rendering
		* AreaChart 3D
		* BarChart 3D
		* LineChart 3D
		* PieChart 3D
		* ScatterChart 3D
		* XYZLineChart
		* XYZBarChart
		* SurfacePlotter
	* Thymeleaf Blog Template Generator
	* Barcode Renderer used OkapiBarcode
	* Lecture: Declarative defining presentation slides via tree view, markdown or html
* Editor Registry for several types

### Flat History View
This view shows all command calls. Via the context menu, the user can undo or redo this action.
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/10-EmfEdit-ProjectExplorer.png)

### Hierachical History View
This view is an extended history view. A lot of information is displayed in cell feature directly. The user is allowed to undo / redo and delete this command direct via the buttons. The results are also displayed in the tree as child nodes.
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/12-EmfEdit-Hierachical-CommandView.png)

### RealTime LineChart Rendering
This addon supports rendering of chart files. The chart file is defined in EMF Xcore, so to create a chart the EMFTreeModelView can be used.
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/13-Addon-LineChart2.png)

### RealTime BarChart Rendering
BarChart Rendering showing history view, editor part and emf model tree.
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/13-Addon-BarChart.png)

### RealTime AreaChart 3D Rendering (Orson Chart)
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/13-Addon-Orson-AreaChart3d.png)

### RealTime BarChart 3D Rendering (Orson Chart)
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/13-Addon-Orson-BarChart3d.png)

### RealTime Surface 3D Plotter (Orson Chart)
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/13-Addon-Orson-SurfacePlotter.png)

### RealTime BarChart 3D Rendering (Orson Chart)
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/13-Addon-Orson-XYZBarChart3d.png)

### Generic Selection Viewer 
Shows all provided selections as fields and methods in tables and hierachical view.
![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/11-EmfEdit-SelectionViewer.png)

### Lecture Presentation Slides Editor
Defining presentation slides can be declare by emf treeview, html or markdown. Running the slides in JavaFX Tab or external browser with the reveal.js api.
![Running Application](https://github.com/chqu1012/RichClientFX/blob/master/de.dc.javafx.xcore.resources/images/15-Addon-Lecture-Icons.png)

### EMF.edit for undo, redo, editing and drag&drop support.

Basic functions will integrate into the TreeView, ListView and TableView. The following figure will shows a generated EMF.edit TreeView with binded PropertyView and HistoryView. Only this description is required to configure the generation

```java
EMFSupport for CRM{
	packagePath: 'hello.world.crm' 
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
}
```

![EMF.edit Support](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.javafx.xcore.resources/images/08-EmfEdit-CommandHistory.png)


## Features
- [x] TableView with Cell Providers
- [x] DataBinding Models
- [x] Form Binding Models
- [x] Derived Bean to Binding Model
- [x] Code Generation via DSL
- [ ] Code Generation via EMF Editor
- [x] Update Site for Eclipse Installation
- [ ] Eclipse JavaFX Preview
- [ ] Code Generation of TreeView
- [ ] Code Generation of TreeTableView
- [ ] Code Generation of ListView
- [ ] Code Generation of Custom forms
- [x] Code Generation of LineChart
- [ ] Code Generation of PieChart
- [ ] Code Generation of AreaChart
- [ ] FXML Code Generation
- [ ] High complex Binding
- [ ] DSL directly to CompilationUnit 

## Used Example
* Define TableView dsl
```java
ProjectFX ContactProject{
	packagePath 'de.dc.emf.javafx.xtext.demo.contact'
	
	controls{
		TableView {
			name: ContactTableView
			usedModel: Contact
			Column(	name:forename 	width:100 	attribute:"Contact.forename")
			Column(	name:familyName width:100 	attribute:"Contact.familyName")
			Column(	name:age 			attribute:"Contact.age")
			Column(	name:address 	width:50 	attribute:"Contact.address")
		}
	}
	
	models{
		class Contact{
			String forename
			String familyName
			int age
			boolean gender
			String address
		} 
	}
}
```
### How to define a FilteredTableViewFX

Each Filter columns as activate the filter by ```useFilter: true```

```java
ProjectFX ContactProject{
	packagePath 'de.dc.emf.javafx.xtext.demo.contact'
	
	controls{
		FilteredTableView {
			name: ContactTableView
			usedModel: Contact
			Column(	name:forename 	width:100 	attribute:"Contact.forename" useFilter:true)
			Column(	name:familyName width:100 	attribute:"Contact.familyName" useFilter:true)
			Column(	name:age 			attribute:"Contact.age" useFilter:true)
			Column(	name:address 	width:50 	attribute:"Contact.address" useFilter:true)
		}
	}   
	
	models{
		class Contact{
			String forename
			String familyName
			int age
			boolean gender
			String address
		} 
	}
}
```

### How to define a LineChart with data list
```java
LineChart{
	name: BudgetChartOther
	legendSide:Top
	title:"Other Budget Chart"
	titleSide:Top
	xAxisLabel:"Budget"
	yAxisLabel:"Month"
	dataList{
		data('10','20') 
		data('20','23')  
		data('25','25') 
		data('30','30') 
	}
}
```

![LineChart Example](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.model.res/images/04-LineChartView.png)

### LineChart with 3 series

```java
LineChart{
	name: BudgetChartOther
	legendSide:Top
	title:"Other Budget Chart"
	titleSide:Top
	xAxisLabel:"Budget"
	yAxisLabel:"Month"
	series{  
		name:"exampleData2" 
		dataList{
			data('0','5') 
			data('10','20') 
			data('20','23')   
			data('25','25') 
			data('30','30') 
		}
	}
	series{
		name:"exampleData10"
		dataList{ 
			data('0','5') 
			data('25','5')   
			data('40','7') 
			data('80','9') 
		}
	}

	series{  
		name:"exampleData15"
		dataList{ 
			data('0','5') 
			data('5','10') 
			data('20','15')   
			data('40','25') 
			data('80','29') 
		}
	}
}
```

![LineChart Example](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.model.res/images/05-LineChartView-With-3-Series.png)

## Third Libaries
* Xtext & Xtend, https://www.eclipse.org/Xtext/
* Xcore, https://wiki.eclipse.org/Xcore
* Emf, Eclipse Modelling Framework https://www.eclipse.org/modeling/emf/
* OkapiBarcode, BarCode API https://github.com/woo-j/OkapiBarcode
* Orson Chart, https://github.com/jfree/orson-charts-fx

## ChangeLog

## Download
* ![v0.9.0](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/build/versions/de.dc.javafx.xcore.lang-v0.9.0.zip) : New API
* ![v0.8.4](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.4.zip) : TableViewFX with filter and property view
* ![v0.8.3](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.3.zip) : Working Example of JFX CU
* ![v0.8.2](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.2.zip) : Separated base code files
* ![v0.8.1a](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.1a.zip) : Removed Eclipse ui editor version restriction
* ![v0.8.1](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.1.zip)
* ![v0.8.0](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.0.zip)
