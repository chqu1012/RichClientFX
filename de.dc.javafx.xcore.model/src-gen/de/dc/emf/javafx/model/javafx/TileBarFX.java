/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Bar FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TileBarFX#getTiles <em>Tiles</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTileBarFX()
 * @model
 * @generated
 */
public interface TileBarFX extends ControlFX {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.BaseTileFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTileBarFX_Tiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseTileFX> getTiles();

} // TileBarFX
