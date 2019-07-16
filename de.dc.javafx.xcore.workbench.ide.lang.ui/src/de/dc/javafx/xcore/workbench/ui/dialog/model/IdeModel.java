package de.dc.javafx.xcore.workbench.ui.dialog.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.IMethod;

public class IdeModel {
	private String name = "";
	private String packagePath = "";
	private String eFactory = "";
	private String ePackage = "";
	private String itemProviderAdapterFactory = "";
	private String rootModel = "";
	private String modelSwitch = "";
	private List<IMethod> editableAttributes = new ArrayList<>();
	private boolean generateDemo = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackagePath() {
		return packagePath;
	}

	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	public String geteFactory() {
		return eFactory;
	}

	public void seteFactory(String eFactory) {
		this.eFactory = eFactory;
	}

	public String getePackage() {
		return ePackage;
	}

	public void setePackage(String ePackage) {
		this.ePackage = ePackage;
	}

	public String getItemProviderAdapterFactory() {
		return itemProviderAdapterFactory;
	}

	public void setItemProviderAdapterFactory(String itemProviderAdapterFactory) {
		this.itemProviderAdapterFactory = itemProviderAdapterFactory;
	}

	public String getRootModel() {
		return rootModel;
	}

	public void setRootModel(String rootModel) {
		this.rootModel = rootModel;
	}

	public String getModelSwitch() {
		return modelSwitch;
	}

	public void setModelSwitch(String modelSwitch) {
		this.modelSwitch = modelSwitch;
	}

	public List<IMethod> getEditableAttributes() {
		return editableAttributes;
	}

	public void setEditableAttributes(List<IMethod> editableAttributes) {
		this.editableAttributes = editableAttributes;
	}

	public boolean isGenerateDemo() {
		return generateDemo;
	}

	public void setGenerateDemo(boolean generateDemo) {
		this.generateDemo = generateDemo;
	}
}