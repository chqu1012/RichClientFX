/**
 */
package de.dc.spring.bootstrap.blog.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Small Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.bootstrap.blog.model.TileSmallSection#getTiles <em>Tiles</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getTileSmallSection()
 * @model
 * @generated
 */
public interface TileSmallSection extends Section {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.bootstrap.blog.model.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getTileSmallSection_Tiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tile> getTiles();

} // TileSmallSection
