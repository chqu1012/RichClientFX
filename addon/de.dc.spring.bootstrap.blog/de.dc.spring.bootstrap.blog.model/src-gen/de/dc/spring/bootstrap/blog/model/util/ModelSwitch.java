/**
 */
package de.dc.spring.bootstrap.blog.model.util;

import de.dc.spring.bootstrap.blog.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.spring.bootstrap.blog.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModelPackage.BLOG: {
			Blog blog = (Blog) theEObject;
			T result = caseBlog(blog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.SECTION: {
			Section section = (Section) theEObject;
			T result = caseSection(section);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TILE_SMALL_SECTION: {
			TileSmallSection tileSmallSection = (TileSmallSection) theEObject;
			T result = caseTileSmallSection(tileSmallSection);
			if (result == null)
				result = caseSection(tileSmallSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.STORY_SECTION: {
			StorySection storySection = (StorySection) theEObject;
			T result = caseStorySection(storySection);
			if (result == null)
				result = caseSection(storySection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.OVERIVEW_SECTION: {
			OverivewSection overivewSection = (OverivewSection) theEObject;
			T result = caseOverivewSection(overivewSection);
			if (result == null)
				result = caseSection(overivewSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TITLE_BIG_SECTION: {
			TitleBigSection titleBigSection = (TitleBigSection) theEObject;
			T result = caseTitleBigSection(titleBigSection);
			if (result == null)
				result = caseSection(titleBigSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ABOUT_SECTION: {
			AboutSection aboutSection = (AboutSection) theEObject;
			T result = caseAboutSection(aboutSection);
			if (result == null)
				result = caseSection(aboutSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.WORKFLOW_SECTION: {
			WorkflowSection workflowSection = (WorkflowSection) theEObject;
			T result = caseWorkflowSection(workflowSection);
			if (result == null)
				result = caseSection(workflowSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GALLERY_SECTION: {
			GallerySection gallerySection = (GallerySection) theEObject;
			T result = caseGallerySection(gallerySection);
			if (result == null)
				result = caseSection(gallerySection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GALLERY_MATERIAL_SECTION: {
			GalleryMaterialSection galleryMaterialSection = (GalleryMaterialSection) theEObject;
			T result = caseGalleryMaterialSection(galleryMaterialSection);
			if (result == null)
				result = caseSection(galleryMaterialSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TILE: {
			Tile tile = (Tile) theEObject;
			T result = caseTile(tile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlog(Blog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile Small Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile Small Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTileSmallSection(TileSmallSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorySection(StorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overivew Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overivew Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverivewSection(OverivewSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Big Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Big Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleBigSection(TitleBigSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>About Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>About Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAboutSection(AboutSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowSection(WorkflowSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gallery Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gallery Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGallerySection(GallerySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gallery Material Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gallery Material Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalleryMaterialSection(GalleryMaterialSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTile(Tile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
