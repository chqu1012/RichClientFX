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


## ChangeLog

## Download
* ![v0.8.3](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.2.zip) : Working Example of JFX CU
* ![v0.8.2](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.2.zip) : Separated base code files
* ![v0.8.1a](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.1a.zip) : Removed Eclipse ui editor version restriction
* ![v0.8.1](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.1.zip)
* ![v0.8.0](https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang/blob/master/de.dc.emf.javafx.xtext.lang.update/build/v0.8.0.zip)
