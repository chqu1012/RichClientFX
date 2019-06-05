/**
 */
package de.dc.javafx.emfsupport.website.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.emfsupport.website.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.emfsupport.website.model.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.emfsupport.website.model.impl.WebsiteImpl
	 * @see de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__PAGES = 1;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.emfsupport.website.model.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.emfsupport.website.model.impl.PageImpl
	 * @see de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BODY = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URL = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__AUTHOR = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.emfsupport.website.model.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.emfsupport.website.model.impl.AuthorImpl
	 * @see de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__EMAIL = 2;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.emfsupport.website.model.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Website#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Website#getName()
	 * @see #getWebsite()
	 * @generated
	 */
	EAttribute getWebsite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.emfsupport.website.model.Website#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Website#getPages()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Pages();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.emfsupport.website.model.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Page#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Page#getBody()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Body();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Page#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Page#getUrl()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.emfsupport.website.model.Page#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Page#getAuthor()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Author();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.emfsupport.website.model.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Author#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Author#getFirstname()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Author#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Author#getLastname()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.emfsupport.website.model.Author#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.dc.javafx.emfsupport.website.model.Author#getEmail()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Email();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.emfsupport.website.model.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.emfsupport.website.model.impl.WebsiteImpl
		 * @see de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE__NAME = eINSTANCE.getWebsite_Name();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__PAGES = eINSTANCE.getWebsite_Pages();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.emfsupport.website.model.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.emfsupport.website.model.impl.PageImpl
		 * @see de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__BODY = eINSTANCE.getPage_Body();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__URL = eINSTANCE.getPage_Url();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__AUTHOR = eINSTANCE.getPage_Author();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.emfsupport.website.model.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.emfsupport.website.model.impl.AuthorImpl
		 * @see de.dc.javafx.emfsupport.website.model.impl.ModelPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__FIRSTNAME = eINSTANCE.getAuthor_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__LASTNAME = eINSTANCE.getAuthor_Lastname();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__EMAIL = eINSTANCE.getAuthor_Email();

	}

} //ModelPackage
