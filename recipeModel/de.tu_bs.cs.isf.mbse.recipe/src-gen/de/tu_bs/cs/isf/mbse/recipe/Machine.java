/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getNeededIn <em>Needed In</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Needed In</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Workstep}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed In</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getMachine_NeededIn()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getNeeds
	 * @model opposite="needs" required="true"
	 * @generated
	 */
	EList<Workstep> getNeededIn();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getMachine_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Machine#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // Machine
