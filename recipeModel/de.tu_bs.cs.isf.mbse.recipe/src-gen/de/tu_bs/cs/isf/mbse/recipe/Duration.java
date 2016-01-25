/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Duration#getHours <em>Hours</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Duration#getMinutes <em>Minutes</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EObject {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getDuration_Hours()
	 * @model default="0"
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Duration#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getDuration_Minutes()
	 * @model default="1"
	 * @generated
	 */
	int getMinutes();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Duration#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(int value);

} // Duration
