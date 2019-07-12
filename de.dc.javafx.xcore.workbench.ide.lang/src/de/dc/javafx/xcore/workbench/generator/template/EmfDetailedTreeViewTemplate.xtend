package de.dc.javafx.xcore.workbench.generator.template

import de.dc.javafx.xcore.workbench.ide.IdeContainer

class EmfDetailedTreeViewTemplate implements IIdeGenerator<IdeContainer>{
	
	override gen(IdeContainer t)'''
	package «t.packagePath»;
	«val model = t.ideRootModel.simpleName»
	import de.dc.javafx.xcore.workbench.emf.ui.*;
	import «t.ideRootModel.qualifiedName»;
	
	public class «t.name»EmfDetailedTreeView extends EmfDetailedTreeView<«model»>{
	
		@Override
		protected EmfTreeModelView<«model»> initEmfModelTreeView() {
			return new «t.name»EmfTreeModelView();
		}
	}
	'''
	
}