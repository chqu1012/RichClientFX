# JavaFX Control Generator
Eclipse Editor for generating JavaFX Controls by defining meta informations in EMF or in Xtext DSL.

Overview of code generation

![Code Generation](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.model.res/images/01-App-Generation.png)

Running application

![Running Application](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.model.res/images/02-Application.PNG)

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
- [ ] FXML Code Generation
- [ ] High complex Binding
- [ ] DSL directly to CompilationUnit 

## use example
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

## ChangeLog

## Download
* ![v0.8.1](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.1.zip)
* ![v0.8.0](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.0.zip)
