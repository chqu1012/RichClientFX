package de.dc.javafx.xcore.workbench.generator.template

import de.dc.javafx.xcore.workbench.ide.IdeContainer

class PluginExtensionTemplate implements IIdeGenerator<IdeContainer>{
	
	override gen(IdeContainer t)'''
	<?xml version="1.0" encoding="UTF-8"?>
	<extensions:ExtensionManager xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:extensions="http://www.frateranatis.org/workbench/extensions">
	  <extensionPoints xsi:type="extensions:ViewExtension">
	    <views Id="de.dc.javafx.xcore.workbench.lecture.ui.view.«t.name»Preview" name="«t.name» Preview" extensionUri="de.dc.javafx.xcore.workbench.lecture.ui.view.LecturePreview"/>
	    <views Id="de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView" name="Recently Open Files History" extensionUri="de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView"/>
	    <views Id="de.dc.javafx.xcore.workbench.emf.ui.EmfSelectionViewer" name="Selection Viewer" extensionUri="de.dc.javafx.xcore.workbench.emf.ui.EmfSelectionViewer"/>
	  </extensionPoints>
	  <extensionPoints xsi:type="extensions:PerspectiveExtension">
	    <perspectives Id="«t.packagePath».«t.name»Perspective" name="«t.name» Perspective" left="//@extensionPoints.0/@views.1" right="//@extensionPoints.0/@views.2" bottom="//@extensionPoints.0/@views.0"/>
	  </extensionPoints>
	  <extensionPoints xsi:type="extensions:EditorExtension">
	    <editors Id="«t.packagePath».«t.name»EmfDetailedTreeView" name="«t.name» Editor" extensionUri="«t.packagePath».«t.name»EmfDetailedTreeView" fileExtension="«t.name.toLowerCase»"/>
	  </extensionPoints>
	</extensions:ExtensionManager>
	'''
	
}