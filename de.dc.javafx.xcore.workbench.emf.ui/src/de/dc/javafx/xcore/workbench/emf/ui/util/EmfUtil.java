package de.dc.javafx.xcore.workbench.emf.ui.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

public class EmfUtil {
	
	private EmfUtil() {
	}
	
	public static List<EClassifier> getAllEClass(EPackage epackage){
		ArrayList<EClassifier> list = new ArrayList<>();
		for (EClassifier classifier : epackage.getEClassifiers()) {
			list.add(classifier);
		}
		return list;
	}

	public static int getValueByName(EPackage ePackage, String name) {
		List<EClassifier> allEClass = getAllEClass(ePackage);
		for (EClassifier eClassifier : allEClass) {
			if (eClassifier.getName().equalsIgnoreCase(name)) {
				return eClassifier.getClassifierID();
			}
		}
		return -1;
	}
}
