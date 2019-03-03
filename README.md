# de.dc.emf.javafx.xtext.lang
Eclipse Editor for geneerating JavaFX Controls by defining meta informations in EMF or in Xtext DSL.

## Features
- [x] TableView with Cell Providers
- [x] DataBinding Models
- [x] Form Binding Models
- [x] Derived Bean to Binding Model
- [x] Code Generation via DSL
- [ ] Code Generation via EMF Editor
- [x] Update Site for Eclipse Installation

## use example
* Define TableView dsl
```
ProjectFX ContactProject{
	packagePath 'de.dc.emf.javafx.xtext.demo.contact'
	
	controls{
		TableView {
			name: ContactTableView
			usedModel: Contact
			Column(	name:forename 	width:100 	attribute:"Contact.forename")
			Column(	name:familyName width:100 	attribute:"Contact.familyName")
			Column(	name:age 					attribute:"Contact.age")
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
