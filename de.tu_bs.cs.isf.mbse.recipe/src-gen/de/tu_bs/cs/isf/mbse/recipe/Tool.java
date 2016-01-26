/**
 */
package de.tu_bs.cs.isf.mbse.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getRequiredIn <em>Required In</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends EObject {
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
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getTool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required In</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.recipe.Workstep}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.cs.isf.mbse.recipe.Workstep#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required In</em>' reference list.
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getTool_RequiredIn()
	 * @see de.tu_bs.cs.isf.mbse.recipe.Workstep#getRequires
	 * @model opposite="requires" required="true"
	 * @generated
	 */
	EList<Workstep> getRequiredIn();

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
	 * @see de.tu_bs.cs.isf.mbse.recipe.RecipePackage#getTool_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.recipe.Tool#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // Tool
